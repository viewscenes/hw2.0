
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicHeadendReceiverNameTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 接收机名称id */
	private Long nameId;
	/** 接收机名称 */
	private String name;

	public Long getNameId() {
		return this.nameId;
	}
	
	public void setNameId(Long value) {
		this.nameId = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

