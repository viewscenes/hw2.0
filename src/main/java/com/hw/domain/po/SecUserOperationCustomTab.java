
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


public class SecUserOperationCustomTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SecUserOperationCustomTab";
	public static final String ALIAS_USER_ID = "用户id";
	public static final String ALIAS_OPERATION_ID = "用户定制模块id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 用户id       db_column: USER_ID 
     */	
	
	private Long userId;
    /**
     * 用户定制模块id       db_column: OPERATION_ID 
     */	
	
	private Long operationId;
	//columns END

	public SecUserOperationCustomTab(){
	}

	public SecUserOperationCustomTab(
		Long userId,
		Long operationId
	){
		this.userId = userId;
		this.operationId = operationId;
	}

	public void setUserId(Long value) {
		this.userId = value;
	}
	
	public Long getUserId() {
		return this.userId;
	}
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("UserId",getUserId())
			.append("OperationId",getOperationId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.append(getOperationId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecUserOperationCustomTab == false) return false;
		if(this == obj) return true;
		SecUserOperationCustomTab other = (SecUserOperationCustomTab)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.append(getOperationId(),other.getOperationId())
			.isEquals();
	}
}

