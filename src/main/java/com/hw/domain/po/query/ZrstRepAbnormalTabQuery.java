
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepAbnormalTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Integer dataId;
	/** 报表Id */
	private Integer reportId;
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
	private Integer frequency;
	/** 语言 */
	private String language;
	/** 发射台 */
	private String stationName;
	/** 机号 */
	private String tranNo;
	/** 功率 */
	private Integer power;
	/** 収测方式：1实时2录音 */
	private String getType;
	/** 异态类型：1，停播；2：断续停播；3，空播；4，断续空播；5，杂音；6，失真；7，调幅度低；8，错播；9，早播；10，迟播；11，多播；12，少播；13，跑频；14，收不到；15，串扰；16：其他 */
	private String abnormalType;
	/** 异态日期 */
	private String abnormalDate;
	/** 异态开始时间--结束时间 */
	private String abnormalTime;
	/** 记录类型：1国外发射台质量异态，2海外落地节目质量异态 */
	private Integer type;
	/** 备注 */
	private String remark;
	/** 播音时间 */
	private String playTime;
	/** 异态时长 */
	private Integer countMinues;

	public Integer getDataId() {
		return this.dataId;
	}
	
	public void setDataId(Integer value) {
		this.dataId = value;
	}
	
	public Integer getReportId() {
		return this.reportId;
	}
	
	public void setReportId(Integer value) {
		this.reportId = value;
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
	
	public Integer getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Integer value) {
		this.frequency = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String value) {
		this.language = value;
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
	
	public Integer getPower() {
		return this.power;
	}
	
	public void setPower(Integer value) {
		this.power = value;
	}
	
	public String getGetType() {
		return this.getType;
	}
	
	public void setGetType(String value) {
		this.getType = value;
	}
	
	public String getAbnormalType() {
		return this.abnormalType;
	}
	
	public void setAbnormalType(String value) {
		this.abnormalType = value;
	}
	
	public String getAbnormalDate() {
		return this.abnormalDate;
	}
	
	public void setAbnormalDate(String value) {
		this.abnormalDate = value;
	}
	
	public String getAbnormalTime() {
		return this.abnormalTime;
	}
	
	public void setAbnormalTime(String value) {
		this.abnormalTime = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	
	public void setType(Integer value) {
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
	
	public Integer getCountMinues() {
		return this.countMinues;
	}
	
	public void setCountMinues(Integer value) {
		this.countMinues = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

