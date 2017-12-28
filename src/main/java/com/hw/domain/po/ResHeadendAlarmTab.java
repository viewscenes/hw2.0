
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResHeadendAlarmTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResHeadendAlarmTab";
	public static final String ALIAS_ALARM_ID = "alarmId";
	public static final String ALIAS_HEAD_ID = "headId";
	public static final String ALIAS_IS_RESUMED = "isResumed";
	public static final String ALIAS_ALARM_TIME = "alarmTime";
	public static final String ALIAS_ALARM_TYPE = "alarmType";
	public static final String ALIAS_ALARM_CONTENT_TYPE = "alarmContentType";
	public static final String ALIAS_FREQ = "freq";
	public static final String ALIAS_LEVEL_VALUE = "levelValue";
	public static final String ALIAS_AM = "am";
	public static final String ALIAS_EQU_SATUS = "equSatus";
	public static final String ALIAS_EQU_VERSION = "equVersion";
	public static final String ALIAS_NRD1 = "nrd1";
	public static final String ALIAS_NRD2 = "nrd2";
	public static final String ALIAS_AM_CARD1 = "amCard1";
	public static final String ALIAS_AM_CARD2 = "amCard2";
	public static final String ALIAS_FM_CARD1 = "fmCard1";
	public static final String ALIAS_FM_CARD2 = "fmCard2";
	public static final String ALIAS_AUDIO_CARD1 = "audioCard1";
	public static final String ALIAS_AUDIO_CARD2 = "audioCard2";
	public static final String ALIAS_POWER = "power";
	public static final String ALIAS_POWER5V = "power5v";
	public static final String ALIAS_POWER24V = "power24v";
	public static final String ALIAS_UPS_IN = "upsIn";
	public static final String ALIAS_UPS_OUT = "upsOut";
	public static final String ALIAS_UPS_FREQ = "upsFreq";
	public static final String ALIAS_UPS_POWER_PRESS = "upsPowerPress";
	public static final String ALIAS_UPS_STATUS = "upsStatus";
	public static final String ALIAS_EQU_HUMIDITY = "equHumidity";
	public static final String ALIAS_EQU_TEMPERATURE = "equTemperature";
	public static final String ALIAS_ENV_HUMIDITY = "envHumidity";
	public static final String ALIAS_ENV_TEMPERATURE = "envTemperature";
	public static final String ALIAS_UPS_STAUTS_ID = "upsStautsId";
	public static final String ALIAS_IS_DELETE = "isDelete";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * alarmId       db_column: ALARM_ID 
     */	
	
	private Long alarmId;
    /**
     * headId       db_column: HEAD_ID 
     */	
	private String headId;
    /**
     * isResumed       db_column: IS_RESUMED 
     */	
	private Integer isResumed;
    /**
     * alarmTime       db_column: ALARM_TIME 
     */	
	
	private Date alarmTime;
    /**
     * alarmType       db_column: ALARM_TYPE 
     */	
	private Integer alarmType;
    /**
     * alarmContentType       db_column: ALARM_CONTENT_TYPE 
     */	
	private String alarmContentType;
    /**
     * freq       db_column: FREQ 
     */	
	private String freq;
    /**
     * levelValue       db_column: LEVEL_VALUE 
     */	
	private String levelValue;
    /**
     * am       db_column: AM 
     */	
	private String am;
    /**
     * equSatus       db_column: EQU_SATUS 
     */	
	private String equSatus;
    /**
     * equVersion       db_column: EQU_VERSION 
     */	
	private String equVersion;
    /**
     * nrd1       db_column: NRD1 
     */	
	
	private Boolean nrd1;
    /**
     * nrd2       db_column: NRD2 
     */	
	
	private Boolean nrd2;
    /**
     * amCard1       db_column: AM_CARD1 
     */	
	
	private Boolean amCard1;
    /**
     * amCard2       db_column: AM_CARD2 
     */	
	
	private Boolean amCard2;
    /**
     * fmCard1       db_column: FM_CARD1 
     */	
	
	private Boolean fmCard1;
    /**
     * fmCard2       db_column: FM_CARD2 
     */	
	
	private Boolean fmCard2;
    /**
     * audioCard1       db_column: AUDIO_CARD1 
     */	
	
	private Boolean audioCard1;
    /**
     * audioCard2       db_column: AUDIO_CARD2 
     */	
	
	private Boolean audioCard2;
    /**
     * power       db_column: POWER 
     */	
	
	private Boolean power;
    /**
     * power5v       db_column: POWER_5V 
     */	
	private String power5v;
    /**
     * power24v       db_column: POWER_24V 
     */	
	private String power24v;
    /**
     * upsIn       db_column: UPS_IN 
     */	
	private String upsIn;
    /**
     * upsOut       db_column: UPS_OUT 
     */	
	private String upsOut;
    /**
     * upsFreq       db_column: UPS_FREQ 
     */	
	private String upsFreq;
    /**
     * upsPowerPress       db_column: UPS_POWER_PRESS 
     */	
	private String upsPowerPress;
    /**
     * upsStatus       db_column: UPS_STATUS 
     */	
	private String upsStatus;
    /**
     * equHumidity       db_column: EQU_HUMIDITY 
     */	
	private String equHumidity;
    /**
     * equTemperature       db_column: EQU_TEMPERATURE 
     */	
	private String equTemperature;
    /**
     * envHumidity       db_column: ENV_HUMIDITY 
     */	
	private String envHumidity;
    /**
     * envTemperature       db_column: ENV_TEMPERATURE 
     */	
	private String envTemperature;
    /**
     * upsStautsId       db_column: UPS_STAUTS_ID 
     */	
	private Integer upsStautsId;
    /**
     * isDelete       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
	//columns END

	public ResHeadendAlarmTab(){
	}

	public ResHeadendAlarmTab(
		Long alarmId
	){
		this.alarmId = alarmId;
	}

	public void setAlarmId(Long value) {
		this.alarmId = value;
	}
	
	public Long getAlarmId() {
		return this.alarmId;
	}
	public void setHeadId(String value) {
		this.headId = value;
	}
	
	public String getHeadId() {
		return this.headId;
	}
	public void setIsResumed(Integer value) {
		this.isResumed = value;
	}
	
	public Integer getIsResumed() {
		return this.isResumed;
	}

	
	public void setAlarmTime(Date value) {
		this.alarmTime = value;
	}
	
	public Date getAlarmTime() {
		return this.alarmTime;
	}
	public void setAlarmType(Integer value) {
		this.alarmType = value;
	}
	
	public Integer getAlarmType() {
		return this.alarmType;
	}
	public void setAlarmContentType(String value) {
		this.alarmContentType = value;
	}
	
	public String getAlarmContentType() {
		return this.alarmContentType;
	}
	public void setFreq(String value) {
		this.freq = value;
	}
	
	public String getFreq() {
		return this.freq;
	}
	public void setLevelValue(String value) {
		this.levelValue = value;
	}
	
	public String getLevelValue() {
		return this.levelValue;
	}
	public void setAm(String value) {
		this.am = value;
	}
	
	public String getAm() {
		return this.am;
	}
	public void setEquSatus(String value) {
		this.equSatus = value;
	}
	
	public String getEquSatus() {
		return this.equSatus;
	}
	public void setEquVersion(String value) {
		this.equVersion = value;
	}
	
	public String getEquVersion() {
		return this.equVersion;
	}
	public void setNrd1(Boolean value) {
		this.nrd1 = value;
	}
	
	public Boolean getNrd1() {
		return this.nrd1;
	}
	public void setNrd2(Boolean value) {
		this.nrd2 = value;
	}
	
	public Boolean getNrd2() {
		return this.nrd2;
	}
	public void setAmCard1(Boolean value) {
		this.amCard1 = value;
	}
	
	public Boolean getAmCard1() {
		return this.amCard1;
	}
	public void setAmCard2(Boolean value) {
		this.amCard2 = value;
	}
	
	public Boolean getAmCard2() {
		return this.amCard2;
	}
	public void setFmCard1(Boolean value) {
		this.fmCard1 = value;
	}
	
	public Boolean getFmCard1() {
		return this.fmCard1;
	}
	public void setFmCard2(Boolean value) {
		this.fmCard2 = value;
	}
	
	public Boolean getFmCard2() {
		return this.fmCard2;
	}
	public void setAudioCard1(Boolean value) {
		this.audioCard1 = value;
	}
	
	public Boolean getAudioCard1() {
		return this.audioCard1;
	}
	public void setAudioCard2(Boolean value) {
		this.audioCard2 = value;
	}
	
	public Boolean getAudioCard2() {
		return this.audioCard2;
	}
	public void setPower(Boolean value) {
		this.power = value;
	}
	
	public Boolean getPower() {
		return this.power;
	}
	public void setPower5v(String value) {
		this.power5v = value;
	}
	
	public String getPower5v() {
		return this.power5v;
	}
	public void setPower24v(String value) {
		this.power24v = value;
	}
	
	public String getPower24v() {
		return this.power24v;
	}
	public void setUpsIn(String value) {
		this.upsIn = value;
	}
	
	public String getUpsIn() {
		return this.upsIn;
	}
	public void setUpsOut(String value) {
		this.upsOut = value;
	}
	
	public String getUpsOut() {
		return this.upsOut;
	}
	public void setUpsFreq(String value) {
		this.upsFreq = value;
	}
	
	public String getUpsFreq() {
		return this.upsFreq;
	}
	public void setUpsPowerPress(String value) {
		this.upsPowerPress = value;
	}
	
	public String getUpsPowerPress() {
		return this.upsPowerPress;
	}
	public void setUpsStatus(String value) {
		this.upsStatus = value;
	}
	
	public String getUpsStatus() {
		return this.upsStatus;
	}
	public void setEquHumidity(String value) {
		this.equHumidity = value;
	}
	
	public String getEquHumidity() {
		return this.equHumidity;
	}
	public void setEquTemperature(String value) {
		this.equTemperature = value;
	}
	
	public String getEquTemperature() {
		return this.equTemperature;
	}
	public void setEnvHumidity(String value) {
		this.envHumidity = value;
	}
	
	public String getEnvHumidity() {
		return this.envHumidity;
	}
	public void setEnvTemperature(String value) {
		this.envTemperature = value;
	}
	
	public String getEnvTemperature() {
		return this.envTemperature;
	}
	public void setUpsStautsId(Integer value) {
		this.upsStautsId = value;
	}
	
	public Integer getUpsStautsId() {
		return this.upsStautsId;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("AlarmId",getAlarmId())
			.append("HeadId",getHeadId())
			.append("IsResumed",getIsResumed())
			.append("AlarmTime",getAlarmTime())
			.append("AlarmType",getAlarmType())
			.append("AlarmContentType",getAlarmContentType())
			.append("Freq",getFreq())
			.append("LevelValue",getLevelValue())
			.append("Am",getAm())
			.append("EquSatus",getEquSatus())
			.append("EquVersion",getEquVersion())
			.append("Nrd1",getNrd1())
			.append("Nrd2",getNrd2())
			.append("AmCard1",getAmCard1())
			.append("AmCard2",getAmCard2())
			.append("FmCard1",getFmCard1())
			.append("FmCard2",getFmCard2())
			.append("AudioCard1",getAudioCard1())
			.append("AudioCard2",getAudioCard2())
			.append("Power",getPower())
			.append("Power5v",getPower5v())
			.append("Power24v",getPower24v())
			.append("UpsIn",getUpsIn())
			.append("UpsOut",getUpsOut())
			.append("UpsFreq",getUpsFreq())
			.append("UpsPowerPress",getUpsPowerPress())
			.append("UpsStatus",getUpsStatus())
			.append("EquHumidity",getEquHumidity())
			.append("EquTemperature",getEquTemperature())
			.append("EnvHumidity",getEnvHumidity())
			.append("EnvTemperature",getEnvTemperature())
			.append("UpsStautsId",getUpsStautsId())
			.append("IsDelete",getIsDelete())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getAlarmId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResHeadendAlarmTab == false) return false;
		if(this == obj) return true;
		ResHeadendAlarmTab other = (ResHeadendAlarmTab)obj;
		return new EqualsBuilder()
			.append(getAlarmId(),other.getAlarmId())
			.isEquals();
	}
}

