
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


public class ResShiftLogTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResShiftLogTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_FROM_USERID = "交接班日志创建人id";
	public static final String ALIAS_START_TIME = "交接班开始日期";
	public static final String ALIAS_DESCRIPTION = "交接班详细";
	public static final String ALIAS_FROM_USERNAME = "交接班日志创建人";
	public static final String ALIAS_IS_DELETE = "isDelete";
	public static final String ALIAS_END_TIME = "交接班结束日期";
	public static final String ALIAS_DOUSER_NAME = "交接人";
	public static final String ALIAS_CREATE_TIME = "交接班日志创建日期";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	private Long id;
    /**
     * 交接班日志创建人id       db_column: FROM_USERID 
     */	
	
	private Long fromUserid;
    /**
     * 交接班开始日期       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 交接班详细       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 交接班日志创建人       db_column: FROM_USERNAME 
     */	
	private String fromUsername;
    /**
     * isDelete       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * 交接班结束日期       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 交接人       db_column: DOUSER_NAME 
     */	
	private String douserName;
    /**
     * 交接班日志创建日期       db_column: CREATE_TIME 
     */	
	
	private Date createTime;
	//columns END

	public ResShiftLogTab(){
	}



	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setFromUserid(Long value) {
		this.fromUserid = value;
	}
	
	public Long getFromUserid() {
		return this.fromUserid;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setFromUsername(String value) {
		this.fromUsername = value;
	}
	
	public String getFromUsername() {
		return this.fromUsername;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public void setDouserName(String value) {
		this.douserName = value;
	}
	
	public String getDouserName() {
		return this.douserName;
	}

	
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("FromUserid",getFromUserid())
			.append("StartTime",getStartTime())
			.append("Description",getDescription())
			.append("FromUsername",getFromUsername())
			.append("IsDelete",getIsDelete())
			.append("EndTime",getEndTime())
			.append("DouserName",getDouserName())
			.append("CreateTime",getCreateTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResShiftLogTab == false) return false;
		if(this == obj) return true;
		ResShiftLogTab other = (ResShiftLogTab)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

