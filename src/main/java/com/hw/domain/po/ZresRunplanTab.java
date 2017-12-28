
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


public class ZresRunplanTab   implements java.io.Serializable{
	private static final Long serialVersionUID = 5454155825314635342L;
	


	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 运行图id       db_column: RUNPLAN_ID 
     */	
	
	private Integer runplanId;
    /**
     * 运行图分类1：国际台运行图2：海外落地3外国台运行图       db_column: RUNPLAN_TYPE_ID 
     */	
	private Integer runplanTypeId;
    /**
     * 发射台id       db_column: STATION_ID 
     */	
	
	private Integer stationId;
    /**
     * 发射台机号       db_column: TRANSMITER_NO 
     */	
	private String transmiterNo;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Integer freq;
    /**
     * 启用期       db_column: VALID_START_TIME 
     */	
	
	private Date validStartTime;
    /**
     * 停用期       db_column: VALID_END_TIME 
     */	
	
	private Date validEndTime;
    /**
     * 方向       db_column: DIRECTION 
     */	
	private String direction;
    /**
     * 功率       db_column: POWER 
     */	
	
	private Integer power;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * 天线程式       db_column: ANTENNATYPE 
     */	
	private String antennatype;
    /**
     * 休息日期       db_column: REST_DATETIME 
     */	
	private String restDatetime;
    /**
     * 休息时间       db_column: REST_TIME 
     */	
	private String restTime;
    /**
     * 发射城市id       db_column: SENTCITY_ID 
     */	
	
	private Integer sentcityId;
    /**
     * 播音开始时间       db_column: START_TIME 
     */	
	private String startTime;
    /**
     * 播音结束时间       db_column: END_TIME 
     */	
	private String endTime;
    /**
     * 国际卫星通道       db_column: SATELLITE_CHANNEL 
     */	
	private String satelliteChannel;
    /**
     * 存储时间       db_column: STORE_DATETIME 
     */	
	
	private Date storeDatetime;
    /**
     * programTypeId       db_column: PROGRAM_TYPE_ID 
     */	
	
	private Integer programTypeId;
    /**
     * 语言id       db_column: LANGUAGE_ID 
     */	
	
	private Integer languageId;
    /**
     * 语言名称       db_column: language_name
     */

    private String languageName;
    /**
     * weekday       db_column: WEEKDAY 
     */	
	private String weekday;
    /**
     * 输入人       db_column: INPUT_PERSON 
     */	
	private String inputPerson;
    /**
     * 校对人       db_column: REVISE_PERSON 
     */	
	private String revisePerson;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
    /**
     * 节目id       db_column: PROGRAM_ID 
     */	
	
	private Integer programId;
    /**
     * 质量收测站点       db_column: MON_AREA 
     */	
	private String monArea;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 0:短波，1:中波，2:调频       db_column: BAND 
     */	
	
	private Integer band;
    /**
     * 节目类别1:海外转播,2:国内直属,3:国外直属,4:国内地方       db_column: PROGRAM_TYPE 
     */	
	private String programType;
    /**
     * 转播机构       db_column: REDISSEMINATORS 
     */	
	private String redisseminators;
    /**
     * 当地播音开始时间       db_column: LOCAL_START_TIME 
     */	
	private String localStartTime;
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
     * 季节代号       db_column: SEASON_ID 
     */	
	private String seasonId;
    /**
     * 天线号       db_column: ANTENNA 
     */	
	private String antenna;
    /**
     * 发射台名称       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * CIRAF区       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * 发射国家       db_column: LAUNCH_COUNTRY 
     */	
	private String launchCountry;
    /**
     * 播音国家       db_column: BROADCAST_COUNTRY 
     */	
	private String broadcastCountry;
    /**
     * 播音电台       db_column: BROADCAST_STATION 
     */	
	private String broadcastStation;
    /**
     * 效果收测站点       db_column: XG_MON_AREA 
     */	
	private String xgMonArea;
    /**
     * 受干扰情况       db_column: DISTURB 
     */	
	private String disturb;
    /**
     * 当地播音结束时间       db_column: LOCAL_END_TIME 
     */	
	private String localEndTime;
	//columns END

	public ZresRunplanTab(){
	}

	public ZresRunplanTab(
		Integer runplanId
	){
		this.runplanId = runplanId;
	}

	public void setRunplanId(Integer value) {
		this.runplanId = value;
	}
	
	public Integer getRunplanId() {
		return this.runplanId;
	}
	public void setRunplanTypeId(Integer value) {
		this.runplanTypeId = value;
	}
	
	public Integer getRunplanTypeId() {
		return this.runplanTypeId;
	}
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	public Integer getStationId() {
		return this.stationId;
	}
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	public void setFreq(Integer value) {
		this.freq = value;
	}
	
	public Integer getFreq() {
		return this.freq;
	}

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public void setValidStartTime(Date value) {
		this.validStartTime = value;
	}
	
	public Date getValidStartTime() {
		return this.validStartTime;
	}

	
	public void setValidEndTime(Date value) {
		this.validEndTime = value;
	}
	
	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setPower(Integer value) {
		this.power = value;
	}
	
	public Integer getPower() {
		return this.power;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setAntennatype(String value) {
		this.antennatype = value;
	}
	
	public String getAntennatype() {
		return this.antennatype;
	}
	public void setRestDatetime(String value) {
		this.restDatetime = value;
	}
	
	public String getRestDatetime() {
		return this.restDatetime;
	}
	public void setRestTime(String value) {
		this.restTime = value;
	}
	
	public String getRestTime() {
		return this.restTime;
	}
	public void setSentcityId(Integer value) {
		this.sentcityId = value;
	}
	
	public Integer getSentcityId() {
		return this.sentcityId;
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
	public void setSatelliteChannel(String value) {
		this.satelliteChannel = value;
	}
	
	public String getSatelliteChannel() {
		return this.satelliteChannel;
	}

	
	public void setStoreDatetime(Date value) {
		this.storeDatetime = value;
	}
	
	public Date getStoreDatetime() {
		return this.storeDatetime;
	}
	public void setProgramTypeId(Integer value) {
		this.programTypeId = value;
	}
	
	public Integer getProgramTypeId() {
		return this.programTypeId;
	}
	public void setLanguageId(Integer value) {
		this.languageId = value;
	}
	
	public Integer getLanguageId() {
		return this.languageId;
	}
	public void setWeekday(String value) {
		this.weekday = value;
	}
	
	public String getWeekday() {
		return this.weekday;
	}
	public void setInputPerson(String value) {
		this.inputPerson = value;
	}
	
	public String getInputPerson() {
		return this.inputPerson;
	}
	public void setRevisePerson(String value) {
		this.revisePerson = value;
	}
	
	public String getRevisePerson() {
		return this.revisePerson;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setProgramId(Integer value) {
		this.programId = value;
	}
	
	public Integer getProgramId() {
		return this.programId;
	}
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	public void setProgramType(String value) {
		this.programType = value;
	}
	
	public String getProgramType() {
		return this.programType;
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
	public void setSeasonId(String value) {
		this.seasonId = value;
	}
	
	public String getSeasonId() {
		return this.seasonId;
	}
	public void setAntenna(String value) {
		this.antenna = value;
	}
	
	public String getAntenna() {
		return this.antenna;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	public void setLaunchCountry(String value) {
		this.launchCountry = value;
	}
	
	public String getLaunchCountry() {
		return this.launchCountry;
	}
	public void setBroadcastCountry(String value) {
		this.broadcastCountry = value;
	}
	
	public String getBroadcastCountry() {
		return this.broadcastCountry;
	}
	public void setBroadcastStation(String value) {
		this.broadcastStation = value;
	}
	
	public String getBroadcastStation() {
		return this.broadcastStation;
	}
	public void setXgMonArea(String value) {
		this.xgMonArea = value;
	}
	
	public String getXgMonArea() {
		return this.xgMonArea;
	}
	public void setDisturb(String value) {
		this.disturb = value;
	}
	
	public String getDisturb() {
		return this.disturb;
	}
	public void setLocalEndTime(String value) {
		this.localEndTime = value;
	}
	
	public String getLocalEndTime() {
		return this.localEndTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("RunplanId",getRunplanId())
			.append("RunplanTypeId",getRunplanTypeId())
			.append("StationId",getStationId())
			.append("TransmiterNo",getTransmiterNo())
			.append("Freq",getFreq())
			.append("ValidStartTime",getValidStartTime())
			.append("ValidEndTime",getValidEndTime())
			.append("Direction",getDirection())
			.append("Power",getPower())
			.append("ServiceArea",getServiceArea())
			.append("Antennatype",getAntennatype())
			.append("RestDatetime",getRestDatetime())
			.append("RestTime",getRestTime())
			.append("SentcityId",getSentcityId())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("SatelliteChannel",getSatelliteChannel())
			.append("StoreDatetime",getStoreDatetime())
			.append("ProgramTypeId",getProgramTypeId())
			.append("LanguageId",getLanguageId())
			.append("Weekday",getWeekday())
			.append("InputPerson",getInputPerson())
			.append("RevisePerson",getRevisePerson())
			.append("Remark",getRemark())
			.append("ProgramId",getProgramId())
			.append("MonArea",getMonArea())
			.append("IsDelete",getIsDelete())
			.append("Band",getBand())
			.append("ProgramType",getProgramType())
			.append("Redisseminators",getRedisseminators())
			.append("LocalStartTime",getLocalStartTime())
			.append("Summer",getSummer())
			.append("SummerStarttime",getSummerStarttime())
			.append("SummerEndtime",getSummerEndtime())
			.append("SeasonId",getSeasonId())
			.append("Antenna",getAntenna())
			.append("StationName",getStationName())
			.append("Ciraf",getCiraf())
			.append("LaunchCountry",getLaunchCountry())
			.append("BroadcastCountry",getBroadcastCountry())
			.append("BroadcastStation",getBroadcastStation())
			.append("XgMonArea",getXgMonArea())
			.append("Disturb",getDisturb())
			.append("LocalEndTime",getLocalEndTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRunplanId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZresRunplanTab == false) return false;
		if(this == obj) return true;
		ZresRunplanTab other = (ZresRunplanTab)obj;
		return new EqualsBuilder()
			.append(getRunplanId(),other.getRunplanId())
			.isEquals();
	}
}

