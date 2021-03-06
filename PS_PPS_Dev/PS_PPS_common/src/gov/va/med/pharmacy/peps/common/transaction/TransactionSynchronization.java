/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.common.transaction;


import javax.transaction.Status;
import javax.transaction.Synchronization;


/**
 * Call the appropriate {@link TransactionSynchronizationUtility} methods before and after completion.
 */
public class TransactionSynchronization implements Synchronization {
    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(TransactionSynchronization.class);

    /**
     * Default constructor.
     */
    public TransactionSynchronization() {
        super();
    }

    /**
     * This method is called by the transaction manager after the transaction is committed or rolled back.
     * If the transaction has committed, call the triggerAfterCommit() method.  If the transaction
     * has rolled back, call call the triggerrAfterRollback().
     * Always call {@link TransactionSynchronizationUtility#clear()} after transaction synchronization is complete.
     * 
     * @param status The status of the transaction completion.
     */
    public void afterCompletion(int status) {
        try {
            switch (status) {
                case Status.STATUS_COMMITTED:
                    TransactionSynchronizationUtility.triggerAfterCommit();
                    break;
                case Status.STATUS_ROLLEDBACK:
                    TransactionSynchronizationUtility.triggerAfterRollback();
                    break;
                default:
                    LOG.debug("Unknown transaction status: " + status);
                    break;
            }
        } finally {
            TransactionSynchronizationUtility.clear();
        }
    }

    /**
     * The beforeCompletion method is called by the transaction manager prior to the start of the two-phase transaction
     * commit process. This call is executed with the transaction context of the transaction that is being committed.
     * <p>
     * Call {@link TransactionSynchronizationUtility#triggerBeforeCommit()}.
     * 
     * @see javax.transaction.Synchronization#beforeCompletion()
     */
    public void beforeCompletion() {
        TransactionSynchronizationUtility.triggerBeforeCommit();
    }
}
