/**
 * Source file created in 2009 by Southwest Research Institute
 * 
 * under permission from:
 *
 * Copyright (c) 2008, Red Hat Middleware LLC or third-party contributors as indicated by the
 * 
 * Hibernate, Relational Persistence for Idiomatic Java
 * 
 * @author tags or express copyright attribution statements applied by the authors. All third-party contributions are
 *         distributed under license by Red Hat Middleware LLC.
 * 
 * This copyrighted material is made available to anyone wishing to use, modify, copy, or redistribute it subject to the
 * terms and conditions of the GNU Lesser General Public License, as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this distribution; if not, write to:
 * Free Software Foundation, Inc. 51 Franklin Street, Fifth Floor Boston, MA 02110-1301 USA
 * 
 */


package gov.va.med.pharmacy.peps.domain.common.hibernate.event.def;


import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.action.CollectionRecreateAction;
import org.hibernate.action.CollectionRemoveAction;
import org.hibernate.action.CollectionUpdateAction;
import org.hibernate.collection.PersistentCollection;
import org.hibernate.engine.ActionQueue;
import org.hibernate.engine.Cascade;
import org.hibernate.engine.CascadingAction;
import org.hibernate.engine.CollectionEntry;
import org.hibernate.engine.CollectionKey;
import org.hibernate.engine.Collections;
import org.hibernate.engine.EntityEntry;
import org.hibernate.engine.PersistenceContext;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.Status;
import org.hibernate.event.EventSource;
import org.hibernate.event.FlushEntityEvent;
import org.hibernate.event.FlushEntityEventListener;
import org.hibernate.event.FlushEvent;
import org.hibernate.persister.entity.EntityPersister;
import org.hibernate.pretty.Printer;
import org.hibernate.util.IdentityMap;
import org.hibernate.util.LazyIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A convenience base class for listeners whose functionality results in flushing.
 * <p>
 * NOTE: This is a copy/paste from the original Hibernate 3.3.1.GA code base, with two line additions to
 * {@link #performExecutions(EventSource)} to correct <a
 * href="http://opensource.atlassian.com/projects/hibernate/browse/HHH-2763">
 * http://opensource.atlassian.com/projects/hibernate/browse/HHH-2763</a>.
 * This modified source file is included as a compiled class as a replacement for
 * {@link org.hibernate.event.def.AbstractFlushingEventListener} within the Hibernate JAR file!
 * 
 *  @ author Steve Eberole
 */
public abstract class AbstractFlushingEventListener implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final Logger LOG = LoggerFactory.getLogger(AbstractFlushingEventListener.class);

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Pre-flushing section
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * Coordinates the processing necessary to get things ready for executions as db calls by preping the session caches and
     * moving the appropriate entities and collections to their respective execution queues.
     * 
     * @param event The flush event.
     */
    protected void flushEverythingToExecutions(FlushEvent event) {

        LOG.trace("flushing session");

        EventSource session = event.getSession();

        final PersistenceContext persistenceContext = session.getPersistenceContext();
        session.getInterceptor().preFlush(new LazyIterator(persistenceContext.getEntitiesByKey()));

        prepareEntityFlushes(session);

        // we could move this inside if we wanted to
        // tolerate collection initializations during
        // collection dirty checking:
        prepareCollectionFlushes(session);

        // now, any collections that are initialized
        // inside this block do not get updated - they
        // are ignored until the next flush

        persistenceContext.setFlushing(true);

        try {
            flushEntities(event);
            flushCollections(session);
        } finally {
            persistenceContext.setFlushing(false);
        }

        // some statistics
        if (LOG.isDebugEnabled()) {
            LOG.debug("Flushed: " + session.getActionQueue().numberOfInsertions() + " insertions, "
                + session.getActionQueue().numberOfUpdates() + " updates, " + session.getActionQueue().numberOfDeletions()
                + " deletions to " + persistenceContext.getEntityEntries().size() + " objects");
            LOG.debug("Flushed: " + session.getActionQueue().numberOfCollectionCreations() + " (re)creations, "
                + session.getActionQueue().numberOfCollectionUpdates() + " updates, "
                + session.getActionQueue().numberOfCollectionRemovals() + " removals to "
                + persistenceContext.getCollectionEntries().size() + " collections");
            new Printer(session.getFactory()).toString(persistenceContext.getEntitiesByKey().values().iterator(), session
                .getEntityMode());
        }
    }

    /**
     * process cascade save/update at the start of a flush to discover any newly referenced entity that must be passed to
     * saveOrUpdate(), and also apply orphan delete
     * 
     * @param session session
     */
    private void prepareEntityFlushes(EventSource session) {

        LOG.debug("processing flush-time cascades");

        final Map.Entry[] list = IdentityMap.concurrentEntries(session.getPersistenceContext().getEntityEntries());

        // safe from concurrent modification because of how entryList() is implemented on IdentityMap
        final int size = list.length;
        final Object anything = getAnything();

        for (int i = 0; i < size; i++) {
            Map.Entry me = list[i];
            EntityEntry entry = (EntityEntry) me.getValue();
            Status status = entry.getStatus();

            if (status == Status.MANAGED || status == Status.SAVING) {
                cascadeOnFlush(session, entry.getPersister(), me.getKey(), anything);
            }
        }
    }

    /**
     * 
     * @param session session
     * @param persister persister
     * @param object object
     * @param anything anything
     */
    private void cascadeOnFlush(EventSource session, EntityPersister persister, Object object, Object anything) {
        session.getPersistenceContext().incrementCascadeLevel();

        try {
            new Cascade(getCascadingAction(), Cascade.BEFORE_FLUSH, session).cascade(persister, object, anything);
        } finally {
            session.getPersistenceContext().decrementCascadeLevel();
        }
    }

    /**
     * getAnything
     * 
     * @return null
     */
    protected Object getAnything() {
        return null;
    }

    /**
     * getCascadingAction
     * 
     * @return SAVE_UPDATE
     */
    protected CascadingAction getCascadingAction() {
        return CascadingAction.SAVE_UPDATE;
    }

    /**
     * Initialize the flags of the CollectionEntry, including the dirty check.
     * 
     * @param session session
     */
    private void prepareCollectionFlushes(SessionImplementor session) {

        // Initialize dirty flags for arrays + collections with composite elements
        // and reset reached, doupdate, etc.

        LOG.debug("dirty checking collections");

        final List list = IdentityMap.entries(session.getPersistenceContext().getCollectionEntries());
        final int size = list.size();

        for (int i = 0; i < size; i++) {
            Map.Entry e = (Map.Entry) list.get(i);
            ((CollectionEntry) e.getValue()).preFlush((PersistentCollection) e.getKey());
        }
    }

    /**
     * 1. detect any dirty entities 2. schedule any entity updates 3. search out any reachable collections
     * 
     * @param event event
     */
    private void flushEntities(FlushEvent event) {

        LOG.trace("Flushing entities and processing referenced collections");

        // Among other things, updateReachables() will recursively load all
        // collections that are moving roles. This might cause entities to
        // be loaded.

        // So this needs to be safe from concurrent modification problems.
        // It is safe because of how IdentityMap implements entrySet()

        final EventSource source = event.getSession();

        final Map.Entry[] list = IdentityMap.concurrentEntries(source.getPersistenceContext().getEntityEntries());
        final int size = list.length;

        for (int i = 0; i < size; i++) {

            // Update the status of the object and if necessary, schedule an update

            Map.Entry me = list[i];
            EntityEntry entry = (EntityEntry) me.getValue();
            Status status = entry.getStatus();

            if (status != Status.LOADING && status != Status.GONE) {
                FlushEntityEvent entityEvent = new FlushEntityEvent(source, me.getKey(), entry);
                FlushEntityEventListener[] listeners = source.getListeners().getFlushEntityEventListeners();

                for (int j = 0; j < listeners.length; j++) {
                    listeners[j].onFlushEntity(entityEvent);
                }
            }
        }

        source.getActionQueue().sortActions();
    }

    /**
     * process any unreferenced collections and then inspect all known collections, scheduling creates/removes/updates
     * 
     * @param session session
     */
    private void flushCollections(EventSource session) {

        LOG.trace("Processing unreferenced collections");

        List list = IdentityMap.entries(session.getPersistenceContext().getCollectionEntries());
        int size = list.size();

        for (int i = 0; i < size; i++) {
            Map.Entry me = (Map.Entry) list.get(i);
            CollectionEntry ce = (CollectionEntry) me.getValue();

            if (!ce.isReached() && !ce.isIgnore()) {
                Collections.processUnreachableCollection((PersistentCollection) me.getKey(), session);
            }
        }

        // Schedule updates to collections:

        LOG.trace("Scheduling collection removes/(re)creates/updates");

        list = IdentityMap.entries(session.getPersistenceContext().getCollectionEntries());
        size = list.size();
        ActionQueue actionQueue = session.getActionQueue();

        for (int i = 0; i < size; i++) {
            Map.Entry me = (Map.Entry) list.get(i);
            PersistentCollection coll = (PersistentCollection) me.getKey();
            CollectionEntry ce = (CollectionEntry) me.getValue();

            if (ce.isDorecreate()) {
                session.getInterceptor().onCollectionRecreate(coll, ce.getCurrentKey());
                actionQueue.addAction(new CollectionRecreateAction(coll, ce.getCurrentPersister(), ce.getCurrentKey(),
                    session));
            }

            if (ce.isDoremove()) {
                session.getInterceptor().onCollectionRemove(coll, ce.getLoadedKey());
                actionQueue.addAction(new CollectionRemoveAction(coll, ce.getLoadedPersister(), ce.getLoadedKey(), ce
                    .isSnapshotEmpty(coll), session));
            }

            if (ce.isDoupdate()) {
                session.getInterceptor().onCollectionUpdate(coll, ce.getLoadedKey());
                actionQueue.addAction(new CollectionUpdateAction(coll, ce.getLoadedPersister(), ce.getLoadedKey(), ce
                    .isSnapshotEmpty(coll), session));
            }

        }

        actionQueue.sortCollectionActions();

    }

    /**
     * Execute all SQL and second-level cache updates, in a special order so that foreign-key constraints cannot be violated:
     * <ol>
     * <li> Inserts, in the order they were performed
     * <li> Updates
     * <li> Deletion of collection elements
     * <li> Insertion of collection elements
     * <li> Deletes, in the order they were performed
     * </ol>
     * 
     * @param session session
     */
    protected void performExecutions(EventSource session) {

        LOG.trace("executing flush");

        // Fix for http://opensource.atlassian.com/projects/hibernate/browse/HHH-2763
        session.getPersistenceContext().setFlushing(true);

        try {
            session.getJDBCContext().getConnectionManager().flushBeginning();

            // we need to lock the collection caches before
            // executing entity inserts/updates in order to
            // account for bidi associations
            session.getActionQueue().prepareActions();
            session.getActionQueue().executeActions();
        } catch (HibernateException he) {
            LOG.error("Could not synchronize database state with session", he);
            throw he;
        } finally {

            // Fix for http://opensource.atlassian.com/projects/hibernate/browse/HHH-2763
            session.getPersistenceContext().setFlushing(false);

            session.getJDBCContext().getConnectionManager().flushEnding();
        }
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Post-flushing section
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * 1. Recreate the collection key -> collection map 2. rebuild the collection entries 3. call Interceptor.postFlush()
     * 
     * @param session session
     */
    protected void postFlush(SessionImplementor session) {

        LOG.trace("post flush");

        final PersistenceContext persistenceContext = session.getPersistenceContext();
        persistenceContext.getCollectionsByKey().clear();
        persistenceContext.getBatchFetchQueue().clearSubselects(); // the database has changed now, so the subselect results

        // need to be invalidated

        Iterator iter = persistenceContext.getCollectionEntries().entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry me = (Map.Entry) iter.next();
            CollectionEntry collectionEntry = (CollectionEntry) me.getValue();
            PersistentCollection persistentCollection = (PersistentCollection) me.getKey();
            collectionEntry.postFlush(persistentCollection);

            if (collectionEntry.getLoadedPersister() == null) {

                // if the collection is dereferenced, remove from the session cache
                // iter.remove(); //does not work, since the entrySet is not backed by the set
                persistenceContext.getCollectionEntries().remove(persistentCollection);
            } else {

                // otherwise recreate the mapping between the collection and its key
                CollectionKey collectionKey = new CollectionKey(collectionEntry.getLoadedPersister(), collectionEntry
                    .getLoadedKey(), session.getEntityMode());
                persistenceContext.getCollectionsByKey().put(collectionKey, persistentCollection);
            }
        }

        session.getInterceptor().postFlush(new LazyIterator(persistenceContext.getEntitiesByKey()));
    }
}
