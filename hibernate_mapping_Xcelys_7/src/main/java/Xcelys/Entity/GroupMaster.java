package Xcelys.Entity;
// Generated Sep 20, 2011 10:12:32 AM by Hibernate Tools 3.2.0.CR1


import java.math.BigDecimal;
import java.util.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GroupMaster generated by hbm2java
 */
@Entity
@Table(name="GROUP_MASTER"
    ,schema="DORIS"
)
public class GroupMaster extends Base.BaseEntity implements java.io.Serializable {


     private int seqGroupId;
     private ReasonCodeMaster reasonCodeMasterByHoldReason;
     private GroupMaster parent;
     private ReasonCodeMaster reasonCodeMasterByPtdUseReasonCde;
     private String groupId;
     private String shortName;
     private char levelCode;
     private String groupName1;
     private String groupName2;
     private String addressLine1;
     private String addressLine2;
     private String city;
     private String state;
     private String zipCode;
     private Character groupType;
     private String sicCode;
     private String userDefined1;
     private String userDefined2;
     private char prorationMethod;
     private Character billingLevel;
     private String billingCycle;
     private String billingBatch;
     private Byte noOfRetroMonths;
     private Date billedThroughDate;
     private Short gracePeriod;
     private Character sortOption;
     private Date nextOpenStartDt;
     private Date nextOpenEndDate;
     private Date holdDate;
     private Character securityCode;
     private Date insertDatetime;
     private String insertUser;
     private String insertProcess;
     private Date updateDatetime;
     private String updateUser;
     private String updateProcess;
     private Date paidThroughDate;
     private String country;
     private Character billingFrequency;
     private Date commonBillingDate;
     private Short paymentDueDaysAfter;
     private Character rateFreezeCalc;
     private String invoicePrintFormat;
     private Character useEftFlg;
     private BigDecimal adultDepAgeParam;
     private Short maxDependentsCharge;
     private Character calcDueDateRule;
     private Byte calcDueDateDays;
     private Short ptdThresholdPct;
     private String nationalEmployerId;
     private String taxId;
     private String userDefined3;
     private String userDefined4;
     private String userDefined5;
     private String userDefined6;
     private String userDefined7;
     private String userDefined8;
     private String userDefined9;
     private String userDefined10;
     private String userDefined11;
     private String userDefined12;
     private String userDefined13;
     private String userDefined14;
     private String userDefined15;
     private String userDefined16;
     private String userDefined17;
     private String userDefined18;
     private String userDefined19;
     private String userDefined20;
     private String userDefined21;
     private String userDefined22;
     private Date userDate3;
     private Date userDate4;
     private Date userDate5;
     private Date userDate6;
     private Date userDate7;
     private Date userDate8;
     private Date userDate9;
     private Date userDate10;
     private Date userDate11;
     private Date userDate12;
     private Date userDate13;
     private Date userDate14;
     private Date userDate15;
     private Date userDate16;
     private Date userDate17;
     private Date userDate18;
     private Date userDate19;
     private Date userDate20;
     private Date userDate21;
     private Date userDate22;
     private String comments;
     private String allowBypassEdit;
     private String userDefined23;
     private String userDefined24;
     private Date userDate1;
     private Date userDate2;
     private String accountType;
     private String paplessSrcIdentifier;
     private String contractYrTimeFrame;
     private String billingFormat;
     private String asoIndicator;
     private Set<GroupContract> contracts = new HashSet<GroupContract>(0);
     private Set<PremiumMaster> premium_masters = new HashSet<PremiumMaster>(0);
     private Set<GroupMaster> subgroups = new HashSet<GroupMaster>(0);

    public GroupMaster() {
    }

	
    public GroupMaster(int seqGroupId, String groupId, String shortName, char levelCode, char prorationMethod) {
        this.seqGroupId = seqGroupId;
        this.groupId = groupId;
        this.shortName = shortName;
        this.levelCode = levelCode;
        this.prorationMethod = prorationMethod;
    }
    public GroupMaster(int seqGroupId, ReasonCodeMaster reasonCodeMasterByHoldReason, GroupMaster parent, ReasonCodeMaster reasonCodeMasterByPtdUseReasonCde, String groupId, String shortName, char levelCode, String groupName1, String groupName2, String addressLine1, String addressLine2, String city, String state, String zipCode, Character groupType, String sicCode, String userDefined1, String userDefined2, char prorationMethod, Character billingLevel, String billingCycle, String billingBatch, Byte noOfRetroMonths, Date billedThroughDate, Short gracePeriod, Character sortOption, Date nextOpenStartDt, Date nextOpenEndDate, Date holdDate, Character securityCode, Date insertDatetime, String insertUser, String insertProcess, Date updateDatetime, String updateUser, String updateProcess, Date paidThroughDate, String country, Character billingFrequency, Date commonBillingDate, Short paymentDueDaysAfter, Character rateFreezeCalc, String invoicePrintFormat, Character useEftFlg, BigDecimal adultDepAgeParam, Short maxDependentsCharge, Character calcDueDateRule, Byte calcDueDateDays, Short ptdThresholdPct, String nationalEmployerId, String taxId, String userDefined3, String userDefined4, String userDefined5, String userDefined6, String userDefined7, String userDefined8, String userDefined9, String userDefined10, String userDefined11, String userDefined12, String userDefined13, String userDefined14, String userDefined15, String userDefined16, String userDefined17, String userDefined18, String userDefined19, String userDefined20, String userDefined21, String userDefined22, Date userDate3, Date userDate4, Date userDate5, Date userDate6, Date userDate7, Date userDate8, Date userDate9, Date userDate10, Date userDate11, Date userDate12, Date userDate13, Date userDate14, Date userDate15, Date userDate16, Date userDate17, Date userDate18, Date userDate19, Date userDate20, Date userDate21, Date userDate22, String comments, String allowBypassEdit, String userDefined23, String userDefined24, Date userDate1, Date userDate2, String accountType, String paplessSrcIdentifier, String contractYrTimeFrame, String billingFormat, String asoIndicator, Set<GroupContract> contracts, Set<PremiumMaster> premium_masters, Set<GroupMaster> subgroups) {
       this.seqGroupId = seqGroupId;
       this.reasonCodeMasterByHoldReason = reasonCodeMasterByHoldReason;
       this.parent = parent;
       this.reasonCodeMasterByPtdUseReasonCde = reasonCodeMasterByPtdUseReasonCde;
       this.groupId = groupId;
       this.shortName = shortName;
       this.levelCode = levelCode;
       this.groupName1 = groupName1;
       this.groupName2 = groupName2;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.city = city;
       this.state = state;
       this.zipCode = zipCode;
       this.groupType = groupType;
       this.sicCode = sicCode;
       this.userDefined1 = userDefined1;
       this.userDefined2 = userDefined2;
       this.prorationMethod = prorationMethod;
       this.billingLevel = billingLevel;
       this.billingCycle = billingCycle;
       this.billingBatch = billingBatch;
       this.noOfRetroMonths = noOfRetroMonths;
       this.billedThroughDate = billedThroughDate;
       this.gracePeriod = gracePeriod;
       this.sortOption = sortOption;
       this.nextOpenStartDt = nextOpenStartDt;
       this.nextOpenEndDate = nextOpenEndDate;
       this.holdDate = holdDate;
       this.securityCode = securityCode;
       this.insertDatetime = insertDatetime;
       this.insertUser = insertUser;
       this.insertProcess = insertProcess;
       this.updateDatetime = updateDatetime;
       this.updateUser = updateUser;
       this.updateProcess = updateProcess;
       this.paidThroughDate = paidThroughDate;
       this.country = country;
       this.billingFrequency = billingFrequency;
       this.commonBillingDate = commonBillingDate;
       this.paymentDueDaysAfter = paymentDueDaysAfter;
       this.rateFreezeCalc = rateFreezeCalc;
       this.invoicePrintFormat = invoicePrintFormat;
       this.useEftFlg = useEftFlg;
       this.adultDepAgeParam = adultDepAgeParam;
       this.maxDependentsCharge = maxDependentsCharge;
       this.calcDueDateRule = calcDueDateRule;
       this.calcDueDateDays = calcDueDateDays;
       this.ptdThresholdPct = ptdThresholdPct;
       this.nationalEmployerId = nationalEmployerId;
       this.taxId = taxId;
       this.userDefined3 = userDefined3;
       this.userDefined4 = userDefined4;
       this.userDefined5 = userDefined5;
       this.userDefined6 = userDefined6;
       this.userDefined7 = userDefined7;
       this.userDefined8 = userDefined8;
       this.userDefined9 = userDefined9;
       this.userDefined10 = userDefined10;
       this.userDefined11 = userDefined11;
       this.userDefined12 = userDefined12;
       this.userDefined13 = userDefined13;
       this.userDefined14 = userDefined14;
       this.userDefined15 = userDefined15;
       this.userDefined16 = userDefined16;
       this.userDefined17 = userDefined17;
       this.userDefined18 = userDefined18;
       this.userDefined19 = userDefined19;
       this.userDefined20 = userDefined20;
       this.userDefined21 = userDefined21;
       this.userDefined22 = userDefined22;
       this.userDate3 = userDate3;
       this.userDate4 = userDate4;
       this.userDate5 = userDate5;
       this.userDate6 = userDate6;
       this.userDate7 = userDate7;
       this.userDate8 = userDate8;
       this.userDate9 = userDate9;
       this.userDate10 = userDate10;
       this.userDate11 = userDate11;
       this.userDate12 = userDate12;
       this.userDate13 = userDate13;
       this.userDate14 = userDate14;
       this.userDate15 = userDate15;
       this.userDate16 = userDate16;
       this.userDate17 = userDate17;
       this.userDate18 = userDate18;
       this.userDate19 = userDate19;
       this.userDate20 = userDate20;
       this.userDate21 = userDate21;
       this.userDate22 = userDate22;
       this.comments = comments;
       this.allowBypassEdit = allowBypassEdit;
       this.userDefined23 = userDefined23;
       this.userDefined24 = userDefined24;
       this.userDate1 = userDate1;
       this.userDate2 = userDate2;
       this.accountType = accountType;
       this.paplessSrcIdentifier = paplessSrcIdentifier;
       this.contractYrTimeFrame = contractYrTimeFrame;
       this.billingFormat = billingFormat;
       this.asoIndicator = asoIndicator;
       this.contracts = contracts;
       this.premium_masters = premium_masters;
       this.subgroups = subgroups;
    }
   
     @Id 
    
    @Column(name="SEQ_GROUP_ID", nullable=false, precision=9, scale=0)
    public int getSeqGroupId() {
        return this.seqGroupId;
    }
    
    public void setSeqGroupId(int seqGroupId) {
        this.seqGroupId = seqGroupId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="HOLD_REASON")
    public ReasonCodeMaster getReasonCodeMasterByHoldReason() {
        return this.reasonCodeMasterByHoldReason;
    }
    
    public void setReasonCodeMasterByHoldReason(ReasonCodeMaster reasonCodeMasterByHoldReason) {
        this.reasonCodeMasterByHoldReason = reasonCodeMasterByHoldReason;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SEQ_PARENT_ID")
    public GroupMaster getParent() {
        return this.parent;
    }
    
    public void setParent(GroupMaster parent) {
        this.parent = parent;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PTD_USE_REASON_CDE")
    public ReasonCodeMaster getReasonCodeMasterByPtdUseReasonCde() {
        return this.reasonCodeMasterByPtdUseReasonCde;
    }
    
    public void setReasonCodeMasterByPtdUseReasonCde(ReasonCodeMaster reasonCodeMasterByPtdUseReasonCde) {
        this.reasonCodeMasterByPtdUseReasonCde = reasonCodeMasterByPtdUseReasonCde;
    }
    
    @Column(name="GROUP_ID", nullable=false, length=12)
    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    @Column(name="SHORT_NAME", nullable=false, length=15)
    public String getShortName() {
        return this.shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    @Column(name="LEVEL_CODE", nullable=false, length=1)
    public char getLevelCode() {
        return this.levelCode;
    }
    
    public void setLevelCode(char levelCode) {
        this.levelCode = levelCode;
    }
    
    @Column(name="GROUP_NAME_1", length=40)
    public String getGroupName1() {
        return this.groupName1;
    }
    
    public void setGroupName1(String groupName1) {
        this.groupName1 = groupName1;
    }
    
    @Column(name="GROUP_NAME_2", length=40)
    public String getGroupName2() {
        return this.groupName2;
    }
    
    public void setGroupName2(String groupName2) {
        this.groupName2 = groupName2;
    }
    
    @Column(name="ADDRESS_LINE_1", length=40)
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    @Column(name="ADDRESS_LINE_2", length=40)
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    @Column(name="CITY", length=30)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Column(name="STATE", length=6)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    @Column(name="ZIP_CODE", length=15)
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    @Column(name="GROUP_TYPE", length=1)
    public Character getGroupType() {
        return this.groupType;
    }
    
    public void setGroupType(Character groupType) {
        this.groupType = groupType;
    }
    
    @Column(name="SIC_CODE", length=7)
    public String getSicCode() {
        return this.sicCode;
    }
    
    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }
    
    @Column(name="USER_DEFINED_1", length=15)
    public String getUserDefined1() {
        return this.userDefined1;
    }
    
    public void setUserDefined1(String userDefined1) {
        this.userDefined1 = userDefined1;
    }
    
    @Column(name="USER_DEFINED_2", length=15)
    public String getUserDefined2() {
        return this.userDefined2;
    }
    
    public void setUserDefined2(String userDefined2) {
        this.userDefined2 = userDefined2;
    }
    
    @Column(name="PRORATION_METHOD", nullable=false, length=1)
    public char getProrationMethod() {
        return this.prorationMethod;
    }
    
    public void setProrationMethod(char prorationMethod) {
        this.prorationMethod = prorationMethod;
    }
    
    @Column(name="BILLING_LEVEL", length=1)
    public Character getBillingLevel() {
        return this.billingLevel;
    }
    
    public void setBillingLevel(Character billingLevel) {
        this.billingLevel = billingLevel;
    }
    
    @Column(name="BILLING_CYCLE", length=3)
    public String getBillingCycle() {
        return this.billingCycle;
    }
    
    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }
    
    @Column(name="BILLING_BATCH", length=2)
    public String getBillingBatch() {
        return this.billingBatch;
    }
    
    public void setBillingBatch(String billingBatch) {
        this.billingBatch = billingBatch;
    }
    
    @Column(name="NO_OF_RETRO_MONTHS", precision=2, scale=0)
    public Byte getNoOfRetroMonths() {
        return this.noOfRetroMonths;
    }
    
    public void setNoOfRetroMonths(Byte noOfRetroMonths) {
        this.noOfRetroMonths = noOfRetroMonths;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BILLED_THROUGH_DATE", length=7)
    public Date getBilledThroughDate() {
        return this.billedThroughDate;
    }
    
    public void setBilledThroughDate(Date billedThroughDate) {
        this.billedThroughDate = billedThroughDate;
    }
    
    @Column(name="GRACE_PERIOD", precision=3, scale=0)
    public Short getGracePeriod() {
        return this.gracePeriod;
    }
    
    public void setGracePeriod(Short gracePeriod) {
        this.gracePeriod = gracePeriod;
    }
    
    @Column(name="SORT_OPTION", length=1)
    public Character getSortOption() {
        return this.sortOption;
    }
    
    public void setSortOption(Character sortOption) {
        this.sortOption = sortOption;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="NEXT_OPEN_START_DT", length=7)
    public Date getNextOpenStartDt() {
        return this.nextOpenStartDt;
    }
    
    public void setNextOpenStartDt(Date nextOpenStartDt) {
        this.nextOpenStartDt = nextOpenStartDt;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="NEXT_OPEN_END_DATE", length=7)
    public Date getNextOpenEndDate() {
        return this.nextOpenEndDate;
    }
    
    public void setNextOpenEndDate(Date nextOpenEndDate) {
        this.nextOpenEndDate = nextOpenEndDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="HOLD_DATE", length=7)
    public Date getHoldDate() {
        return this.holdDate;
    }
    
    public void setHoldDate(Date holdDate) {
        this.holdDate = holdDate;
    }
    
    @Column(name="SECURITY_CODE", length=1)
    public Character getSecurityCode() {
        return this.securityCode;
    }
    
    public void setSecurityCode(Character securityCode) {
        this.securityCode = securityCode;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="INSERT_DATETIME", length=7)
    public Date getInsertDatetime() {
        return this.insertDatetime;
    }
    
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }
    
    @Column(name="INSERT_USER", length=8)
    public String getInsertUser() {
        return this.insertUser;
    }
    
    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }
    
    @Column(name="INSERT_PROCESS", length=8)
    public String getInsertProcess() {
        return this.insertProcess;
    }
    
    public void setInsertProcess(String insertProcess) {
        this.insertProcess = insertProcess;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="UPDATE_DATETIME", length=7)
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }
    
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
    
    @Column(name="UPDATE_USER", length=8)
    public String getUpdateUser() {
        return this.updateUser;
    }
    
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    
    @Column(name="UPDATE_PROCESS", length=8)
    public String getUpdateProcess() {
        return this.updateProcess;
    }
    
    public void setUpdateProcess(String updateProcess) {
        this.updateProcess = updateProcess;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="PAID_THROUGH_DATE", length=7)
    public Date getPaidThroughDate() {
        return this.paidThroughDate;
    }
    
    public void setPaidThroughDate(Date paidThroughDate) {
        this.paidThroughDate = paidThroughDate;
    }
    
    @Column(name="COUNTRY", length=20)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    @Column(name="BILLING_FREQUENCY", length=1)
    public Character getBillingFrequency() {
        return this.billingFrequency;
    }
    
    public void setBillingFrequency(Character billingFrequency) {
        this.billingFrequency = billingFrequency;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="COMMON_BILLING_DATE", length=7)
    public Date getCommonBillingDate() {
        return this.commonBillingDate;
    }
    
    public void setCommonBillingDate(Date commonBillingDate) {
        this.commonBillingDate = commonBillingDate;
    }
    
    @Column(name="PAYMENT_DUE_DAYS_AFTER", precision=3, scale=0)
    public Short getPaymentDueDaysAfter() {
        return this.paymentDueDaysAfter;
    }
    
    public void setPaymentDueDaysAfter(Short paymentDueDaysAfter) {
        this.paymentDueDaysAfter = paymentDueDaysAfter;
    }
    
    @Column(name="RATE_FREEZE_CALC", length=1)
    public Character getRateFreezeCalc() {
        return this.rateFreezeCalc;
    }
    
    public void setRateFreezeCalc(Character rateFreezeCalc) {
        this.rateFreezeCalc = rateFreezeCalc;
    }
    
    @Column(name="INVOICE_PRINT_FORMAT", length=3)
    public String getInvoicePrintFormat() {
        return this.invoicePrintFormat;
    }
    
    public void setInvoicePrintFormat(String invoicePrintFormat) {
        this.invoicePrintFormat = invoicePrintFormat;
    }
    
    @Column(name="USE_EFT_FLG", length=1)
    public Character getUseEftFlg() {
        return this.useEftFlg;
    }
    
    public void setUseEftFlg(Character useEftFlg) {
        this.useEftFlg = useEftFlg;
    }
    
    @Column(name="ADULT_DEP_AGE_PARAM", precision=4, scale=1)
    public BigDecimal getAdultDepAgeParam() {
        return this.adultDepAgeParam;
    }
    
    public void setAdultDepAgeParam(BigDecimal adultDepAgeParam) {
        this.adultDepAgeParam = adultDepAgeParam;
    }
    
    @Column(name="MAX_DEPENDENTS_CHARGE", precision=3, scale=0)
    public Short getMaxDependentsCharge() {
        return this.maxDependentsCharge;
    }
    
    public void setMaxDependentsCharge(Short maxDependentsCharge) {
        this.maxDependentsCharge = maxDependentsCharge;
    }
    
    @Column(name="CALC_DUE_DATE_RULE", length=1)
    public Character getCalcDueDateRule() {
        return this.calcDueDateRule;
    }
    
    public void setCalcDueDateRule(Character calcDueDateRule) {
        this.calcDueDateRule = calcDueDateRule;
    }
    
    @Column(name="CALC_DUE_DATE_DAYS", precision=2, scale=0)
    public Byte getCalcDueDateDays() {
        return this.calcDueDateDays;
    }
    
    public void setCalcDueDateDays(Byte calcDueDateDays) {
        this.calcDueDateDays = calcDueDateDays;
    }
    
    @Column(name="PTD_THRESHOLD_PCT", precision=3, scale=0)
    public Short getPtdThresholdPct() {
        return this.ptdThresholdPct;
    }
    
    public void setPtdThresholdPct(Short ptdThresholdPct) {
        this.ptdThresholdPct = ptdThresholdPct;
    }
    
    @Column(name="NATIONAL_EMPLOYER_ID", length=9)
    public String getNationalEmployerId() {
        return this.nationalEmployerId;
    }
    
    public void setNationalEmployerId(String nationalEmployerId) {
        this.nationalEmployerId = nationalEmployerId;
    }
    
    @Column(name="TAX_ID", length=15)
    public String getTaxId() {
        return this.taxId;
    }
    
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
    
    @Column(name="USER_DEFINED_3", length=30)
    public String getUserDefined3() {
        return this.userDefined3;
    }
    
    public void setUserDefined3(String userDefined3) {
        this.userDefined3 = userDefined3;
    }
    
    @Column(name="USER_DEFINED_4", length=30)
    public String getUserDefined4() {
        return this.userDefined4;
    }
    
    public void setUserDefined4(String userDefined4) {
        this.userDefined4 = userDefined4;
    }
    
    @Column(name="USER_DEFINED_5", length=30)
    public String getUserDefined5() {
        return this.userDefined5;
    }
    
    public void setUserDefined5(String userDefined5) {
        this.userDefined5 = userDefined5;
    }
    
    @Column(name="USER_DEFINED_6", length=30)
    public String getUserDefined6() {
        return this.userDefined6;
    }
    
    public void setUserDefined6(String userDefined6) {
        this.userDefined6 = userDefined6;
    }
    
    @Column(name="USER_DEFINED_7", length=30)
    public String getUserDefined7() {
        return this.userDefined7;
    }
    
    public void setUserDefined7(String userDefined7) {
        this.userDefined7 = userDefined7;
    }
    
    @Column(name="USER_DEFINED_8", length=30)
    public String getUserDefined8() {
        return this.userDefined8;
    }
    
    public void setUserDefined8(String userDefined8) {
        this.userDefined8 = userDefined8;
    }
    
    @Column(name="USER_DEFINED_9", length=30)
    public String getUserDefined9() {
        return this.userDefined9;
    }
    
    public void setUserDefined9(String userDefined9) {
        this.userDefined9 = userDefined9;
    }
    
    @Column(name="USER_DEFINED_10", length=30)
    public String getUserDefined10() {
        return this.userDefined10;
    }
    
    public void setUserDefined10(String userDefined10) {
        this.userDefined10 = userDefined10;
    }
    
    @Column(name="USER_DEFINED_11", length=30)
    public String getUserDefined11() {
        return this.userDefined11;
    }
    
    public void setUserDefined11(String userDefined11) {
        this.userDefined11 = userDefined11;
    }
    
    @Column(name="USER_DEFINED_12", length=30)
    public String getUserDefined12() {
        return this.userDefined12;
    }
    
    public void setUserDefined12(String userDefined12) {
        this.userDefined12 = userDefined12;
    }
    
    @Column(name="USER_DEFINED_13", length=30)
    public String getUserDefined13() {
        return this.userDefined13;
    }
    
    public void setUserDefined13(String userDefined13) {
        this.userDefined13 = userDefined13;
    }
    
    @Column(name="USER_DEFINED_14", length=30)
    public String getUserDefined14() {
        return this.userDefined14;
    }
    
    public void setUserDefined14(String userDefined14) {
        this.userDefined14 = userDefined14;
    }
    
    @Column(name="USER_DEFINED_15", length=30)
    public String getUserDefined15() {
        return this.userDefined15;
    }
    
    public void setUserDefined15(String userDefined15) {
        this.userDefined15 = userDefined15;
    }
    
    @Column(name="USER_DEFINED_16", length=30)
    public String getUserDefined16() {
        return this.userDefined16;
    }
    
    public void setUserDefined16(String userDefined16) {
        this.userDefined16 = userDefined16;
    }
    
    @Column(name="USER_DEFINED_17", length=30)
    public String getUserDefined17() {
        return this.userDefined17;
    }
    
    public void setUserDefined17(String userDefined17) {
        this.userDefined17 = userDefined17;
    }
    
    @Column(name="USER_DEFINED_18", length=30)
    public String getUserDefined18() {
        return this.userDefined18;
    }
    
    public void setUserDefined18(String userDefined18) {
        this.userDefined18 = userDefined18;
    }
    
    @Column(name="USER_DEFINED_19", length=30)
    public String getUserDefined19() {
        return this.userDefined19;
    }
    
    public void setUserDefined19(String userDefined19) {
        this.userDefined19 = userDefined19;
    }
    
    @Column(name="USER_DEFINED_20", length=30)
    public String getUserDefined20() {
        return this.userDefined20;
    }
    
    public void setUserDefined20(String userDefined20) {
        this.userDefined20 = userDefined20;
    }
    
    @Column(name="USER_DEFINED_21", length=30)
    public String getUserDefined21() {
        return this.userDefined21;
    }
    
    public void setUserDefined21(String userDefined21) {
        this.userDefined21 = userDefined21;
    }
    
    @Column(name="USER_DEFINED_22", length=30)
    public String getUserDefined22() {
        return this.userDefined22;
    }
    
    public void setUserDefined22(String userDefined22) {
        this.userDefined22 = userDefined22;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_3", length=7)
    public Date getUserDate3() {
        return this.userDate3;
    }
    
    public void setUserDate3(Date userDate3) {
        this.userDate3 = userDate3;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_4", length=7)
    public Date getUserDate4() {
        return this.userDate4;
    }
    
    public void setUserDate4(Date userDate4) {
        this.userDate4 = userDate4;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_5", length=7)
    public Date getUserDate5() {
        return this.userDate5;
    }
    
    public void setUserDate5(Date userDate5) {
        this.userDate5 = userDate5;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_6", length=7)
    public Date getUserDate6() {
        return this.userDate6;
    }
    
    public void setUserDate6(Date userDate6) {
        this.userDate6 = userDate6;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_7", length=7)
    public Date getUserDate7() {
        return this.userDate7;
    }
    
    public void setUserDate7(Date userDate7) {
        this.userDate7 = userDate7;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_8", length=7)
    public Date getUserDate8() {
        return this.userDate8;
    }
    
    public void setUserDate8(Date userDate8) {
        this.userDate8 = userDate8;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_9", length=7)
    public Date getUserDate9() {
        return this.userDate9;
    }
    
    public void setUserDate9(Date userDate9) {
        this.userDate9 = userDate9;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_10", length=7)
    public Date getUserDate10() {
        return this.userDate10;
    }
    
    public void setUserDate10(Date userDate10) {
        this.userDate10 = userDate10;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_11", length=7)
    public Date getUserDate11() {
        return this.userDate11;
    }
    
    public void setUserDate11(Date userDate11) {
        this.userDate11 = userDate11;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_12", length=7)
    public Date getUserDate12() {
        return this.userDate12;
    }
    
    public void setUserDate12(Date userDate12) {
        this.userDate12 = userDate12;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_13", length=7)
    public Date getUserDate13() {
        return this.userDate13;
    }
    
    public void setUserDate13(Date userDate13) {
        this.userDate13 = userDate13;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_14", length=7)
    public Date getUserDate14() {
        return this.userDate14;
    }
    
    public void setUserDate14(Date userDate14) {
        this.userDate14 = userDate14;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_15", length=7)
    public Date getUserDate15() {
        return this.userDate15;
    }
    
    public void setUserDate15(Date userDate15) {
        this.userDate15 = userDate15;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_16", length=7)
    public Date getUserDate16() {
        return this.userDate16;
    }
    
    public void setUserDate16(Date userDate16) {
        this.userDate16 = userDate16;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_17", length=7)
    public Date getUserDate17() {
        return this.userDate17;
    }
    
    public void setUserDate17(Date userDate17) {
        this.userDate17 = userDate17;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_18", length=7)
    public Date getUserDate18() {
        return this.userDate18;
    }
    
    public void setUserDate18(Date userDate18) {
        this.userDate18 = userDate18;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_19", length=7)
    public Date getUserDate19() {
        return this.userDate19;
    }
    
    public void setUserDate19(Date userDate19) {
        this.userDate19 = userDate19;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_20", length=7)
    public Date getUserDate20() {
        return this.userDate20;
    }
    
    public void setUserDate20(Date userDate20) {
        this.userDate20 = userDate20;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_21", length=7)
    public Date getUserDate21() {
        return this.userDate21;
    }
    
    public void setUserDate21(Date userDate21) {
        this.userDate21 = userDate21;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_22", length=7)
    public Date getUserDate22() {
        return this.userDate22;
    }
    
    public void setUserDate22(Date userDate22) {
        this.userDate22 = userDate22;
    }
    
    @Column(name="COMMENTS", length=80)
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    @Column(name="ALLOW_BYPASS_EDIT", length=1)
    public String getAllowBypassEdit() {
        return this.allowBypassEdit;
    }
    
    public void setAllowBypassEdit(String allowBypassEdit) {
        this.allowBypassEdit = allowBypassEdit;
    }
    
    @Column(name="USER_DEFINED_23", length=60)
    public String getUserDefined23() {
        return this.userDefined23;
    }
    
    public void setUserDefined23(String userDefined23) {
        this.userDefined23 = userDefined23;
    }
    
    @Column(name="USER_DEFINED_24", length=60)
    public String getUserDefined24() {
        return this.userDefined24;
    }
    
    public void setUserDefined24(String userDefined24) {
        this.userDefined24 = userDefined24;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_1", length=7)
    public Date getUserDate1() {
        return this.userDate1;
    }
    
    public void setUserDate1(Date userDate1) {
        this.userDate1 = userDate1;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="USER_DATE_2", length=7)
    public Date getUserDate2() {
        return this.userDate2;
    }
    
    public void setUserDate2(Date userDate2) {
        this.userDate2 = userDate2;
    }
    
    @Column(name="ACCOUNT_TYPE", length=2)
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    @Column(name="PAPLESS_SRC_IDENTIFIER", length=5)
    public String getPaplessSrcIdentifier() {
        return this.paplessSrcIdentifier;
    }
    
    public void setPaplessSrcIdentifier(String paplessSrcIdentifier) {
        this.paplessSrcIdentifier = paplessSrcIdentifier;
    }
    
    @Column(name="CONTRACT_YR_TIME_FRAME", length=1)
    public String getContractYrTimeFrame() {
        return this.contractYrTimeFrame;
    }
    
    public void setContractYrTimeFrame(String contractYrTimeFrame) {
        this.contractYrTimeFrame = contractYrTimeFrame;
    }
    
    @Column(name="BILLING_FORMAT", length=20)
    public String getBillingFormat() {
        return this.billingFormat;
    }
    
    public void setBillingFormat(String billingFormat) {
        this.billingFormat = billingFormat;
    }
    
    @Column(name="ASO_INDICATOR", length=1)
    public String getAsoIndicator() {
        return this.asoIndicator;
    }
    
    public void setAsoIndicator(String asoIndicator) {
        this.asoIndicator = asoIndicator;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="group")
    public Set<GroupContract> getContracts() {
        return this.contracts;
    }
    
    public void setContracts(Set<GroupContract> contracts) {
        this.contracts = contracts;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="group")
    public Set<PremiumMaster> getPremium_masters() {
        return this.premium_masters;
    }
    
    public void setPremium_masters(Set<PremiumMaster> premium_masters) {
        this.premium_masters = premium_masters;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="parent")
    public Set<GroupMaster> getSubgroups() {
        return this.subgroups;
    }
    
    public void setSubgroups(Set<GroupMaster> subgroups) {
        this.subgroups = subgroups;
    }




}


