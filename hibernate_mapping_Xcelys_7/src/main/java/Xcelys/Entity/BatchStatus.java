package Xcelys.Entity;
// Generated Sep 20, 2011 10:12:32 AM by Hibernate Tools 3.2.0.CR1


import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BatchStatus generated by hbm2java
 */
@Entity
@Table(name="BATCH_STATUS"
    ,schema="DORIS"
)
public class BatchStatus extends Base.BaseEntity implements java.io.Serializable {


     private char status;
     private String description;

    public BatchStatus() {
    }

	
    public BatchStatus(char status) {
        this.status = status;
    }
    public BatchStatus(char status, String description) {
       this.status = status;
       this.description = description;
    }
   
     @Id 
    
    @Column(name="STATUS", nullable=false, length=1)
    public char getStatus() {
        return this.status;
    }
    
    public void setStatus(char status) {
        this.status = status;
    }
    
    @Column(name="DESCRIPTION", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


