
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepAbnormalTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepAbnormalTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "报表Id";
	public static final String ALIAS_SEND_COUNTY = "发射国家";
	public static final String ALIAS_SEND_CITY = "发射城市";
	public static final String ALIAS_BROADCASTING_ORGANIZATIONS = "发射机构";
	public static final String ALIAS_REMOTE_STATION = "遥控站";
	public static final String ALIAS_COLLECTION_POINT = "采集点";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_LANGUAGE = "语言";
	public static final String ALIAS_STATION_NAME = "发射台";
	public static final String ALIAS_TRAN_NO = "机号";
	public static final String ALIAS_POWER = "功率";
	public static final String ALIAS_GET_TYPE = "収测方式：1实时2录音";
	public static final String ALIAS_ABNORMAL_TYPE = "异态类型：1，停播；2：断续停播；3，空播；4，断续空播；5，杂音；6，失真；7，调幅度低；8，错播；9，早播；10，迟播；11，多播；12，少播；13，跑频；14，收不到；15，串扰；16：其他";
	public static final String ALIAS_ABNORMAL_DATE = "异态日期";
	public static final String ALIAS_ABNORMAL_TIME = "异态开始时间--结束时间";
	public static final String ALIAS_TYPE = "记录类型：1国外发射台质量异态，2海外落地节目质量异态";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_PLAY_TIME = "播音时间";
	public static final String ALIAS_COUNT_MINUES = "异态时长";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * 报表Id       db_column: REPORT_ID 
     */	
	
	private Long reportId;
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
     * 语言       db_column: LANGUAGE 
     */	
	private String language;
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
	private String getType;
    /**
     * 异态类型：1，停播；2：断续停播；3，空播；4，断续空播；5，杂音；6，失真；7，调幅度低；8，错播；9，早播；10，迟播；11，多播；12，少播；13，跑频；14，收不到；15，串扰；16：其他       db_column: ABNORMAL_TYPE 
     */	
	private String abnormalType;
    /**
     * 异态日期       db_column: ABNORMAL_DATE 
     */	
	private String abnormalDate;
    /**
     * 异态开始时间--结束时间       db_column: ABNORMAL_TIME 
     */	
	private String abnormalTime;
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
     * 异态时长       db_column: COUNT_MINUES 
     */	
	
	private Long countMinues;
	//columns END

	public ZrstRepAbnormalTab(){
	}

	public ZrstRepAbnormalTab(
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
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getLanguage() {
		return this.language;
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
	public void setGetType(String value) {
		this.getType = value;
	}
	
	public String getGetType() {
		return this.getType;
	}
	public void setAbnormalType(String value) {
		this.abnormalType = value;
	}
	
	public String getAbnormalType() {
		return this.abnormalType;
	}
	public void setAbnormalDate(String value) {
		this.abnormalDate = value;
	}
	
	public String getAbnormalDate() {
		return this.abnormalDate;
	}
	public void setAbnormalTime(String value) {
		this.abnormalTime = value;
	}
	
	public String getAbnormalTime() {
		return this.abnormalTime;
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
	public void setCountMinues(Long value) {
		this.countMinues = value;
	}
	
	public Long getCountMinues() {
		return this.countMinues;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("SendCounty",getSendCounty())
			.append("SendCity",getSendCity())
			.append("BroadcastingOrganizations",getBroadcastingOrganizations())
			.append("RemoteStation",getRemoteStation())
			.append("CollectionPoint",getCollectionPoint())
			.append("Frequency",getFrequency())
			.append("Language",getLanguage())
			.append("StationName",getStationName())
			.append("TranNo",getTranNo())
			.append("Power",getPower())
			.append("GetType",getGetType())
			.append("AbnormalType",getAbnormalType())
			.append("AbnormalDate",getAbnormalDate())
			.append("AbnormalTime",getAbnormalTime())
			.append("Type",getType())
			.append("Remark",getRemark())
			.append("PlayTime",getPlayTime())
			.append("CountMinues",getCountMinues())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepAbnormalTab == false) return false;
		if(this == obj) return true;
		ZrstRepAbnormalTab other = (ZrstRepAbnormalTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

