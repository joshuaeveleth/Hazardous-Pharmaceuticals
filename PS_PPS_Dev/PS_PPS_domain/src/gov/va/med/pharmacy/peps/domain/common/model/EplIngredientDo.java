/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Jun 25, 2008 2:51:44 PM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * EplIngredientDo generated by hbm2java
 * 
 * @hibernate.class
 */
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class EplIngredientDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    // Fields
    public static final String NAME = "name";
    public static final String ITEM_STATUS = "itemStatus";
    public static final String REQUEST_STATUS = "requestStatus";
    public static final String INACTIVATION_DATE = "inactivationDate";
    public static final String EPL_ID = "eplId";
    public static final String NDF_INGREDIENT_IEN = "ndfIngredientIen";
    
    private static final long serialVersionUID = 1L;

    private Long eplId;
    private String vuid;
    private String masterEntryForVuid;
    private String name;
    private Date inactivationDate;
    private String requestStatus;
    private String itemStatus;
    private String rejectReasonText;
    private String requestRejectReason;
    private Long revisionNumber;
    private Long ndfIngredientIen;
    private Set<EplIngredientDo> eplIngredients = new HashSet<EplIngredientDo>(0);
    private EplIngredientDo eplIngredient;
    private Set<EplProdIngredientAssocDo> eplProdIngredientAssocs = new HashSet<EplProdIngredientAssocDo>(0);

    // Constructors

    /** default constructor */
    
    public EplIngredientDo() {
    }

    /** minimal constructor */
    
    public EplIngredientDo(Long eplId, String vuid, String masterEntryForVuid, String name, String requestStatus, String itemStatus,
                           Long revisionNumber, String createdBy, Date createdDtm) {
        this.eplId = eplId;
        this.vuid = vuid;
        this.masterEntryForVuid = masterEntryForVuid;
        this.name = name;
        this.requestStatus = requestStatus;
        this.itemStatus = itemStatus;
        this.revisionNumber = revisionNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */
    
    public EplIngredientDo(Long eplId, String vuid, String masterEntryForVuid, String name, Date inactivationDate, String requestStatus,
                           String itemStatus, String rejectReasonText, String requestRejectReason, Long revisionNumber,
                           Long ndfIngredientIen,
                           String createdBy, Date createdDtm, String lastModifiedBy, Date lastModifiedDtm,
                           Set<EplIngredientDo> eplIngredients, EplIngredientDo eplIngredient,
                           Set<EplProdIngredientAssocDo> eplProdIngredientAssocs) {
        this.eplId = eplId;
        this.vuid = vuid;
        this.masterEntryForVuid = masterEntryForVuid;
        this.name = name;
        this.inactivationDate = inactivationDate;
        this.requestStatus = requestStatus;
        this.itemStatus = itemStatus;
        this.rejectReasonText = rejectReasonText;
        this.requestRejectReason = requestRejectReason;
        this.revisionNumber = revisionNumber;
        this.ndfIngredientIen = ndfIngredientIen;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplIngredients = eplIngredients;
        this.eplIngredient = eplIngredient;
        this.eplProdIngredientAssocs = eplProdIngredientAssocs;
    }

    // Property accessors
    public Long getEplId() {
        return this.eplId;
    }

    public void setEplId(Long eplId) {
        this.eplId = eplId;
    }
    
    // Property accessors
    public Long getNdfIngredientIen() {
        return this.ndfIngredientIen;
    }

    /**
     * setNdfIngredientIen
     * @param ndfIngredientIen
     */
    public void setNdfIngredientIen(Long ndfIngredientIen) {
        this.ndfIngredientIen = ndfIngredientIen;
    }

    public String getVuid() {
        return this.vuid;
    }

    public void setVuid(String vuid) {
        this.vuid = vuid;
    }

    public String getMasterEntryForVuid() {
        return this.masterEntryForVuid;
    }
    
    public void setMasterEntryForVuid(String masterEntryForVuid) {
        this.masterEntryForVuid = masterEntryForVuid;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInactivationDate() {
        return this.inactivationDate;
    }

    public void setInactivationDate(Date inactivationDate) {
        this.inactivationDate = inactivationDate;
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

    public EplIngredientDo getEplIngredient() {
        return this.eplIngredient;
    }

    public void setEplIngredient(EplIngredientDo eplIngredient) {
        this.eplIngredient = eplIngredient;
    }

    public Set<EplProdIngredientAssocDo> getEplProdIngredientAssocs() {
        return this.eplProdIngredientAssocs;
    }

    public void setEplProdIngredientAssocs(Set<EplProdIngredientAssocDo> eplProdIngredientAssocs) {
        this.eplProdIngredientAssocs = eplProdIngredientAssocs;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("vuid").append("='").append(getVuid()).append("' ");
        buffer.append("masterEntryForVuid").append("='").append(getMasterEntryForVuid()).append("' ");
        buffer.append("name").append("='").append(getName()).append("' ");
        buffer.append("inactivationDate").append("='").append(getInactivationDate()).append("' ");
        buffer.append("requestStatus").append("='").append(getRequestStatus()).append("' ");
        buffer.append("itemStatus").append("='").append(getItemStatus()).append("' ");
        buffer.append("rejectReasonText").append("='").append(getRejectReasonText()).append("' ");
        buffer.append("requestRejectReason").append("='").append(getRequestRejectReason()).append("' ");
        buffer.append("revisionNumber").append("='").append(getRevisionNumber()).append("' ");
        buffer.append("ndfIngredientIen").append("='").append(getRevisionNumber()).append("' ");
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
        
        if (!(other instanceof EplIngredientDo)) {
            return false;
        }
        
        EplIngredientDo castOther = (EplIngredientDo) other;

        return ((this.getEplId() == castOther.getEplId()) || (this.getEplId() != null && castOther.getEplId() != null && this
            .getEplId().equals(castOther.getEplId())))
            && ((this.getVuid() == castOther.getVuid()) || (this.getVuid() != null && castOther.getVuid() != null && this
                .getVuid().equals(castOther.getVuid())))
            && ((this.getMasterEntryForVuid() == castOther.getMasterEntryForVuid()) || (this.getMasterEntryForVuid() != null && castOther.getMasterEntryForVuid() != null && this
                .getMasterEntryForVuid().equals(castOther.getMasterEntryForVuid())))
            && ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null && this
                .getName().equals(castOther.getName())))
            && ((this.getInactivationDate() == castOther.getInactivationDate()) || (this.getInactivationDate() != null
                && castOther.getInactivationDate() != null && this.getInactivationDate().equals(
                    castOther.getInactivationDate())))
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
            && ((this.getNdfIngredientIen() == castOther.getNdfIngredientIen()) || (this.getNdfIngredientIen() != null
                && castOther.getNdfIngredientIen() != null && this.getNdfIngredientIen().equals(castOther.getNdfIngredientIen())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())))
            && ((this.getEplIngredient() == castOther.getEplIngredient()) || (this.getEplIngredient() != null
                && castOther.getEplIngredient() != null && this.getEplIngredient().equals(castOther.getEplIngredient())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getEplId() == null ? 0 : this.getEplId().hashCode());
        result = 37 * result + (getVuid() == null ? 0 : this.getVuid().hashCode());
        result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());

        return result;
    }

}