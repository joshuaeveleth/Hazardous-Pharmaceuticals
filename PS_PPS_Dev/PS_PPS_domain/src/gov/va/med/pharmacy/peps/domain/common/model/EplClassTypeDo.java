/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * EplClassTypeDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplClassTypeDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    
    // Fields
    public static final String CLASS_TYPE = "classType";
    private static final long serialVersionUID = 1L;

    private Long id;
    private String classType;
    private Set<EplVaDrugClassDo> eplVaDrugClasses = new HashSet<EplVaDrugClassDo>(0);

    // Constructors

    /** default constructor */

    public EplClassTypeDo() {
    }

    /** minimal constructor */

    public EplClassTypeDo(Long id, String classType, String createdBy, Date createdDtm) {
        this.id = id;
        this.classType = classType;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplClassTypeDo(Long id, String classType, String createdBy, Date createdDtm, String lastModifiedBy,
                          Date lastModifiedDtm, Set<EplVaDrugClassDo> eplVaDrugClasses) {
        this.id = id;
        this.classType = classType;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplVaDrugClasses = eplVaDrugClasses;
    }

    // Property accessors
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassType() {
        return this.classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Set<EplVaDrugClassDo> getEplVaDrugClasses() {
        return this.eplVaDrugClasses;
    }

    public void setEplVaDrugClasses(Set<EplVaDrugClassDo> eplVaDrugClasses) {
        this.eplVaDrugClasses = eplVaDrugClasses;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("classType").append("='").append(getClassType()).append("' ");
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

        if (!(other instanceof EplClassTypeDo)) {
            return false;
        }

        EplClassTypeDo castOther = (EplClassTypeDo) other;

        return ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null && this.getId()
            .equals(castOther.getId())))
            && ((this.getClassType() == castOther.getClassType()) || (this.getClassType() != null
                && castOther.getClassType() != null && this.getClassType().equals(castOther.getClassType())))
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
        result = 37 * result + (getClassType() == null ? 0 : this.getClassType().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        return result;
    }

}
