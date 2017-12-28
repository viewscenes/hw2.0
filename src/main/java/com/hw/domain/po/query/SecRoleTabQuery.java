
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SecRoleTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 角色id */
	private Long roleId;
	/** 角色名称 */
	private String name;
	/** 描述 */
	private String description;
	/** 权限 */
	private Long priority;

	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public Long getPriority() {
		return this.priority;
	}
	
	public void setPriority(Long value) {
		this.priority = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

