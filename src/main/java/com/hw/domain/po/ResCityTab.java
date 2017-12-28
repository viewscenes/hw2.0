
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


public class ResCityTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResCityTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CITY = "城市";
	public static final String ALIAS_CONTRY = "国家";
	public static final String ALIAS_CAPITAL = "首都";
	public static final String ALIAS_CONTINENTS_ID = "大洲";
	public static final String ALIAS_LONGITUDE = "经度";
	public static final String ALIAS_LATITUDE = "维度";
	public static final String ALIAS_CIRAF = "ciraf区";
	public static final String ALIAS_ELEVATION = "海拔";
	public static final String ALIAS_DEFAULT_LANGUAGE = "默认语言";
	public static final String ALIAS_VOLTAGE = "电压";
	public static final String ALIAS_MOVEUT = "时差";
	public static final String ALIAS_SUMMER = "夏令：1有夏令，0：无夏令";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 城市       db_column: CITY 
     */	
	private String city;
    /**
     * 国家       db_column: CONTRY 
     */	
	private String contry;
    /**
     * 首都       db_column: CAPITAL 
     */	
	private String capital;
    /**
     * 大洲       db_column: CONTINENTS_ID 
     */	
	
	private Long continentsId;
    /**
     * 经度       db_column: LONGITUDE 
     */	
	private String longitude;
    /**
     * 维度       db_column: LATITUDE 
     */	
	private String latitude;
    /**
     * ciraf区       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * 海拔       db_column: ELEVATION 
     */	
	
	private Long elevation;
    /**
     * 默认语言       db_column: DEFAULT_LANGUAGE 
     */	
	private String defaultLanguage;
    /**
     * 电压       db_column: VOLTAGE 
     */	
	private String voltage;
    /**
     * 时差       db_column: MOVEUT 
     */	
	private String moveut;
    /**
     * 夏令：1有夏令，0：无夏令       db_column: SUMMER 
     */	
	
	private Long summer;
	//columns END

	public ResCityTab(){
	}

	public ResCityTab(
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
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return this.city;
	}
	public void setContry(String value) {
		this.contry = value;
	}
	
	public String getContry() {
		return this.contry;
	}
	public void setCapital(String value) {
		this.capital = value;
	}
	
	public String getCapital() {
		return this.capital;
	}
	public void setContinentsId(Long value) {
		this.continentsId = value;
	}
	
	public Long getContinentsId() {
		return this.continentsId;
	}
	public void setLongitude(String value) {
		this.longitude = value;
	}
	
	public String getLongitude() {
		return this.longitude;
	}
	public void setLatitude(String value) {
		this.latitude = value;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	public void setElevation(Long value) {
		this.elevation = value;
	}
	
	public Long getElevation() {
		return this.elevation;
	}
	public void setDefaultLanguage(String value) {
		this.defaultLanguage = value;
	}
	
	public String getDefaultLanguage() {
		return this.defaultLanguage;
	}
	public void setVoltage(String value) {
		this.voltage = value;
	}
	
	public String getVoltage() {
		return this.voltage;
	}
	public void setMoveut(String value) {
		this.moveut = value;
	}
	
	public String getMoveut() {
		return this.moveut;
	}
	public void setSummer(Long value) {
		this.summer = value;
	}
	
	public Long getSummer() {
		return this.summer;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("City",getCity())
			.append("Contry",getContry())
			.append("Capital",getCapital())
			.append("ContinentsId",getContinentsId())
			.append("Longitude",getLongitude())
			.append("Latitude",getLatitude())
			.append("Ciraf",getCiraf())
			.append("Elevation",getElevation())
			.append("DefaultLanguage",getDefaultLanguage())
			.append("Voltage",getVoltage())
			.append("Moveut",getMoveut())
			.append("Summer",getSummer())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResCityTab == false) return false;
		if(this == obj) return true;
		ResCityTab other = (ResCityTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

