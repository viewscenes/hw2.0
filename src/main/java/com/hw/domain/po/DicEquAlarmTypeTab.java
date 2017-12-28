
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


public class DicEquAlarmTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicEquAlarmTypeTab";
	public static final String ALIAS_ALARM_TYPE_ID = "设备报警类型id";
	public static final String ALIAS_TYPE = "设备报警类型";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 设备报警类型id       db_column: ALARM_TYPE_ID 
     */	
	
	private Long alarmTypeId;
    /**
     * 设备报警类型       db_column: TYPE 
     */	
	private String type;
	//columns END

	public DicEquAlarmTypeTab(){
	}

	public DicEquAlarmTypeTab(
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
	
	private Set radioEquAlarmTabs = new HashSet(0);
	public void setRadioEquAlarmTabs(Set<RadioEquAlarmTab> radioEquAlarmTab){
		this.radioEquAlarmTabs = radioEquAlarmTab;
	}
	
	public Set<RadioEquAlarmTab> getRadioEquAlarmTabs() {
		return radioEquAlarmTabs;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
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
		if(obj instanceof DicEquAlarmTypeTab == false) return false;
		if(this == obj) return true;
		DicEquAlarmTypeTab other = (DicEquAlarmTypeTab)obj;
		return new EqualsBuilder()
			.append(getAlarmTypeId(),other.getAlarmTypeId())
			.isEquals();
	}
}

