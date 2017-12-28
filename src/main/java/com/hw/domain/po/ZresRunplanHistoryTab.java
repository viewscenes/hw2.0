
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


public class ZresRunplanHistoryTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZresRunplanHistoryTab";
	public static final String ALIAS_RUNPLAN_ID = "运行图id";
	public static final String ALIAS_RUNPLAN_TYPE_ID = "运行图类型";
	public static final String ALIAS_STATION_ID = "发射台id";
	public static final String ALIAS_TRANSMITER_NO = "发射台机号";
	public static final String ALIAS_FREQ = "频率";
	public static final String ALIAS_VALID_START_TIME = "启用期";
	public static final String ALIAS_VALID_END_TIME = "停用期";
	public static final String ALIAS_DIRECTION = "方向";
	public static final String ALIAS_POWER = "功率";
	public static final String ALIAS_SERVICE_AREA = "服务区";
	public static final String ALIAS_ANTENNA = "天线号";
	public static final String ALIAS_ANTENNATYPE = "天线程式";
	public static final String ALIAS_REST_DATETIME = "休息日期";
	public static final String ALIAS_REST_TIME = "休息时间";
	public static final String ALIAS_SENTCITY_ID = "发射城市id";
	public static final String ALIAS_START_TIME = "播音开始时间";
	public static final String ALIAS_END_TIME = "播音结束时间";
	public static final String ALIAS_SATELLITE_CHANNEL = "国际卫星通道";
	public static final String ALIAS_STORE_DATETIME = "存储时间";
	public static final String ALIAS_PROGRAM_TYPE_ID = "programTypeId";
	public static final String ALIAS_LANGUAGE_ID = "语言id";
	public static final String ALIAS_WEEKDAY = "weekday";
	public static final String ALIAS_INPUT_PERSON_ID = "输入人";
	public static final String ALIAS_REVISE_PERSON_ID = "校对人";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_PROGRAM_ID = "节目id";
	public static final String ALIAS_MON_AREA = "收测站点";
	public static final String ALIAS_IS_DELETE = "是否删除";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 运行图id       db_column: RUNPLAN_ID 
     */	
	
	private Long runplanId;
    /**
     * 运行图类型       db_column: RUNPLAN_TYPE_ID 
     */	
	private Long runplanTypeId;
    /**
     * 发射台id       db_column: STATION_ID 
     */	
	
	private Long stationId;
    /**
     * 发射台机号       db_column: TRANSMITER_NO 
     */	
	private String transmiterNo;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Long freq;
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
	
	private Long power;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * 天线号       db_column: ANTENNA 
     */	
	private String antenna;
    /**
     * 天线程式       db_column: ANTENNATYPE 
     */	
	private String antennatype;
    /**
     * 休息日期       db_column: REST_DATETIME 
     */	
	
	private Date restDatetime;
    /**
     * 休息时间       db_column: REST_TIME 
     */	
	private String restTime;
    /**
     * 发射城市id       db_column: SENTCITY_ID 
     */	
	
	private Long sentcityId;
    /**
     * 播音开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 播音结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
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
	
	private Long programTypeId;
    /**
     * 语言id       db_column: LANGUAGE_ID 
     */	
	
	private Long languageId;
    /**
     * weekday       db_column: WEEKDAY 
     */	
	private String weekday;
    /**
     * 输入人       db_column: INPUT_PERSON_ID 
     */	
	
	private Long inputPersonId;
    /**
     * 校对人       db_column: REVISE_PERSON_ID 
     */	
	
	private Long revisePersonId;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
    /**
     * 节目id       db_column: PROGRAM_ID 
     */	
	
	private Long programId;
    /**
     * 收测站点       db_column: MON_AREA 
     */	
	private String monArea;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
	//columns END

	public ZresRunplanHistoryTab(){
	}

	public ZresRunplanHistoryTab(
		Long runplanId
	){
		this.runplanId = runplanId;
	}

	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public Long getRunplanId() {
		return this.runplanId;
	}
	public void setRunplanTypeId(Long value) {
		this.runplanTypeId = value;
	}
	
	public Long getRunplanTypeId() {
		return this.runplanTypeId;
	}
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	public void setTransmiterNo(String value) {
		this.transmiterNo = value;
	}
	
	public String getTransmiterNo() {
		return this.transmiterNo;
	}
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getFreq() {
		return this.freq;
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
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setAntenna(String value) {
		this.antenna = value;
	}
	
	public String getAntenna() {
		return this.antenna;
	}
	public void setAntennatype(String value) {
		this.antennatype = value;
	}
	
	public String getAntennatype() {
		return this.antennatype;
	}

	
	public void setRestDatetime(Date value) {
		this.restDatetime = value;
	}
	
	public Date getRestDatetime() {
		return this.restDatetime;
	}
	public void setRestTime(String value) {
		this.restTime = value;
	}
	
	public String getRestTime() {
		return this.restTime;
	}
	public void setSentcityId(Long value) {
		this.sentcityId = value;
	}
	
	public Long getSentcityId() {
		return this.sentcityId;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
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
	public void setProgramTypeId(Long value) {
		this.programTypeId = value;
	}
	
	public Long getProgramTypeId() {
		return this.programTypeId;
	}
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	public void setWeekday(String value) {
		this.weekday = value;
	}
	
	public String getWeekday() {
		return this.weekday;
	}
	public void setInputPersonId(Long value) {
		this.inputPersonId = value;
	}
	
	public Long getInputPersonId() {
		return this.inputPersonId;
	}
	public void setRevisePersonId(Long value) {
		this.revisePersonId = value;
	}
	
	public Long getRevisePersonId() {
		return this.revisePersonId;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setProgramId(Long value) {
		this.programId = value;
	}
	
	public Long getProgramId() {
		return this.programId;
	}
	public void setMonArea(String value) {
		this.monArea = value;
	}
	
	public String getMonArea() {
		return this.monArea;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
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
			.append("Antenna",getAntenna())
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
			.append("InputPersonId",getInputPersonId())
			.append("RevisePersonId",getRevisePersonId())
			.append("Remark",getRemark())
			.append("ProgramId",getProgramId())
			.append("MonArea",getMonArea())
			.append("IsDelete",getIsDelete())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRunplanId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZresRunplanHistoryTab == false) return false;
		if(this == obj) return true;
		ZresRunplanHistoryTab other = (ZresRunplanHistoryTab)obj;
		return new EqualsBuilder()
			.append(getRunplanId(),other.getRunplanId())
			.isEquals();
	}
}

