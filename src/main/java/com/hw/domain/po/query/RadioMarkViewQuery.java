
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioMarkViewQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** markId */
	private Long markId;
	/** stationName */
	private String stationName;
	/** launchCountry */
	private String launchCountry;
	/** city */
	private String city;
	/** redisseminators */
	private String redisseminators;
	/** direction */
	private String direction;
	/** serviceArea */
	private String serviceArea;
	/** power */
	private Long power;
	/** ciraf */
	private String ciraf;
	/** frequency */
	private Long frequency;
	/** counti */
	private Long counti;
	/** counto */
	private Long counto;
	/** counts */
	private Long counts;
	/** languagename1 */
	private String languagename1;
	/** markDatetime */
	private String markDatetime;
	/** headname */
	private String headname;
	/** playTime */
	private String playTime;
	/** disturb */
	private String disturb;
	/** typeId */
	private Long typeId;

	public Long getMarkId() {
		return this.markId;
	}
	
	public void setMarkId(Long value) {
		this.markId = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getLaunchCountry() {
		return this.launchCountry;
	}
	
	public void setLaunchCountry(String value) {
		this.launchCountry = value;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getRedisseminators() {
		return this.redisseminators;
	}
	
	public void setRedisseminators(String value) {
		this.redisseminators = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getCounti() {
		return this.counti;
	}
	
	public void setCounti(Long value) {
		this.counti = value;
	}
	
	public Long getCounto() {
		return this.counto;
	}
	
	public void setCounto(Long value) {
		this.counto = value;
	}
	
	public Long getCounts() {
		return this.counts;
	}
	
	public void setCounts(Long value) {
		this.counts = value;
	}
	
	public String getLanguagename1() {
		return this.languagename1;
	}
	
	public void setLanguagename1(String value) {
		this.languagename1 = value;
	}
	
	public String getMarkDatetime() {
		return this.markDatetime;
	}
	
	public void setMarkDatetime(String value) {
		this.markDatetime = value;
	}
	
	public String getHeadname() {
		return this.headname;
	}
	
	public void setHeadname(String value) {
		this.headname = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getDisturb() {
		return this.disturb;
	}
	
	public void setDisturb(String value) {
		this.disturb = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

