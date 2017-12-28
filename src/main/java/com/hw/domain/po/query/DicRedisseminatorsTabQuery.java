
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicRedisseminatorsTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 转播机构 */
	private String redisseminators;
	/** 所属国家 */
	private String country;
	/** id */
	private Long id;

	public String getRedisseminators() {
		return this.redisseminators;
	}
	
	public void setRedisseminators(String value) {
		this.redisseminators = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

