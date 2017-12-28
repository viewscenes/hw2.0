
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


public class DicQualityAlarmTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicQualityAlarmTypeTab";
	public static final String ALIAS_ALARM_TYPE_ID = "指标报警类型id";
	public static final String ALIAS_TYPE = "指标报警类型详细";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 指标报警类型id       db_column: ALARM_TYPE_ID 
     */	
	
	private Long alarmTypeId;
    /**
     * 指标报警类型详细       db_column: TYPE 
     */	
	private String type;
	//columns END

	public DicQualityAlarmTypeTab(){
	}

	public DicQualityAlarmTypeTab(
		Long alarmTypeId
	){
		this.alarmTypeId = alarmTypeId;
	}

	public void setAlarmTypeId(Long value) {
		this.alarmTypeId = value;
	}
	
	public Long getAlarmTypeId() {
		return this.alarmTypeId;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	
	private Set radioQualityAlarmTabs = new HashSet(0);
	public void setRadioQualityAlarmTabs(Set<RadioQualityAlarmTab> radioQualityAlarmTab){
		this.radioQualityAlarmTabs = radioQualityAlarmTab;
	}
	
	public Set<RadioQualityAlarmTab> getRadioQualityAlarmTabs() {
		return radioQualityAlarmTabs;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
			.append("AlarmTypeId",getAlarmTypeId())
			.append("Type",getType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getAlarmTypeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicQualityAlarmTypeTab == false) return false;
		if(this == obj) return true;
		DicQualityAlarmTypeTab other = (DicQualityAlarmTypeTab)obj;
		return new EqualsBuilder()
			.append(getAlarmTypeId(),other.getAlarmTypeId())
			.isEquals();
	}
}

