
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioSpectrumStatTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/**  主键 */
	private Long id;
	/** 前端CODE */
	private String headCode;
	/** 发射台ID */
	private String stationId;
	/** 发射台 */
	private String stationName;
	/** 语言ID */
	private String languageId;
	/** 语言 */
	private String languageName;
	/** 国家 */
	private String country;
	/** 效果 */
	private String effect;
	/** 分数 */
	private String mark;
	/** 频率 */
	private Long freq;
	/** 播音时段 */
	private String playtime;
	/** 101采集点，102遥控站 */
	private String headtype;
	/** 0无播音，1有播音 */
	private Long isPlay;
	/** 录入日期 */
	private Date inputDatetimeBegin;
	private Date inputDatetimeEnd;
	/** 站点名称 */
	private String shortname;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getStationId() {
		return this.stationId;
	}
	
	public void setStationId(String value) {
		this.stationId = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(String value) {
		this.languageId = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getEffect() {
		return this.effect;
	}
	
	public void setEffect(String value) {
		this.effect = value;
	}
	
	public String getMark() {
		return this.mark;
	}
	
	public void setMark(String value) {
		this.mark = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public String getPlaytime() {
		return this.playtime;
	}
	
	public void setPlaytime(String value) {
		this.playtime = value;
	}
	
	public String getHeadtype() {
		return this.headtype;
	}
	
	public void setHeadtype(String value) {
		this.headtype = value;
	}
	
	public Long getIsPlay() {
		return this.isPlay;
	}
	
	public void setIsPlay(Long value) {
		this.isPlay = value;
	}
	
	public Date getInputDatetimeBegin() {
		return this.inputDatetimeBegin;
	}
	
	public void setInputDatetimeBegin(Date value) {
		this.inputDatetimeBegin = value;
	}	
	
	public Date getInputDatetimeEnd() {
		return this.inputDatetimeEnd;
	}
	
	public void setInputDatetimeEnd(Date value) {
		this.inputDatetimeEnd = value;
	}
	
	public String getShortname() {
		return this.shortname;
	}
	
	public void setShortname(String value) {
		this.shortname = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

