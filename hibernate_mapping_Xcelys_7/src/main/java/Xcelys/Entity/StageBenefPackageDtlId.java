package Xcelys.Entity;
// Generated Sep 20, 2011 10:12:32 AM by Hibernate Tools 3.2.0.CR1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StageBenefPackageDtlId generated by hbm2java
 */
@Embeddable
public class StageBenefPackageDtlId  implements java.io.Serializable {


     private String batchId;
     private int transactionId;
     private BigDecimal seqNo;

    public StageBenefPackageDtlId() {
    }

    public StageBenefPackageDtlId(String batchId, int transactionId, BigDecimal seqNo) {
       this.batchId = batchId;
       this.transactionId = transactionId;
       this.seqNo = seqNo;
    }
   

    @Column(name="BATCH_ID", nullable=false, length=9)
    public String getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Column(name="TRANSACTION_ID", nullable=false, precision=9, scale=0)
    public int getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Column(name="SEQ_NO", nullable=false, precision=22, scale=0)
    public BigDecimal getSeqNo() {
        return this.seqNo;
    }
    
    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StageBenefPackageDtlId) ) return false;
		 StageBenefPackageDtlId castOther = ( StageBenefPackageDtlId ) other; 
         
		 return ( (this.getBatchId()==castOther.getBatchId()) || ( this.getBatchId()!=null && castOther.getBatchId()!=null && this.getBatchId().equals(castOther.getBatchId()) ) )
 && (this.getTransactionId()==castOther.getTransactionId())
 && ( (this.getSeqNo()==castOther.getSeqNo()) || ( this.getSeqNo()!=null && castOther.getSeqNo()!=null && this.getSeqNo().equals(castOther.getSeqNo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBatchId() == null ? 0 : this.getBatchId().hashCode() );
         result = 37 * result + this.getTransactionId();
         result = 37 * result + ( getSeqNo() == null ? 0 : this.getSeqNo().hashCode() );
         return result;
   }   


}


