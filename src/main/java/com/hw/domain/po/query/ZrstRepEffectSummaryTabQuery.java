
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


public class ZrstRepEffectSummaryTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Integer dataId;
	/** reportId */
	private Integer reportId;
	/** stationName */
	private String stationName;
	/** sendCounty */
	private String sendCounty;
	/** sendCity */
	private String sendCity;
	/** broadcastingOrganizations */
	private String broadcastingOrganizations;
	/** direction */
	private String direction;
	/** serviceArea */
	private String serviceArea;
	/** power */
	private String power;
	/** ciraf */
	private String ciraf;
	/** frequency */
	private Integer frequency;
	/** languageName */
	private String languageName;
	/** datetime */
	private Date datetimeBegin;
	private Date datetimeEnd;
	/** remoteHeadname */
	private String remoteHeadname;
	/** collectHeadname */
	private String collectHeadname;
	/** playTime */
	private String playTime;
	/** listen */
	private String listen;
	/** listenMiddle */
	private String listenMiddle;
	/** count */
	private Integer count;
	/** remark */
	private String remark;

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
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
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
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getPower() {
		return this.power;
	}
	
	public void setPower(String value) {
		this.power = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public Integer getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Integer value) {
		this.frequency = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public Date getDatetimeBegin() {
		return this.datetimeBegin;
	}
	
	public void setDatetimeBegin(Date value) {
		this.datetimeBegin = value;
	}	
	
	public Date getDatetimeEnd() {
		return this.datetimeEnd;
	}
	
	public void setDatetimeEnd(Date value) {
		this.datetimeEnd = value;
	}
	
	public String getRemoteHeadname() {
		return this.remoteHeadname;
	}
	
	public void setRemoteHeadname(String value) {
		this.remoteHeadname = value;
	}
	
	public String getCollectHeadname() {
		return this.collectHeadname;
	}
	
	public void setCollectHeadname(String value) {
		this.collectHeadname = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getListen() {
		return this.listen;
	}
	
	public void setListen(String value) {
		this.listen = value;
	}
	
	public String getListenMiddle() {
		return this.listenMiddle;
	}
	
	public void setListenMiddle(String value) {
		this.listenMiddle = value;
	}
	
	public Integer getCount() {
		return this.count;
	}
	
	public void setCount(Integer value) {
		this.count = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

