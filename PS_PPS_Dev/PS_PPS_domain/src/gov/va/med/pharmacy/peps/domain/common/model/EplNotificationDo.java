
/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Mar 27, 2009 10:10:41 AM by Hibernate Tools 3.2.0.beta8

import java.util.HashSet;
import java.util.Set;


/**
 * EplNotificationDo generated by hbm2java
 * @hibernate.class
 */
public class EplNotificationDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    private static final long serialVersionUID = 1L;
    public static final String EPL_NOTIFICATION_STATUS = "eplNotificationStatuses";
    public static final String NOTIFICATION_TYPE = "notificationType";

    private Long id;
    private String notificationType;
    private Set<EplNotificationStatusDo> eplNotificationStatuses = new HashSet<EplNotificationStatusDo>(0);
    private Set<EplItemAuditHistoryDo> eplItemAuditHistories = new HashSet<EplItemAuditHistoryDo>(0);

    // Constructors

    /** default constructor */

    public EplNotificationDo() {
    }

    /** minimal constructor */

    public EplNotificationDo(Long id, String notificationType) {
        this.id = id;
        this.notificationType = notificationType;
    }

    /** full constructor */

    public EplNotificationDo(Long id, String notificationType, Set<EplNotificationStatusDo> eplNotificationStatuses,
                             Set<EplItemAuditHistoryDo> eplItemAuditHistories) {
        this.id = id;
        this.notificationType = notificationType;
        this.eplNotificationStatuses = eplNotificationStatuses;
        this.eplItemAuditHistories = eplItemAuditHistories;
    }

    // Property accessors
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotificationType() {
        return this.notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public Set<EplNotificationStatusDo> getEplNotificationStatuses() {
        return this.eplNotificationStatuses;
    }

    public void setEplNotificationStatuses(Set<EplNotificationStatusDo> eplNotificationStatuses) {
        this.eplNotificationStatuses = eplNotificationStatuses;
    }

    public Set<EplItemAuditHistoryDo> getEplItemAuditHistories() {
        return this.eplItemAuditHistories;
    }

    public void setEplItemAuditHistories(Set<EplItemAuditHistoryDo> eplItemAuditHistories) {
        this.eplItemAuditHistories = eplItemAuditHistories;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("notificationType").append("='").append(getNotificationType()).append("' ");
        buffer.append("createdBy").append("='").append(getCreatedBy()).append("' ");
        buffer.append("createdDtm").append("='").append(getCreatedDtm()).append("' ");
        buffer.append("lastModifiedBy").append("='").append(getLastModifiedBy()).append("' ");
        buffer.append("lastModifiedDtm").append("='").append(getLastModifiedDtm()).append("' ");
        buffer.append("]");

        return buffer.toString();
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }

        if ((other == null)) {
            return false;
        }

        if (!(other instanceof EplNotificationDo)) {
            return false;
        }

        EplNotificationDo castOther = (EplNotificationDo) other;

        return ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null && this.getId()
            .equals(castOther.getId())))
            && ((this.getNotificationType() == castOther.getNotificationType()) || (this.getNotificationType() != null
                && castOther.getNotificationType() != null && this.getNotificationType().equals(
                    castOther.getNotificationType())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
        result = 37 * result + (getNotificationType() == null ? 0 : this.getNotificationType().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        return result;
    }

}
