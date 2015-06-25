/**
 * Source file created in 2008 by Southwest Research Institute
 * 
 * Generated Feb 3, 2009 2:10:07 PM by Hibernate Tools 3.2.0.beta8
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;


/**
 * EplPharmacySystemDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplPharmacySystemDo extends
        gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
        java.io.Serializable {

    // Fields
    public static final String INACTIVATION_DATE = "inactivationDate";
    public static final String ITEM_STATUS = "itemStatus";
    public static final String REQUEST_STATUS = "requestStatus";
    public static final String SITE_NUMBER = "siteNumber";

    private static final long serialVersionUID = 1L;

    private Integer siteNumber;
    private String psAnd;
    private String psCmopWarningLabelSource;
    private String psDays;
    private String psExcept;
    private String psEight;
    private String psFive;
    private String psFor;
    private String psFour;
    private String psHours;
    private String psMinutes;
    private String psMonths;
    private String psNine;
    private String psOne;
    private String psOneFourth;
    private String psOneHalf;
    private String psOneThird;
    private String psOpaiWarningLabelSource;
    private String psPmisLanguage;
    private String psPmisPrinter;
    private String psPmisSectionDelete;
    private String psSeconds;
    private String psSeven;
    private String psSiteName;
    private String psSix;
    private String psTen;
    private String psThen;
    private String psThree;
    private String psThreeFourths;
    private String psTwo;
    private String psTwoThirds;
    private String psWarningLabelSource;
    private String psWeeks;
    private Date inactivationDate;
    private String itemStatus;
    private Long revisionNumber;

    // Constructors

    /** default constructor */

    public EplPharmacySystemDo() {
    }

    /** minimal constructor */

    public EplPharmacySystemDo(Integer siteNumber, String psPmisPrinter,
            String psSiteName, String requestStatus, String itemStatus,
            Long revisionNumber, String createdBy, Date createdDtm) {
        this.siteNumber = siteNumber;
        this.psPmisPrinter = psPmisPrinter;
        this.psSiteName = psSiteName;
        this.itemStatus = itemStatus;
        this.revisionNumber = revisionNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplPharmacySystemDo(Integer siteNumber, String psAnd,
            String psCmopWarningLabelSource, String psDays, String psExcept,
            String psEight, String psFive, String psFor, String psFour,
            String psHours, String psMinutes, String psMonths, String psNine,
            String psOne, String psOneFourth, String psOneHalf,
            String psOneThird, String psOpaiWarningLabelSource,
            String psPmisLanguage, String psPmisPrinter,
            String psPmisSectionDelete, String psSeconds, String psSeven,
            String psSiteName, String psSix, String psTen, String psThen,
            String psThree, String psThreeFourths, String psTwo,
            String psTwoThirds, String psWarningLabelSource, String psWeeks,
            Date inactivationDate, String itemStatus, Long revisionNumber,
            String createdBy, Date createdDtm, String lastModifiedBy,
            Date lastModifiedDtm) {
        this.siteNumber = siteNumber;
        this.psAnd = psAnd;
        this.psCmopWarningLabelSource = psCmopWarningLabelSource;
        this.psDays = psDays;
        this.psExcept = psExcept;
        this.psEight = psEight;
        this.psFive = psFive;
        this.psFor = psFor;
        this.psFour = psFour;
        this.psHours = psHours;
        this.psMinutes = psMinutes;
        this.psMonths = psMonths;
        this.psNine = psNine;
        this.psOne = psOne;
        this.psOneFourth = psOneFourth;
        this.psOneHalf = psOneHalf;
        this.psOneThird = psOneThird;
        this.psOpaiWarningLabelSource = psOpaiWarningLabelSource;
        this.psPmisLanguage = psPmisLanguage;
        this.psPmisPrinter = psPmisPrinter;
        this.psPmisSectionDelete = psPmisSectionDelete;
        this.psSeconds = psSeconds;
        this.psSeven = psSeven;
        this.psSiteName = psSiteName;
        this.psSix = psSix;
        this.psTen = psTen;
        this.psThen = psThen;
        this.psThree = psThree;
        this.psThreeFourths = psThreeFourths;
        this.psTwo = psTwo;
        this.psTwoThirds = psTwoThirds;
        this.psWarningLabelSource = psWarningLabelSource;
        this.psWeeks = psWeeks;
        this.inactivationDate = inactivationDate;
        this.itemStatus = itemStatus;
        this.revisionNumber = revisionNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
    }

    // Property accessors
    public Integer getSiteNumber() {
        return this.siteNumber;
    }

    public void setSiteNumber(Integer siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getPsAnd() {
        return this.psAnd;
    }

    public void setPsAnd(String psAnd) {
        this.psAnd = psAnd;
    }

    public String getPsCmopWarningLabelSource() {
        return this.psCmopWarningLabelSource;
    }

    public void setPsCmopWarningLabelSource(String psCmopWarningLabelSource) {
        this.psCmopWarningLabelSource = psCmopWarningLabelSource;
    }

    public String getPsDays() {
        return this.psDays;
    }

    public void setPsDays(String psDays) {
        this.psDays = psDays;
    }

    public String getPsExcept() {
        return this.psExcept;
    }

    public void setPsExcept(String psExcept) {
        this.psExcept = psExcept;
    }

    public String getPsEight() {
        return this.psEight;
    }

    public void setPsEight(String psEight) {
        this.psEight = psEight;
    }

    public String getPsFive() {
        return this.psFive;
    }

    public void setPsFive(String psFive) {
        this.psFive = psFive;
    }

    public String getPsFor() {
        return this.psFor;
    }

    public void setPsFor(String psFor) {
        this.psFor = psFor;
    }

    public String getPsFour() {
        return this.psFour;
    }

    public void setPsFour(String psFour) {
        this.psFour = psFour;
    }

    public String getPsHours() {
        return this.psHours;
    }

    public void setPsHours(String psHours) {
        this.psHours = psHours;
    }

    public String getPsMinutes() {
        return this.psMinutes;
    }

    public void setPsMinutes(String psMinutes) {
        this.psMinutes = psMinutes;
    }

    public String getPsMonths() {
        return this.psMonths;
    }

    public void setPsMonths(String psMonths) {
        this.psMonths = psMonths;
    }

    public String getPsNine() {
        return this.psNine;
    }

    public void setPsNine(String psNine) {
        this.psNine = psNine;
    }

    public String getPsOne() {
        return this.psOne;
    }

    public void setPsOne(String psOne) {
        this.psOne = psOne;
    }

    public String getPsOneFourth() {
        return this.psOneFourth;
    }

    public void setPsOneFourth(String psOneFourth) {
        this.psOneFourth = psOneFourth;
    }

    public String getPsOneHalf() {
        return this.psOneHalf;
    }

    public void setPsOneHalf(String psOneHalf) {
        this.psOneHalf = psOneHalf;
    }

    public String getPsOneThird() {
        return this.psOneThird;
    }

    public void setPsOneThird(String psOneThird) {
        this.psOneThird = psOneThird;
    }

    public String getPsOpaiWarningLabelSource() {
        return this.psOpaiWarningLabelSource;
    }

    public void setPsOpaiWarningLabelSource(String psOpaiWarningLabelSource) {
        this.psOpaiWarningLabelSource = psOpaiWarningLabelSource;
    }

    public String getPsPmisLanguage() {
        return this.psPmisLanguage;
    }

    public void setPsPmisLanguage(String psPmisLanguage) {
        this.psPmisLanguage = psPmisLanguage;
    }

    public String getPsPmisPrinter() {
        return this.psPmisPrinter;
    }

    public void setPsPmisPrinter(String psPmisPrinter) {
        this.psPmisPrinter = psPmisPrinter;
    }

    public String getPsPmisSectionDelete() {
        return this.psPmisSectionDelete;
    }

    public void setPsPmisSectionDelete(String psPmisSectionDelete) {
        this.psPmisSectionDelete = psPmisSectionDelete;
    }

    public String getPsSeconds() {
        return this.psSeconds;
    }

    public void setPsSeconds(String psSeconds) {
        this.psSeconds = psSeconds;
    }

    public String getPsSeven() {
        return this.psSeven;
    }

    public void setPsSeven(String psSeven) {
        this.psSeven = psSeven;
    }

    public String getPsSiteName() {
        return this.psSiteName;
    }

    public void setPsSiteName(String psSiteName) {
        this.psSiteName = psSiteName;
    }

    public String getPsSix() {
        return this.psSix;
    }

    public void setPsSix(String psSix) {
        this.psSix = psSix;
    }

    public String getPsTen() {
        return this.psTen;
    }

    public void setPsTen(String psTen) {
        this.psTen = psTen;
    }

    public String getPsThen() {
        return this.psThen;
    }

    public void setPsThen(String psThen) {
        this.psThen = psThen;
    }

    public String getPsThree() {
        return this.psThree;
    }

    public void setPsThree(String psThree) {
        this.psThree = psThree;
    }

    public String getPsThreeFourths() {
        return this.psThreeFourths;
    }

    public void setPsThreeFourths(String psThreeFourths) {
        this.psThreeFourths = psThreeFourths;
    }

    public String getPsTwo() {
        return this.psTwo;
    }

    public void setPsTwo(String psTwo) {
        this.psTwo = psTwo;
    }

    public String getPsTwoThirds() {
        return this.psTwoThirds;
    }

    public void setPsTwoThirds(String psTwoThirds) {
        this.psTwoThirds = psTwoThirds;
    }

    public String getPsWarningLabelSource() {
        return this.psWarningLabelSource;
    }

    public void setPsWarningLabelSource(String psWarningLabelSource) {
        this.psWarningLabelSource = psWarningLabelSource;
    }

    public String getPsWeeks() {
        return this.psWeeks;
    }

    public void setPsWeeks(String psWeeks) {
        this.psWeeks = psWeeks;
    }

    public Date getInactivationDate() {
        return inactivationDate;
    }

    public void setInactivationDate(Date inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Long getRevisionNumber() {
        return this.revisionNumber;
    }

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
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
        buffer.append("psAnd").append("='").append(getPsAnd()).append("' ");
        buffer.append("psCmopWarningLabelSource").append("='")
                .append(getPsCmopWarningLabelSource()).append("' ");
        buffer.append("psDays").append("='").append(getPsDays()).append("' ");
        buffer.append("psExcept").append("='").append(getPsExcept())
                .append("' ");
        buffer.append("psEight").append("='").append(getPsEight()).append("' ");
        buffer.append("psFive").append("='").append(getPsFive()).append("' ");
        buffer.append("psFor").append("='").append(getPsFor()).append("' ");
        buffer.append("psFour").append("='").append(getPsFour()).append("' ");
        buffer.append("psHours").append("='").append(getPsHours()).append("' ");
        buffer.append("psMinutes").append("='").append(getPsMinutes())
                .append("' ");
        buffer.append("psMonths").append("='").append(getPsMonths())
                .append("' ");
        buffer.append("psNine").append("='").append(getPsNine()).append("' ");
        buffer.append("psOne").append("='").append(getPsOne()).append("' ");
        buffer.append("psOneFourth").append("='").append(getPsOneFourth())
                .append("' ");
        buffer.append("psOneHalf").append("='").append(getPsOneHalf())
                .append("' ");
        buffer.append("psOneThird").append("='").append(getPsOneThird())
                .append("' ");
        buffer.append("psOpaiWarningLabelSource").append("='")
                .append(getPsOpaiWarningLabelSource()).append("' ");
        buffer.append("psPmisLanguage").append("='")
                .append(getPsPmisLanguage()).append("' ");
        buffer.append("psPmisPrinter").append("='").append(getPsPmisPrinter())
                .append("' ");
        buffer.append("psPmisSectionDelete").append("='")
                .append(getPsPmisSectionDelete()).append("' ");
        buffer.append("psSeconds").append("='").append(getPsSeconds())
                .append("' ");
        buffer.append("psSeven").append("='").append(getPsSeven()).append("' ");
        buffer.append("psSiteName").append("='").append(getPsSiteName())
                .append("' ");
        buffer.append("psSix").append("='").append(getPsSix()).append("' ");
        buffer.append("psTen").append("='").append(getPsTen()).append("' ");
        buffer.append("psThen").append("='").append(getPsThen()).append("' ");
        buffer.append("psThree").append("='").append(getPsThree()).append("' ");
        buffer.append("psThreeFourths").append("='")
                .append(getPsThreeFourths()).append("' ");
        buffer.append("psTwo").append("='").append(getPsTwo()).append("' ");
        buffer.append("psTwoThirds").append("='").append(getPsTwoThirds())
                .append("' ");
        buffer.append("psWarningLabelSource").append("='")
                .append(getPsWarningLabelSource()).append("' ");
        buffer.append("psWeeks").append("='").append(getPsWeeks()).append("' ");
        buffer.append("inactivationDate").append("='")
                .append(getInactivationDate()).append("' ");
        buffer.append("itemStatus").append("='").append(getItemStatus())
                .append("' ");
        buffer.append("revisionNumber").append("='")
                .append(getRevisionNumber()).append("' ");
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

        if (!(other instanceof EplPharmacySystemDo)) {
            return false;
        }

        EplPharmacySystemDo castOther = (EplPharmacySystemDo) other;

        return ((this.getSiteNumber() == castOther.getSiteNumber()) || (this
                .getSiteNumber() != null && castOther.getSiteNumber() != null && this
                .getSiteNumber().equals(castOther.getSiteNumber())))
                && ((this.getPsAnd() == castOther.getPsAnd()) || (this
                        .getPsAnd() != null && castOther.getPsAnd() != null && this
                        .getPsAnd().equals(castOther.getPsAnd())))
                && ((this.getPsCmopWarningLabelSource() == castOther
                        .getPsCmopWarningLabelSource()) || (this
                        .getPsCmopWarningLabelSource() != null
                        && castOther.getPsCmopWarningLabelSource() != null && this
                        .getPsCmopWarningLabelSource().equals(
                                castOther.getPsCmopWarningLabelSource())))
                && ((this.getPsDays() == castOther.getPsDays()) || (this
                        .getPsDays() != null && castOther.getPsDays() != null && this
                        .getPsDays().equals(castOther.getPsDays())))
                && ((this.getPsExcept() == castOther.getPsExcept()) || (this
                        .getPsExcept() != null
                        && castOther.getPsExcept() != null && this
                        .getPsExcept().equals(castOther.getPsExcept())))
                && ((this.getPsEight() == castOther.getPsEight()) || (this
                        .getPsEight() != null && castOther.getPsEight() != null && this
                        .getPsEight().equals(castOther.getPsEight())))
                && ((this.getPsFive() == castOther.getPsFive()) || (this
                        .getPsFive() != null && castOther.getPsFive() != null && this
                        .getPsFive().equals(castOther.getPsFive())))
                && ((this.getPsFor() == castOther.getPsFor()) || (this
                        .getPsFor() != null && castOther.getPsFor() != null && this
                        .getPsFor().equals(castOther.getPsFor())))
                && ((this.getPsFour() == castOther.getPsFour()) || (this
                        .getPsFour() != null && castOther.getPsFour() != null && this
                        .getPsFour().equals(castOther.getPsFour())))
                && ((this.getPsHours() == castOther.getPsHours()) || (this
                        .getPsHours() != null && castOther.getPsHours() != null && this
                        .getPsHours().equals(castOther.getPsHours())))
                && ((this.getPsMinutes() == castOther.getPsMinutes()) || (this
                        .getPsMinutes() != null
                        && castOther.getPsMinutes() != null && this
                        .getPsMinutes().equals(castOther.getPsMinutes())))
                && ((this.getPsMonths() == castOther.getPsMonths()) || (this
                        .getPsMonths() != null
                        && castOther.getPsMonths() != null && this
                        .getPsMonths().equals(castOther.getPsMonths())))
                && ((this.getPsNine() == castOther.getPsNine()) || (this
                        .getPsNine() != null && castOther.getPsNine() != null && this
                        .getPsNine().equals(castOther.getPsNine())))
                && ((this.getPsOne() == castOther.getPsOne()) || (this
                        .getPsOne() != null && castOther.getPsOne() != null && this
                        .getPsOne().equals(castOther.getPsOne())))
                && ((this.getPsOneFourth() == castOther.getPsOneFourth()) || (this
                        .getPsOneFourth() != null
                        && castOther.getPsOneFourth() != null && this
                        .getPsOneFourth().equals(castOther.getPsOneFourth())))
                && ((this.getPsOneHalf() == castOther.getPsOneHalf()) || (this
                        .getPsOneHalf() != null
                        && castOther.getPsOneHalf() != null && this
                        .getPsOneHalf().equals(castOther.getPsOneHalf())))
                && ((this.getPsOneThird() == castOther.getPsOneThird()) || (this
                        .getPsOneThird() != null
                        && castOther.getPsOneThird() != null && this
                        .getPsOneThird().equals(castOther.getPsOneThird())))
                && ((this.getPsOpaiWarningLabelSource() == castOther
                        .getPsOpaiWarningLabelSource()) || (this
                        .getPsOpaiWarningLabelSource() != null
                        && castOther.getPsOpaiWarningLabelSource() != null && this
                        .getPsOpaiWarningLabelSource().equals(
                                castOther.getPsOpaiWarningLabelSource())))
                && ((this.getPsPmisLanguage() == castOther.getPsPmisLanguage()) || (this
                        .getPsPmisLanguage() != null
                        && castOther.getPsPmisLanguage() != null && this
                        .getPsPmisLanguage().equals(
                                castOther.getPsPmisLanguage())))
                && ((this.getPsPmisPrinter() == castOther.getPsPmisPrinter()) || (this
                        .getPsPmisPrinter() != null
                        && castOther.getPsPmisPrinter() != null && this
                        .getPsPmisPrinter()
                        .equals(castOther.getPsPmisPrinter())))
                && ((this.getPsPmisSectionDelete() == castOther
                        .getPsPmisSectionDelete()) || (this
                        .getPsPmisSectionDelete() != null
                        && castOther.getPsPmisSectionDelete() != null && this
                        .getPsPmisSectionDelete().equals(
                                castOther.getPsPmisSectionDelete())))
                && ((this.getPsSeconds() == castOther.getPsSeconds()) || (this
                        .getPsSeconds() != null
                        && castOther.getPsSeconds() != null && this
                        .getPsSeconds().equals(castOther.getPsSeconds())))
                && ((this.getPsSeven() == castOther.getPsSeven()) || (this
                        .getPsSeven() != null && castOther.getPsSeven() != null && this
                        .getPsSeven().equals(castOther.getPsSeven())))
                && ((this.getPsSiteName() == castOther.getPsSiteName()) || (this
                        .getPsSiteName() != null
                        && castOther.getPsSiteName() != null && this
                        .getPsSiteName().equals(castOther.getPsSiteName())))
                && ((this.getPsSix() == castOther.getPsSix()) || (this
                        .getPsSix() != null && castOther.getPsSix() != null && this
                        .getPsSix().equals(castOther.getPsSix())))
                && ((this.getPsTen() == castOther.getPsTen()) || (this
                        .getPsTen() != null && castOther.getPsTen() != null && this
                        .getPsTen().equals(castOther.getPsTen())))
                && ((this.getPsThen() == castOther.getPsThen()) || (this
                        .getPsThen() != null && castOther.getPsThen() != null && this
                        .getPsThen().equals(castOther.getPsThen())))
                && ((this.getPsThree() == castOther.getPsThree()) || (this
                        .getPsThree() != null && castOther.getPsThree() != null && this
                        .getPsThree().equals(castOther.getPsThree())))
                && ((this.getPsThreeFourths() == castOther.getPsThreeFourths()) || (this
                        .getPsThreeFourths() != null
                        && castOther.getPsThreeFourths() != null && this
                        .getPsThreeFourths().equals(
                                castOther.getPsThreeFourths())))
                && ((this.getPsTwo() == castOther.getPsTwo()) || (this
                        .getPsTwo() != null && castOther.getPsTwo() != null && this
                        .getPsTwo().equals(castOther.getPsTwo())))
                && ((this.getPsTwoThirds() == castOther.getPsTwoThirds()) || (this
                        .getPsTwoThirds() != null
                        && castOther.getPsTwoThirds() != null && this
                        .getPsTwoThirds().equals(castOther.getPsTwoThirds())))
                && ((this.getPsWarningLabelSource() == castOther
                        .getPsWarningLabelSource()) || (this
                        .getPsWarningLabelSource() != null
                        && castOther.getPsWarningLabelSource() != null && this
                        .getPsWarningLabelSource().equals(
                                castOther.getPsWarningLabelSource())))
                && ((this.getPsWeeks() == castOther.getPsWeeks()) || (this
                        .getPsWeeks() != null && castOther.getPsWeeks() != null && this
                        .getPsWeeks().equals(castOther.getPsWeeks())))
                && ((this.getInactivationDate() == castOther
                        .getInactivationDate()) || (this.getInactivationDate() != null
                        && castOther.getInactivationDate() != null && this
                        .getInactivationDate().equals(
                                castOther.getInactivationDate())))
                && ((this.getItemStatus() == castOther.getItemStatus()) || (this
                        .getItemStatus() != null
                        && castOther.getItemStatus() != null && this
                        .getItemStatus().equals(castOther.getItemStatus())))
                && ((this.getRevisionNumber() == castOther.getRevisionNumber()) || (this
                        .getRevisionNumber() != null
                        && castOther.getRevisionNumber() != null && this
                        .getRevisionNumber().equals(
                                castOther.getRevisionNumber())))
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

        result = 37
                * result
                + (getSiteNumber() == null ? 0 : this.getSiteNumber()
                        .hashCode());
        result = 37 * result
                + (getPsAnd() == null ? 0 : this.getPsAnd().hashCode());
        result = 37
                * result
                + (getPsCmopWarningLabelSource() == null ? 0 : this
                        .getPsCmopWarningLabelSource().hashCode());
        result = 37 * result
                + (getPsDays() == null ? 0 : this.getPsDays().hashCode());
        result = 37 * result
                + (getPsExcept() == null ? 0 : this.getPsExcept().hashCode());
        result = 37 * result
                + (getPsEight() == null ? 0 : this.getPsEight().hashCode());
        result = 37 * result
                + (getPsFive() == null ? 0 : this.getPsFive().hashCode());
        result = 37 * result
                + (getPsFor() == null ? 0 : this.getPsFor().hashCode());
        result = 37 * result
                + (getPsFour() == null ? 0 : this.getPsFour().hashCode());
        result = 37 * result
                + (getPsHours() == null ? 0 : this.getPsHours().hashCode());
        result = 37 * result
                + (getPsMinutes() == null ? 0 : this.getPsMinutes().hashCode());
        result = 37 * result
                + (getPsMonths() == null ? 0 : this.getPsMonths().hashCode());
        result = 37 * result
                + (getPsNine() == null ? 0 : this.getPsNine().hashCode());
        result = 37 * result
                + (getPsOne() == null ? 0 : this.getPsOne().hashCode());
        result = 37
                * result
                + (getPsOneFourth() == null ? 0 : this.getPsOneFourth()
                        .hashCode());
        result = 37 * result
                + (getPsOneHalf() == null ? 0 : this.getPsOneHalf().hashCode());
        result = 37
                * result
                + (getPsOneThird() == null ? 0 : this.getPsOneThird()
                        .hashCode());
        result = 37
                * result
                + (getPsOpaiWarningLabelSource() == null ? 0 : this
                        .getPsOpaiWarningLabelSource().hashCode());
        result = 37
                * result
                + (getPsPmisLanguage() == null ? 0 : this.getPsPmisLanguage()
                        .hashCode());
        result = 37
                * result
                + (getPsPmisPrinter() == null ? 0 : this.getPsPmisPrinter()
                        .hashCode());
        result = 37
                * result
                + (getPsPmisSectionDelete() == null ? 0 : this
                        .getPsPmisSectionDelete().hashCode());
        result = 37 * result
                + (getPsSeconds() == null ? 0 : this.getPsSeconds().hashCode());
        result = 37 * result
                + (getPsSeven() == null ? 0 : this.getPsSeven().hashCode());
        result = 37
                * result
                + (getPsSiteName() == null ? 0 : this.getPsSiteName()
                        .hashCode());
        result = 37 * result
                + (getPsSix() == null ? 0 : this.getPsSix().hashCode());
        result = 37 * result
                + (getPsTen() == null ? 0 : this.getPsTen().hashCode());
        result = 37 * result
                + (getPsThen() == null ? 0 : this.getPsThen().hashCode());
        result = 37 * result
                + (getPsThree() == null ? 0 : this.getPsThree().hashCode());
        result = 37
                * result
                + (getPsThreeFourths() == null ? 0 : this.getPsThreeFourths()
                        .hashCode());
        result = 37 * result
                + (getPsTwo() == null ? 0 : this.getPsTwo().hashCode());
        result = 37
                * result
                + (getPsTwoThirds() == null ? 0 : this.getPsTwoThirds()
                        .hashCode());
        result = 37
                * result
                + (getPsWarningLabelSource() == null ? 0 : this
                        .getPsWarningLabelSource().hashCode());
        result = 37 * result
                + (getPsWeeks() == null ? 0 : this.getPsWeeks().hashCode());
        result = 37
                * result
                + (getInactivationDate() == null ? 0 : this
                        .getInactivationDate().hashCode());
        result = 37
                * result
                + (getItemStatus() == null ? 0 : this.getItemStatus()
                        .hashCode());
        result = 37
                * result
                + (getRevisionNumber() == null ? 0 : this.getRevisionNumber()
                        .hashCode());
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
