/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Apr 23, 2009 11:01:36 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;


/**
 * EplProdDrugTextNAssocDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplProdDrugTextNAssocDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    private static final long serialVersionUID = 1L;
    public static final String EPL_DRUG_TEXT = "eplDrugText";    

    private EplProdDrugTextNAssocDoKey key;
    private String createdBy;
    private Date createdDtm;
    private String lastModifiedBy;
    private Date lastModifiedDtm;
    private EplDrugTextDo eplDrugText;
    private EplProductDo eplProduct;

    // Constructors

    /** default constructor */
    
    public EplProdDrugTextNAssocDo() {
    }

    /** minimal constructor */
    
    public EplProdDrugTextNAssocDo(EplProdDrugTextNAssocDoKey key, String createdBy, Date createdDtm) {
        this.key = key;
        this.createdBy = createdBy;
        this.createdDtm = createdDtm;
    }

    /** full constructor */
    
    public EplProdDrugTextNAssocDo(EplProdDrugTextNAssocDoKey key, String createdBy, Date createdDtm, String lastModifiedBy,
                                   Date lastModifiedDtm, EplDrugTextDo eplDrugText, EplProductDo eplProduct) {
        this.key = key;
        this.createdBy = createdBy;
        this.createdDtm = createdDtm;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDtm = lastModifiedDtm;
        this.eplDrugText = eplDrugText;
        this.eplProduct = eplProduct;
    }

    // Property accessors
    public EplProdDrugTextNAssocDoKey getKey() {
        return this.key;
    }

    public void setKey(EplProdDrugTextNAssocDoKey key) {
        this.key = key;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDtm() {
        return this.createdDtm;
    }

    public void setCreatedDtm(Date createdDtm) {
        this.createdDtm = createdDtm;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDtm() {
        return this.lastModifiedDtm;
    }

    public void setLastModifiedDtm(Date lastModifiedDtm) {
        this.lastModifiedDtm = lastModifiedDtm;
    }

    public EplDrugTextDo getEplDrugText() {
        return this.eplDrugText;
    }

    public void setEplDrugText(EplDrugTextDo eplDrugText) {
        this.eplDrugText = eplDrugText;
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
        
        if (!(other instanceof EplProdDrugTextNAssocDo)) {
            return false;
        }
        
        EplProdDrugTextNAssocDo castOther = (EplProdDrugTextNAssocDo) other;

        return ((this.getKey() == castOther.getKey()) || (this.getKey() != null && castOther.getKey() != null && this
            .getKey().equals(castOther.getKey())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getKey() == null ? 0 : this.getKey().hashCode());

        return result;
    }

}
