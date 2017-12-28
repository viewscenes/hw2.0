
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


public class SecOperationLogTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SecOperationLogTab";
	public static final String ALIAS_LOG_ID = "logId";
	public static final String ALIAS_OPERATION_ID = "operationId";
	public static final String ALIAS_OPERATION_NAME = "operationName";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_USER_NAME = "userName";
	public static final String ALIAS_LOG_DATETIME = "logDatetime";
	public static final String ALIAS_DESCRIPTION = "description";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * logId       db_column: LOG_ID 
     */	
	
	private Long logId;
    /**
     * operationId       db_column: OPERATION_ID 
     */	
	
	private Long operationId;
    /**
     * operationName       db_column: OPERATION_NAME 
     */	
	private String operationName;
    /**
     * userId       db_column: USER_ID 
     */	
	
	private Long userId;
    /**
     * userName       db_column: USER_NAME 
     */	
	private String userName;
    /**
     * logDatetime       db_column: LOG_DATETIME 
     */	
	
	private Date logDatetime;
    /**
     * description       db_column: DESCRIPTION 
     */	
	private String description;
	//columns END

	public SecOperationLogTab(){
	}

	public SecOperationLogTab(
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
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	public void setOperationName(String value) {
		this.operationName = value;
	}
	
	public String getOperationName() {
		return this.operationName;
	}
	public void setUserId(Long value) {
		this.userId = value;
	}
	
	public Long getUserId() {
		return this.userId;
	}
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
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

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("LogId",getLogId())
			.append("OperationId",getOperationId())
			.append("OperationName",getOperationName())
			.append("UserId",getUserId())
			.append("UserName",getUserName())
			.append("LogDatetime",getLogDatetime())
			.append("Description",getDescription())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getLogId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecOperationLogTab == false) return false;
		if(this == obj) return true;
		SecOperationLogTab other = (SecOperationLogTab)obj;
		return new EqualsBuilder()
			.append(getLogId(),other.getLogId())
			.isEquals();
	}
}

