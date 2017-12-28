
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicSunspotTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 年 */
	private String timeYear;
	/** 月 */
	private String timeMonth;
	/** 太阳黑子数 */
	private Long ssn;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getTimeYear() {
		return this.timeYear;
	}
	
	public void setTimeYear(String value) {
		this.timeYear = value;
	}
	
	public String getTimeMonth() {
		return this.timeMonth;
	}
	
	public void setTimeMonth(String value) {
		this.timeMonth = value;
	}
	
	public Long getSsn() {
		return this.ssn;
	}
	
	public void setSsn(Long value) {
		this.ssn = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

