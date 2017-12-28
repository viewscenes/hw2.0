
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioQualityAlarmTabLogQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 前端code */
	private String headCode;
	/** 当前未处理报警 */
	private Long state00Count;
	/** 总报警次数 */
	private Long realRowCount;

	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public Long getState00Count() {
		return this.state00Count;
	}
	
	public void setState00Count(Long value) {
		this.state00Count = value;
	}
	
	public Long getRealRowCount() {
		return this.realRowCount;
	}
	
	public void setRealRowCount(Long value) {
		this.realRowCount = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

