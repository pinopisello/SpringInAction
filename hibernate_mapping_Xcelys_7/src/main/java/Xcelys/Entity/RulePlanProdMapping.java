package Xcelys.Entity;
// Generated Sep 20, 2011 10:12:32 AM by Hibernate Tools 3.2.0.CR1


import java.util.*;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RulePlanProdMapping generated by hbm2java
 */
@Entity
@Table(name="RULE_PLAN_PROD_MAPPING"
    ,schema="DORIS"
)
public class RulePlanProdMapping extends Base.BaseEntity implements java.io.Serializable {


     private RulePlanProdMappingId id;

    public RulePlanProdMapping() {
    }

    public RulePlanProdMapping(RulePlanProdMappingId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="region", column=@Column(name="REGION", nullable=false, length=1) ), 
        @AttributeOverride(name="tier1Code", column=@Column(name="TIER_1_CODE", length=15) ), 
        @AttributeOverride(name="tier2Code", column=@Column(name="TIER_2_CODE", length=15) ), 
        @AttributeOverride(name="tier3Code", column=@Column(name="TIER_3_CODE", length=15) ), 
        @AttributeOverride(name="medicarePlan", column=@Column(name="MEDICARE_PLAN", length=15) ), 
        @AttributeOverride(name="xcelysPlanProdCod", column=@Column(name="XCELYS_PLAN_PROD_COD", nullable=false, length=8) ), 
        @AttributeOverride(name="securityCode", column=@Column(name="SECURITY_CODE", length=1) ), 
        @AttributeOverride(name="insertDatetime", column=@Column(name="INSERT_DATETIME", length=7) ), 
        @AttributeOverride(name="insertUser", column=@Column(name="INSERT_USER", length=8) ), 
        @AttributeOverride(name="insertProcess", column=@Column(name="INSERT_PROCESS", length=8) ), 
        @AttributeOverride(name="updateDatetime", column=@Column(name="UPDATE_DATETIME", length=7) ), 
        @AttributeOverride(name="updateUser", column=@Column(name="UPDATE_USER", length=8) ), 
        @AttributeOverride(name="updateProcess", column=@Column(name="UPDATE_PROCESS", length=8) ) } )
    public RulePlanProdMappingId getId() {
        return this.id;
    }
    
    public void setId(RulePlanProdMappingId id) {
        this.id = id;
    }




}


