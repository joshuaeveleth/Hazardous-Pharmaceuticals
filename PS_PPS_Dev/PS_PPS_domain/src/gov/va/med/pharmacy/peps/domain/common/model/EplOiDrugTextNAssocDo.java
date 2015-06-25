/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Apr 27, 2009 12:35:56 PM by Hibernate Tools 3.2.0.beta8

/**
 * EplOiDrugTextNAssocDo generated by hbm2java
 * @hibernate.class
 */
public class EplOiDrugTextNAssocDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    public static final String EPL_DRUG_TEXT = "eplDrugText";
    public static final String ORDERABLE_ITEM_EPL_ID = "eplOrderableItem.eplId";
    
    private static final long serialVersionUID = 1L;

    private EplOiDrugTextNAssocDoKey key;
    private EplDrugTextDo eplDrugText;
    private EplOrderableItemDo eplOrderableItem;

    // Constructors

    /** default constructor */

    public EplOiDrugTextNAssocDo() {
    }

    /** minimal constructor */

    public EplOiDrugTextNAssocDo(EplOiDrugTextNAssocDoKey key) {
        this.key = key;

    }

    /** full constructor */

    public EplOiDrugTextNAssocDo(EplOiDrugTextNAssocDoKey key, EplDrugTextDo eplDrugText, EplOrderableItemDo eplOrderableItem) {
        this.key = key;

        this.eplDrugText = eplDrugText;
        this.eplOrderableItem = eplOrderableItem;
    }

    // Property accessors
    public EplOiDrugTextNAssocDoKey getKey() {
        return this.key;
    }

    public void setKey(EplOiDrugTextNAssocDoKey key) {
        this.key = key;
    }

    public EplDrugTextDo getEplDrugText() {
        return this.eplDrugText;
    }

    public void setEplDrugText(EplDrugTextDo eplDrugText) {
        this.eplDrugText = eplDrugText;
    }

    public EplOrderableItemDo getEplOrderableItem() {
        return this.eplOrderableItem;
    }

    public void setEplOrderableItem(EplOrderableItemDo eplOrderableItem) {
        this.eplOrderableItem = eplOrderableItem;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");

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

        if (!(other instanceof EplOiDrugTextNAssocDo)) {
            return false;
        }

        EplOiDrugTextNAssocDo castOther = (EplOiDrugTextNAssocDo) other;

        return ((this.getKey() == castOther.getKey()) || (this.getKey() != null && castOther.getKey() != null && this
            .getKey().equals(castOther.getKey())));

    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getKey() == null ? 0 : this.getKey().hashCode());

        return result;
    }

}
