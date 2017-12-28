
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicHeadendReceiverCodeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 接收机code_id */
	private Long codeId;
	/** 接收机code */
	private String code;
	/** 接收机描述 */
	private String description;

	public Long getCodeId() {
		return this.codeId;
	}
	
	public void setCodeId(Long value) {
		this.codeId = value;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

