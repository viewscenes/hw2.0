
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


public class ResHeadendOpenTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResHeadendOpenTab";
	public static final String ALIAS_HEAD_ID = "headId";
	public static final String ALIAS_START_TIME = "startTime";
	public static final String ALIAS_END_TIME = "endTime";
	public static final String ALIAS_DURATION = "duration";
	public static final String ALIAS_ID = "id";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * headId       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * startTime       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * endTime       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * duration       db_column: DURATION 
     */	
	
	private Long duration;
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
	//columns END

	public ResHeadendOpenTab(){
	}

	public ResHeadendOpenTab(
		Long id
	){
		this.id = id;
	}

	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
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
	public void setDuration(Long value) {
		this.duration = value;
	}
	
	public Long getDuration() {
		return this.duration;
	}
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("HeadId",getHeadId())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("Duration",getDuration())
			.append("Id",getId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResHeadendOpenTab == false) return false;
		if(this == obj) return true;
		ResHeadendOpenTab other = (ResHeadendOpenTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

