
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResCityTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Integer id;
	/** 城市 */
	private String city;
	/** 国家 */
	private String contry;
	/** 首都 */
	private String capital;
	/** 大洲 */
	private Long continentsId;
	/** 经度 */
	private String longitude;
	/** 维度 */
	private String latitude;
	/** ciraf区 */
	private String ciraf;
	/** 海拔 */
	private Long elevation;
	/** 默认语言 */
	private String defaultLanguage;
	/** 电压 */
	private String voltage;
	/** 时差 */
	private String moveut;
	/** 夏令：1有夏令，0：无夏令 */
	private Long summer;

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer value) {
		this.id = value;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getContry() {
		return this.contry;
	}
	
	public void setContry(String value) {
		this.contry = value;
	}
	
	public String getCapital() {
		return this.capital;
	}
	
	public void setCapital(String value) {
		this.capital = value;
	}
	
	public Long getContinentsId() {
		return this.continentsId;
	}
	
	public void setContinentsId(Long value) {
		this.continentsId = value;
	}
	
	public String getLongitude() {
		return this.longitude;
	}
	
	public void setLongitude(String value) {
		this.longitude = value;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	
	public void setLatitude(String value) {
		this.latitude = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public Long getElevation() {
		return this.elevation;
	}
	
	public void setElevation(Long value) {
		this.elevation = value;
	}
	
	public String getDefaultLanguage() {
		return this.defaultLanguage;
	}
	
	public void setDefaultLanguage(String value) {
		this.defaultLanguage = value;
	}
	
	public String getVoltage() {
		return this.voltage;
	}
	
	public void setVoltage(String value) {
		this.voltage = value;
	}
	
	public String getMoveut() {
		return this.moveut;
	}
	
	public void setMoveut(String value) {
		this.moveut = value;
	}
	
	public Long getSummer() {
		return this.summer;
	}
	
	public void setSummer(Long value) {
		this.summer = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

