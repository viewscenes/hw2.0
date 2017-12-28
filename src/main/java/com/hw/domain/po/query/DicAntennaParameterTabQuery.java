
package com.hw.domain.po.query;



import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicAntennaParameterTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 天线程式 */
	private String antennaMode;
	/** 主瓣宽度 */
	private Long antennaWidth;
	/** 仰角 */
	private Long elevationAngle;
	/** 增益 */
	private Long gain;

	public String getAntennaMode() {
		return this.antennaMode;
	}
	
	public void setAntennaMode(String value) {
		this.antennaMode = value;
	}
	
	public Long getAntennaWidth() {
		return this.antennaWidth;
	}
	
	public void setAntennaWidth(Long value) {
		this.antennaWidth = value;
	}
	
	public Long getElevationAngle() {
		return this.elevationAngle;
	}
	
	public void setElevationAngle(Long value) {
		this.elevationAngle = value;
	}
	
	public Long getGain() {
		return this.gain;
	}
	
	public void setGain(Long value) {
		this.gain = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

