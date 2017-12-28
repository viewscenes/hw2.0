
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicStationCityRelTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** stationName */
	private String stationName;
	/** cityName */
	private String cityName;
	/** circleDistance */
	private Long circleDistance;
	/** longitude */
	private Long longitude;
	/** latitude */
	private Long latitude;
	/** azimuth */
	private Long azimuth;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getCityName() {
		return this.cityName;
	}
	
	public void setCityName(String value) {
		this.cityName = value;
	}
	
	public Long getCircleDistance() {
		return this.circleDistance;
	}
	
	public void setCircleDistance(Long value) {
		this.circleDistance = value;
	}
	
	public Long getLongitude() {
		return this.longitude;
	}
	
	public void setLongitude(Long value) {
		this.longitude = value;
	}
	
	public Long getLatitude() {
		return this.latitude;
	}
	
	public void setLatitude(Long value) {
		this.latitude = value;
	}
	
	public Long getAzimuth() {
		return this.azimuth;
	}
	
	public void setAzimuth(Long value) {
		this.azimuth = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

