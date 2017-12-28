
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


public class ZrstRepEffectSummaryTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepEffectSummaryTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "reportId";
	public static final String ALIAS_STATION_NAME = "stationName";
	public static final String ALIAS_SEND_COUNTY = "sendCounty";
	public static final String ALIAS_SEND_CITY = "sendCity";
	public static final String ALIAS_BROADCASTING_ORGANIZATIONS = "broadcastingOrganizations";
	public static final String ALIAS_DIRECTION = "direction";
	public static final String ALIAS_SERVICE_AREA = "serviceArea";
	public static final String ALIAS_POWER = "power";
	public static final String ALIAS_CIRAF = "ciraf";
	public static final String ALIAS_FREQUENCY = "frequency";
	public static final String ALIAS_LANGUAGE_NAME = "languageName";
	public static final String ALIAS_DATETIME = "datetime";
	public static final String ALIAS_REMOTE_HEADNAME = "remoteHeadname";
	public static final String ALIAS_COLLECT_HEADNAME = "collectHeadname";
	public static final String ALIAS_PLAY_TIME = "playTime";
	public static final String ALIAS_LISTEN = "listen";
	public static final String ALIAS_LISTEN_MIDDLE = "listenMiddle";
	public static final String ALIAS_COUNT = "count";
	public static final String ALIAS_REMARK = "remark";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * reportId       db_column: REPORT_ID 
     */	
	
	private Long reportId;
    /**
     * stationName       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * sendCounty       db_column: SEND_COUNTY 
     */	
	private String sendCounty;
    /**
     * sendCity       db_column: SEND_CITY 
     */	
	private String sendCity;
    /**
     * broadcastingOrganizations       db_column: BROADCASTING_ORGANIZATIONS 
     */	
	private String broadcastingOrganizations;
    /**
     * direction       db_column: DIRECTION 
     */	
	private String direction;
    /**
     * serviceArea       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * power       db_column: POWER 
     */	
	private String power;
    /**
     * ciraf       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * frequency       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * languageName       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * datetime       db_column: DATETIME 
     */	
	
	private Date datetime;
    /**
     * remoteHeadname       db_column: REMOTE_HEADNAME 
     */	
	private String remoteHeadname;
    /**
     * collectHeadname       db_column: COLLECT_HEADNAME 
     */	
	private String collectHeadname;
    /**
     * playTime       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * listen       db_column: LISTEN 
     */	
	private String listen;
    /**
     * listenMiddle       db_column: LISTEN_MIDDLE 
     */	
	private String listenMiddle;
    /**
     * count       db_column: COUNT 
     */	
	
	private Long count;
    /**
     * remark       db_column: REMARK 
     */	
	private String remark;
	//columns END

	public ZrstRepEffectSummaryTab(){
	}

	public ZrstRepEffectSummaryTab(
		Long dataId
	){
		this.dataId = dataId;
	}

	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getDataId() {
		return this.dataId;
	}
	public void setReportId(Long value) {
		this.reportId = value;
	}
	
	public Long getReportId() {
		return this.reportId;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
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
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setPower(String value) {
		this.power = value;
	}
	
	public String getPower() {
		return this.power;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}

	public void setDatetime(Date value) {
		this.datetime = value;
	}
	
	public Date getDatetime() {
		return this.datetime;
	}
	public void setRemoteHeadname(String value) {
		this.remoteHeadname = value;
	}
	
	public String getRemoteHeadname() {
		return this.remoteHeadname;
	}
	public void setCollectHeadname(String value) {
		this.collectHeadname = value;
	}
	
	public String getCollectHeadname() {
		return this.collectHeadname;
	}
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	public void setListen(String value) {
		this.listen = value;
	}
	
	public String getListen() {
		return this.listen;
	}
	public void setListenMiddle(String value) {
		this.listenMiddle = value;
	}
	
	public String getListenMiddle() {
		return this.listenMiddle;
	}
	public void setCount(Long value) {
		this.count = value;
	}
	
	public Long getCount() {
		return this.count;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("StationName",getStationName())
			.append("SendCounty",getSendCounty())
			.append("SendCity",getSendCity())
			.append("BroadcastingOrganizations",getBroadcastingOrganizations())
			.append("Direction",getDirection())
			.append("ServiceArea",getServiceArea())
			.append("Power",getPower())
			.append("Ciraf",getCiraf())
			.append("Frequency",getFrequency())
			.append("LanguageName",getLanguageName())
			.append("Datetime",getDatetime())
			.append("RemoteHeadname",getRemoteHeadname())
			.append("CollectHeadname",getCollectHeadname())
			.append("PlayTime",getPlayTime())
			.append("Listen",getListen())
			.append("ListenMiddle",getListenMiddle())
			.append("Count",getCount())
			.append("Remark",getRemark())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepEffectSummaryTab == false) return false;
		if(this == obj) return true;
		ZrstRepEffectSummaryTab other = (ZrstRepEffectSummaryTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

