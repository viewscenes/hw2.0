
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashSet;
import java.util.Set;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioSubTaskTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioSubTaskTab";
	public static final String ALIAS_SUB_TASK_ID = "子任务id";
	public static final String ALIAS_BAND = "波段";
	public static final String ALIAS_STARTFREQ = "起始频率";
	public static final String ALIAS_ENDFREQ = "终止频率";
	public static final String ALIAS_STEPFREQ = "步长频率";
	public static final String ALIAS_TASK_ID = "任务id";
	public static final String ALIAS_FROM_RUNPLAN = "是否来自运行图0：不，1：是";
	public static final String ALIAS_IS_DELETE = "是否删除";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_FREQ = "频率";
	public static final String ALIAS_BPS = "录音压缩";
	public static final String ALIAS_STATION_NAME = "发射台名称";
	public static final String ALIAS_LANGUAGE = "语言";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 子任务id       db_column: SUB_TASK_ID 
     */	
	
	private Long subTaskId;
    /**
     * 波段       db_column: BAND 
     */	
	
	private Long band;
    /**
     * 起始频率       db_column: STARTFREQ 
     */	
	
	private Long startfreq;
    /**
     * 终止频率       db_column: ENDFREQ 
     */	
	
	private Long endfreq;
    /**
     * 步长频率       db_column: STEPFREQ 
     */	
	
	private Long stepfreq;
    /**
     * 任务id       db_column: TASK_ID 
     */	
	
	private Long taskId;
    /**
     * 是否来自运行图0：不，1：是       db_column: FROM_RUNPLAN 
     */	
	
	private Long fromRunplan;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Long freq;
    /**
     * 录音压缩       db_column: BPS 
     */	
	
	private Long bps;
    /**
     * 发射台名称       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 语言       db_column: LANGUAGE 
     */	
	private String language;
	//columns END

	public RadioSubTaskTab(){
	}

	public RadioSubTaskTab(
		Long subTaskId
	){
		this.subTaskId = subTaskId;
	}

	public void setSubTaskId(Long value) {
		this.subTaskId = value;
	}
	
	public Long getSubTaskId() {
		return this.subTaskId;
	}
	public void setBand(Long value) {
		this.band = value;
	}
	
	public Long getBand() {
		return this.band;
	}
	public void setStartfreq(Long value) {
		this.startfreq = value;
	}
	
	public Long getStartfreq() {
		return this.startfreq;
	}
	public void setEndfreq(Long value) {
		this.endfreq = value;
	}
	
	public Long getEndfreq() {
		return this.endfreq;
	}
	public void setStepfreq(Long value) {
		this.stepfreq = value;
	}
	
	public Long getStepfreq() {
		return this.stepfreq;
	}
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	public void setFromRunplan(Long value) {
		this.fromRunplan = value;
	}
	
	public Long getFromRunplan() {
		return this.fromRunplan;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	public void setBps(Long value) {
		this.bps = value;
	}
	
	public Long getBps() {
		return this.bps;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setLanguage(String value) {
		this.language = value;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	private Set radioTaskTimeCycleTabs = new HashSet(0);
	public void setRadioTaskTimeCycleTabs(Set<RadioTaskTimeCycleTab> radioTaskTimeCycleTab){
		this.radioTaskTimeCycleTabs = radioTaskTimeCycleTab;
	}
	
	public Set<RadioTaskTimeCycleTab> getRadioTaskTimeCycleTabs() {
		return radioTaskTimeCycleTabs;
	}
	
	private Set radioTaskTimeSingleTabs = new HashSet(0);
	public void setRadioTaskTimeSingleTabs(Set<RadioTaskTimeSingleTab> radioTaskTimeSingleTab){
		this.radioTaskTimeSingleTabs = radioTaskTimeSingleTab;
	}
	
	public Set<RadioTaskTimeSingleTab> getRadioTaskTimeSingleTabs() {
		return radioTaskTimeSingleTabs;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("SubTaskId",getSubTaskId())
			.append("Band",getBand())
			.append("Startfreq",getStartfreq())
			.append("Endfreq",getEndfreq())
			.append("Stepfreq",getStepfreq())
			.append("TaskId",getTaskId())
			.append("FromRunplan",getFromRunplan())
			.append("IsDelete",getIsDelete())
			.append("EquCode",getEquCode())
			.append("Freq",getFreq())
			.append("Bps",getBps())
			.append("StationName",getStationName())
			.append("Language",getLanguage())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSubTaskId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioSubTaskTab == false) return false;
		if(this == obj) return true;
		RadioSubTaskTab other = (RadioSubTaskTab)obj;
		return new EqualsBuilder()
			.append(getSubTaskId(),other.getSubTaskId())
			.isEquals();
	}
}

