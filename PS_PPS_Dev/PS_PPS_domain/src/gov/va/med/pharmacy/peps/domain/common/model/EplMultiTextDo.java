/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Jun 12, 2008 2:48:45 PM by Hibernate Tools 3.2.0.beta8

import java.util.Date;


/**
 * EplMultiTextDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplMultiTextDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    // Fields
    public static final String EPL_VA_DF_OWNER = "eplVadfOwner";
    public static final String EPL_VA_DF_OWNER_ID = "eplVadfOwner.id";
    public static final String EPL_VA_DF = "eplVaDf";
    
    private static final long serialVersionUID = 1L;

    private EplMultiTextDoKey key;
    private String pkOwnerType;
    private String pkTableName;
    private EplVadfOwnerDo eplVadfOwner;
    private EplVaDfDo eplVaDf;

    // Constructors

    /** default constructor */

    public EplMultiTextDo() {
    }

    /** minimal constructor */

    public EplMultiTextDo(EplMultiTextDoKey key, String createdBy, Date createdDtm) {
        this.key = key;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplMultiTextDo(EplMultiTextDoKey key, String pkOwnerType, String pkTableName, String createdBy, Date createdDtm,
                          String lastModifiedBy, Date lastModifiedDtm, EplVadfOwnerDo eplVadfOwner, EplVaDfDo eplVaDf) {
        this.key = key;
        this.pkOwnerType = pkOwnerType;
        this.pkTableName = pkTableName;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplVadfOwner = eplVadfOwner;
        this.eplVaDf = eplVaDf;
    }

    // Property accessors
    public EplMultiTextDoKey getKey() {
        return this.key;
    }

    public void setKey(EplMultiTextDoKey key) {
        this.key = key;
    }

    public String getPkOwnerType() {
        return this.pkOwnerType;
    }

    public void setPkOwnerType(String pkOwnerType) {
        this.pkOwnerType = pkOwnerType;
    }

    public String getPkTableName() {
        return this.pkTableName;
    }

    public void setPkTableName(String pkTableName) {
        this.pkTableName = pkTableName;
    }

    public EplVadfOwnerDo getEplVadfOwner() {
        return this.eplVadfOwner;
    }

    public void setEplVadfOwner(EplVadfOwnerDo eplVadfOwner) {
        this.eplVadfOwner = eplVadfOwner;
    }

    public EplVaDfDo getEplVaDf() {
        return this.eplVaDf;
    }

    public void setEplVaDf(EplVaDfDo eplVaDf) {
        this.eplVaDf = eplVaDf;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("pkOwnerType").append("='").append(getPkOwnerType()).append("' ");
        buffer.append("pkTableName").append("='").append(getPkTableName()).append("' ");
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
        
        if (!(other instanceof EplMultiTextDo)) {
            return false;
        }
        
        EplMultiTextDo castOther = (EplMultiTextDo) other;

        return ((this.getKey() == castOther.getKey()) || (this.getKey() != null && castOther.getKey() != null && this
            .getKey().equals(castOther.getKey())))
            && ((this.getPkOwnerType() == castOther.getPkOwnerType()) || (this.getPkOwnerType() != null
                && castOther.getPkOwnerType() != null && this.getPkOwnerType().equals(castOther.getPkOwnerType())))
            && ((this.getPkTableName() == castOther.getPkTableName()) || (this.getPkTableName() != null
                && castOther.getPkTableName() != null && this.getPkTableName().equals(castOther.getPkTableName())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getKey() == null ? 0 : this.getKey().hashCode());
        result = 37 * result + (getPkOwnerType() == null ? 0 : this.getPkOwnerType().hashCode());
        result = 37 * result + (getPkTableName() == null ? 0 : this.getPkTableName().hashCode());

        return result;
    }

}
