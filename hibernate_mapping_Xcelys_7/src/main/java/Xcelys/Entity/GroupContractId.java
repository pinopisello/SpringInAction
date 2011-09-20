package Xcelys.Entity;
// Generated Sep 20, 2011 10:12:32 AM by Hibernate Tools 3.2.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupContractId generated by hbm2java
 */
@Embeddable
public class GroupContractId  implements java.io.Serializable {


     private int seqGroupId;
     private int seqGroupContract;

    public GroupContractId() {
    }

    public GroupContractId(int seqGroupId, int seqGroupContract) {
       this.seqGroupId = seqGroupId;
       this.seqGroupContract = seqGroupContract;
    }
   

    @Column(name="SEQ_GROUP_ID", nullable=false, precision=9, scale=0)
    public int getSeqGroupId() {
        return this.seqGroupId;
    }
    
    public void setSeqGroupId(int seqGroupId) {
        this.seqGroupId = seqGroupId;
    }

    @Column(name="SEQ_GROUP_CONTRACT", nullable=false, precision=9, scale=0)
    public int getSeqGroupContract() {
        return this.seqGroupContract;
    }
    
    public void setSeqGroupContract(int seqGroupContract) {
        this.seqGroupContract = seqGroupContract;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GroupContractId) ) return false;
		 GroupContractId castOther = ( GroupContractId ) other; 
         
		 return (this.getSeqGroupId()==castOther.getSeqGroupId())
 && (this.getSeqGroupContract()==castOther.getSeqGroupContract());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSeqGroupId();
         result = 37 * result + this.getSeqGroupContract();
         return result;
   }   


}


