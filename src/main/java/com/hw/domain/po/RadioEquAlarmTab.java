
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


public class RadioEquAlarmTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioEquAlarmTab";
	public static final String ALIAS_ALARM_ID = "alarmId";
	public static final String ALIAS_HEAD_ID = "前段id";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_ORIGIN_ALARMID = "原始报警id";
	public static final String ALIAS_ALARM_DATETIME = "报警时间";
	public static final String ALIAS_RESUME_DATETIME = "恢复时间";
	public static final String ALIAS_IS_RESUME = "是否恢复";
	public static final String ALIAS_TYPE = "类型";
	public static final String ALIAS_DESCRIPTION = "描述";
	public static final String ALIAS_REASON = "原因";
	public static final String ALIAS_OUTPUTLINELEVEL = "输出电压";
	public static final String ALIAS_INPUTLINELEVEL = "输入电压";
	public static final String ALIAS_LINEFREQUENCY = "外电频率";
	public static final String ALIAS_BATTERYLEVEL = "UPS电池电压";
	public static final String ALIAS_UPSSTATUS = "UPS状态字";
	public static final String ALIAS_REPORT_TYPE = "上报类型：0，手动回收，1主动上报,2手动添加";
	public static final String ALIAS_IS_HANDLE = "是否处理";
	public static final String ALIAS_HANDLE_DATETIME = "处理日期";
	public static final String ALIAS_OPERATOR = "处理人";
	public static final String ALIAS_REMARK = "处理意见";
	public static final String ALIAS_IS_DELETE = "是否删除";
	public static final String ALIAS_HEAD_CODE = "前段代码";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * alarmId       db_column: ALARM_ID 
     */	
	
	private Long alarmId;
    /**
     * 前段id       db_column: HEAD_ID 
     */	
	private Long headId;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 原始报警id       db_column: ORIGIN_ALARMID 
     */	
	
	private Long originAlarmid;
    /**
     * 报警时间       db_column: ALARM_DATETIME 
     */	
	
	private Date alarmDatetime;
    /**
     * 恢复时间       db_column: RESUME_DATETIME 
     */	
	
	private Date resumeDatetime;
    /**
     * 是否恢复       db_column: IS_RESUME 
     */	
	
	private Long isResume;
    /**
     * 类型       db_column: TYPE 
     */	
	
	private Long type;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 原因       db_column: REASON 
     */	
	private String reason;
    /**
     * 输出电压       db_column: OUTPUTLINELEVEL 
     */	
	
	private Long outputlinelevel;
    /**
     * 输入电压       db_column: INPUTLINELEVEL 
     */	
	
	private Long inputlinelevel;
    /**
     * 外电频率       db_column: LINEFREQUENCY 
     */	
	
	private Long linefrequency;
    /**
     * UPS电池电压       db_column: BATTERYLEVEL 
     */	
	
	private Long batterylevel;
    /**
     * UPS状态字       db_column: UPSSTATUS 
     */	
	private String upsstatus;
    /**
     * 上报类型：0，手动回收，1主动上报,2手动添加       db_column: REPORT_TYPE 
     */	
	
	private Long reportType;
    /**
     * 是否处理       db_column: IS_HANDLE 
     */	
	
	private Long isHandle;
    /**
     * 处理日期       db_column: HANDLE_DATETIME 
     */	
	
	private Date handleDatetime;
    /**
     * 处理人       db_column: OPERATOR 
     */	
	private String operator;
    /**
     * 处理意见       db_column: REMARK 
     */	
	private String remark;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * 前段代码       db_column: HEAD_CODE 
     */	
	private String headCode;
	//columns END

	public RadioEquAlarmTab(){
	}

	public RadioEquAlarmTab(
		Long alarmId
	){
		this.alarmId = alarmId;
	}

	public void setAlarmId(Long value) {
		this.alarmId = value;
	}
	
	public Long getAlarmId() {
		return this.alarmId;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setOriginAlarmid(Long value) {
		this.originAlarmid = value;
	}
	
	public Long getOriginAlarmid() {
		return this.originAlarmid;
	}

	
	public void setAlarmDatetime(Date value) {
		this.alarmDatetime = value;
	}
	
	public Date getAlarmDatetime() {
		return this.alarmDatetime;
	}

	
	public void setResumeDatetime(Date value) {
		this.resumeDatetime = value;
	}
	
	public Date getResumeDatetime() {
		return this.resumeDatetime;
	}
	public void setIsResume(Long value) {
		this.isResume = value;
	}
	
	public Long getIsResume() {
		return this.isResume;
	}
	public void setType(Long value) {
		this.type = value;
	}
	
	public Long getType() {
		return this.type;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setReason(String value) {
		this.reason = value;
	}
	
	public String getReason() {
		return this.reason;
	}
	public void setOutputlinelevel(Long value) {
		this.outputlinelevel = value;
	}
	
	public Long getOutputlinelevel() {
		return this.outputlinelevel;
	}
	public void setInputlinelevel(Long value) {
		this.inputlinelevel = value;
	}
	
	public Long getInputlinelevel() {
		return this.inputlinelevel;
	}
	public void setLinefrequency(Long value) {
		this.linefrequency = value;
	}
	
	public Long getLinefrequency() {
		return this.linefrequency;
	}
	public void setBatterylevel(Long value) {
		this.batterylevel = value;
	}
	
	public Long getBatterylevel() {
		return this.batterylevel;
	}
	public void setUpsstatus(String value) {
		this.upsstatus = value;
	}
	
	public String getUpsstatus() {
		return this.upsstatus;
	}
	public void setReportType(Long value) {
		this.reportType = value;
	}
	
	public Long getReportType() {
		return this.reportType;
	}
	public void setIsHandle(Long value) {
		this.isHandle = value;
	}
	
	public Long getIsHandle() {
		return this.isHandle;
	}

	
	public void setHandleDatetime(Date value) {
		this.handleDatetime = value;
	}
	
	public Date getHandleDatetime() {
		return this.handleDatetime;
	}
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getOperator() {
		return this.operator;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	private DicEquAlarmTypeTab dicEquAlarmTypeTab;
	
	public void setDicEquAlarmTypeTab(DicEquAlarmTypeTab dicEquAlarmTypeTab){
		this.dicEquAlarmTypeTab = dicEquAlarmTypeTab;
	}
	
	public DicEquAlarmTypeTab getDicEquAlarmTypeTab() {
		return dicEquAlarmTypeTab;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("AlarmId",getAlarmId())
			.append("HeadId",getHeadId())
			.append("EquCode",getEquCode())
			.append("OriginAlarmid",getOriginAlarmid())
			.append("AlarmDatetime",getAlarmDatetime())
			.append("ResumeDatetime",getResumeDatetime())
			.append("IsResume",getIsResume())
			.append("Type",getType())
			.append("Description",getDescription())
			.append("Reason",getReason())
			.append("Outputlinelevel",getOutputlinelevel())
			.append("Inputlinelevel",getInputlinelevel())
			.append("Linefrequency",getLinefrequency())
			.append("Batterylevel",getBatterylevel())
			.append("Upsstatus",getUpsstatus())
			.append("ReportType",getReportType())
			.append("IsHandle",getIsHandle())
			.append("HandleDatetime",getHandleDatetime())
			.append("Operator",getOperator())
			.append("Remark",getRemark())
			.append("IsDelete",getIsDelete())
			.append("HeadCode",getHeadCode())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getAlarmId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquAlarmTab == false) return false;
		if(this == obj) return true;
		RadioEquAlarmTab other = (RadioEquAlarmTab)obj;
		return new EqualsBuilder()
			.append(getAlarmId(),other.getAlarmId())
			.isEquals();
	}
}

