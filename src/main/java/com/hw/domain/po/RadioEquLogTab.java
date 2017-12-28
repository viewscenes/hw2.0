
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


public class RadioEquLogTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioEquLogTab";
	public static final String ALIAS_LOG_ID = "logId";
	public static final String ALIAS_LOG_DATETIME = "日志日期";
	public static final String ALIAS_DESCRIPTION = "描述";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_TYPE_ID = "类型";
	public static final String ALIAS_HEAD_CODE = "前端code";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * logId       db_column: LOG_ID 
     */	
	
	private Long logId;
    /**
     * 日志日期       db_column: LOG_DATETIME 
     */	
	
	private Date logDatetime;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
    /**
     * 类型       db_column: TYPE_ID 
     */	
	
	private Long typeId;
    /**
     * 前端code       db_column: HEAD_CODE 
     */	
	private String headCode;
	//columns END

	public RadioEquLogTab(){
	}

	public RadioEquLogTab(
		Long logId
	){
		this.logId = logId;
	}

	public void setLogId(Long value) {
		this.logId = value;
	}
	
	public Long getLogId() {
		return this.logId;
	}

	
	public void setLogDatetime(Date value) {
		this.logDatetime = value;
	}
	
	public Date getLogDatetime() {
		return this.logDatetime;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("LogId",getLogId())
			.append("LogDatetime",getLogDatetime())
			.append("Description",getDescription())
			.append("Remark",getRemark())
			.append("TypeId",getTypeId())
			.append("HeadCode",getHeadCode())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getLogId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquLogTab == false) return false;
		if(this == obj) return true;
		RadioEquLogTab other = (RadioEquLogTab)obj;
		return new EqualsBuilder()
			.append(getLogId(),other.getLogId())
			.isEquals();
	}
}

