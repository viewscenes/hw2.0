
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioAbnormalTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioAbnormalTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SEND_COUNTY = "发射国家";
	public static final String ALIAS_SEND_CITY = "发射城市";
	public static final String ALIAS_BROADCASTING_ORGANIZATIONS = "发射机构";
	public static final String ALIAS_REMOTE_STATION = "遥控站";
	public static final String ALIAS_COLLECTION_POINT = "采集点";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_LANGUAGE_ID = "languageId";
	public static final String ALIAS_LANGUAGE_NAME = "语言";
	public static final String ALIAS_STATION_ID = "stationId";
	public static final String ALIAS_STATION_NAME = "发射台";
	public static final String ALIAS_TRAN_NO = "机号";
	public static final String ALIAS_POWER = "功率";
	public static final String ALIAS_GET_TYPE = "収测方式：1实时2录音";
	public static final String ALIAS_ABNORMAL_TYPE = "异态类型：1，停播；2：断续停播；3，空播；4，断续空播；5，杂音；6，失真；7，调幅度低；8，错播；9，早播；10，迟播；11，多播；12，少播；13，跑频；14，收不到；15，串扰；16：其他";
	public static final String ALIAS_ABNORMAL_DATE = "异态日期";
	public static final String ALIAS_STARTTIME = "异态开始时间";
	public static final String ALIAS_ENDTIME = "异态结束时间";
	public static final String ALIAS_TYPE = "记录类型：1国外发射台质量异态，2海外落地节目质量异态";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_PLAY_TIME = "播音时间";
	public static final String ALIAS_IS_PROOFREAD = "校对：0，未校对;1：已校对";
	public static final String ALIAS_IS_AUDIT = "审核：0，未审核;1：已审核";
	public static final String ALIAS_ORA_ALARM_ID = "指标报警ID";
	public static final String ALIAS_INSERT_PERSON = "录入人";
	public static final String ALIAS_PROOF_PERSON = "校对人";
	public static final String ALIAS_AUDIT_PERSON = "审核人";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 发射国家       db_column: SEND_COUNTY 
     */	
	private String sendCounty;
    /**
     * 发射城市       db_column: SEND_CITY 
     */	
	private String sendCity;
    /**
     * 发射机构       db_column: BROADCASTING_ORGANIZATIONS 
     */	
	private String broadcastingOrganizations;
    /**
     * 遥控站       db_column: REMOTE_STATION 
     */	
	private String remoteStation;
    /**
     * 采集点       db_column: COLLECTION_POINT 
     */	
	private String collectionPoint;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * languageId       db_column: LANGUAGE_ID 
     */	
	
	private Long languageId;
    /**
     * 语言       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * stationId       db_column: STATION_ID 
     */	
	
	private Long stationId;
    /**
     * 发射台       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 机号       db_column: TRAN_NO 
     */	
	private String tranNo;
    /**
     * 功率       db_column: POWER 
     */	
	
	private Long power;
    /**
     * 収测方式：1实时2录音       db_column: GET_TYPE 
     */	
	
	private Long getType;
    /**
     * 异态类型：1，停播；2：断续停播；3，空播；4，断续空播；5，杂音；6，失真；7，调幅度低；8，错播；9，早播；10，迟播；11，多播；12，少播；13，跑频；14，收不到；15，串扰；16：其他       db_column: ABNORMAL_TYPE 
     */	
	
	private Long abnormalType;
    /**
     * 异态日期       db_column: ABNORMAL_DATE 
     */	
	
	private Date abnormalDate;
    /**
     * 异态开始时间       db_column: STARTTIME 
     */	
	
	private Date starttime;
    /**
     * 异态结束时间       db_column: ENDTIME 
     */	
	
	private Date endtime;
    /**
     * 记录类型：1国外发射台质量异态，2海外落地节目质量异态       db_column: TYPE 
     */	
	
	private Long type;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
    /**
     * 播音时间       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * 校对：0，未校对;1：已校对       db_column: IS_PROOFREAD 
     */	
	
	private Long isProofread;
    /**
     * 审核：0，未审核;1：已审核       db_column: IS_AUDIT 
     */	
	
	private Long isAudit;
    /**
     * 指标报警ID       db_column: ORA_ALARM_ID 
     */	
	
	private Long oraAlarmId;
    /**
     * 录入人       db_column: INSERT_PERSON 
     */	
	private String insertPerson;
    /**
     * 校对人       db_column: PROOF_PERSON 
     */	
	private String proofPerson;
    /**
     * 审核人       db_column: AUDIT_PERSON 
     */	
	private String auditPerson;
	//columns END

	public RadioAbnormalTab(){
	}

	public RadioAbnormalTab(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setSendCounty(String value) {
		this.sendCounty = value;
	}
	
	public String getSendCounty() {
		return this.sendCounty;
	}
	public void setSendCity(String value) {
		this.sendCity = value;
	}
	
	public String getSendCity() {
		return this.sendCity;
	}
	public void setBroadcastingOrganizations(String value) {
		this.broadcastingOrganizations = value;
	}
	
	public String getBroadcastingOrganizations() {
		return this.broadcastingOrganizations;
	}
	public void setRemoteStation(String value) {
		this.remoteStation = value;
	}
	
	public String getRemoteStation() {
		return this.remoteStation;
	}
	public void setCollectionPoint(String value) {
		this.collectionPoint = value;
	}
	
	public String getCollectionPoint() {
		return this.collectionPoint;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setTranNo(String value) {
		this.tranNo = value;
	}
	
	public String getTranNo() {
		return this.tranNo;
	}
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	public void setGetType(Long value) {
		this.getType = value;
	}
	
	public Long getGetType() {
		return this.getType;
	}
	public void setAbnormalType(Long value) {
		this.abnormalType = value;
	}
	
	public Long getAbnormalType() {
		return this.abnormalType;
	}

	
	public void setAbnormalDate(Date value) {
		this.abnormalDate = value;
	}
	
	public Date getAbnormalDate() {
		return this.abnormalDate;
	}

	
	public void setStarttime(Date value) {
		this.starttime = value;
	}
	
	public Date getStarttime() {
		return this.starttime;
	}

	public void setEndtime(Date value) {
		this.endtime = value;
	}
	
	public Date getEndtime() {
		return this.endtime;
	}
	public void setType(Long value) {
		this.type = value;
	}
	
	public Long getType() {
		return this.type;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	public void setIsProofread(Long value) {
		this.isProofread = value;
	}
	
	public Long getIsProofread() {
		return this.isProofread;
	}
	public void setIsAudit(Long value) {
		this.isAudit = value;
	}
	
	public Long getIsAudit() {
		return this.isAudit;
	}
	public void setOraAlarmId(Long value) {
		this.oraAlarmId = value;
	}
	
	public Long getOraAlarmId() {
		return this.oraAlarmId;
	}
	public void setInsertPerson(String value) {
		this.insertPerson = value;
	}
	
	public String getInsertPerson() {
		return this.insertPerson;
	}
	public void setProofPerson(String value) {
		this.proofPerson = value;
	}
	
	public String getProofPerson() {
		return this.proofPerson;
	}
	public void setAuditPerson(String value) {
		this.auditPerson = value;
	}
	
	public String getAuditPerson() {
		return this.auditPerson;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("SendCounty",getSendCounty())
			.append("SendCity",getSendCity())
			.append("BroadcastingOrganizations",getBroadcastingOrganizations())
			.append("RemoteStation",getRemoteStation())
			.append("CollectionPoint",getCollectionPoint())
			.append("Frequency",getFrequency())
			.append("LanguageId",getLanguageId())
			.append("LanguageName",getLanguageName())
			.append("StationId",getStationId())
			.append("StationName",getStationName())
			.append("TranNo",getTranNo())
			.append("Power",getPower())
			.append("GetType",getGetType())
			.append("AbnormalType",getAbnormalType())
			.append("AbnormalDate",getAbnormalDate())
			.append("Starttime",getStarttime())
			.append("Endtime",getEndtime())
			.append("Type",getType())
			.append("Remark",getRemark())
			.append("PlayTime",getPlayTime())
			.append("IsProofread",getIsProofread())
			.append("IsAudit",getIsAudit())
			.append("OraAlarmId",getOraAlarmId())
			.append("InsertPerson",getInsertPerson())
			.append("ProofPerson",getProofPerson())
			.append("AuditPerson",getAuditPerson())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioAbnormalTab == false) return false;
		if(this == obj) return true;
		RadioAbnormalTab other = (RadioAbnormalTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

