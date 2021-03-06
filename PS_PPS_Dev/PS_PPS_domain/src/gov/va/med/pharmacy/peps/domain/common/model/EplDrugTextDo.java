/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * EplDrugTextDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplDrugTextDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    public static final String EPL_ID = "eplId";
    public static final String INACTIVATION_DATE = "inactivationDate";
    public static final String DRUG_TEXT_NAME = "drugTextName";
    public static final String DRUG_TEXT_SYNONYM = "drugTextSynonym";
    public static final String DRUG_TEXT_LOCAL = "drugTextLocal";
    public static final String DRUG_TEXT_NATIONAL = "drugTextNational";
    public static final String REQUEST_STATUS = "requestStatus";
    public static final String ITEM_STATUS = "itemStatus";
    public static final String REJECT_REASON_TEXT = "rejectReasonText";
    public static final String REQUEST_REJECT_REASON = "requestRejectReason";
    public static final String REVISION_NUMBER = "revisionNumber";
    public static final String DRUG_TEXT_TYPE = "drugTextType";

    private static final long serialVersionUID = 1L;

    // Fields

    private Long eplId;
    private Date inactivationDate;
    private String drugTextType;
    private String drugTextName;
    private String drugTextLocal;
    private String drugTextNational;
    private String requestStatus;
    private String itemStatus;
    private String rejectReasonText;
    private String requestRejectReason;
    private Long revisionNumber;
    private Set<EplOiDrugTextLAssocDo> eplOiDrugTextLAssocs = new HashSet<EplOiDrugTextLAssocDo>(0);
    private Set<EplOiDrugTextNAssocDo> eplOiDrugTextNAssocs = new HashSet<EplOiDrugTextNAssocDo>(0);
    private Set<EplDtSynonymDo> eplDtSynonyms = new HashSet<EplDtSynonymDo>(0);

    // Constructors

    /** default constructor */

    public EplDrugTextDo() {
    }

    /** minimal constructor */

    public EplDrugTextDo(Long eplId, String drugTextName, String drugText, String requestStatus, String itemStatus,
                         Long revisionNumber, String createdBy, Date createdDtm) {
        this.eplId = eplId;
        this.drugTextName = drugTextName;
        this.drugTextLocal = drugText;
        this.requestStatus = requestStatus;
        this.itemStatus = itemStatus;
        this.revisionNumber = revisionNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplDrugTextDo(Long eplId, Date inactivationDate, String drugTextType, String drugTextName,
                         String drugTextLocal, String requestStatus, String itemStatus, String rejectReasonText,
                         String requestRejectReason, Long revisionNumber, String createdBy, Date createdDtm,
                         String lastModifiedBy,
                         Date lastModifiedDtm, Set<EplOiDrugTextLAssocDo> eplOiDrugTextLAssocs,
                         Set<EplOiDrugTextNAssocDo> eplOiDrugTextNAssocs, Set<EplDtSynonymDo> eplDtSynonyms,
                         String drugTextNational) {
        this.eplId = eplId;
        this.inactivationDate = inactivationDate;
        this.drugTextType = drugTextType;
        this.drugTextName = drugTextName;
        this.drugTextLocal = drugTextLocal;
        this.requestStatus = requestStatus;
        this.itemStatus = itemStatus;
        this.rejectReasonText = rejectReasonText;
        this.requestRejectReason = requestRejectReason;
        this.revisionNumber = revisionNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplOiDrugTextLAssocs = eplOiDrugTextLAssocs;
        this.eplOiDrugTextNAssocs = eplOiDrugTextNAssocs;
        this.eplDtSynonyms = eplDtSynonyms;
        this.drugTextNational = drugTextNational;
    }

    // Property accessors
    public Long getEplId() {
        return this.eplId;
    }

    public void setEplId(Long eplId) {
        this.eplId = eplId;
    }

    public Date getInactivationDate() {
        return this.inactivationDate;
    }

    public void setInactivationDate(Date inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

    public String getDrugTextType() {
        return this.drugTextType;
    }

    public void setDrugTextType(String drugTextType) {
        this.drugTextType = drugTextType;
    }

    public String getDrugTextName() {
        return this.drugTextName;
    }

    public void setDrugTextName(String drugTextName) {
        this.drugTextName = drugTextName;
    }

    public String getDrugTextLocal() {
        return this.drugTextLocal;
    }

    public void setDrugTextLocal(String drugTextLocal) {
        this.drugTextLocal = drugTextLocal;
    }

    public String getDrugTextNational() {
        return this.drugTextNational;
    }

    public void setDrugTextNational(String drugTextNational) {
        this.drugTextNational = drugTextNational;
    }

    public String getRequestStatus() {
        return this.requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getItemStatus() {
        return this.itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getRejectReasonText() {
        return this.rejectReasonText;
    }

    public void setRejectReasonText(String rejectReasonText) {
        this.rejectReasonText = rejectReasonText;
    }

    public String getRequestRejectReason() {
        return this.requestRejectReason;
    }

    public void setRequestRejectReason(String requestRejectReason) {
        this.requestRejectReason = requestRejectReason;
    }

    public Long getRevisionNumber() {
        return this.revisionNumber;
    }

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Set<EplOiDrugTextLAssocDo> getEplOiDrugTextLAssocs() {
        return this.eplOiDrugTextLAssocs;
    }

    public void setEplOiDrugTextLAssocs(Set<EplOiDrugTextLAssocDo> eplOiDrugTextLAssocs) {
        this.eplOiDrugTextLAssocs = eplOiDrugTextLAssocs;
    }

    public Set<EplDtSynonymDo> getEplDtSynonyms() {
        return this.eplDtSynonyms;
    }

    public void setEplDtSynonyms(Set<EplDtSynonymDo> eplDtSynonyms) {
        this.eplDtSynonyms = eplDtSynonyms;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("inactivationDate").append("='").append(getInactivationDate()).append("' ");
        buffer.append("drugTextType").append("='").append(getDrugTextType()).append("' ");
        buffer.append("drugTextName").append("='").append(getDrugTextName()).append("' ");
        buffer.append("drugTextLocal").append("='").append(getDrugTextLocal()).append("' ");
        buffer.append("drugTextNational").append("='").append(getDrugTextNational()).append("' ");
        buffer.append("requestStatus").append("='").append(getRequestStatus()).append("' ");
        buffer.append("itemStatus").append("='").append(getItemStatus()).append("' ");
        buffer.append("rejectReasonText").append("='").append(getRejectReasonText()).append("' ");
        buffer.append("requestRejectReason").append("='").append(getRequestRejectReason()).append("' ");
        buffer.append("revisionNumber").append("='").append(getRevisionNumber()).append("' ");
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

        if (!(other instanceof EplDrugTextDo)) {
            return false;
        }

        EplDrugTextDo castOther = (EplDrugTextDo) other;

        return ((this.getEplId() == castOther.getEplId()) || (this.getEplId() != null && castOther.getEplId() != null && this
            .getEplId().equals(castOther.getEplId())))
            && ((this.getInactivationDate() == castOther.getInactivationDate()) || (this.getInactivationDate() != null
                && castOther.getInactivationDate() != null && this.getInactivationDate().equals(
                    castOther.getInactivationDate())))
            && ((this.getDrugTextType() == castOther.getDrugTextType()) || (this.getDrugTextType() != null
                && castOther.getDrugTextType() != null && this.getDrugTextType().equals(castOther.getDrugTextType())))
            && ((this.getDrugTextName() == castOther.getDrugTextName()) || (this.getDrugTextName() != null
                && castOther.getDrugTextName() != null && this.getDrugTextName().equals(castOther.getDrugTextName())))
            && ((this.getDrugTextLocal() == castOther.getDrugTextLocal()) || (this.getDrugTextLocal() != null
                && castOther.getDrugTextLocal() != null && this.getDrugTextLocal().equals(castOther.getDrugTextLocal())))
            && ((this.getDrugTextNational() == castOther.getDrugTextNational()) || (this.getDrugTextNational() != null
                && castOther.getDrugTextNational() != null && this.getDrugTextNational().equals(
                    castOther.getDrugTextNational())))
            && ((this.getRequestStatus() == castOther.getRequestStatus()) || (this.getRequestStatus() != null
                && castOther.getRequestStatus() != null && this.getRequestStatus().equals(castOther.getRequestStatus())))
            && ((this.getItemStatus() == castOther.getItemStatus()) || (this.getItemStatus() != null
                && castOther.getItemStatus() != null && this.getItemStatus().equals(castOther.getItemStatus())))
            && ((this.getRejectReasonText() == castOther.getRejectReasonText()) || (this.getRejectReasonText() != null
                && castOther.getRejectReasonText() != null && this.getRejectReasonText().equals(
                    castOther.getRejectReasonText())))
            && ((this.getRequestRejectReason() == castOther.getRequestRejectReason()) || (this.getRequestRejectReason() != null
                && castOther.getRequestRejectReason() != null && this.getRequestRejectReason().equals(
                    castOther.getRequestRejectReason())))
            && ((this.getRevisionNumber() == castOther.getRevisionNumber()) || (this.getRevisionNumber() != null
                && castOther.getRevisionNumber() != null && this.getRevisionNumber().equals(castOther.getRevisionNumber())))
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
        result = 37 * result + (getInactivationDate() == null ? 0 : this.getInactivationDate().hashCode());
        result = 37 * result + (getDrugTextType() == null ? 0 : this.getDrugTextType().hashCode());
        result = 37 * result + (getDrugTextName() == null ? 0 : this.getDrugTextName().hashCode());
        result = 37 * result + (getDrugTextLocal() == null ? 0 : this.getDrugTextLocal().hashCode());
        result = 37 * result + (getDrugTextNational() == null ? 0 : this.getDrugTextNational().hashCode());
        result = 37 * result + (getRequestStatus() == null ? 0 : this.getRequestStatus().hashCode());
        result = 37 * result + (getItemStatus() == null ? 0 : this.getItemStatus().hashCode());
        result = 37 * result + (getRejectReasonText() == null ? 0 : this.getRejectReasonText().hashCode());
        result = 37 * result + (getRequestRejectReason() == null ? 0 : this.getRequestRejectReason().hashCode());
        result = 37 * result + (getRevisionNumber() == null ? 0 : this.getRevisionNumber().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        return result;
    }

    /**
     * 
     * @return eplOiDrugTextNAssocs property
     */
    public Set<EplOiDrugTextNAssocDo> getEplOiDrugTextNAssocs() {
        return eplOiDrugTextNAssocs;
    }

    /**
     * 
     * @param eplOiDrugTextNAssocs eplOiDrugTextNAssocs property
     */
    public void setEplOiDrugTextNAssocs(Set<EplOiDrugTextNAssocDo> eplOiDrugTextNAssocs) {
        this.eplOiDrugTextNAssocs = eplOiDrugTextNAssocs;
    }

}
