
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SysConfigurationTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 参数 */
	private String paramName;
	/** 参数值 */
	private String paramValue;

	public String getParamName() {
		return this.paramName;
	}
	
	public void setParamName(String value) {
		this.paramName = value;
	}
	
	public String getParamValue() {
		return this.paramValue;
	}
	
	public void setParamValue(String value) {
		this.paramValue = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

