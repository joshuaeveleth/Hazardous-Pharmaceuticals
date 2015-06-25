/**
 * Source file created in 2006 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Feb 18, 2009 11:19:13 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;


/**
 * EplCmopIdGeneratorDo generated by hbm2java
 * @hibernate.class
 */
public class EplCmopIdGeneratorDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {
   
    // Fields
    
    private static final long serialVersionUID = 1L;

    private String prodNameInitialLetter;
    private String lastUsedCmopId;

    // Constructors

    /** default constructor */
    
    public EplCmopIdGeneratorDo() {
    }

    /** minimal constructor */
    
    public EplCmopIdGeneratorDo(String prodNameInitialLetter, String lastUsedCmopId, String createdBy, Date createdDtm) {
        this.prodNameInitialLetter = prodNameInitialLetter;
        this.lastUsedCmopId = lastUsedCmopId;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */
    
    public EplCmopIdGeneratorDo(String prodNameInitialLetter, String lastUsedCmopId, String createdBy, Date createdDtm,
                                String lastModifiedBy, Date lastModifiedDtm) {
        this.prodNameInitialLetter = prodNameInitialLetter;
        this.lastUsedCmopId = lastUsedCmopId;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
    }

    // Property accessors
    public String getProdNameInitialLetter() {
        return this.prodNameInitialLetter;
    }

    public void setProdNameInitialLetter(String prodNameInitialLetter) {
        this.prodNameInitialLetter = prodNameInitialLetter;
    }

    public String getLastUsedCmopId() {
        return this.lastUsedCmopId;
    }

    public void setLastUsedCmopId(String lastUsedCmopId) {
        this.lastUsedCmopId = lastUsedCmopId;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("lastUsedCmopId").append("='").append(getLastUsedCmopId()).append("' ");
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

        if (!(other instanceof EplCmopIdGeneratorDo)) {
            return false;
        }
        
        EplCmopIdGeneratorDo castOther = (EplCmopIdGeneratorDo) other;

        return ((this.getProdNameInitialLetter() == castOther.getProdNameInitialLetter()) || (this
            .getProdNameInitialLetter() != null
            && castOther.getProdNameInitialLetter() != null && this.getProdNameInitialLetter().equals(
                castOther.getProdNameInitialLetter())))
            && ((this.getLastUsedCmopId() == castOther.getLastUsedCmopId()) || (this.getLastUsedCmopId() != null
                && castOther.getLastUsedCmopId() != null && this.getLastUsedCmopId().equals(castOther.getLastUsedCmopId())))
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

        result = 37 * result + (getProdNameInitialLetter() == null ? 0 : this.getProdNameInitialLetter().hashCode());
        result = 37 * result + (getLastUsedCmopId() == null ? 0 : this.getLastUsedCmopId().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());
        
        return result;
    }

}