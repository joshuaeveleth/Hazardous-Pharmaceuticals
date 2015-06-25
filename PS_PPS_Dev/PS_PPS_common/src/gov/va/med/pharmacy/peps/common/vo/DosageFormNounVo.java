/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.common.vo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import gov.va.med.pharmacy.peps.common.utility.PPSConstants;




/**
 * Data representing a Noun MDF on a Dosage Form
 */
public class DosageFormNounVo extends ValueObject {
    private static final long serialVersionUID = 1L;

    private String noun;
    private String otherLanguageNoun;
    private Collection<PossibleDosagesPackageVo> packages = new ArrayList<PossibleDosagesPackageVo>(0);

    /**
     * getNoun.
     * @return noun property
     */
    public String getNoun() {
        return noun;
    }

    /**
     * setNoun.
     * @param noun noun property
     */
    public void setNoun(String noun) {
        this.noun = trimToEmpty(noun);
    }

    /**
     * getOtherLanguageNoun.
     * @return otherLanguageNoun property
     */
    public String getOtherLanguageNoun() {
        return otherLanguageNoun;
    }

    /**
     * setOtherLanguageNoun.
     * @param otherLanguageNoun otherLanguageNoun property
     */
    public void setOtherLanguageNoun(String otherLanguageNoun) {
        this.otherLanguageNoun = trimToEmpty(otherLanguageNoun);
    }

    /**
     * Returns true if the domain is standardized.
     * 
     * @return boolean
     */
    public boolean isStandardized() {
        return true;
    }

    /**
     * Returns true if this is a local only domain for DosageFormNounVo.
     * 
     * @return boolean
     */
    public boolean isLocal() {
        return false;
    }

    /**
     * Returns true if this is a local only domain for DosageFormNounVo.
     * 
     * @return boolean
     */
    public boolean isLocalOnlyData() {
        return false;
    }

    /**
     * getPackages for DosageFormNounVo.
     * @return packages property
     */
    public Collection<PossibleDosagesPackageVo> getPackages() {
        return packages;
    }

    /**
     * setPackages for DosageFormNounVo.
     * 
     * @param packages property
     */
    public void setPackages(Collection<PossibleDosagesPackageVo> packages) {
        this.packages = new ArrayList<PossibleDosagesPackageVo>();

        if (packages != null && !packages.isEmpty()) {
            this.packages.addAll(packages);
        }
    }

    /**
     * toShortString returns toString method of DosageFromNounVo.
     * 
     * @return String properties and values of the ValueObject
     * 
     * @see java.lang.Object#toString()
     */
    public String toShortString() {
        
        
        String s1 = FieldKey.getLocalizedName(FieldKey.DOSAGE_FORM_NOUN, Locale.getDefault());
        String s2 = FieldKey.getLocalizedName(FieldKey.OTHER_LANGUAGE_NOUN, Locale.getDefault());
        String s3 = FieldKey.getLocalizedName(FieldKey.PACKAGES, Locale.getDefault());

        StringBuffer value = new StringBuffer(s1 + ": " + noun + PPSConstants.P_TAG 
            + s2 + ": " 
            + (otherLanguageNoun == null ? "(Not specified)" + PPSConstants.P_TAG : otherLanguageNoun + "<br \\>")
            + s3 + ": ");
        
        for (PossibleDosagesPackageVo pk : packages) {
            value.append(pk.toShortString() + " ");
        }

        value.append("<p>");
        
        return value.toString();
    }
    
}
