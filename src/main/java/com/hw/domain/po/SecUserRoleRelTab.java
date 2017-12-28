
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


public class SecUserRoleRelTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SecUserRoleRelTab";
	public static final String ALIAS_USER_ID = "用户id";
	public static final String ALIAS_ROLE_ID = "角色id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 用户id       db_column: USER_ID 
     */	
	
	private Long userId;
    /**
     * 角色id       db_column: ROLE_ID 
     */	
	
	private Long roleId;
	//columns END

	public SecUserRoleRelTab(){
	}

	public SecUserRoleRelTab(
		Long userId,
		Long roleId
	){
		this.userId = userId;
		this.roleId = roleId;
	}

	public void setUserId(Long value) {
		this.userId = value;
	}
	
	public Long getUserId() {
		return this.userId;
	}
	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("UserId",getUserId())
			.append("RoleId",getRoleId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.append(getRoleId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecUserRoleRelTab == false) return false;
		if(this == obj) return true;
		SecUserRoleRelTab other = (SecUserRoleRelTab)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.append(getRoleId(),other.getRoleId())
			.isEquals();
	}
}

