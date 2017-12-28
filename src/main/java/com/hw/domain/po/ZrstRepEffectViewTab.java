
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


public class ZrstRepEffectViewTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepEffectViewTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "报表id";
	public static final String ALIAS_STATION_NAME = "发射台名称";
	public static final String ALIAS_DIRECTION = "方向";
	public static final String ALIAS_SERVICE_AREA = "服务区";
	public static final String ALIAS_POWER = "功率";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_LANGUAGE_NAME = "语言";
	public static final String ALIAS_DATETIME = "统计日期";
	public static final String ALIAS_DESCRIPTION = "分数";
	public static final String ALIAS_HEADNAME = "站点名称";
	public static final String ALIAS_PLAY_TIME = "播出日期";
	public static final String ALIAS_REMARK = "描述";
	public static final String ALIAS_START_TIME = "统计开始日期";
	public static final String ALIAS_END_TIME = "统计结束日期";
	public static final String ALIAS_COUNT = "统计条目数";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * 报表id       db_column: REPORT_ID 
     */	
	
	private Long reportId;
    /**
     * 发射台名称       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 方向       db_column: DIRECTION 
     */	
	private String direction;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * 功率       db_column: POWER 
     */	
	
	private Long power;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 语言       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * 统计日期       db_column: DATETIME 
     */	
	private String datetime;
    /**
     * 分数       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 站点名称       db_column: HEADNAME 
     */	
	private String headname;
    /**
     * 播出日期       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * 描述       db_column: REMARK 
     */	
	private String remark;
    /**
     * 统计开始日期       db_column: START_TIME 
     */	
	private String startTime;
    /**
     * 统计结束日期       db_column: END_TIME 
     */	
	private String endTime;
    /**
     * 统计条目数       db_column: COUNT 
     */	
	
	private Long count;
	//columns END

	public ZrstRepEffectViewTab(){
	}

	public ZrstRepEffectViewTab(
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
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getPower() {
		return this.power;
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
	public void setDatetime(String value) {
		this.datetime = value;
	}
	
	public String getDatetime() {
		return this.datetime;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setHeadname(String value) {
		this.headname = value;
	}
	
	public String getHeadname() {
		return this.headname;
	}
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setStartTime(String value) {
		this.startTime = value;
	}
	
	public String getStartTime() {
		return this.startTime;
	}
	public void setEndTime(String value) {
		this.endTime = value;
	}
	
	public String getEndTime() {
		return this.endTime;
	}
	public void setCount(Long value) {
		this.count = value;
	}
	
	public Long getCount() {
		return this.count;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("StationName",getStationName())
			.append("Direction",getDirection())
			.append("ServiceArea",getServiceArea())
			.append("Power",getPower())
			.append("Frequency",getFrequency())
			.append("LanguageName",getLanguageName())
			.append("Datetime",getDatetime())
			.append("Description",getDescription())
			.append("Headname",getHeadname())
			.append("PlayTime",getPlayTime())
			.append("Remark",getRemark())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("Count",getCount())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepEffectViewTab == false) return false;
		if(this == obj) return true;
		ZrstRepEffectViewTab other = (ZrstRepEffectViewTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

