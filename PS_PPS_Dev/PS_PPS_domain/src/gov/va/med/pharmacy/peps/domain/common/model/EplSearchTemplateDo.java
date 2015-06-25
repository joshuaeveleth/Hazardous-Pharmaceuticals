
/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Oct 15, 2008 11:54:39 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * EplSearchTemplateDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplSearchTemplateDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    public static final String EPL_ID = "eplId";
    public static final String TEMPLATE_NAME = "templateName";
    public static final String TEMPLATE_TYPE = "templateType";
    public static final String USER = "eplUser";

    private static final long serialVersionUID = 1L;

    private Long eplId;
    private String templateName;
    private String templateType;
    private String advancedSearchYn;
    private String andSearchYn;
    private String defaultYn;
    private String notes;
    private Set<EplSearchCriteriaDo> eplSearchCriterias = new HashSet<EplSearchCriteriaDo>(0);
    private EplPrintTemplateDo eplPrintTemplate;
    private EplUserDo eplUser;

    // Constructors

    /** default constructor */

    public EplSearchTemplateDo() {
    }

    /** minimal constructor */

    public EplSearchTemplateDo(Long eplId, String templateName, String advancedSearchYn, String andSearchYn,
                               String defaultYn, String createdBy, Date createdDtm) {
        this.eplId = eplId;
        this.templateName = templateName;
        this.advancedSearchYn = advancedSearchYn;
        this.andSearchYn = andSearchYn;
        this.defaultYn = defaultYn;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplSearchTemplateDo(Long eplId, String templateName, String templateType, String advancedSearchYn,
                               String andSearchYn, String defaultYn, String notes, String createdBy, Date createdDtm,
                               String lastModifiedBy, Date lastModifiedDtm, Set<EplSearchCriteriaDo> eplSearchCriterias,
                               EplPrintTemplateDo eplPrintTemplate, EplUserDo eplUser) {
        this.eplId = eplId;
        this.templateName = templateName;
        this.templateType = templateType;
        this.advancedSearchYn = advancedSearchYn;
        this.andSearchYn = andSearchYn;
        this.defaultYn = defaultYn;
        this.notes = notes;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplSearchCriterias = eplSearchCriterias;
        this.eplPrintTemplate = eplPrintTemplate;
        this.eplUser = eplUser;
    }

    // Property accessors
    public Long getEplId() {
        return this.eplId;
    }

    public void setEplId(Long eplId) {
        this.eplId = eplId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getAdvancedSearchYn() {
        return this.advancedSearchYn;
    }

    public void setAdvancedSearchYn(String advancedSearchYn) {
        this.advancedSearchYn = advancedSearchYn;
    }

    /**
     * 
     * @return andSearchYn property
     */
    public String getAndSearchYn() {
        return andSearchYn;
    }

    /**
     * 
     * @param andSearchYn andSearchYn property
     */
    public void setAndSearchYn(String andSearchYn) {
        this.andSearchYn = andSearchYn;
    }

    public String getDefaultYn() {
        return this.defaultYn;
    }

    public void setDefaultYn(String defaultYn) {
        this.defaultYn = defaultYn;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<EplSearchCriteriaDo> getEplSearchCriterias() {
        return this.eplSearchCriterias;
    }

    public void setEplSearchCriterias(Set<EplSearchCriteriaDo> eplSearchCriterias) {
        this.eplSearchCriterias = eplSearchCriterias;
    }

    public EplPrintTemplateDo getEplPrintTemplate() {
        return this.eplPrintTemplate;
    }

    public void setEplPrintTemplate(EplPrintTemplateDo eplPrintTemplate) {
        this.eplPrintTemplate = eplPrintTemplate;
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
        buffer.append("templateName").append("='").append(getTemplateName()).append("' ");
        buffer.append("templateType").append("='").append(getTemplateType()).append("' ");
        buffer.append("advancedSearchYn").append("='").append(getAdvancedSearchYn()).append("' ");
        buffer.append("andSearchYn").append("='").append(getAndSearchYn()).append("' ");
        buffer.append("defaultYn").append("='").append(getDefaultYn()).append("' ");
        buffer.append("notes").append("='").append(getNotes()).append("' ");
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

        if (!(other instanceof EplSearchTemplateDo)) {
            return false;
        }

        EplSearchTemplateDo castOther = (EplSearchTemplateDo) other;

        return ((this.getEplId() == castOther.getEplId()) || (this.getEplId() != null && castOther.getEplId() != null && this
            .getEplId().equals(castOther.getEplId())))
            && ((this.getTemplateName() == castOther.getTemplateName()) || (this.getTemplateName() != null
                && castOther.getTemplateName() != null && this.getTemplateName().equals(castOther.getTemplateName())))
            && ((this.getTemplateType() == castOther.getTemplateType()) || (this.getTemplateType() != null
                && castOther.getTemplateType() != null && this.getTemplateType().equals(castOther.getTemplateType())))
            && ((this.getAdvancedSearchYn() == castOther.getAdvancedSearchYn()) || (this.getAdvancedSearchYn() != null
                && castOther.getAdvancedSearchYn() != null && this.getAdvancedSearchYn().equals(
                    castOther.getAdvancedSearchYn())))
            && ((this.getAndSearchYn() == castOther.getAndSearchYn()) || (this.getAndSearchYn() != null
                && castOther.getAndSearchYn() != null && this.getAndSearchYn().equals(castOther.getAndSearchYn())))
            && ((this.getDefaultYn() == castOther.getDefaultYn()) || (this.getDefaultYn() != null
                && castOther.getDefaultYn() != null && this.getDefaultYn().equals(castOther.getDefaultYn())))
            && ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null && castOther.getNotes() != null && this
                .getNotes().equals(castOther.getNotes())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())))
            && ((this.getEplPrintTemplate() == castOther.getEplPrintTemplate()) || (this.getEplPrintTemplate() != null
                && castOther.getEplPrintTemplate() != null && this.getEplPrintTemplate().equals(
                    castOther.getEplPrintTemplate())))
            && ((this.getEplUser() == castOther.getEplUser()) || (this.getEplUser() != null
                && castOther.getEplUser() != null && this.getEplUser().equals(castOther.getEplUser())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getEplId() == null ? 0 : this.getEplId().hashCode());
        result = 37 * result + (getTemplateName() == null ? 0 : this.getTemplateName().hashCode());
        result = 37 * result + (getTemplateType() == null ? 0 : this.getTemplateType().hashCode());
        result = 37 * result + (getAdvancedSearchYn() == null ? 0 : this.getAdvancedSearchYn().hashCode());
        result = 37 * result + (getAndSearchYn() == null ? 0 : this.getAndSearchYn().hashCode());
        result = 37 * result + (getDefaultYn() == null ? 0 : this.getDefaultYn().hashCode());
        result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        result = 37 * result + (getEplPrintTemplate() == null ? 0 : this.getEplPrintTemplate().hashCode());
        result = 37 * result + (getEplUser() == null ? 0 : this.getEplUser().hashCode());

        return result;
    }

}
