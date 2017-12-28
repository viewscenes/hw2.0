
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


public class SecRoleTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SecRoleTab";
	public static final String ALIAS_ROLE_ID = "角色id";
	public static final String ALIAS_NAME = "角色名称";
	public static final String ALIAS_DESCRIPTION = "描述";
	public static final String ALIAS_PRIORITY = "权限";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 角色id       db_column: ROLE_ID 
     */	
	
	private Long roleId;
    /**
     * 角色名称       db_column: NAME 
     */	
	private String name;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 权限       db_column: PRIORITY 
     */	
	
	private Long priority;
	//columns END

	public SecRoleTab(){
	}

	public SecRoleTab(
		Long roleId
	){
		this.roleId = roleId;
	}

	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setPriority(Long value) {
		this.priority = value;
	}
	
	public Long getPriority() {
		return this.priority;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("RoleId",getRoleId())
			.append("Name",getName())
			.append("Description",getDescription())
			.append("Priority",getPriority())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getRoleId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecRoleTab == false) return false;
		if(this == obj) return true;
		SecRoleTab other = (SecRoleTab)obj;
		return new EqualsBuilder()
			.append(getRoleId(),other.getRoleId())
			.isEquals();
	}
}

