
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


public class ZresFreqTimeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 播音时间 */
	private String broadcastTime;
	/** 频率 */
	private Long freq;
	/** 发射台 */
	private String stationName;
	/** 发射台id */
	private Long stationId;
	/** 功率 */
	private Long power;
	/** 方向 */
	private String direction;
	/** 语言 */
	private String language;
	/** 发射机号 */
	private String transmiterNo;
	/** 天线号 */
	private String antenna;
	/** 服务区 */
	private String serviceArea;
	/** 转播机构 */
	private String redisseminators;
	/** 当地开始时间 */
	private String localStartTime;
	/** 发射国家 */
	private String launchCountry;
	/** 发射城市 */
	private String sentcity;
	/** 节目类别1:海外转播,2:国内直属,3:国外直属,4:国内地方 */
	private String programType;
	/** 节目类别id */
	private Long programTypeId;
	/** CIRAF区 */
	private String ciraf;
	/** 启用期 */
	private String validStartDate;
	/** 启用时间 */
	private String validStartTime;
	/** 停用期 */
	private String validEndTime;
	/** 停用期时间 */
	private String validEndDate;
	/** 季节代号 */
	private String seasonId;
	/** 夏令时 */
	private String summer;
	/** 夏令时启用日期 */
	private Date summerStarttimeBegin;
	private Date summerStarttimeEnd;
	/** 夏令时停用日期 */
	private Date summerEndtimeBegin;
	private Date summerEndtimeEnd;
	/** 质量收测站点 */
	private String monArea;
	/** 效果收测站点 */
	private String xgMonArea;
	/** 运行图分类1：国际台运行图2：海外落地 */
	private Long runplanTypeId;
	/** 休息日期 */
	private String restDatetime;
	/** 当地结束时间 */
	private String localEndTime;

	public String getBroadcastTime() {
		return this.broadcastTime;
	}
	
	public void setBroadcastTime(String value) {
		this.broadcastTime = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public String getAntenna() {
		return this.antenna;
	}
	
	public void setAntenna(String value) {
		this.antenna = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getRedisseminators() {
		return this.redisseminators;
	}
	
	public void setRedisseminators(String value) {
		this.redisseminators = value;
	}
	
	public String getLocalStartTime() {
		return this.localStartTime;
	}
	
	public void setLocalStartTime(String value) {
		this.localStartTime = value;
	}
	
	public String getLaunchCountry() {
		return this.launchCountry;
	}
	
	public void setLaunchCountry(String value) {
		this.launchCountry = value;
	}
	
	public String getSentcity() {
		return this.sentcity;
	}
	
	public void setSentcity(String value) {
		this.sentcity = value;
	}
	
	public String getProgramType() {
		return this.programType;
	}
	
	public void setProgramType(String value) {
		this.programType = value;
	}
	
	public Long getProgramTypeId() {
		return this.programTypeId;
	}
	
	public void setProgramTypeId(Long value) {
		this.programTypeId = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getValidStartDate() {
		return this.validStartDate;
	}
	
	public void setValidStartDate(String value) {
		this.validStartDate = value;
	}
	
	public String getValidStartTime() {
		return this.validStartTime;
	}
	
	public void setValidStartTime(String value) {
		this.validStartTime = value;
	}
	
	public String getValidEndTime() {
		return this.validEndTime;
	}
	
	public void setValidEndTime(String value) {
		this.validEndTime = value;
	}
	
	public String getValidEndDate() {
		return this.validEndDate;
	}
	
	public void setValidEndDate(String value) {
		this.validEndDate = value;
	}
	
	public String getSeasonId() {
		return this.seasonId;
	}
	
	public void setSeasonId(String value) {
		this.seasonId = value;
	}
	
	public String getSummer() {
		return this.summer;
	}
	
	public void setSummer(String value) {
		this.summer = value;
	}
	
	public Date getSummerStarttimeBegin() {
		return this.summerStarttimeBegin;
	}
	
	public void setSummerStarttimeBegin(Date value) {
		this.summerStarttimeBegin = value;
	}	
	
	public Date getSummerStarttimeEnd() {
		return this.summerStarttimeEnd;
	}
	
	public void setSummerStarttimeEnd(Date value) {
		this.summerStarttimeEnd = value;
	}
	
	public Date getSummerEndtimeBegin() {
		return this.summerEndtimeBegin;
	}
	
	public void setSummerEndtimeBegin(Date value) {
		this.summerEndtimeBegin = value;
	}	
	
	public Date getSummerEndtimeEnd() {
		return this.summerEndtimeEnd;
	}
	
	public void setSummerEndtimeEnd(Date value) {
		this.summerEndtimeEnd = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public String getXgMonArea() {
		return this.xgMonArea;
	}
	
	public void setXgMonArea(String value) {
		this.xgMonArea = value;
	}
	
	public Long getRunplanTypeId() {
		return this.runplanTypeId;
	}
	
	public void setRunplanTypeId(Long value) {
		this.runplanTypeId = value;
	}
	
	public String getRestDatetime() {
		return this.restDatetime;
	}
	
	public void setRestDatetime(String value) {
		this.restDatetime = value;
	}
	
	public String getLocalEndTime() {
		return this.localEndTime;
	}
	
	public void setLocalEndTime(String value) {
		this.localEndTime = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

