
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


public class RadioQualityRealtimeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioQualityRealtimeTab";
	public static final String ALIAS_REALTIME_ID = "realtimeId";
	public static final String ALIAS_EQU_CODE = "接收机";
	public static final String ALIAS_FREQUENCY = "频率";
	public static final String ALIAS_CHECK_DATETIME = "数据测量时间";
	public static final String ALIAS_VALUE1 = "测量值";
	public static final String ALIAS_VALUE2 = "测量值";
	public static final String ALIAS_TYPE_ID = "指标类型 1载波电平；2瞬时调制度；3调幅度；5调制度；6频偏指标；8带宽指标；100频谱测量";
	public static final String ALIAS_HEAD_ID = "前端ID";
	public static final String ALIAS_BAND = "波段";
	public static final String ALIAS_DESCRIPTION = "描述";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * realtimeId       db_column: REALTIME_ID 
     */	
	
	private Long realtimeId;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Long frequency;
    /**
     * 数据测量时间       db_column: CHECK_DATETIME 
     */	
	
	private Date checkDatetime;
    /**
     * 测量值       db_column: VALUE1 
     */	
	private String value1;
    /**
     * 测量值       db_column: VALUE2 
     */	
	private String value2;
    /**
     * 指标类型 1载波电平；2瞬时调制度；3调幅度；5调制度；6频偏指标；8带宽指标；100频谱测量       db_column: TYPE_ID 
     */	
	
	private Long typeId;
    /**
     * 前端ID       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * 波段       db_column: BAND 
     */	
	private Integer band;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
	//columns END

	public RadioQualityRealtimeTab(){
	}

	public RadioQualityRealtimeTab(
		Long realtimeId
	){
		this.realtimeId = realtimeId;
	}

	public void setRealtimeId(Long value) {
		this.realtimeId = value;
	}
	
	public Long getRealtimeId() {
		return this.realtimeId;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
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
	public void setValue1(String value) {
		this.value1 = value;
	}
	
	public String getValue1() {
		return this.value1;
	}
	public void setValue2(String value) {
		this.value2 = value;
	}
	
	public String getValue2() {
		return this.value2;
	}
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setBand(Integer value) {
		this.band = value;
	}
	
	public Integer getBand() {
		return this.band;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("RealtimeId",getRealtimeId())
			.append("EquCode",getEquCode())
			.append("Frequency",getFrequency())
			.append("CheckDatetime",getCheckDatetime())
			.append("Value1",getValue1())
			.append("Value2",getValue2())
			.append("TypeId",getTypeId())
			.append("HeadId",getHeadId())
			.append("Band",getBand())
			.append("Description",getDescription())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRealtimeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioQualityRealtimeTab == false) return false;
		if(this == obj) return true;
		RadioQualityRealtimeTab other = (RadioQualityRealtimeTab)obj;
		return new EqualsBuilder()
			.append(getRealtimeId(),other.getRealtimeId())
			.isEquals();
	}
}

