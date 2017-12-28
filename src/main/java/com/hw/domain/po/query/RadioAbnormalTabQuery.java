
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioAbnormalTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 发射国家 */
	private String sendCounty;
	/** 发射城市 */
	private String sendCity;
	/** 发射机构 */
	private String broadcastingOrganizations;
	/** 遥控站 */
	private String remoteStation;
	/** 采集点 */
	private String collectionPoint;
	/** 频率 */
	private Long frequency;
	/** languageId */
	private Long languageId;
	/** 语言 */
	private String languageName;
	/** stationId */
	private Long stationId;
	/** 发射台 */
	private String stationName;
	/** 机号 */
	private String tranNo;
	/** 功率 */
	private Long power;
	/** 収测方式：1实时2录音 */
	private Long getType;
	/** 异态类型：1，停播；2：断续停播；3，空播；4，断续空播；5，杂音；6，失真；7，调幅度低；8，错播；9，早播；10，迟播；11，多播；12，少播；13，跑频；14，收不到；15，串扰；16：其他 */
	private Long abnormalType;
	/** 异态日期 */
	private Date abnormalDateBegin;
	private Date abnormalDateEnd;
	/** 异态开始时间 */
	private Date starttimeBegin;
	private Date starttimeEnd;
	/** 异态结束时间 */
	private Date endtimeBegin;
	private Date endtimeEnd;
	/** 记录类型：1国外发射台质量异态，2海外落地节目质量异态 */
	private Long type;
	/** 备注 */
	private String remark;
	/** 播音时间 */
	private String playTime;
	/** 校对：0，未校对;1：已校对 */
	private Long isProofread;
	/** 审核：0，未审核;1：已审核 */
	private Long isAudit;
	/** 指标报警ID */
	private Long oraAlarmId;
	/** 录入人 */
	private String insertPerson;
	/** 校对人 */
	private String proofPerson;
	/** 审核人 */
	private String auditPerson;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getSendCounty() {
		return this.sendCounty;
	}
	
	public void setSendCounty(String value) {
		this.sendCounty = value;
	}
	
	public String getSendCity() {
		return this.sendCity;
	}
	
	public void setSendCity(String value) {
		this.sendCity = value;
	}
	
	public String getBroadcastingOrganizations() {
		return this.broadcastingOrganizations;
	}
	
	public void setBroadcastingOrganizations(String value) {
		this.broadcastingOrganizations = value;
	}
	
	public String getRemoteStation() {
		return this.remoteStation;
	}
	
	public void setRemoteStation(String value) {
		this.remoteStation = value;
	}
	
	public String getCollectionPoint() {
		return this.collectionPoint;
	}
	
	public void setCollectionPoint(String value) {
		this.collectionPoint = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getTranNo() {
		return this.tranNo;
	}
	
	public void setTranNo(String value) {
		this.tranNo = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getGetType() {
		return this.getType;
	}
	
	public void setGetType(Long value) {
		this.getType = value;
	}
	
	public Long getAbnormalType() {
		return this.abnormalType;
	}
	
	public void setAbnormalType(Long value) {
		this.abnormalType = value;
	}
	
	public Date getAbnormalDateBegin() {
		return this.abnormalDateBegin;
	}
	
	public void setAbnormalDateBegin(Date value) {
		this.abnormalDateBegin = value;
	}	
	
	public Date getAbnormalDateEnd() {
		return this.abnormalDateEnd;
	}
	
	public void setAbnormalDateEnd(Date value) {
		this.abnormalDateEnd = value;
	}
	
	public Date getStarttimeBegin() {
		return this.starttimeBegin;
	}
	
	public void setStarttimeBegin(Date value) {
		this.starttimeBegin = value;
	}	
	
	public Date getStarttimeEnd() {
		return this.starttimeEnd;
	}
	
	public void setStarttimeEnd(Date value) {
		this.starttimeEnd = value;
	}
	
	public Date getEndtimeBegin() {
		return this.endtimeBegin;
	}
	
	public void setEndtimeBegin(Date value) {
		this.endtimeBegin = value;
	}	
	
	public Date getEndtimeEnd() {
		return this.endtimeEnd;
	}
	
	public void setEndtimeEnd(Date value) {
		this.endtimeEnd = value;
	}
	
	public Long getType() {
		return this.type;
	}
	
	public void setType(Long value) {
		this.type = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public Long getIsProofread() {
		return this.isProofread;
	}
	
	public void setIsProofread(Long value) {
		this.isProofread = value;
	}
	
	public Long getIsAudit() {
		return this.isAudit;
	}
	
	public void setIsAudit(Long value) {
		this.isAudit = value;
	}
	
	public Long getOraAlarmId() {
		return this.oraAlarmId;
	}
	
	public void setOraAlarmId(Long value) {
		this.oraAlarmId = value;
	}
	
	public String getInsertPerson() {
		return this.insertPerson;
	}
	
	public void setInsertPerson(String value) {
		this.insertPerson = value;
	}
	
	public String getProofPerson() {
		return this.proofPerson;
	}
	
	public void setProofPerson(String value) {
		this.proofPerson = value;
	}
	
	public String getAuditPerson() {
		return this.auditPerson;
	}
	
	public void setAuditPerson(String value) {
		this.auditPerson = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

