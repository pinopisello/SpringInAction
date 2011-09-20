package Xcelys.Entity;
// Generated Sep 20, 2011 10:12:32 AM by Hibernate Tools 3.2.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PremiumMasterId generated by hbm2java
 */
@Embeddable
public class PremiumMasterId  implements java.io.Serializable {


     private int seqGroupId;
     private int seqPremId;

    public PremiumMasterId() {
    }

    public PremiumMasterId(int seqGroupId, int seqPremId) {
       this.seqGroupId = seqGroupId;
       this.seqPremId = seqPremId;
    }
   

    @Column(name="SEQ_GROUP_ID", nullable=false, precision=9, scale=0)
    public int getSeqGroupId() {
        return this.seqGroupId;
    }
    
    public void setSeqGroupId(int seqGroupId) {
        this.seqGroupId = seqGroupId;
    }

    @Column(name="SEQ_PREM_ID", nullable=false, precision=9, scale=0)
    public int getSeqPremId() {
        return this.seqPremId;
    }
    
    public void setSeqPremId(int seqPremId) {
        this.seqPremId = seqPremId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PremiumMasterId) ) return false;
		 PremiumMasterId castOther = ( PremiumMasterId ) other; 
         
		 return (this.getSeqGroupId()==castOther.getSeqGroupId())
 && (this.getSeqPremId()==castOther.getSeqPremId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSeqGroupId();
         result = 37 * result + this.getSeqPremId();
         return result;
   }   


}


