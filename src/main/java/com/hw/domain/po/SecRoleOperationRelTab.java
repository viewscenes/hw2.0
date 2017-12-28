
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


public class SecRoleOperationRelTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SecRoleOperationRelTab";
	public static final String ALIAS_ROLE_ID = "角色id";
	public static final String ALIAS_OPERATION_ID = "模块id";
	public static final String ALIAS_LEVELVALUE = "权限值";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 角色id       db_column: ROLE_ID 
     */	
	
	private Long roleId;
    /**
     * 模块id       db_column: OPERATION_ID 
     */	
	
	private Long operationId;
    /**
     * 权限值       db_column: LEVELVALUE 
     */	
	
	private Long levelvalue;
	//columns END

	public SecRoleOperationRelTab(){
	}

	public SecRoleOperationRelTab(
		Long roleId,
		Long operationId
	){
		this.roleId = roleId;
		this.operationId = operationId;
	}

	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	public void setLevelvalue(Long value) {
		this.levelvalue = value;
	}
	
	public Long getLevelvalue() {
		return this.levelvalue;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
			.append("RoleId",getRoleId())
			.append("OperationId",getOperationId())
			.append("Levelvalue",getLevelvalue())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRoleId())
			.append(getOperationId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecRoleOperationRelTab == false) return false;
		if(this == obj) return true;
		SecRoleOperationRelTab other = (SecRoleOperationRelTab)obj;
		return new EqualsBuilder()
			.append(getRoleId(),other.getRoleId())
			.append(getOperationId(),other.getOperationId())
			.isEquals();
	}
}

