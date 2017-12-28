
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioTaskTimeCycleTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioTaskTimeCycleTab";
	public static final String ALIAS_TIME_ID = "循环任务id";
	public static final String ALIAS_DAYOFWEEK = "任务周设置";
	public static final String ALIAS_STARTTIME = "开始时间";
	public static final String ALIAS_ENDTIME = "结束时间";
	public static final String ALIAS_REPORTMODE = "上报类型";
	public static final String ALIAS_REPORTINTERVAL = "上报间隔";
	public static final String ALIAS_REPORTTIME = "上报时间";
	public static final String ALIAS_EXPIREDAYS = "过期时间";
	public static final String ALIAS_SUB_TASK_ID = "子任务id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 循环任务id       db_column: TIME_ID 
     */	
	
	private Long timeId;
    /**
     * 任务周设置       db_column: DAYOFWEEK 
     */	
	private String dayofweek;
    /**
     * 开始时间       db_column: STARTTIME 
     */	
	private String starttime;
    /**
     * 结束时间       db_column: ENDTIME 
     */	
	private String endtime;
    /**
     * 上报类型       db_column: REPORTMODE 
     */	
	
	private Long reportmode;
    /**
     * 上报间隔       db_column: REPORTINTERVAL 
     */	
	private String reportinterval;
    /**
     * 上报时间       db_column: REPORTTIME 
     */	
	private String reporttime;
    /**
     * 过期时间       db_column: EXPIREDAYS 
     */	
	
	private Long expiredays;
    /**
     * 子任务id       db_column: SUB_TASK_ID 
     */	
	
	private Long subTaskId;
	//columns END

	public RadioTaskTimeCycleTab(){
	}

	public RadioTaskTimeCycleTab(
		Long timeId
	){
		this.timeId = timeId;
	}

	public void setTimeId(Long value) {
		this.timeId = value;
	}
	
	public Long getTimeId() {
		return this.timeId;
	}
	public void setDayofweek(String value) {
		this.dayofweek = value;
	}
	
	public String getDayofweek() {
		return this.dayofweek;
	}
	public void setStarttime(String value) {
		this.starttime = value;
	}
	
	public String getStarttime() {
		return this.starttime;
	}
	public void setEndtime(String value) {
		this.endtime = value;
	}
	
	public String getEndtime() {
		return this.endtime;
	}
	public void setReportmode(Long value) {
		this.reportmode = value;
	}
	
	public Long getReportmode() {
		return this.reportmode;
	}
	public void setReportinterval(String value) {
		this.reportinterval = value;
	}
	
	public String getReportinterval() {
		return this.reportinterval;
	}
	public void setReporttime(String value) {
		this.reporttime = value;
	}
	
	public String getReporttime() {
		return this.reporttime;
	}
	public void setExpiredays(Long value) {
		this.expiredays = value;
	}
	
	public Long getExpiredays() {
		return this.expiredays;
	}
	public void setSubTaskId(Long value) {
		this.subTaskId = value;
	}
	
	public Long getSubTaskId() {
		return this.subTaskId;
	}
	
	private RadioSubTaskTab radioSubTaskTab;
	
	public void setRadioSubTaskTab(RadioSubTaskTab radioSubTaskTab){
		this.radioSubTaskTab = radioSubTaskTab;
	}
	
	public RadioSubTaskTab getRadioSubTaskTab() {
		return radioSubTaskTab;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("TimeId",getTimeId())
			.append("Dayofweek",getDayofweek())
			.append("Starttime",getStarttime())
			.append("Endtime",getEndtime())
			.append("Reportmode",getReportmode())
			.append("Reportinterval",getReportinterval())
			.append("Reporttime",getReporttime())
			.append("Expiredays",getExpiredays())
			.append("SubTaskId",getSubTaskId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTimeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioTaskTimeCycleTab == false) return false;
		if(this == obj) return true;
		RadioTaskTimeCycleTab other = (RadioTaskTimeCycleTab)obj;
		return new EqualsBuilder()
			.append(getTimeId(),other.getTimeId())
			.isEquals();
	}
}

