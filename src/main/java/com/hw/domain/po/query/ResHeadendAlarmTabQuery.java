
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


public class ResHeadendAlarmTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** alarmId */
	private Long alarmId;
	/** headId */
	private String headId;
	/** isResumed */
	private Integer isResumed;
	/** alarmTime */
	private Date alarmTimeBegin;
	private Date alarmTimeEnd;
	/** alarmType */
	private Integer alarmType;
	/** alarmContentType */
	private String alarmContentType;
	/** freq */
	private String freq;
	/** levelValue */
	private String levelValue;
	/** am */
	private String am;
	/** equSatus */
	private String equSatus;
	/** equVersion */
	private String equVersion;
	/** nrd1 */
	private Boolean nrd1;
	/** nrd2 */
	private Boolean nrd2;
	/** amCard1 */
	private Boolean amCard1;
	/** amCard2 */
	private Boolean amCard2;
	/** fmCard1 */
	private Boolean fmCard1;
	/** fmCard2 */
	private Boolean fmCard2;
	/** audioCard1 */
	private Boolean audioCard1;
	/** audioCard2 */
	private Boolean audioCard2;
	/** power */
	private Boolean power;
	/** power5v */
	private String power5v;
	/** power24v */
	private String power24v;
	/** upsIn */
	private String upsIn;
	/** upsOut */
	private String upsOut;
	/** upsFreq */
	private String upsFreq;
	/** upsPowerPress */
	private String upsPowerPress;
	/** upsStatus */
	private String upsStatus;
	/** equHumidity */
	private String equHumidity;
	/** equTemperature */
	private String equTemperature;
	/** envHumidity */
	private String envHumidity;
	/** envTemperature */
	private String envTemperature;
	/** upsStautsId */
	private Integer upsStautsId;
	/** isDelete */
	private Long isDelete;

	public Long getAlarmId() {
		return this.alarmId;
	}
	
	public void setAlarmId(Long value) {
		this.alarmId = value;
	}
	
	public String getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(String value) {
		this.headId = value;
	}
	
	public Integer getIsResumed() {
		return this.isResumed;
	}
	
	public void setIsResumed(Integer value) {
		this.isResumed = value;
	}
	
	public Date getAlarmTimeBegin() {
		return this.alarmTimeBegin;
	}
	
	public void setAlarmTimeBegin(Date value) {
		this.alarmTimeBegin = value;
	}	
	
	public Date getAlarmTimeEnd() {
		return this.alarmTimeEnd;
	}
	
	public void setAlarmTimeEnd(Date value) {
		this.alarmTimeEnd = value;
	}
	
	public Integer getAlarmType() {
		return this.alarmType;
	}
	
	public void setAlarmType(Integer value) {
		this.alarmType = value;
	}
	
	public String getAlarmContentType() {
		return this.alarmContentType;
	}
	
	public void setAlarmContentType(String value) {
		this.alarmContentType = value;
	}
	
	public String getFreq() {
		return this.freq;
	}
	
	public void setFreq(String value) {
		this.freq = value;
	}
	
	public String getLevelValue() {
		return this.levelValue;
	}
	
	public void setLevelValue(String value) {
		this.levelValue = value;
	}
	
	public String getAm() {
		return this.am;
	}
	
	public void setAm(String value) {
		this.am = value;
	}
	
	public String getEquSatus() {
		return this.equSatus;
	}
	
	public void setEquSatus(String value) {
		this.equSatus = value;
	}
	
	public String getEquVersion() {
		return this.equVersion;
	}
	
	public void setEquVersion(String value) {
		this.equVersion = value;
	}
	
	public Boolean getNrd1() {
		return this.nrd1;
	}
	
	public void setNrd1(Boolean value) {
		this.nrd1 = value;
	}
	
	public Boolean getNrd2() {
		return this.nrd2;
	}
	
	public void setNrd2(Boolean value) {
		this.nrd2 = value;
	}
	
	public Boolean getAmCard1() {
		return this.amCard1;
	}
	
	public void setAmCard1(Boolean value) {
		this.amCard1 = value;
	}
	
	public Boolean getAmCard2() {
		return this.amCard2;
	}
	
	public void setAmCard2(Boolean value) {
		this.amCard2 = value;
	}
	
	public Boolean getFmCard1() {
		return this.fmCard1;
	}
	
	public void setFmCard1(Boolean value) {
		this.fmCard1 = value;
	}
	
	public Boolean getFmCard2() {
		return this.fmCard2;
	}
	
	public void setFmCard2(Boolean value) {
		this.fmCard2 = value;
	}
	
	public Boolean getAudioCard1() {
		return this.audioCard1;
	}
	
	public void setAudioCard1(Boolean value) {
		this.audioCard1 = value;
	}
	
	public Boolean getAudioCard2() {
		return this.audioCard2;
	}
	
	public void setAudioCard2(Boolean value) {
		this.audioCard2 = value;
	}
	
	public Boolean getPower() {
		return this.power;
	}
	
	public void setPower(Boolean value) {
		this.power = value;
	}
	
	public String getPower5v() {
		return this.power5v;
	}
	
	public void setPower5v(String value) {
		this.power5v = value;
	}
	
	public String getPower24v() {
		return this.power24v;
	}
	
	public void setPower24v(String value) {
		this.power24v = value;
	}
	
	public String getUpsIn() {
		return this.upsIn;
	}
	
	public void setUpsIn(String value) {
		this.upsIn = value;
	}
	
	public String getUpsOut() {
		return this.upsOut;
	}
	
	public void setUpsOut(String value) {
		this.upsOut = value;
	}
	
	public String getUpsFreq() {
		return this.upsFreq;
	}
	
	public void setUpsFreq(String value) {
		this.upsFreq = value;
	}
	
	public String getUpsPowerPress() {
		return this.upsPowerPress;
	}
	
	public void setUpsPowerPress(String value) {
		this.upsPowerPress = value;
	}
	
	public String getUpsStatus() {
		return this.upsStatus;
	}
	
	public void setUpsStatus(String value) {
		this.upsStatus = value;
	}
	
	public String getEquHumidity() {
		return this.equHumidity;
	}
	
	public void setEquHumidity(String value) {
		this.equHumidity = value;
	}
	
	public String getEquTemperature() {
		return this.equTemperature;
	}
	
	public void setEquTemperature(String value) {
		this.equTemperature = value;
	}
	
	public String getEnvHumidity() {
		return this.envHumidity;
	}
	
	public void setEnvHumidity(String value) {
		this.envHumidity = value;
	}
	
	public String getEnvTemperature() {
		return this.envTemperature;
	}
	
	public void setEnvTemperature(String value) {
		this.envTemperature = value;
	}
	
	public Integer getUpsStautsId() {
		return this.upsStautsId;
	}
	
	public void setUpsStautsId(Integer value) {
		this.upsStautsId = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

