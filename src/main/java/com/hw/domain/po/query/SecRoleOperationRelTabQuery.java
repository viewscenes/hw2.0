
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SecRoleOperationRelTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 角色id */
	private Long roleId;
	/** 模块id */
	private Long operationId;
	/** 权限值 */
	private Long levelvalue;

	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public Long getLevelvalue() {
		return this.levelvalue;
	}
	
	public void setLevelvalue(Long value) {
		this.levelvalue = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

