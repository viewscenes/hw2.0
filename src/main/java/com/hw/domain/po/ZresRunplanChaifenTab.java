
package com.hw.domain.po;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZresRunplanChaifenTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
	//date formats

	
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
	
	private String power;
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
    /**
     * 运行图总表的id       db_column: PARENT_ID 
     */	
	
	private Integer parentId;
	//columns END

	public ZresRunplanChaifenTab(){
	}

	public ZresRunplanChaifenTab(
            Integer runplanId
	){
		this.runplanId = runplanId;
	}

    public Integer getRunplanId() {
        return runplanId;
    }

    public void setRunplanId(Integer runplanId) {
        this.runplanId = runplanId;
    }

    public Integer getRunplanTypeId() {
        return runplanTypeId;
    }

    public void setRunplanTypeId(Integer runplanTypeId) {
        this.runplanTypeId = runplanTypeId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getTransmiterNo() {
        return transmiterNo;
    }

    public void setTransmiterNo(String transmiterNo) {
        this.transmiterNo = transmiterNo;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getAntennatype() {
        return antennatype;
    }

    public void setAntennatype(String antennatype) {
        this.antennatype = antennatype;
    }

    public String getRestDatetime() {
        return restDatetime;
    }

    public void setRestDatetime(String restDatetime) {
        this.restDatetime = restDatetime;
    }

    public String getRestTime() {
        return restTime;
    }

    public void setRestTime(String restTime) {
        this.restTime = restTime;
    }

    public Integer getSentcityId() {
        return sentcityId;
    }

    public void setSentcityId(Integer sentcityId) {
        this.sentcityId = sentcityId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSatelliteChannel() {
        return satelliteChannel;
    }

    public void setSatelliteChannel(String satelliteChannel) {
        this.satelliteChannel = satelliteChannel;
    }

    public Date getStoreDatetime() {
        return storeDatetime;
    }

    public void setStoreDatetime(Date storeDatetime) {
        this.storeDatetime = storeDatetime;
    }

    public Integer getProgramTypeId() {
        return programTypeId;
    }

    public void setProgramTypeId(Integer programTypeId) {
        this.programTypeId = programTypeId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson;
    }

    public String getRevisePerson() {
        return revisePerson;
    }

    public void setRevisePerson(String revisePerson) {
        this.revisePerson = revisePerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getMonArea() {
        return monArea;
    }

    public void setMonArea(String monArea) {
        this.monArea = monArea;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getBand() {
        return band;
    }

    public void setBand(Integer band) {
        this.band = band;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public String getRedisseminators() {
        return redisseminators;
    }

    public void setRedisseminators(String redisseminators) {
        this.redisseminators = redisseminators;
    }

    public String getLocalStartTime() {
        return localStartTime;
    }

    public void setLocalStartTime(String localStartTime) {
        this.localStartTime = localStartTime;
    }

    public String getSummer() {
        return summer;
    }

    public void setSummer(String summer) {
        this.summer = summer;
    }

    public Date getSummerStarttime() {
        return summerStarttime;
    }

    public void setSummerStarttime(Date summerStarttime) {
        this.summerStarttime = summerStarttime;
    }

    public Date getSummerEndtime() {
        return summerEndtime;
    }

    public void setSummerEndtime(Date summerEndtime) {
        this.summerEndtime = summerEndtime;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getAntenna() {
        return antenna;
    }

    public void setAntenna(String antenna) {
        this.antenna = antenna;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCiraf() {
        return ciraf;
    }

    public void setCiraf(String ciraf) {
        this.ciraf = ciraf;
    }

    public String getLaunchCountry() {
        return launchCountry;
    }

    public void setLaunchCountry(String launchCountry) {
        this.launchCountry = launchCountry;
    }

    public String getBroadcastCountry() {
        return broadcastCountry;
    }

    public void setBroadcastCountry(String broadcastCountry) {
        this.broadcastCountry = broadcastCountry;
    }

    public String getBroadcastStation() {
        return broadcastStation;
    }

    public void setBroadcastStation(String broadcastStation) {
        this.broadcastStation = broadcastStation;
    }

    public String getXgMonArea() {
        return xgMonArea;
    }

    public void setXgMonArea(String xgMonArea) {
        this.xgMonArea = xgMonArea;
    }

    public String getDisturb() {
        return disturb;
    }

    public void setDisturb(String disturb) {
        this.disturb = disturb;
    }

    public String getLocalEndTime() {
        return localEndTime;
    }

    public void setLocalEndTime(String localEndTime) {
        this.localEndTime = localEndTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}

