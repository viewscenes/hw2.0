
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


public class ResDatainputTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Long dataId;
	/** 录入类型1：国际台运行图2：海外落地 */
	private Long dataType;
	/** 频率 */
	private Long freq;
	/** 语言ID(节目) */
	private Long languageId;
	/** 语言(节目) */
	private String languageName;
	/** stationId */
	private Long stationId;
	/** 当录入类型=1时为发射台，当录入类型=2时为转播机构 */
	private String stationName;
	/** 功率 */
	private Long power;
	/** 方向 */
	private Long direction;
	/** 服务区 */
	private String serviceArea;
	/** ciraf区 */
	private String ciraf;
	/** 收测国家 */
	private String receiveCountry;
	/** 收测城市 */
	private String receiveCity;
	/** 资源来原（包含实地收测、反馈收测、互换资料） */
	private String datasource;
	/** 开播时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 停播时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 收测日期 */
	private Date receiveDateBegin;
	private Date receiveDateEnd;
	/** 收测时间 */
	private String receiveTime;
	/** 节目类别 */
	private String programType;
	/** 场强 */
	private String fieldStrength;
	/** s */
	private Long s;
	/** i */
	private Long i;
	/** o */
	private Long o;
	/** 电平 */
	private Long levelValue;
	/** 备注 */
	private String remark;

	public Long getDataId() {
		return this.dataId;
	}
	
	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getDataType() {
		return this.dataType;
	}
	
	public void setDataType(Long value) {
		this.dataType = value;
	}
	
	public Long getFreq() {
		return this.freq;
	}
	
	public void setFreq(Long value) {
		this.freq = value;
	}
	
	public Long getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public Long getPower() {
		return this.power;
	}
	
	public void setPower(Long value) {
		this.power = value;
	}
	
	public Long getDirection() {
		return this.direction;
	}
	
	public void setDirection(Long value) {
		this.direction = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getCiraf() {
		return this.ciraf;
	}
	
	public void setCiraf(String value) {
		this.ciraf = value;
	}
	
	public String getReceiveCountry() {
		return this.receiveCountry;
	}
	
	public void setReceiveCountry(String value) {
		this.receiveCountry = value;
	}
	
	public String getReceiveCity() {
		return this.receiveCity;
	}
	
	public void setReceiveCity(String value) {
		this.receiveCity = value;
	}
	
	public String getDatasource() {
		return this.datasource;
	}
	
	public void setDatasource(String value) {
		this.datasource = value;
	}
	
	public Date getStartTimeBegin() {
		return this.startTimeBegin;
	}
	
	public void setStartTimeBegin(Date value) {
		this.startTimeBegin = value;
	}	
	
	public Date getStartTimeEnd() {
		return this.startTimeEnd;
	}
	
	public void setStartTimeEnd(Date value) {
		this.startTimeEnd = value;
	}
	
	public Date getEndTimeBegin() {
		return this.endTimeBegin;
	}
	
	public void setEndTimeBegin(Date value) {
		this.endTimeBegin = value;
	}	
	
	public Date getEndTimeEnd() {
		return this.endTimeEnd;
	}
	
	public void setEndTimeEnd(Date value) {
		this.endTimeEnd = value;
	}
	
	public Date getReceiveDateBegin() {
		return this.receiveDateBegin;
	}
	
	public void setReceiveDateBegin(Date value) {
		this.receiveDateBegin = value;
	}	
	
	public Date getReceiveDateEnd() {
		return this.receiveDateEnd;
	}
	
	public void setReceiveDateEnd(Date value) {
		this.receiveDateEnd = value;
	}
	
	public String getReceiveTime() {
		return this.receiveTime;
	}
	
	public void setReceiveTime(String value) {
		this.receiveTime = value;
	}
	
	public String getProgramType() {
		return this.programType;
	}
	
	public void setProgramType(String value) {
		this.programType = value;
	}
	
	public String getFieldStrength() {
		return this.fieldStrength;
	}
	
	public void setFieldStrength(String value) {
		this.fieldStrength = value;
	}
	
	public Long getS() {
		return this.s;
	}
	
	public void setS(Long value) {
		this.s = value;
	}
	
	public Long getI() {
		return this.i;
	}
	
	public void setI(Long value) {
		this.i = value;
	}
	
	public Long getO() {
		return this.o;
	}
	
	public void setO(Long value) {
		this.o = value;
	}
	
	public Long getLevelValue() {
		return this.levelValue;
	}
	
	public void setLevelValue(Long value) {
		this.levelValue = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

