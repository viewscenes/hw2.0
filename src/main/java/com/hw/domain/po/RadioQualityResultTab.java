
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


public class RadioQualityResultTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioQualityResultTab";
	public static final String ALIAS_RESULT_ID = "resultId";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_TASK_ID = "任务Id";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_CHECK_DATETIME = "测量时间";
	public static final String ALIAS_TYPE = "类型：1:载波电平 3:调幅度 5:调制度最大值 8:带宽";
	public static final String ALIAS_VALUE1 = "值";
	public static final String ALIAS_VALUE2 = "值";
	public static final String ALIAS_REPORT_TYPE = "上报类型：1主动上报，0：手动获取";
	public static final String ALIAS_HEAD_ID = "前段id";
	public static final String ALIAS_IS_DELETE = "是否删除";
	public static final String ALIAS_STORE_DATETIME = "存储时间";
	public static final String ALIAS_DESCRIPTION = "描述";
	public static final String ALIAS_BAND = "波段";
	
	//date formats

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * resultId       db_column: RESULT_ID 
     */	
	
	private Long resultId;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 任务Id       db_column: TASK_ID 
     */	
	
	private Long taskId;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 测量时间       db_column: CHECK_DATETIME 
     */	
	
	private Date checkDatetime;
    /**
     * 类型：1:载波电平 3:调幅度 5:调制度最大值 8:带宽       db_column: TYPE 
     */	
	private String type;
    /**
     * 值       db_column: VALUE1 
     */	
	
	private Long value1;
    /**
     * 值       db_column: VALUE2 
     */	
	
	private Long value2;
    /**
     * 上报类型：1主动上报，0：手动获取       db_column: REPORT_TYPE 
     */	
	
	private Long reportType;
    /**
     * 前段id       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * 存储时间       db_column: STORE_DATETIME 
     */	
	
	private Date storeDatetime;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 波段       db_column: BAND 
     */	
	private Integer band;
	//columns END

	public RadioQualityResultTab(){
	}

	public RadioQualityResultTab(
		Long resultId
	){
		this.resultId = resultId;
	}

	public void setResultId(Long value) {
		this.resultId = value;
	}
	
	public Long getResultId() {
		return this.resultId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}

	public void setCheckDatetime(Date value) {
		this.checkDatetime = value;
	}
	
	public Date getCheckDatetime() {
		return this.checkDatetime;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	public void setValue1(Long value) {
		this.value1 = value;
	}
	
	public Long getValue1() {
		return this.value1;
	}
	public void setValue2(Long value) {
		this.value2 = value;
	}
	
	public Long getValue2() {
		return this.value2;
	}
	public void setReportType(Long value) {
		this.reportType = value;
	}
	
	public Long getReportType() {
		return this.reportType;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}

	
	public void setStoreDatetime(Date value) {
		this.storeDatetime = value;
	}
	
	public Date getStoreDatetime() {
		return this.storeDatetime;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public Integer getBand() {
		return this.band;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ResultId",getResultId())
			.append("EquCode",getEquCode())
			.append("TaskId",getTaskId())
			.append("Frequency",getFrequency())
			.append("CheckDatetime",getCheckDatetime())
			.append("Type",getType())
			.append("Value1",getValue1())
			.append("Value2",getValue2())
			.append("ReportType",getReportType())
			.append("HeadId",getHeadId())
			.append("IsDelete",getIsDelete())
			.append("StoreDatetime",getStoreDatetime())
			.append("Description",getDescription())
			.append("Band",getBand())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getResultId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioQualityResultTab == false) return false;
		if(this == obj) return true;
		RadioQualityResultTab other = (RadioQualityResultTab)obj;
		return new EqualsBuilder()
			.append(getResultId(),other.getResultId())
			.isEquals();
	}
}

