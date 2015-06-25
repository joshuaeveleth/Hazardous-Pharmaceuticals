/**
 * Source file created in 2011 by Southwest Research Institute
 * 
 * Generated Oct 25, 2011 3:04:47 PM by Hibernate Tools 3.2.4.GA
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;

/**
 * EplFdbAutoAddDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplFdbAutoAddDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    // Fields
    public static final String NDC = "ndc";
    public static final String PACKAGE_SIZE = "packageSize";
    public static final String PACKAGE_TYPE = "packageType";
    public static final String GCNSEQNO = "gcnSeqno";
    public static final String MESSAGE = "message";
    public static final String VA_PRODUCT_NAME = "vaProductName";
    public static final String FDB_PRODUCT_NAME = "fdbProductName";
    public static final String ADD_DESC = "addDesc";
    public static final String NDC_ID_FK = "ndcIdFk";
    
    private static final long serialVersionUID = 1L; 

    private String ndc;
    private Double packageSize;
    private String packageType;
    private Long gcnSeqno;
    private String vaProductName;
    private String labelName;
    private String fdbProductName;
    private String addDesc;
    private Long ndcIdFk;
    private String createdBy;
    private Date createdDtm;
    private String lastModifiedBy;
    private Date lastModifiedDtm;

    /**
     * Default Constructor
     */
    public EplFdbAutoAddDo() {
    }

    /**
     * Full Constructor
     * 
     * @param ndc
     * @param packageSize
     * @param packageType
     * @param gcnSeqno
     * @param vaProductName
     * @param fdbProductName
     * @param addDesc
     * @param ndcIdFk
     * @param createdBy
     * @param createdDtm
     * @param lastModifiedBy
     * @param lastModifiedDtm
     */
    public EplFdbAutoAddDo(String ndc, Double packageSize, String packageType, 
                           Long gcnSeqno, String vaProductName, String labelName,
                           String fdbProductName, String addDesc, Long ndcIdFk, 
                           String createdBy, Date createdDtm, String lastModifiedBy, 
                           Date lastModifiedDtm) {
        
        this.ndc = ndc;
        this.packageSize = packageSize;
        this.packageType = packageType;
        this.gcnSeqno = gcnSeqno;
        this.vaProductName = vaProductName;
        this.fdbProductName = fdbProductName;
        this.labelName = labelName;
        this.addDesc = addDesc;
        this.ndcIdFk = ndcIdFk;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
    }
   
    /**
     * getNdc.
     * @return ndc
     */
    public String getNdc() {
        return ndc;
    }
    
    /**
     * setNdc.
     * @param ndc ndc 
     */
    public void setNdc(String ndc) {
        this.ndc = ndc;
    }
    
    /**
     * getLabelName.
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }
    
    /**
     * setLabelName.
     * @param labelName labelName 
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }


    /**
     * 
     * @return packageSize
     */
    public Double getPackageSize() {
        return packageSize;
    }

    /**
     * 
     * @param packageSize
     */
    public void setPackageSize(Double packageSize) {
        this.packageSize = packageSize;
    }

    /**
     * 
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 
     * @param packageType
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * getGcnSeqno.
     * @return gcnSeqno
     */
    public Long getGcnSeqno() {
        return gcnSeqno;
    }
    
    /**
     * setGcnSeqno.
     * @param gcnSeqno gcnSeqno 
     */
    public void setGcnSeqno(Long gcnSeqno) {
        this.gcnSeqno = gcnSeqno;
    }
    
    /**
     * getVaProductName.
     * @return vaProductName
     */
    public String getVaProductName() {
        return vaProductName;
    }
    
    /**
     * setVaProductName.
     * @param vaProductName vaProductName 
     */
    public void setVaProductName(String vaProductName) {
        this.vaProductName = vaProductName;
    }

    /**
     * 
     * @return fdbProductName
     */
    public String getFdbProductName() {
        return fdbProductName;
    }

    /**
     * 
     * @param fdbProductName
     */
    public void setFdbProductName(String fdbProductName) {
        this.fdbProductName = fdbProductName;
    }

    /**
     * getAddDesc.
     * @return addDesc
     */
    public String getAddDesc() {
        return addDesc;
    }
    
    /**
     * setAddDesc.
     * @param addDesc addDesc 
     */
    public void setAddDesc(String addDesc) {
        this.addDesc = addDesc;
    }
    
    /**
     * 
     * @return ndcIdFk
     */
    public Long getNdcIdFk() {
        return ndcIdFk;
    }

    /**
     * 
     * @param ndcIdFk
     */
    public void setNdcIdFk(Long ndcIdFk) {
        this.ndcIdFk = ndcIdFk;
    }

    /* (non-Javadoc)
     * @see gov.va.med.pharmacy.peps.domain.common.model.DataObject#toString()
     */
    @Override
    public String toString() {
        return "EplFdbAutoAddDo [ndc=" + ndc + ", packageSize=" + packageSize + ", packageType=" + 
        packageType + ", gcnSeqno=" + gcnSeqno + ", vaProductName=" + 
        vaProductName + ", fdbProductName=" + fdbProductName + ", addDesc=" + 
        addDesc + ", ndcIdFk=" + ndcIdFk + ", createdBy=" + createdBy + ", createdDtm=" +
        createdDtm + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDtm=" + lastModifiedDtm + "]";
    }

    /* (non-Javadoc)
     * @see gov.va.med.pharmacy.peps.domain.common.model.DataObject#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
        result = prime * result + ((createdDtm == null) ? 0 : createdDtm.hashCode());
        result = prime * result + ((fdbProductName == null) ? 0 : fdbProductName.hashCode());
        result = prime * result + ((addDesc == null) ? 0 : addDesc.hashCode());
        result = prime * result + ((gcnSeqno == null) ? 0 : gcnSeqno.hashCode());
        result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
        result = prime * result + ((lastModifiedDtm == null) ? 0 : lastModifiedDtm.hashCode());
        result = prime * result + ((ndc == null) ? 0 : ndc.hashCode());
        result = prime * result + ((ndcIdFk == null) ? 0 : ndcIdFk.hashCode());
        result = prime * result + ((packageSize == null) ? 0 : packageSize.hashCode());
        result = prime * result + ((packageType == null) ? 0 : packageType.hashCode());
        result = prime * result + ((vaProductName == null) ? 0 : vaProductName.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see gov.va.med.pharmacy.peps.domain.common.model.DataObject#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        EplFdbAutoAddDo other = (EplFdbAutoAddDo) obj;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        } else if (!createdBy.equals(other.createdBy))
            return false;
        if (createdDtm == null) {
            if (other.createdDtm != null)
                return false;
        } else if (!createdDtm.equals(other.createdDtm))
            return false;
        if (fdbProductName == null) {
            if (other.fdbProductName != null)
                return false;
        } else if (!fdbProductName.equals(other.fdbProductName))
            return false;
        if (addDesc == null) {
            if (other.addDesc != null)
                return false;
        } else if (!addDesc.equals(other.addDesc))
            return false;
        if (gcnSeqno == null) {
            if (other.gcnSeqno != null)
                return false;
        } else if (!gcnSeqno.equals(other.gcnSeqno))
            return false;
        if (lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        } else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (lastModifiedDtm == null) {
            if (other.lastModifiedDtm != null)
                return false;
        } else if (!lastModifiedDtm.equals(other.lastModifiedDtm))
            return false;
        if (ndc == null) {
            if (other.ndc != null)
                return false;
        } else if (!ndc.equals(other.ndc))
            return false;
        if (ndcIdFk == null) {
            if (other.ndcIdFk != null)
                return false;
        } else if (!ndcIdFk.equals(other.ndcIdFk))
            return false;
        if (packageSize == null) {
            if (other.packageSize != null)
                return false;
        } else if (!packageSize.equals(other.packageSize))
            return false;
        if (packageType == null) {
            if (other.packageType != null)
                return false;
        } else if (!packageType.equals(other.packageType))
            return false;
        if (vaProductName == null) {
            if (other.vaProductName != null)
                return false;
        } else if (!vaProductName.equals(other.vaProductName))
            return false;
        return true;
    }

}


