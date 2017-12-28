
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


public class ZresFreqTimeTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZresFreqTimeTab";
	public static final String ALIAS_BROADCAST_TIME = "播音时间";
	public static final String ALIAS_FREQ = "频率";
	public static final String ALIAS_STATION_NAME = "发射台";
	public static final String ALIAS_STATION_ID = "发射台id";
	public static final String ALIAS_POWER = "功率";
	public static final String ALIAS_DIRECTION = "方向";
	public static final String ALIAS_LANGUAGE = "语言";
	public static final String ALIAS_TRANSMITER_NO = "发射机号";
	public static final String ALIAS_ANTENNA = "天线号";
	public static final String ALIAS_SERVICE_AREA = "服务区";
	public static final String ALIAS_REDISSEMINATORS = "转播机构";
	public static final String ALIAS_LOCAL_START_TIME = "当地开始时间";
	public static final String ALIAS_LAUNCH_COUNTRY = "发射国家";
	public static final String ALIAS_SENTCITY = "发射城市";
	public static final String ALIAS_PROGRAM_TYPE = "节目类别1:海外转播,2:国内直属,3:国外直属,4:国内地方";
	public static final String ALIAS_PROGRAM_TYPE_ID = "节目类别id";
	public static final String ALIAS_CIRAF = "CIRAF区";
	public static final String ALIAS_VALID_START_DATE = "启用期";
	public static final String ALIAS_VALID_START_TIME = "启用时间";
	public static final String ALIAS_VALID_END_TIME = "停用期";
	public static final String ALIAS_VALID_END_DATE = "停用期时间";
	public static final String ALIAS_SEASON_ID = "季节代号";
	public static final String ALIAS_SUMMER = "夏令时";
	public static final String ALIAS_SUMMER_STARTTIME = "夏令时启用日期";
	public static final String ALIAS_SUMMER_ENDTIME = "夏令时停用日期";
	public static final String ALIAS_MON_AREA = "质量收测站点";
	public static final String ALIAS_XG_MON_AREA = "效果收测站点";
	public static final String ALIAS_RUNPLAN_TYPE_ID = "运行图分类1：国际台运行图2：海外落地";
	public static final String ALIAS_REST_DATETIME = "休息日期";
	public static final String ALIAS_LOCAL_END_TIME = "当地结束时间";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 播音时间       db_column: BROADCAST_TIME 
     */	
	private String broadcastTime;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Long freq;
    /**
     * 发射台       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 发射台id       db_column: STATION_ID 
     */	
	
	private Long stationId;
    /**
     * 功率       db_column: POWER 
     */	
	
	private Long power;
    /**
     * 方向       db_column: DIRECTION 
     */	
	private String direction;
    /**
     * 语言       db_column: LANGUAGE 
     */	
	private String language;
    /**
     * 发射机号       db_column: TRANSMITER_NO 
     */	
	private String transmiterNo;
    /**
     * 天线号       db_column: ANTENNA 
     */	
	private String antenna;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * 转播机构       db_column: REDISSEMINATORS 
     */	
	private String redisseminators;
    /**
     * 当地开始时间       db_column: LOCAL_START_TIME 
     */	
	private String localStartTime;
    /**
     * 发射国家       db_column: LAUNCH_COUNTRY 
     */	
	private String launchCountry;
    /**
     * 发射城市       db_column: SENTCITY 
     */	
	private String sentcity;
    /**
     * 节目类别1:海外转播,2:国内直属,3:国外直属,4:国内地方       db_column: PROGRAM_TYPE 
     */	
	private String programType;
    /**
     * 节目类别id       db_column: PROGRAM_TYPE_ID 
     */	
	
	private Long programTypeId;
    /**
     * CIRAF区       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * 启用期       db_column: VALID_START_DATE 
     */	
	private String validStartDate;
    /**
     * 启用时间       db_column: VALID_START_TIME 
     */	
	private String validStartTime;
    /**
     * 停用期       db_column: VALID_END_TIME 
     */	
	private String validEndTime;
    /**
     * 停用期时间       db_column: VALID_END_DATE 
     */	
	private String validEndDate;
    /**
     * 季节代号       db_column: SEASON_ID 
     */	
	private String seasonId;
    /**
     * 夏令时       db_column: SUMMER 
     */	
	private String summer;
    /**
     * 夏令时启用日期       db_column: SUMMER_STARTTIME 
     */	
	
	private Date summerStarttime;
    /**
     * 夏令时停用日期       db_column: SUMMER_ENDTIME 
     */	
	
	private Date summerEndtime;
    /**
     * 质量收测站点       db_column: MON_AREA 
     */	
	private String monArea;
    /**
     * 效果收测站点       db_column: XG_MON_AREA 
     */	
	private String xgMonArea;
    /**
     * 运行图分类1：国际台运行图2：海外落地       db_column: RUNPLAN_TYPE_ID 
     */	
	
	private Long runplanTypeId;
    /**
     * 休息日期       db_column: REST_DATETIME 
     */	
	private String restDatetime;
    /**
     * 当地结束时间       db_column: LOCAL_END_TIME 
     */	
	private String localEndTime;
	//columns END

	public ZresFreqTimeTab(){
	}



	public void setBroadcastTime(String value) {
		this.broadcastTime = value;
	}
	
	public String getBroadcastTime() {
		return this.broadcastTime;
	}
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	public void setAntenna(String value) {
		this.antenna = value;
	}
	
	public String getAntenna() {
		return this.antenna;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setRedisseminators(String value) {
		this.redisseminators = value;
	}
	
	public String getRedisseminators() {
		return this.redisseminators;
	}
	public void setLocalStartTime(String value) {
		this.localStartTime = value;
	}
	
	public String getLocalStartTime() {
		return this.localStartTime;
	}
	public void setLaunchCountry(String value) {
		this.launchCountry = value;
	}
	
	public String getLaunchCountry() {
		return this.launchCountry;
	}
	public void setSentcity(String value) {
		this.sentcity = value;
	}
	
	public String getSentcity() {
		return this.sentcity;
	}
	public void setProgramType(String value) {
		this.programType = value;
	}
	
	public String getProgramType() {
		return this.programType;
	}
	public void setProgramTypeId(Long value) {
		this.programTypeId = value;
	}
	
	public Long getProgramTypeId() {
		return this.programTypeId;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	public void setValidStartDate(String value) {
		this.validStartDate = value;
	}
	
	public String getValidStartDate() {
		return this.validStartDate;
	}
	public void setValidStartTime(String value) {
		this.validStartTime = value;
	}
	
	public String getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidEndTime(String value) {
		this.validEndTime = value;
	}
	
	public String getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndDate(String value) {
		this.validEndDate = value;
	}
	
	public String getValidEndDate() {
		return this.validEndDate;
	}
	public void setSeasonId(String value) {
		this.seasonId = value;
	}
	
	public String getSeasonId() {
		return this.seasonId;
	}
	public void setSummer(String value) {
		this.summer = value;
	}
	
	public String getSummer() {
		return this.summer;
	}

	
	public void setSummerStarttime(Date value) {
		this.summerStarttime = value;
	}
	
	public Date getSummerStarttime() {
		return this.summerStarttime;
	}

	
	public void setSummerEndtime(Date value) {
		this.summerEndtime = value;
	}
	
	public Date getSummerEndtime() {
		return this.summerEndtime;
	}
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	public void setXgMonArea(String value) {
		this.xgMonArea = value;
	}
	
	public String getXgMonArea() {
		return this.xgMonArea;
	}
	public void setRunplanTypeId(Long value) {
		this.runplanTypeId = value;
	}
	
	public Long getRunplanTypeId() {
		return this.runplanTypeId;
	}
	public void setRestDatetime(String value) {
		this.restDatetime = value;
	}
	
	public String getRestDatetime() {
		return this.restDatetime;
	}
	public void setLocalEndTime(String value) {
		this.localEndTime = value;
	}
	
	public String getLocalEndTime() {
		return this.localEndTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("BroadcastTime",getBroadcastTime())
			.append("Freq",getFreq())
			.append("StationName",getStationName())
			.append("StationId",getStationId())
			.append("Power",getPower())
			.append("Direction",getDirection())
			.append("Language",getLanguage())
			.append("TransmiterNo",getTransmiterNo())
			.append("Antenna",getAntenna())
			.append("ServiceArea",getServiceArea())
			.append("Redisseminators",getRedisseminators())
			.append("LocalStartTime",getLocalStartTime())
			.append("LaunchCountry",getLaunchCountry())
			.append("Sentcity",getSentcity())
			.append("ProgramType",getProgramType())
			.append("ProgramTypeId",getProgramTypeId())
			.append("Ciraf",getCiraf())
			.append("ValidStartDate",getValidStartDate())
			.append("ValidStartTime",getValidStartTime())
			.append("ValidEndTime",getValidEndTime())
			.append("ValidEndDate",getValidEndDate())
			.append("SeasonId",getSeasonId())
			.append("Summer",getSummer())
			.append("SummerStarttime",getSummerStarttime())
			.append("SummerEndtime",getSummerEndtime())
			.append("MonArea",getMonArea())
			.append("XgMonArea",getXgMonArea())
			.append("RunplanTypeId",getRunplanTypeId())
			.append("RestDatetime",getRestDatetime())
			.append("LocalEndTime",getLocalEndTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZresFreqTimeTab == false) return false;
		if(this == obj) return true;
		ZresFreqTimeTab other = (ZresFreqTimeTab)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

