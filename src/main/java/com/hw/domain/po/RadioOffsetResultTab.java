
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


public class RadioOffsetResultTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioOffsetResultTab";
	public static final String ALIAS_RESULT_ID = "resultId";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_TASK_ID = "任务id";
	public static final String ALIAS_CHECK_DATETIME = "收测时间";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_OFFSET = "频偏值";
	public static final String ALIAS_REPORT_TYPE = "上报类型：1主动上报，0手动回收";
	public static final String ALIAS_HEAD_ID = "前段id";
	public static final String ALIAS_IS_DELETE = "是否删除";
	public static final String ALIAS_STORE_DATETIME = "存储时间";
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
     * 任务id       db_column: TASK_ID 
     */	
	
	private Long taskId;
    /**
     * 收测时间       db_column: CHECK_DATETIME 
     */	
	
	private Date checkDatetime;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 频偏值       db_column: OFFSET 
     */	
	
	private Long offset;
    /**
     * 上报类型：1主动上报，0手动回收       db_column: REPORT_TYPE 
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
     * 波段       db_column: BAND 
     */	
	private Integer band;
	//columns END

	public RadioOffsetResultTab(){
	}

	public RadioOffsetResultTab(
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

	
	public void setCheckDatetime(Date value) {
		this.checkDatetime = value;
	}
	
	public Date getCheckDatetime() {
		return this.checkDatetime;
	}
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	public void setOffset(Long value) {
		this.offset = value;
	}
	
	public Long getOffset() {
		return this.offset;
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
			.append("CheckDatetime",getCheckDatetime())
			.append("Frequency",getFrequency())
			.append("Offset",getOffset())
			.append("ReportType",getReportType())
			.append("HeadId",getHeadId())
			.append("IsDelete",getIsDelete())
			.append("StoreDatetime",getStoreDatetime())
			.append("Band",getBand())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getResultId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioOffsetResultTab == false) return false;
		if(this == obj) return true;
		RadioOffsetResultTab other = (RadioOffsetResultTab)obj;
		return new EqualsBuilder()
			.append(getResultId(),other.getResultId())
			.isEquals();
	}
}

