
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


public class DicStateTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicStateTab";
	public static final String ALIAS_STATE = "洲代号";
	public static final String ALIAS_STATE_NAME = "洲名称";
	public static final String ALIAS_START_TIME = "夏令时开始时间";
	public static final String ALIAS_END_TIME = "夏令时结束时间";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 洲代号       db_column: STATE 
     */	
	
	private Long state;
    /**
     * 洲名称       db_column: STATE_NAME 
     */	
	private String stateName;
    /**
     * 夏令时开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 夏令时结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
	//columns END

	public DicStateTab(){
	}

	public DicStateTab(
		Long state
	){
		this.state = state;
	}

	public void setState(Long value) {
		this.state = value;
	}
	
	public Long getState() {
		return this.state;
	}
	public void setStateName(String value) {
		this.stateName = value;
	}
	
	public String getStateName() {
		return this.stateName;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("State",getState())
			.append("StateName",getStateName())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getState())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicStateTab == false) return false;
		if(this == obj) return true;
		DicStateTab other = (DicStateTab)obj;
		return new EqualsBuilder()
			.append(getState(),other.getState())
			.isEquals();
	}
}

