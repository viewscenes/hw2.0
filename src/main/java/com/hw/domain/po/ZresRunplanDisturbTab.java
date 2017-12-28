
package com.hw.domain.po;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZresRunplanDisturbTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * disrunId       db_column: DISRUN_ID 
     */	
	
	private Integer disrunId;
    /**
     * 发射台ID       db_column: STATION_ID 
     */	
	
	private Integer stationId;
    /**
     * 发射城市       db_column: SENCITY_ID 
     */	
	
	private Integer sencityId;
    /**
     * 机号       db_column: TRANSMITER_NO 
     */	
	private String transmiterNo;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Integer freq;
    /**
     * 语言       db_column: LANGUAGE 
     */	
	private String language;
    /**
     * 开播时间       db_column: START_TIME 
     */	
	private String startTime;
    /**
     * 停播时间       db_column: END_TIME 
     */	
	private String endTime;
    /**
     * 启用日期       db_column: VALID_START_TIME 
     */	
	
	private Date validStartTime;
    /**
     * 停用日期       db_column: VALID_END_TIME 
     */	
	
	private Date validEndTime;
    /**
     * 干扰信息       db_column: DISTURB 
     */	
	private String disturb;
    /**
     * 是否删除 ，0为未删除       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 发射功率       db_column: POWER 
     */	
	
	private Integer power;
    /**
     * 转播机构       db_column: REDISSEMINATORS 
     */	
	private String redisseminators;
    /**
     * 收测国家       db_column: RECEIVE_COUNTRY 
     */	
	private String receiveCountry;
    /**
     * 收测城市       db_column: RECEIVE_CITY 
     */	
	private String receiveCity;
    /**
     * 发射台名称       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 录入类型 国际台，海外落地       db_column: TYPE 
     */	
	
	private Integer type;
    /**
     * 运行图ID       db_column: RUNPLAN_ID 
     */	
	
	private Integer runplanId;
    /**
     * 收测站点       db_column: RECEIVE_STATION 
     */	
	private String receiveStation;
    /**
     * 录入日期       db_column: INSERT_TIME 
     */	
	
	private Date insertTime;
	//columns END

	public ZresRunplanDisturbTab(){
	}

	public ZresRunplanDisturbTab(
            Integer disrunId
	){
		this.disrunId = disrunId;
	}

    public Integer getDisrunId() {
        return disrunId;
    }

    public void setDisrunId(Integer disrunId) {
        this.disrunId = disrunId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getSencityId() {
        return sencityId;
    }

    public void setSencityId(Integer sencityId) {
        this.sencityId = sencityId;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public String getDisturb() {
        return disturb;
    }

    public void setDisturb(String disturb) {
        this.disturb = disturb;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getRedisseminators() {
        return redisseminators;
    }

    public void setRedisseminators(String redisseminators) {
        this.redisseminators = redisseminators;
    }

    public String getReceiveCountry() {
        return receiveCountry;
    }

    public void setReceiveCountry(String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRunplanId() {
        return runplanId;
    }

    public void setRunplanId(Integer runplanId) {
        this.runplanId = runplanId;
    }

    public String getReceiveStation() {
        return receiveStation;
    }

    public void setReceiveStation(String receiveStation) {
        this.receiveStation = receiveStation;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}

