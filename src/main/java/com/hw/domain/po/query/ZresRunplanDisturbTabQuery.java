
package com.hw.domain.po.query;



import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZresRunplanDisturbTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** disrunId */
	private Integer disrunId;
	/** 发射台ID */
	private Integer stationId;
	/** 发射城市 */
	private Integer sencityId;
	/** 机号 */
	private String transmiterNo;
	/** 频率 */
	private Integer freq;
	/** 语言 */
	private String language;
	/** 开播时间 */
	private String startTime;
	/** 停播时间 */
	private String endTime;
	/** 启用日期 */
	private Date validStartTimeBegin;
	private Date validStartTimeEnd;
	/** 停用日期 */
	private Date validEndTimeBegin;
	private Date validEndTimeEnd;
	/** 干扰信息 */
	private String disturb;
	/** 是否删除 ，0为未删除 */
	private Integer isDelete;
	/** 发射功率 */
	private Integer power;
	/** 转播机构 */
	private String redisseminators;
	/** 收测国家 */
	private String receiveCountry;
	/** 收测城市 */
	private String receiveCity;
	/** 发射台名称 */
	private String stationName;
	/** 录入类型 国际台，海外落地 */
	private Integer type;
	/** 运行图ID */
	private Integer runplanId;
	/** 收测站点 */
	private String receiveStation;
	/** 录入日期 */
	private Date insertTimeBegin;
	private Date insertTimeEnd;

    /** 录音文件开始日期 */
    private Date recoodTimeBegin;

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

    public Date getRecoodTimeBegin() {
        return recoodTimeBegin;
    }

    public void setRecoodTimeBegin(Date recoodTimeBegin) {
        this.recoodTimeBegin = recoodTimeBegin;
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

    public Date getValidStartTimeBegin() {
        return validStartTimeBegin;
    }

    public void setValidStartTimeBegin(Date validStartTimeBegin) {
        this.validStartTimeBegin = validStartTimeBegin;
    }

    public Date getValidStartTimeEnd() {
        return validStartTimeEnd;
    }

    public void setValidStartTimeEnd(Date validStartTimeEnd) {
        this.validStartTimeEnd = validStartTimeEnd;
    }

    public Date getValidEndTimeBegin() {
        return validEndTimeBegin;
    }

    public void setValidEndTimeBegin(Date validEndTimeBegin) {
        this.validEndTimeBegin = validEndTimeBegin;
    }

    public Date getValidEndTimeEnd() {
        return validEndTimeEnd;
    }

    public void setValidEndTimeEnd(Date validEndTimeEnd) {
        this.validEndTimeEnd = validEndTimeEnd;
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

    public Date getInsertTimeBegin() {
        return insertTimeBegin;
    }

    public void setInsertTimeBegin(Date insertTimeBegin) {
        this.insertTimeBegin = insertTimeBegin;
    }

    public Date getInsertTimeEnd() {
        return insertTimeEnd;
    }

    public void setInsertTimeEnd(Date insertTimeEnd) {
        this.insertTimeEnd = insertTimeEnd;
    }
}

