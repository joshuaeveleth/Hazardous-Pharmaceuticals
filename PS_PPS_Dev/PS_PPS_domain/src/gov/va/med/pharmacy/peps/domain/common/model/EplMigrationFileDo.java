/**
 * Source file created in 2011 by Southwest Research Institute
 * 
 * Generated Aug 24, 2011 10:37:08 AM by Hibernate Tools 3.2.4.GA
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;


/**
 * EplMigrationFileDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplMigrationFileDo extends
        gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
        java.io.Serializable {

    // Fields
    public static final String FILE_ID = "fileId";
    public static final String MIGRATION_FILE_NAME = "migrationFileName";
    public static final String ROWS_PROCESSED_QTY = "rowsProcessedQty";
    public static final String ROWS_MIGRATED_QTY = "rowsMigratedQty";
    public static final String ROWS_NOT_MIGRATED_QTY = "rowsNotMigratedQty";
    public static final String ERROR_QTY = "errorQty";

    private static final long serialVersionUID = 1L;

    private Double fileId;
    private String migrationFileName;
    private Integer rowsProcessedQty;
    private Integer rowsMigratedQty;
    private Integer rowsNotMigratedQty;
    private Integer errorQty;
    private String createdBy;
    private Date createdDtm;
    private String lastModifiedBy;
    private Date lastModifiedDtm;

    public EplMigrationFileDo() {
    }

    public EplMigrationFileDo(Double fileId, String migrationFileName,
            String createdBy, Date createdDtm) {
        this.fileId = fileId;
        this.migrationFileName = migrationFileName;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    public EplMigrationFileDo(Double fileId, String migrationFileName,
            Integer rowsProcessedQty, Integer rowsMigratedQty,
            Integer rowsNotMigratedQty, Integer errorQty, String createdBy,
            Date createdDtm, String lastModifiedBy, Date lastModifiedDtm,
            EplMigrationControlDo eplMigrationControl,
            EplMigrationErrorDo eplMigrationError) {
        this.fileId = fileId;
        this.migrationFileName = migrationFileName;
        this.rowsProcessedQty = rowsProcessedQty;
        this.rowsMigratedQty = rowsMigratedQty;
        this.rowsNotMigratedQty = rowsNotMigratedQty;
        this.errorQty = errorQty;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
    }

    public Double getFileId() {
        return this.fileId;
    }

    public void setFileId(Double fileId) {
        this.fileId = fileId;
    }

    public String getMigrationFileName() {
        return this.migrationFileName;
    }

    public void setMigrationFileName(String migrationFileName) {
        this.migrationFileName = migrationFileName;
    }

    public Integer getRowsProcessedQty() {
        return this.rowsProcessedQty;
    }

    public void setRowsProcessedQty(Integer rowsProcessedQty) {
        this.rowsProcessedQty = rowsProcessedQty;
    }

    public Integer getRowsMigratedQty() {
        return this.rowsMigratedQty;
    }

    public void setRowsMigratedQty(Integer rowsMigratedQty) {
        this.rowsMigratedQty = rowsMigratedQty;
    }

    public Integer getRowsNotMigratedQty() {
        return this.rowsNotMigratedQty;
    }

    public void setRowsNotMigratedQty(Integer rowsNotMigratedQty) {
        this.rowsNotMigratedQty = rowsNotMigratedQty;
    }

    public Integer getErrorQty() {
        return this.errorQty;
    }

    public void setErrorQty(Integer errorQty) {
        this.errorQty = errorQty;
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

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@")
                .append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("fileId").append("='").append(getFileId()).append("' ");
        buffer.append("migrationFileName").append("='")
                .append(getMigrationFileName()).append("' ");
        buffer.append("rowsProcessedQty").append("='")
                .append(this.getRowsProcessedQty()).append("' ");
        buffer.append("rowsMigratedQty").append("='")
                .append(getRowsMigratedQty()).append("' ");
        buffer.append("rowsNotMigratedQty").append("='")
                .append(getRowsNotMigratedQty()).append("' ");
        buffer.append("errorQty").append("='").append(getErrorQty())
                .append("' ");
        buffer.append("createdBy").append("='").append(getCreatedBy())
                .append("' ");
        buffer.append("createdDtm").append("='").append(getCreatedDtm())
                .append("' ");
        buffer.append("lastModifiedBy").append("='")
                .append(getLastModifiedBy()).append("' ");
        buffer.append("lastModifiedDtm").append("='")
                .append(getLastModifiedDtm()).append("' ");
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

        if (!(other instanceof EplMigrationFileDo)) {
            return false;
        }

        EplMigrationFileDo castOther = (EplMigrationFileDo) other;

        return ((this.getFileId() == castOther.getFileId()) || (this
                .getFileId() != null && castOther.getFileId() != null && this
                .getFileId().equals(castOther.getFileId())))
                && ((this.getMigrationFileName() == castOther
                        .getMigrationFileName()) || (this
                        .getMigrationFileName() != null
                        && castOther.getMigrationFileName() != null && this
                        .getMigrationFileName().equals(
                                castOther.getMigrationFileName())))
                && ((this.getRowsProcessedQty() == castOther
                        .getRowsProcessedQty()) || (this.getRowsProcessedQty() != null
                        && castOther.getRowsProcessedQty() != null && this
                        .getRowsProcessedQty().equals(
                                castOther.getRowsProcessedQty())))
                && ((this.getRowsMigratedQty() == castOther
                        .getRowsMigratedQty()) || (this.getRowsMigratedQty() != null
                        && castOther.getRowsMigratedQty() != null && this
                        .getRowsMigratedQty().equals(
                                castOther.getRowsMigratedQty())))
                && ((this.getRowsNotMigratedQty() == castOther
                        .getRowsNotMigratedQty()) || (this
                        .getRowsNotMigratedQty() != null
                        && castOther.getRowsNotMigratedQty() != null && this
                        .getRowsNotMigratedQty().equals(
                                castOther.getRowsNotMigratedQty())))
                && ((this.getErrorQty() == castOther.getErrorQty()) || (this
                        .getErrorQty() != null
                        && castOther.getErrorQty() != null && this
                        .getErrorQty().equals(castOther.getErrorQty())))
                && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this
                        .getCreatedBy() != null
                        && castOther.getCreatedBy() != null && this
                        .getCreatedBy().equals(castOther.getCreatedBy())))
                && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this
                        .getCreatedDtm() != null
                        && castOther.getCreatedDtm() != null && this
                        .getCreatedDtm().equals(castOther.getCreatedDtm())))
                && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this
                        .getLastModifiedBy() != null
                        && castOther.getLastModifiedBy() != null && this
                        .getLastModifiedBy().equals(
                                castOther.getLastModifiedBy())))
                && ((this.getLastModifiedDtm() == castOther
                        .getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                        && castOther.getLastModifiedDtm() != null && this
                        .getLastModifiedDtm().equals(
                                castOther.getLastModifiedDtm())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getFileId() == null ? 0 : this.getFileId().hashCode());
        result = 37
                * result
                + (getMigrationFileName() == null ? 0 : this
                        .getMigrationFileName().hashCode());
        result = 37
                * result
                + (getRowsProcessedQty() == null ? 0 : this
                        .getRowsProcessedQty().hashCode());
        result = 37
                * result
                + (getRowsMigratedQty() == null ? 0 : this.getRowsMigratedQty()
                        .hashCode());
        result = 37
                * result
                + (getRowsNotMigratedQty() == null ? 0 : this
                        .getRowsNotMigratedQty().hashCode());
        result = 37 * result
                + (getErrorQty() == null ? 0 : this.getErrorQty().hashCode());
        result = 37 * result
                + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37
                * result
                + (getCreatedDtm() == null ? 0 : this.getCreatedDtm()
                        .hashCode());
        result = 37
                * result
                + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy()
                        .hashCode());
        result = 37
                * result
                + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm()
                        .hashCode());

        return result;
    }
}
