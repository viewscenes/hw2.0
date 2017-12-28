
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


public class ResDatainputTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResDatainputTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_DATA_TYPE = "录入类型1：国际台运行图2：海外落地";
	public static final String ALIAS_FREQ = "频率";
	public static final String ALIAS_LANGUAGE_ID = "语言ID(节目)";
	public static final String ALIAS_LANGUAGE_NAME = "语言(节目)";
	public static final String ALIAS_STATION_ID = "stationId";
	public static final String ALIAS_STATION_NAME = "当录入类型=1时为发射台，当录入类型=2时为转播机构";
	public static final String ALIAS_POWER = "功率";
	public static final String ALIAS_DIRECTION = "方向";
	public static final String ALIAS_SERVICE_AREA = "服务区";
	public static final String ALIAS_CIRAF = "ciraf区";
	public static final String ALIAS_RECEIVE_COUNTRY = "收测国家";
	public static final String ALIAS_RECEIVE_CITY = "收测城市";
	public static final String ALIAS_DATASOURCE = "资源来原（包含实地收测、反馈收测、互换资料）";
	public static final String ALIAS_START_TIME = "开播时间";
	public static final String ALIAS_END_TIME = "停播时间";
	public static final String ALIAS_RECEIVE_DATE = "收测日期";
	public static final String ALIAS_RECEIVE_TIME = "收测时间";
	public static final String ALIAS_PROGRAM_TYPE = "节目类别";
	public static final String ALIAS_FIELD_STRENGTH = "场强";
	public static final String ALIAS_S = "s";
	public static final String ALIAS_I = "i";
	public static final String ALIAS_O = "o";
	public static final String ALIAS_LEVEL_VALUE = "电平";
	public static final String ALIAS_REMARK = "备注";
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * 录入类型1：国际台运行图2：海外落地       db_column: DATA_TYPE 
     */	
	
	private Long dataType;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Long freq;
    /**
     * 语言ID(节目)       db_column: LANGUAGE_ID 
     */	
	
	private Long languageId;
    /**
     * 语言(节目)       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * stationId       db_column: STATION_ID 
     */	
	
	private Long stationId;
    /**
     * 当录入类型=1时为发射台，当录入类型=2时为转播机构       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 功率       db_column: POWER 
     */	
	
	private Long power;
    /**
     * 方向       db_column: DIRECTION 
     */	
	
	private Long direction;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * ciraf区       db_column: CIRAF 
     */	
	private String ciraf;
    /**
     * 收测国家       db_column: RECEIVE_COUNTRY 
     */	
	private String receiveCountry;
    /**
     * 收测城市       db_column: RECEIVE_CITY 
     */	
	private String receiveCity;
    /**
     * 资源来原（包含实地收测、反馈收测、互换资料）       db_column: DATASOURCE 
     */	
	private String datasource;
    /**
     * 开播时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 停播时间       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 收测日期       db_column: RECEIVE_DATE 
     */	
	
	private Date receiveDate;
    /**
     * 收测时间       db_column: RECEIVE_TIME 
     */	
	private String receiveTime;
    /**
     * 节目类别       db_column: PROGRAM_TYPE 
     */	
	private String programType;
    /**
     * 场强       db_column: FIELD_STRENGTH 
     */	
	private String fieldStrength;
    /**
     * s       db_column: S 
     */	
	
	private Long s;
    /**
     * i       db_column: I 
     */	
	
	private Long i;
    /**
     * o       db_column: O 
     */	
	
	private Long o;
    /**
     * 电平       db_column: LEVEL_VALUE 
     */	
	
	private Long levelValue;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
	//columns END

	public ResDatainputTab(){
	}

	public ResDatainputTab(
		Long dataId
	){
		this.dataId = dataId;
	}

	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getDataId() {
		return this.dataId;
	}
	public void setDataType(Long value) {
		this.dataType = value;
	}
	
	public Long getDataType() {
		return this.dataType;
	}
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	public void setDirection(Long value) {
		this.direction = value;
	}
	
	public Long getDirection() {
		return this.direction;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	public void setReceiveCountry(String value) {
		this.receiveCountry = value;
	}
	
	public String getReceiveCountry() {
		return this.receiveCountry;
	}
	public void setReceiveCity(String value) {
		this.receiveCity = value;
	}
	
	public String getReceiveCity() {
		return this.receiveCity;
	}
	public void setDatasource(String value) {
		this.datasource = value;
	}
	
	public String getDatasource() {
		return this.datasource;
	}

	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}

	
	public void setReceiveDate(Date value) {
		this.receiveDate = value;
	}
	
	public Date getReceiveDate() {
		return this.receiveDate;
	}
	public void setReceiveTime(String value) {
		this.receiveTime = value;
	}
	
	public String getReceiveTime() {
		return this.receiveTime;
	}
	public void setProgramType(String value) {
		this.programType = value;
	}
	
	public String getProgramType() {
		return this.programType;
	}
	public void setFieldStrength(String value) {
		this.fieldStrength = value;
	}
	
	public String getFieldStrength() {
		return this.fieldStrength;
	}
	public void setS(Long value) {
		this.s = value;
	}
	
	public Long getS() {
		return this.s;
	}
	public void setI(Long value) {
		this.i = value;
	}
	
	public Long getI() {
		return this.i;
	}
	public void setO(Long value) {
		this.o = value;
	}
	
	public Long getO() {
		return this.o;
	}
	public void setLevelValue(Long value) {
		this.levelValue = value;
	}
	
	public Long getLevelValue() {
		return this.levelValue;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("DataType",getDataType())
			.append("Freq",getFreq())
			.append("LanguageId",getLanguageId())
			.append("LanguageName",getLanguageName())
			.append("StationId",getStationId())
			.append("StationName",getStationName())
			.append("Power",getPower())
			.append("Direction",getDirection())
			.append("ServiceArea",getServiceArea())
			.append("Ciraf",getCiraf())
			.append("ReceiveCountry",getReceiveCountry())
			.append("ReceiveCity",getReceiveCity())
			.append("Datasource",getDatasource())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("ReceiveDate",getReceiveDate())
			.append("ReceiveTime",getReceiveTime())
			.append("ProgramType",getProgramType())
			.append("FieldStrength",getFieldStrength())
			.append("S",getS())
			.append("I",getI())
			.append("O",getO())
			.append("LevelValue",getLevelValue())
			.append("Remark",getRemark())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResDatainputTab == false) return false;
		if(this == obj) return true;
		ResDatainputTab other = (ResDatainputTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

