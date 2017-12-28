
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


public class ResTaskUnitTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResTaskUnitTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HEAD_CODE = "前端code";
	public static final String ALIAS_UNITTIME = "单元时间";
	public static final String ALIAS_COUNT_MINUTES = "单元时间内总的录音时间";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_RECORD_TYPE = "运行图录音任务类型 质量 录音";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 前端code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 单元时间       db_column: UNITTIME 
     */	
	private String unittime;
    /**
     * 单元时间内总的录音时间       db_column: COUNT_MINUTES 
     */	
	
	private Long countMinutes;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 运行图录音任务类型 质量 录音       db_column: RECORD_TYPE 
     */	
	private String recordType;
	//columns END

	public ResTaskUnitTab(){
	}

	public ResTaskUnitTab(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setUnittime(String value) {
		this.unittime = value;
	}
	
	public String getUnittime() {
		return this.unittime;
	}
	public void setCountMinutes(Long value) {
		this.countMinutes = value;
	}
	
	public Long getCountMinutes() {
		return this.countMinutes;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	public void setRecordType(String value) {
		this.recordType = value;
	}
	
	public String getRecordType() {
		return this.recordType;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("HeadCode",getHeadCode())
			.append("Unittime",getUnittime())
			.append("CountMinutes",getCountMinutes())
			.append("EquCode",getEquCode())
			.append("RecordType",getRecordType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResTaskUnitTab == false) return false;
		if(this == obj) return true;
		ResTaskUnitTab other = (ResTaskUnitTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

