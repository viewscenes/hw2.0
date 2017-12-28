
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


public class RadioUnifyTaskTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioUnifyTaskTab";
	public static final String ALIAS_TASK_ID = "taskId";
	public static final String ALIAS_EQU_CODE = "接收机号，指标、频偏、录音任务接收机取RADIO_TASK_FREQ_TAB中的，频谱取这个。";
	public static final String ALIAS_HEAD_CODE = "前端code";
	public static final String ALIAS_IS_DELETE = "是否删除0：未删除。1：删除";
	public static final String ALIAS_VALID_STARTDATETIME = "有效期开始时间";
	public static final String ALIAS_VALID_ENDDATETIME = "有效期结束时间";
	public static final String ALIAS_CHECK_LEVEL = "是否监测电平";
	public static final String ALIAS_CHECK_FM_MODULATION = "是否监测调制度";
	public static final String ALIAS_CHECK_AM_MODULATION = "是否监测条幅度";
	public static final String ALIAS_CHECK_FM_MODULATION_MAX = "是否监测最大调制度";
	public static final String ALIAS_CHECK_OFFSET = "是否监测频偏";
	public static final String ALIAS_CHECK_BANDWIDTH = "是否监测带宽";
	public static final String ALIAS_UNIT = "采样单元1分钟2秒钟3小时";
	public static final String ALIAS_SAMPLES_NUMBER = "采样个数";
	public static final String ALIAS_IS_SEND = "下达状态：0未下达，1已下达，2下达失败，3等待下达";
	public static final String ALIAS_IS_DELAYSEND = "是否延迟下达0不延迟，1延迟";
	public static final String ALIAS_DELAYSEND_DATETIME = "延迟下达时间";
	public static final String ALIAS_RECORDLENGTH = "录音时间";
	public static final String ALIAS_EXPIREDAYS = "有效期";
	public static final String ALIAS_SLEEPTIME = "间隔时间";
	public static final String ALIAS_SEND_TIMES = "下达次数";
	public static final String ALIAS_NOTE = "下达信息";
	public static final String ALIAS_RUNPLAN_ID = "运行图id";
	public static final String ALIAS_BATCH_NO = "在有效下发次数范围中下发日期";
	public static final String ALIAS_IS_ACTIVE = "是否存活：0激活，1延迟";
	public static final String ALIAS_PRIORITY = "权限";
	public static final String ALIAS_IS_TEMPORARY = "是否临时任务：1是。2否";
	public static final String ALIAS_SEND_DATETIME = "下发到设备日期";
	public static final String ALIAS_BPS = "码率";
	public static final String ALIAS_TASK_TYPE = "任务类型1 指标任务 2 录音任务 3 频偏任务 4 频谱任务 5录音指标任务";
	public static final String ALIAS_CREATE_USER = "任务生成人";
	public static final String ALIAS_SEND_USER = "任务下发 人";
	public static final String ALIAS_AUTHENTIC_STATUS = "0:未审核1：审核";
	public static final String ALIAS_AUTHENTIC_USER = "审核人";
	public static final String ALIAS_QUALITY_SLEEPTIME = "指标收测时间间隔";
	public static final String ALIAS_STREAM_SLEEPTIME = "录音收测时间间隔";
	public static final String ALIAS_OFFSET_SLEEPTIME = "频偏收测时间间隔";
	public static final String ALIAS_SPECTRUM_SLEEPTIME = "频谱收测时间间隔";
	public static final String ALIAS_CHECK_QUALITY_TASK = "1:代表指标任务";
	public static final String ALIAS_CHECK_OFFSET_TASK = "1;代表频偏任务";
	public static final String ALIAS_CHECK_STREAM_TASK = "1:代表录音任务";
	public static final String ALIAS_CHECK_ALARM = "0报警1不报警";
	public static final String ALIAS_HEAD_TYPE_ID = "站点类型 101采集点 102遥控站";
	public static final String ALIAS_RECORD_TYPE = "运行图录音任务类型 质量 录音";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * taskId       db_column: TASK_ID 
     */	
	
	private Long taskId;
    /**
     * 接收机号，指标、频偏、录音任务接收机取RADIO_TASK_FREQ_TAB中的，频谱取这个。       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 前端code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 是否删除0：未删除。1：删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * 有效期开始时间       db_column: VALID_STARTDATETIME 
     */	
	
	private Date validStartdatetime;
    /**
     * 有效期结束时间       db_column: VALID_ENDDATETIME 
     */	
	
	private Date validEnddatetime;
    /**
     * 是否监测电平       db_column: CHECK_LEVEL 
     */	
	
	private Long checkLevel;
    /**
     * 是否监测调制度       db_column: CHECK_FM_MODULATION 
     */	
	
	private Long checkFmModulation;
    /**
     * 是否监测条幅度       db_column: CHECK_AM_MODULATION 
     */	
	
	private Long checkAmModulation;
    /**
     * 是否监测最大调制度       db_column: CHECK_FM_MODULATION_MAX 
     */	
	
	private Long checkFmModulationMax;
    /**
     * 是否监测频偏       db_column: CHECK_OFFSET 
     */	
	
	private Long checkOffset;
    /**
     * 是否监测带宽       db_column: CHECK_BANDWIDTH 
     */	
	
	private Long checkBandwidth;
    /**
     * 采样单元1分钟2秒钟3小时       db_column: UNIT 
     */	
	
	private Long unit;
    /**
     * 采样个数       db_column: SAMPLES_NUMBER 
     */	
	
	private Long samplesNumber;
    /**
     * 下达状态：0未下达，1已下达，2下达失败，3等待下达       db_column: IS_SEND 
     */	
	
	private Long isSend;
    /**
     * 是否延迟下达0不延迟，1延迟       db_column: IS_DELAYSEND 
     */	
	
	private Long isDelaysend;
    /**
     * 延迟下达时间       db_column: DELAYSEND_DATETIME 
     */	
	
	private Date delaysendDatetime;
    /**
     * 录音时间       db_column: RECORDLENGTH 
     */	
	private String recordlength;
    /**
     * 有效期       db_column: EXPIREDAYS 
     */	
	
	private Long expiredays;
    /**
     * 间隔时间       db_column: SLEEPTIME 
     */	
	private String sleeptime;
    /**
     * 下达次数       db_column: SEND_TIMES 
     */	
	
	private Long sendTimes;
    /**
     * 下达信息       db_column: NOTE 
     */	
	private String note;
    /**
     * 运行图id       db_column: RUNPLAN_ID 
     */	
	
	private Long runplanId;
    /**
     * 在有效下发次数范围中下发日期       db_column: BATCH_NO 
     */	
	private String batchNo;
    /**
     * 是否存活：0激活，1延迟       db_column: IS_ACTIVE 
     */	
	
	private Long isActive;
    /**
     * 权限       db_column: PRIORITY 
     */	
	
	private Long priority;
    /**
     * 是否临时任务：1是。2否       db_column: IS_TEMPORARY 
     */	
	
	private Long isTemporary;
    /**
     * 下发到设备日期       db_column: SEND_DATETIME 
     */	
	
	private Date sendDatetime;
    /**
     * 码率       db_column: BPS 
     */	
	
	private Long bps;
    /**
     * 任务类型1 指标任务 2 录音任务 3 频偏任务 4 频谱任务 5录音指标任务       db_column: TASK_TYPE 
     */	
	
	private Long taskType;
    /**
     * 任务生成人       db_column: CREATE_USER 
     */	
	private String createUser;
    /**
     * 任务下发 人       db_column: SEND_USER 
     */	
	private String sendUser;
    /**
     * 0:未审核1：审核       db_column: AUTHENTIC_STATUS 
     */	
	
	private Long authenticStatus;
    /**
     * 审核人       db_column: AUTHENTIC_USER 
     */	
	private String authenticUser;
    /**
     * 指标收测时间间隔       db_column: QUALITY_SLEEPTIME 
     */	
	private String qualitySleeptime;
    /**
     * 录音收测时间间隔       db_column: STREAM_SLEEPTIME 
     */	
	private String streamSleeptime;
    /**
     * 频偏收测时间间隔       db_column: OFFSET_SLEEPTIME 
     */	
	private String offsetSleeptime;
    /**
     * 频谱收测时间间隔       db_column: SPECTRUM_SLEEPTIME 
     */	
	private String spectrumSleeptime;
    /**
     * 1:代表指标任务       db_column: CHECK_QUALITY_TASK 
     */	
	
	private Long checkQualityTask;
    /**
     * 1;代表频偏任务       db_column: CHECK_OFFSET_TASK 
     */	
	
	private Long checkOffsetTask;
    /**
     * 1:代表录音任务       db_column: CHECK_STREAM_TASK 
     */	
	
	private Long checkStreamTask;
    /**
     * 0报警1不报警       db_column: CHECK_ALARM 
     */	
	
	private Long checkAlarm;
    /**
     * 站点类型 101采集点 102遥控站       db_column: HEAD_TYPE_ID 
     */	
	
	private Long headTypeId;
    /**
     * 运行图录音任务类型 质量 录音       db_column: RECORD_TYPE 
     */	
	private String recordType;
	//columns END

	public RadioUnifyTaskTab(){
	}

	public RadioUnifyTaskTab(
		Long taskId
	){
		this.taskId = taskId;
	}

	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}

	
	public void setValidStartdatetime(Date value) {
		this.validStartdatetime = value;
	}
	
	public Date getValidStartdatetime() {
		return this.validStartdatetime;
	}

	
	public void setValidEnddatetime(Date value) {
		this.validEnddatetime = value;
	}
	
	public Date getValidEnddatetime() {
		return this.validEnddatetime;
	}
	public void setCheckLevel(Long value) {
		this.checkLevel = value;
	}
	
	public Long getCheckLevel() {
		return this.checkLevel;
	}
	public void setCheckFmModulation(Long value) {
		this.checkFmModulation = value;
	}
	
	public Long getCheckFmModulation() {
		return this.checkFmModulation;
	}
	public void setCheckAmModulation(Long value) {
		this.checkAmModulation = value;
	}
	
	public Long getCheckAmModulation() {
		return this.checkAmModulation;
	}
	public void setCheckFmModulationMax(Long value) {
		this.checkFmModulationMax = value;
	}
	
	public Long getCheckFmModulationMax() {
		return this.checkFmModulationMax;
	}
	public void setCheckOffset(Long value) {
		this.checkOffset = value;
	}
	
	public Long getCheckOffset() {
		return this.checkOffset;
	}
	public void setCheckBandwidth(Long value) {
		this.checkBandwidth = value;
	}
	
	public Long getCheckBandwidth() {
		return this.checkBandwidth;
	}
	public void setUnit(Long value) {
		this.unit = value;
	}
	
	public Long getUnit() {
		return this.unit;
	}
	public void setSamplesNumber(Long value) {
		this.samplesNumber = value;
	}
	
	public Long getSamplesNumber() {
		return this.samplesNumber;
	}
	public void setIsSend(Long value) {
		this.isSend = value;
	}
	
	public Long getIsSend() {
		return this.isSend;
	}
	public void setIsDelaysend(Long value) {
		this.isDelaysend = value;
	}
	
	public Long getIsDelaysend() {
		return this.isDelaysend;
	}

	
	public void setDelaysendDatetime(Date value) {
		this.delaysendDatetime = value;
	}
	
	public Date getDelaysendDatetime() {
		return this.delaysendDatetime;
	}
	public void setRecordlength(String value) {
		this.recordlength = value;
	}
	
	public String getRecordlength() {
		return this.recordlength;
	}
	public void setExpiredays(Long value) {
		this.expiredays = value;
	}
	
	public Long getExpiredays() {
		return this.expiredays;
	}
	public void setSleeptime(String value) {
		this.sleeptime = value;
	}
	
	public String getSleeptime() {
		return this.sleeptime;
	}
	public void setSendTimes(Long value) {
		this.sendTimes = value;
	}
	
	public Long getSendTimes() {
		return this.sendTimes;
	}
	public void setNote(String value) {
		this.note = value;
	}
	
	public String getNote() {
		return this.note;
	}
	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public Long getRunplanId() {
		return this.runplanId;
	}
	public void setBatchNo(String value) {
		this.batchNo = value;
	}
	
	public String getBatchNo() {
		return this.batchNo;
	}
	public void setIsActive(Long value) {
		this.isActive = value;
	}
	
	public Long getIsActive() {
		return this.isActive;
	}
	public void setPriority(Long value) {
		this.priority = value;
	}
	
	public Long getPriority() {
		return this.priority;
	}
	public void setIsTemporary(Long value) {
		this.isTemporary = value;
	}
	
	public Long getIsTemporary() {
		return this.isTemporary;
	}

	public void setSendDatetime(Date value) {
		this.sendDatetime = value;
	}
	
	public Date getSendDatetime() {
		return this.sendDatetime;
	}
	public void setBps(Long value) {
		this.bps = value;
	}
	
	public Long getBps() {
		return this.bps;
	}
	public void setTaskType(Long value) {
		this.taskType = value;
	}
	
	public Long getTaskType() {
		return this.taskType;
	}
	public void setCreateUser(String value) {
		this.createUser = value;
	}
	
	public String getCreateUser() {
		return this.createUser;
	}
	public void setSendUser(String value) {
		this.sendUser = value;
	}
	
	public String getSendUser() {
		return this.sendUser;
	}
	public void setAuthenticStatus(Long value) {
		this.authenticStatus = value;
	}
	
	public Long getAuthenticStatus() {
		return this.authenticStatus;
	}
	public void setAuthenticUser(String value) {
		this.authenticUser = value;
	}
	
	public String getAuthenticUser() {
		return this.authenticUser;
	}
	public void setQualitySleeptime(String value) {
		this.qualitySleeptime = value;
	}
	
	public String getQualitySleeptime() {
		return this.qualitySleeptime;
	}
	public void setStreamSleeptime(String value) {
		this.streamSleeptime = value;
	}
	
	public String getStreamSleeptime() {
		return this.streamSleeptime;
	}
	public void setOffsetSleeptime(String value) {
		this.offsetSleeptime = value;
	}
	
	public String getOffsetSleeptime() {
		return this.offsetSleeptime;
	}
	public void setSpectrumSleeptime(String value) {
		this.spectrumSleeptime = value;
	}
	
	public String getSpectrumSleeptime() {
		return this.spectrumSleeptime;
	}
	public void setCheckQualityTask(Long value) {
		this.checkQualityTask = value;
	}
	
	public Long getCheckQualityTask() {
		return this.checkQualityTask;
	}
	public void setCheckOffsetTask(Long value) {
		this.checkOffsetTask = value;
	}
	
	public Long getCheckOffsetTask() {
		return this.checkOffsetTask;
	}
	public void setCheckStreamTask(Long value) {
		this.checkStreamTask = value;
	}
	
	public Long getCheckStreamTask() {
		return this.checkStreamTask;
	}
	public void setCheckAlarm(Long value) {
		this.checkAlarm = value;
	}
	
	public Long getCheckAlarm() {
		return this.checkAlarm;
	}
	public void setHeadTypeId(Long value) {
		this.headTypeId = value;
	}
	
	public Long getHeadTypeId() {
		return this.headTypeId;
	}
	public void setRecordType(String value) {
		this.recordType = value;
	}
	
	public String getRecordType() {
		return this.recordType;
	}
	
	private DicTaskTypeTab dicTaskTypeTab;
	
	public void setDicTaskTypeTab(DicTaskTypeTab dicTaskTypeTab){
		this.dicTaskTypeTab = dicTaskTypeTab;
	}
	
	public DicTaskTypeTab getDicTaskTypeTab() {
		return dicTaskTypeTab;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("TaskId",getTaskId())
			.append("EquCode",getEquCode())
			.append("HeadCode",getHeadCode())
			.append("IsDelete",getIsDelete())
			.append("ValidStartdatetime",getValidStartdatetime())
			.append("ValidEnddatetime",getValidEnddatetime())
			.append("CheckLevel",getCheckLevel())
			.append("CheckFmModulation",getCheckFmModulation())
			.append("CheckAmModulation",getCheckAmModulation())
			.append("CheckFmModulationMax",getCheckFmModulationMax())
			.append("CheckOffset",getCheckOffset())
			.append("CheckBandwidth",getCheckBandwidth())
			.append("Unit",getUnit())
			.append("SamplesNumber",getSamplesNumber())
			.append("IsSend",getIsSend())
			.append("IsDelaysend",getIsDelaysend())
			.append("DelaysendDatetime",getDelaysendDatetime())
			.append("Recordlength",getRecordlength())
			.append("Expiredays",getExpiredays())
			.append("Sleeptime",getSleeptime())
			.append("SendTimes",getSendTimes())
			.append("Note",getNote())
			.append("RunplanId",getRunplanId())
			.append("BatchNo",getBatchNo())
			.append("IsActive",getIsActive())
			.append("Priority",getPriority())
			.append("IsTemporary",getIsTemporary())
			.append("SendDatetime",getSendDatetime())
			.append("Bps",getBps())
			.append("TaskType",getTaskType())
			.append("CreateUser",getCreateUser())
			.append("SendUser",getSendUser())
			.append("AuthenticStatus",getAuthenticStatus())
			.append("AuthenticUser",getAuthenticUser())
			.append("QualitySleeptime",getQualitySleeptime())
			.append("StreamSleeptime",getStreamSleeptime())
			.append("OffsetSleeptime",getOffsetSleeptime())
			.append("SpectrumSleeptime",getSpectrumSleeptime())
			.append("CheckQualityTask",getCheckQualityTask())
			.append("CheckOffsetTask",getCheckOffsetTask())
			.append("CheckStreamTask",getCheckStreamTask())
			.append("CheckAlarm",getCheckAlarm())
			.append("HeadTypeId",getHeadTypeId())
			.append("RecordType",getRecordType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTaskId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioUnifyTaskTab == false) return false;
		if(this == obj) return true;
		RadioUnifyTaskTab other = (RadioUnifyTaskTab)obj;
		return new EqualsBuilder()
			.append(getTaskId(),other.getTaskId())
			.isEquals();
	}
}

