/**
 * Source file created in 2011 by Southwest Research Institute
 * 
 * Generated Oct 25, 2011 3:04:47 PM by Hibernate Tools 3.2.4.GA
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;


/**
 * EplFdbGcnseqnoPemDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplFdbGcnseqnoPemDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    // Fields
    public static final String MONOGRAPH_ID = "monographId";
    public static final String GCNSEQNO = "gcnSeqNo";
    public static final String EPL_ID="eplId";
    
    private static final long serialVersionUID = 1L; 
    
    private Long gcnSeqNo;
    private Long monographId;
    private Long eplId;
    
    /**
     * Default Constructor
     */
    public EplFdbGcnseqnoPemDo() {
    }

    /**
     * Minimal Constructor
     * 
     * @param monographId PPSN EPL_ID
     */
    public EplFdbGcnseqnoPemDo(Long eplId, Long monographId, Long gcnSeqNo, String createdBy, Date createdDtm ) {
        this.monographId = monographId;
        this.eplId = eplId;
        this.gcnSeqNo = gcnSeqNo;
        this.createdBy = createdBy;
        this.createdDtm = createdDtm;
        
    }
    
    /**
     * Full Constructor
     * @param monographId monographId;
     * 
     */
    public EplFdbGcnseqnoPemDo(Long eplId, Long monographId,  Long gcnSeqNo, 
        String createdBy, Date createdDtm, String lastModifiedBy, Date lastModifiedDtm ) {
        
        this.monographId = monographId;
        this.eplId = eplId;
        this.gcnSeqNo = gcnSeqNo;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
    }
   
    
    public Long getEplId() {
        return eplId;
    }

    
    public void setEplId(Long eplId) {
        this.eplId = eplId;
    }

    // Property accessors
    public Long getMonographId() {
        return this.monographId;
    }
    
    public void setMonographId(Long monographId) {
        this.monographId = monographId;
    }
    
    public Long getGcnSeqNo() {
        return this.gcnSeqNo;
    }
    
    public void setGcnSeqNo(Long gcnSeqNo) {
        this.gcnSeqNo = gcnSeqNo;
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
    @Override
    public String toString() {
        return "EplFdbNdcDo [monographID=" + monographId + ", gcnSeqNo=" + gcnSeqNo
                + ", createdBy=" + createdBy + ", createdDtm="
                + createdDtm + ", lastModifiedBy=" + lastModifiedBy
                + ", lastModifiedDtm=" + lastModifiedDtm 
                + "]";
    }


    
    /**
     * hashCode
     * 
     * @return result string represents the hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((monographId == null) ? 0 : monographId.hashCode());
        result = prime * result
                + ((gcnSeqNo == null) ? 0 : gcnSeqNo.hashCode());
       
        return result;
    }

    /**
     * equals
     * 
     * @param obj EplFdbAddDo object
     * @return result returns the hash code results
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!super.equals(obj)) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        EplFdbGcnseqnoPemDo other = (EplFdbGcnseqnoPemDo) obj;
        
        if (monographId == null) {
            if (other.monographId != null) {
                return false;
            }
        }
        else if (!monographId.equals(other.monographId)) {
            return false;
        }
        
        if (eplId == null) {
            if (other.eplId != null) {
                return false;
            }
        }
        else if (!eplId.equals(other.eplId)) {
            return false;
        }
        
        if (createdDtm == null) {
            if (other.createdDtm != null) {
                return false;
            }
        }
        else if (!createdDtm.equals(other.createdDtm)) {
            return false;
        }
        
        if (gcnSeqNo == null) {
            if (other.gcnSeqNo != null) {
                return false;
            }
        }
        else if (!gcnSeqNo.equals(other.gcnSeqNo)) {
            return false;
        }
        
        return true;
    }
}


