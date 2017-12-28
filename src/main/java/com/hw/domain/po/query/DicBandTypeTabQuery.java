
package com.hw.domain.po.query;



import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicBandTypeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 波段id */
	private Long bandId;
	/** 波段名称 */
	private String bandName;

	public Long getBandId() {
		return this.bandId;
	}
	
	public void setBandId(Long value) {
		this.bandId = value;
	}
	
	public String getBandName() {
		return this.bandName;
	}
	
	public void setBandName(String value) {
		this.bandName = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

