/**
 * Source file created in 2008 by Southwest Research Institute
 */



package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Mar 27, 2009 2:34:31 PM by Hibernate Tools 3.2.0.beta8

import java.util.Date;


/**
 * EplNotifUserPrefDo generated by hbm2java
 * @hibernate.class
 */
public class EplNotifUserPrefDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    private static final long serialVersionUID = 1L;
    private EplNotifUserPrefDoKey key;
    private String createdBy;
    private Date createdDtm;
    private String lastModifiedBy;
    private Date lastModifiedDtm;
    private EplUserDo eplUser;

    // Constructors

    /** default constructor */
    
    public EplNotifUserPrefDo() {
    }

    /** minimal constructor */
    
    public EplNotifUserPrefDo(EplNotifUserPrefDoKey key, String createdBy, Date createdDtm) {
        this.key = key;
        this.createdBy = createdBy;
        this.createdDtm = createdDtm;
    }

    /** full constructor */
    
    public EplNotifUserPrefDo(EplNotifUserPrefDoKey key, String createdBy, Date createdDtm, String lastModifiedBy,
                              Date lastModifiedDtm, EplUserDo eplUser) {
        this.key = key;
        this.createdBy = createdBy;
        this.createdDtm = createdDtm;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDtm = lastModifiedDtm;
        this.eplUser = eplUser;
    }

    // Property accessors
    public EplNotifUserPrefDoKey getKey() {
        return this.key;
    }

    public void setKey(EplNotifUserPrefDoKey key) {
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

    public EplUserDo getEplUser() {
        return this.eplUser;
    }

    public void setEplUser(EplUserDo eplUser) {
        this.eplUser = eplUser;
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

        if (!(other instanceof EplNotifUserPrefDo)) {
            return false;
        }

        EplNotifUserPrefDo castOther = (EplNotifUserPrefDo) other;

        return ((this.getKey() == castOther.getKey()) || (this.getKey() != null && castOther.getKey() != null && this
            .getKey().equals(castOther.getKey())))
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

        result = 37 * result + (getKey() == null ? 0 : this.getKey().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        return result;
    }

}
