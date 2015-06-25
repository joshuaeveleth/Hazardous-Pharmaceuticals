/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * EplCsFedScheduleDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplCsFedScheduleDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    public static final String ITEM_STATUS = "itemStatus";
    public static final String REQUEST_STATUS = "requestStatus";
    public static final String SCHEDULE_NAME = "scheduleName";
    private static final long serialVersionUID = 1L;

    private Long eplId;
    private String scheduleName;
    private Date inactivationDate;
    private String requestStatus;
    private String itemStatus;
    private String rejectReasonText;
    private String requestRejectReason;
    private Long revisionNumber;
    private Set<EplProductDo> eplProducts = new HashSet<EplProductDo>(0);

    // Constructors

    /** default constructor */
    
    public EplCsFedScheduleDo() {
    }

    /** minimal constructor */

    public EplCsFedScheduleDo(Long eplId, String scheduleName, String createdBy, Date createdDtm) {
        this.eplId = eplId;
        this.scheduleName = scheduleName;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplCsFedScheduleDo(Long eplId, String scheduleName, String createdBy, Date createdDtm, String lastModifiedBy,
                              Date lastModifiedDtm, Set<EplProductDo> eplProducts) {
        this.eplId = eplId;
        this.scheduleName = scheduleName;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplProducts = eplProducts;
    }

    // Property accessors
    public Long getEplId() {
        return this.eplId;
    }

    public void setEplId(Long eplId) {
        this.eplId = eplId;
    }

    public String getScheduleName() {
        return this.scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public Set<EplProductDo> getEplProducts() {
        return this.eplProducts;
    }

    public void setEplProducts(Set<EplProductDo> eplProducts) {
        this.eplProducts = eplProducts;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("scheduleName").append("='").append(getScheduleName()).append("' ");
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

        if (!(other instanceof EplCsFedScheduleDo)) {
            return false;
        }

        EplCsFedScheduleDo castOther = (EplCsFedScheduleDo) other;

        return ((this.getEplId() == castOther.getEplId()) || (this.getEplId() != null && castOther.getEplId() != null && this.getEplId()
            .equals(castOther.getEplId())))
            && ((this.getScheduleName() == castOther.getScheduleName()) || (this.getScheduleName() != null
                && castOther.getScheduleName() != null && this.getScheduleName().equals(castOther.getScheduleName())))
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

        result = 37 * result + (getEplId() == null ? 0 : this.getEplId().hashCode());
        result = 37 * result + (getScheduleName() == null ? 0 : this.getScheduleName().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        return result;
    }

    public Date getInactivationDate() {
        return inactivationDate;
    }

    public void setInactivationDate(Date inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getRejectReasonText() {
        return rejectReasonText;
    }

    public void setRejectReasonText(String rejectReasonText) {
        this.rejectReasonText = rejectReasonText;
    }

    public String getRequestRejectReason() {
        return requestRejectReason;
    }

    public void setRequestRejectReason(String requestRejectReason) {
        this.requestRejectReason = requestRejectReason;
    }

    public Long getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

}
