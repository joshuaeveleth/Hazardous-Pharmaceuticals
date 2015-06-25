/**
 * Source file created in 2006 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Jan 8, 2009 3:09:37 PM by Hibernate Tools 3.2.0.beta8

import java.util.Date;


/**
 * EplNdcByOutpatientSiteNdcDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplNdcByOutpatientSiteNdcDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    public static final String OUTPATIENT_SITE = "outpatientSite";
    public static final String LAST_LOCAL_NDC = "lastLocalNdc";
    public static final String LAST_CMOP_NDC = "lastCmopNdc";
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private String outpatientSite;
    private String lastLocalNdc;
    private String lastCmopNdc;
    private EplProductDo eplProduct;

    // Constructors

    /** default constructor */

    public EplNdcByOutpatientSiteNdcDo() {
    }

    /** minimal constructor */

    public EplNdcByOutpatientSiteNdcDo(Long id, String createdBy, Date createdDtm) {
        this.id = id;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */
    
    public EplNdcByOutpatientSiteNdcDo(Long id, String outpatientSite, String lastLocalNdc, String lastCmopNdc,
                                       String createdBy, Date createdDtm, String lastModifiedBy, Date lastModifiedDtm,
                                       EplProductDo eplProduct) {
        this.id = id;
        this.outpatientSite = outpatientSite;
        this.lastLocalNdc = lastLocalNdc;
        this.lastCmopNdc = lastCmopNdc;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplProduct = eplProduct;
    }

    // Property accessors
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutpatientSite() {
        return this.outpatientSite;
    }

    public void setOutpatientSite(String outpatientSite) {
        this.outpatientSite = outpatientSite;
    }

    public String getLastLocalNdc() {
        return this.lastLocalNdc;
    }

    public void setLastLocalNdc(String lastLocalNdc) {
        this.lastLocalNdc = lastLocalNdc;
    }

    public String getLastCmopNdc() {
        return this.lastCmopNdc;
    }

    public void setLastCmopNdc(String lastCmopNdc) {
        this.lastCmopNdc = lastCmopNdc;
    }

    public EplProductDo getEplProduct() {
        return this.eplProduct;
    }

    public void setEplProduct(EplProductDo eplProduct) {
        this.eplProduct = eplProduct;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("outpatientSite").append("='").append(getOutpatientSite()).append("' ");
        buffer.append("lastLocalNdc").append("='").append(getLastLocalNdc()).append("' ");
        buffer.append("lastCmopNdc").append("='").append(getLastCmopNdc()).append("' ");
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

        if (!(other instanceof EplNdcByOutpatientSiteNdcDo)) {
            return false;
        }

        EplNdcByOutpatientSiteNdcDo castOther = (EplNdcByOutpatientSiteNdcDo) other;

        return ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null && this.getId()
            .equals(castOther.getId())))
            && ((this.getOutpatientSite() == castOther.getOutpatientSite()) || (this.getOutpatientSite() != null
                && castOther.getOutpatientSite() != null && this.getOutpatientSite().equals(castOther.getOutpatientSite())))
            && ((this.getLastLocalNdc() == castOther.getLastLocalNdc()) || (this.getLastLocalNdc() != null
                && castOther.getLastLocalNdc() != null && this.getLastLocalNdc().equals(castOther.getLastLocalNdc())))
            && ((this.getLastCmopNdc() == castOther.getLastCmopNdc()) || (this.getLastCmopNdc() != null
                && castOther.getLastCmopNdc() != null && this.getLastCmopNdc().equals(castOther.getLastCmopNdc())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())))
            && ((this.getEplProduct() == castOther.getEplProduct()) || (this.getEplProduct() != null
                && castOther.getEplProduct() != null && this.getEplProduct().equals(castOther.getEplProduct())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
        result = 37 * result + (getOutpatientSite() == null ? 0 : this.getOutpatientSite().hashCode());
        result = 37 * result + (getLastLocalNdc() == null ? 0 : this.getLastLocalNdc().hashCode());
        result = 37 * result + (getLastCmopNdc() == null ? 0 : this.getLastCmopNdc().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());
        result = 37 * result + (getEplProduct() == null ? 0 : this.getEplProduct().hashCode());
        
        return result;
    }

}
