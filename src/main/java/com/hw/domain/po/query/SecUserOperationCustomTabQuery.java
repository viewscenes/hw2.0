
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SecUserOperationCustomTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 用户id */
	private Long userId;
	/** 用户定制模块id */
	private Long operationId;

	public Long getUserId() {
		return this.userId;
	}
	
	public void setUserId(Long value) {
		this.userId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

