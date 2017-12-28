
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZresRunplanTabQuery implements Serializable {
    private static final Long serialVersionUID = 3148176768559230877L;
    

	/** 运行图id */
	private Integer runplanId;
	/** 运行图分类1：国际台运行图2：海外落地3外国台运行图 */
	private Integer runplanTypeId;
	/** 发射台id */
	private Integer stationId;
	/** 发射台机号 */
	private String transmiterNo;
	/** 频率 */
	private Integer freq;
	/** 启用期 */
	private Date validStartTimeBegin;
	private Date validStartTimeEnd;
	/** 停用期 */
	private Date validEndTimeBegin;
	private Date validEndTimeEnd;
	/** 方向 */
	private String direction;
	/** 功率 */
	private Integer power;
	/** 服务区 */
	private String serviceArea;
	/** 天线程式 */
	private String antennatype;
	/** 休息日期 */
	private String restDatetime;
	/** 休息时间 */
	private String restTime;
	/** 发射城市id */
	private Integer sentcityId;
	/** 播音开始时间 */
	private String startTime;
	/** 播音结束时间 */
	private String endTime;
	/** 国际卫星通道 */
	private String satelliteChannel;
	/** 存储时间 */
	private Date storeDatetimeBegin;
	private Date storeDatetimeEnd;
	/** programTypeId */
	private Integer programTypeId;
	/** 语言id */
	private Integer languageId;
	/** weekday */
	private String weekday;
	/** 输入人 */
	private String inputPerson;
	/** 校对人 */
	private String revisePerson;
	/** 备注 */
	private String remark;
	/** 节目id */
	private Integer programId;
	/** 质量收测站点 */
	private String monArea;
	/** 是否删除 */
	private Integer isDelete;
	/** 0:短波，1:中波，2:调频 */
	private Integer band;
	/** 节目类别1:海外转播,2:国内直属,3:国外直属,4:国内地方 */
	private String programType;
	/** 转播机构 */
	private String redisseminators;
	/** 当地播音开始时间 */
	private String localStartTime;
	/** 夏令时 */
	private String summer;
	/** 夏令时启用日期 */
	private Date summerStarttimeBegin;
	private Date summerStarttimeEnd;
	/** 夏令时停用日期 */
	private Date summerEndtimeBegin;
	private Date summerEndtimeEnd;
	/** 季节代号 */
	private String seasonId;
	/** 天线号 */
	private String antenna;
	/** 发射台名称 */
	private String stationName;
	/** CIRAF区 */
	private String ciraf;
	/** 发射国家 */
	private String launchCountry;
	/** 播音国家 */
	private String broadcastCountry;
	/** 播音电台 */
	private String broadcastStation;
	/** 效果收测站点 */
	private String xgMonArea;
	/** 受干扰情况 */
	private String disturb;
	/** 当地播音结束时间 */
	private String localEndTime;
    //运行图集合
    private List<Long> list;

	public Integer getRunplanId() {
		return this.runplanId;
	}
	
	public void setRunplanId(Integer value) {
		this.runplanId = value;
	}
	
	public Integer getRunplanTypeId() {
		return this.runplanTypeId;
	}
	
	public void setRunplanTypeId(Integer value) {
		this.runplanTypeId = value;
	}
	
	public Integer getStationId() {
		return this.stationId;
	}

    public List<Long> getList() {
        return list;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }

    public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public Integer getFreq() {
		return this.freq;
	}
	
	public void setFreq(Integer value) {
		this.freq = value;
	}
	
	public Date getValidStartTimeBegin() {
		return this.validStartTimeBegin;
	}
	
	public void setValidStartTimeBegin(Date value) {
		this.validStartTimeBegin = value;
	}	
	
	public Date getValidStartTimeEnd() {
		return this.validStartTimeEnd;
	}
	
	public void setValidStartTimeEnd(Date value) {
		this.validStartTimeEnd = value;
	}
	
	public Date getValidEndTimeBegin() {
		return this.validEndTimeBegin;
	}
	
	public void setValidEndTimeBegin(Date value) {
		this.validEndTimeBegin = value;
	}	
	
	public Date getValidEndTimeEnd() {
		return this.validEndTimeEnd;
	}
	
	public void setValidEndTimeEnd(Date value) {
		this.validEndTimeEnd = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public Integer getPower() {
		return this.power;
	}
	
	public void setPower(Integer value) {
		this.power = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getAntennatype() {
		return this.antennatype;
	}
	
	public void setAntennatype(String value) {
		this.antennatype = value;
	}
	
	public String getRestDatetime() {
		return this.restDatetime;
	}
	
	public void setRestDatetime(String value) {
		this.restDatetime = value;
	}
	
	public String getRestTime() {
		return this.restTime;
	}
	
	public void setRestTime(String value) {
		this.restTime = value;
	}
	
	public Integer getSentcityId() {
		return this.sentcityId;
	}
	
	public void setSentcityId(Integer value) {
		this.sentcityId = value;
	}
	
	public String getStartTime() {
		return this.startTime;
	}
	
	public void setStartTime(String value) {
		this.startTime = value;
	}
	
	public String getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(String value) {
		this.endTime = value;
	}
	
	public String getSatelliteChannel() {
		return this.satelliteChannel;
	}
	
	public void setSatelliteChannel(String value) {
		this.satelliteChannel = value;
	}
	
	public Date getStoreDatetimeBegin() {
		return this.storeDatetimeBegin;
	}
	
	public void setStoreDatetimeBegin(Date value) {
		this.storeDatetimeBegin = value;
	}	
	
	public Date getStoreDatetimeEnd() {
		return this.storeDatetimeEnd;
	}
	
	public void setStoreDatetimeEnd(Date value) {
		this.storeDatetimeEnd = value;
	}
	
	public Integer getProgramTypeId() {
		return this.programTypeId;
	}
	
	public void setProgramTypeId(Integer value) {
		this.programTypeId = value;
	}
	
	public Integer getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Integer value) {
		this.languageId = value;
	}
	
	public String getWeekday() {
		return this.weekday;
	}
	
	public void setWeekday(String value) {
		this.weekday = value;
	}
	
	public String getInputPerson() {
		return this.inputPerson;
	}
	
	public void setInputPerson(String value) {
		this.inputPerson = value;
	}
	
	public String getRevisePerson() {
		return this.revisePerson;
	}
	
	public void setRevisePerson(String value) {
		this.revisePerson = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Integer getProgramId() {
		return this.programId;
	}
	
	public void setProgramId(Integer value) {
		this.programId = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public String getProgramType() {
		return this.programType;
	}
	
	public void setProgramType(String value) {
		this.programType = value;
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
	
	public String getSeasonId() {
		return this.seasonId;
	}
	
	public void setSeasonId(String value) {
		this.seasonId = value;
	}
	
	public String getAntenna() {
		return this.antenna;
	}
	
	public void setAntenna(String value) {
		this.antenna = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getLaunchCountry() {
		return this.launchCountry;
	}
	
	public void setLaunchCountry(String value) {
		this.launchCountry = value;
	}
	
	public String getBroadcastCountry() {
		return this.broadcastCountry;
	}
	
	public void setBroadcastCountry(String value) {
		this.broadcastCountry = value;
	}
	
	public String getBroadcastStation() {
		return this.broadcastStation;
	}
	
	public void setBroadcastStation(String value) {
		this.broadcastStation = value;
	}
	
	public String getXgMonArea() {
		return this.xgMonArea;
	}
	
	public void setXgMonArea(String value) {
		this.xgMonArea = value;
	}
	
	public String getDisturb() {
		return this.disturb;
	}
	
	public void setDisturb(String value) {
		this.disturb = value;
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

