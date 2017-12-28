
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicAntennaParameterTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicAntennaParameterTab";
	public static final String ALIAS_ANTENNA_MODE = "天线程式";
	public static final String ALIAS_ANTENNA_WIDTH = "主瓣宽度";
	public static final String ALIAS_ELEVATION_ANGLE = "仰角";
	public static final String ALIAS_GAIN = "增益";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 天线程式       db_column: ANTENNA_MODE 
     */	

	private String antennaMode;
    /**
     * 主瓣宽度       db_column: ANTENNA_WIDTH 
     */	
	
	private Long antennaWidth;
    /**
     * 仰角       db_column: ELEVATION_ANGLE 
     */	
	
	private Long elevationAngle;
    /**
     * 增益       db_column: GAIN 
     */	
	
	private Long gain;
	//columns END

	public DicAntennaParameterTab(){
	}



	public void setAntennaMode(String value) {
		this.antennaMode = value;
	}
	
	public String getAntennaMode() {
		return this.antennaMode;
	}
	public void setAntennaWidth(Long value) {
		this.antennaWidth = value;
	}
	
	public Long getAntennaWidth() {
		return this.antennaWidth;
	}
	public void setElevationAngle(Long value) {
		this.elevationAngle = value;
	}
	
	public Long getElevationAngle() {
		return this.elevationAngle;
	}
	public void setGain(Long value) {
		this.gain = value;
	}
	
	public Long getGain() {
		return this.gain;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("AntennaMode",getAntennaMode())
			.append("AntennaWidth",getAntennaWidth())
			.append("ElevationAngle",getElevationAngle())
			.append("Gain",getGain())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicAntennaParameterTab == false) return false;
		if(this == obj) return true;
		DicAntennaParameterTab other = (DicAntennaParameterTab)obj;
		return new EqualsBuilder()
			.isEquals();
	}
}

