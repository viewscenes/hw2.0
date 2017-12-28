
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


public class ZresRunplanHistoryTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 运行图id */
	private Long runplanId;
	/** 运行图类型 */
	private Long runplanTypeId;
	/** 发射台id */
	private Long stationId;
	/** 发射台机号 */
	private String transmiterNo;
	/** 频率 */
	private Long freq;
	/** 启用期 */
	private Date validStartTimeBegin;
	private Date validStartTimeEnd;
	/** 停用期 */
	private Date validEndTimeBegin;
	private Date validEndTimeEnd;
	/** 方向 */
	private String direction;
	/** 功率 */
	private Long power;
	/** 服务区 */
	private String serviceArea;
	/** 天线号 */
	private String antenna;
	/** 天线程式 */
	private String antennatype;
	/** 休息日期 */
	private Date restDatetimeBegin;
	private Date restDatetimeEnd;
	/** 休息时间 */
	private String restTime;
	/** 发射城市id */
	private Long sentcityId;
	/** 播音开始时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 播音结束时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 国际卫星通道 */
	private String satelliteChannel;
	/** 存储时间 */
	private Date storeDatetimeBegin;
	private Date storeDatetimeEnd;
	/** programTypeId */
	private Long programTypeId;
	/** 语言id */
	private Long languageId;
	/** weekday */
	private String weekday;
	/** 输入人 */
	private Long inputPersonId;
	/** 校对人 */
	private Long revisePersonId;
	/** 备注 */
	private String remark;
	/** 节目id */
	private Long programId;
	/** 收测站点 */
	private String monArea;
	/** 是否删除 */
	private Long isDelete;

	public Long getRunplanId() {
		return this.runplanId;
	}
	
	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public Long getRunplanTypeId() {
		return this.runplanTypeId;
	}
	
	public void setRunplanTypeId(Long value) {
		this.runplanTypeId = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	
	public void setFreq(Long value) {
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
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getAntenna() {
		return this.antenna;
	}
	
	public void setAntenna(String value) {
		this.antenna = value;
	}
	
	public String getAntennatype() {
		return this.antennatype;
	}
	
	public void setAntennatype(String value) {
		this.antennatype = value;
	}
	
	public Date getRestDatetimeBegin() {
		return this.restDatetimeBegin;
	}
	
	public void setRestDatetimeBegin(Date value) {
		this.restDatetimeBegin = value;
	}	
	
	public Date getRestDatetimeEnd() {
		return this.restDatetimeEnd;
	}
	
	public void setRestDatetimeEnd(Date value) {
		this.restDatetimeEnd = value;
	}
	
	public String getRestTime() {
		return this.restTime;
	}
	
	public void setRestTime(String value) {
		this.restTime = value;
	}
	
	public Long getSentcityId() {
		return this.sentcityId;
	}
	
	public void setSentcityId(Long value) {
		this.sentcityId = value;
	}
	
	public Date getStartTimeBegin() {
		return this.startTimeBegin;
	}
	
	public void setStartTimeBegin(Date value) {
		this.startTimeBegin = value;
	}	
	
	public Date getStartTimeEnd() {
		return this.startTimeEnd;
	}
	
	public void setStartTimeEnd(Date value) {
		this.startTimeEnd = value;
	}
	
	public Date getEndTimeBegin() {
		return this.endTimeBegin;
	}
	
	public void setEndTimeBegin(Date value) {
		this.endTimeBegin = value;
	}	
	
	public Date getEndTimeEnd() {
		return this.endTimeEnd;
	}
	
	public void setEndTimeEnd(Date value) {
		this.endTimeEnd = value;
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
	
	public Long getProgramTypeId() {
		return this.programTypeId;
	}
	
	public void setProgramTypeId(Long value) {
		this.programTypeId = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public String getWeekday() {
		return this.weekday;
	}
	
	public void setWeekday(String value) {
		this.weekday = value;
	}
	
	public Long getInputPersonId() {
		return this.inputPersonId;
	}
	
	public void setInputPersonId(Long value) {
		this.inputPersonId = value;
	}
	
	public Long getRevisePersonId() {
		return this.revisePersonId;
	}
	
	public void setRevisePersonId(Long value) {
		this.revisePersonId = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Long getProgramId() {
		return this.programId;
	}
	
	public void setProgramId(Long value) {
		this.programId = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

