/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;


/**
 * EplMedInstructWardDo generated by hbm2java
 * @hibernate.class
 */
public class EplMedInstructWardDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {
  
    // Fields
    public static final String NAME  = "ward";
    private static final long serialVersionUID = 1L;

    private Long id;
    private String wardDefaultAdminTimes;
    private String ward;
    private EplMedicationInstructionDo eplMedicationInstruction;

    // Constructors

    /** default constructor */

    public EplMedInstructWardDo() {
    }

    /** minimal constructor */

    public EplMedInstructWardDo(Long id, String createdBy, Date createdDtm) {
        this.id = id;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplMedInstructWardDo(Long id, String wardDefaultAdminTimes, String ward, String createdBy, Date createdDtm,
                                String lastModifiedBy, Date lastModifiedDtm,
                                EplMedicationInstructionDo eplMedicationInstruction) {
        this.id = id;
        this.wardDefaultAdminTimes = wardDefaultAdminTimes;
        this.ward = ward;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplMedicationInstruction = eplMedicationInstruction;
    }

    // Property accessors
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWardDefaultAdminTimes() {
        return this.wardDefaultAdminTimes;
    }

    public void setWardDefaultAdminTimes(String wardDefaultAdminTimes) {
        this.wardDefaultAdminTimes = wardDefaultAdminTimes;
    }

    public String getWard() {
        return this.ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public EplMedicationInstructionDo getEplMedicationInstruction() {
        return this.eplMedicationInstruction;
    }

    public void setEplMedicationInstruction(EplMedicationInstructionDo eplMedicationInstruction) {
        this.eplMedicationInstruction = eplMedicationInstruction;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("wardDefaultAdminTimes").append("='").append(getWardDefaultAdminTimes()).append("' ");
        buffer.append("ward").append("='").append(getWard()).append("' ");
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

        if (!(other instanceof EplMedInstructWardDo)) {
            return false;
        }

        EplMedInstructWardDo castOther = (EplMedInstructWardDo) other;

        return ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null && this.getId()
            .equals(castOther.getId())))
            && ((this.getWardDefaultAdminTimes() == castOther.getWardDefaultAdminTimes()) || (this
                .getWardDefaultAdminTimes() != null
                && castOther.getWardDefaultAdminTimes() != null && this.getWardDefaultAdminTimes().equals(
                    castOther.getWardDefaultAdminTimes())))
            && ((this.getWard() == castOther.getWard()) || (this.getWard() != null && castOther.getWard() != null && this
                .getWard().equals(castOther.getWard())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())))
            && ((this.getEplMedicationInstruction() == castOther.getEplMedicationInstruction()) || (this
                .getEplMedicationInstruction() != null
                && castOther.getEplMedicationInstruction() != null && this.getEplMedicationInstruction().equals(
                    castOther.getEplMedicationInstruction())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
        result = 37 * result + (getWardDefaultAdminTimes() == null ? 0 : this.getWardDefaultAdminTimes().hashCode());
        result = 37 * result + (getWard() == null ? 0 : this.getWard().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());
        result = 37 * result + (getEplMedicationInstruction() == null ? 0 : this.getEplMedicationInstruction().hashCode());

        return result;
    }

}
