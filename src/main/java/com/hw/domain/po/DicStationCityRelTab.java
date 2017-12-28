
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


public class DicStationCityRelTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicStationCityRelTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_STATION_NAME = "stationName";
	public static final String ALIAS_CITY_NAME = "cityName";
	public static final String ALIAS_CIRCLE_DISTANCE = "circleDistance";
	public static final String ALIAS_LONGITUDE = "longitude";
	public static final String ALIAS_LATITUDE = "latitude";
	public static final String ALIAS_AZIMUTH = "azimuth";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * stationName       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * cityName       db_column: CITY_NAME 
     */	
	private String cityName;
    /**
     * circleDistance       db_column: CIRCLE_DISTANCE 
     */	
	
	private Long circleDistance;
    /**
     * longitude       db_column: LONGITUDE 
     */	
	
	private Long longitude;
    /**
     * latitude       db_column: LATITUDE 
     */	
	
	private Long latitude;
    /**
     * azimuth       db_column: AZIMUTH 
     */	
	
	private Long azimuth;
	//columns END

	public DicStationCityRelTab(){
	}

	public DicStationCityRelTab(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setCityName(String value) {
		this.cityName = value;
	}
	
	public String getCityName() {
		return this.cityName;
	}
	public void setCircleDistance(Long value) {
		this.circleDistance = value;
	}
	
	public Long getCircleDistance() {
		return this.circleDistance;
	}
	public void setLongitude(Long value) {
		this.longitude = value;
	}
	
	public Long getLongitude() {
		return this.longitude;
	}
	public void setLatitude(Long value) {
		this.latitude = value;
	}
	
	public Long getLatitude() {
		return this.latitude;
	}
	public void setAzimuth(Long value) {
		this.azimuth = value;
	}
	
	public Long getAzimuth() {
		return this.azimuth;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("StationName",getStationName())
			.append("CityName",getCityName())
			.append("CircleDistance",getCircleDistance())
			.append("Longitude",getLongitude())
			.append("Latitude",getLatitude())
			.append("Azimuth",getAzimuth())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicStationCityRelTab == false) return false;
		if(this == obj) return true;
		DicStationCityRelTab other = (DicStationCityRelTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

