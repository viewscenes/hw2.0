
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


public class ZrstRepEffectStatisticsTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepEffectStatisticsTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "报表ID";
	public static final String ALIAS_PLAY_TIME = "播音时间";
	public static final String ALIAS_LANGUAGE_NAME = "语言";
	public static final String ALIAS_FREQ = "频率";
	public static final String ALIAS_TRANSMIT_STATION = "发射台";
	public static final String ALIAS_TRANSMIT_DIRECTION = "发射方向";
	public static final String ALIAS_TRANSMIT_POWER = "发射功率";
	public static final String ALIAS_SERVICE_AREA = "服务区";
	public static final String ALIAS_RECEIVE_CODE = "收测地点";
	public static final String ALIAS_RECEIVE_COUNT = "收测次数";
	public static final String ALIAS_FEN0 = "0分的";
	public static final String ALIAS_FEN1 = "1分的";
	public static final String ALIAS_FEN2 = "2分的";
	public static final String ALIAS_FEN3 = "3分的";
	public static final String ALIAS_FEN4 = "4分的";
	public static final String ALIAS_FEN5 = "5分的";
	public static final String ALIAS_LISTEN = "可听率%";
	public static final String ALIAS_LISTEN_MIDDLE = "可听度中值";
	public static final String ALIAS_BAK = "备注";
	public static final String ALIAS_RECEIVE_NAME = "遥控站名";
	public static final String ALIAS_TRANSMIT_STATION_LISTENS = "发射台_>=3分_总次数_可听率%  例如：2022_88_123_78,2032_23_423_28";
	public static final String ALIAS_RECEIVE_NAME_TOTAL_HOURS = "遥控站名_总频时  例如：大阪_96,吉隆坡_34";
	public static final String ALIAS_RECEIVE_LISTENS = "保证收听频时 _基本可收听频时 _有时可收听频时_ 无法收听频时_总频时";
	public static final String ALIAS_LANGUAGE_NAME_LISTENS = "语言_>=3分_总次数_可听率%  例如：德 _88_123_78,2032_23_423_28";
	public static final String ALIAS_STATE_NAME = "地区 如：欧洲";
	public static final String ALIAS_MONTH_LISTENS = "各月可听率 一月_二月_三月_四月_五月_六月_七月_八月_九月_十月_十一月_十二月 如：1_2_3_4_5_7_8_8_2_10_33_44";
	public static final String ALIAS_AVERAGE_LISTENS = "平均可听率%";
	public static final String ALIAS_SUB_REPORT_TYPE = "子报表类型  11：国际台广播效果统计；21：发射台总体播出效果统计1；22：发射台总体播出效果统计2；23：发射台总体播出效果统计3；31：语言总体播出效果统计1；32：语言总体播出效果统计2；41：各遥控站、各地区、各大洲、可听率统计；51：各遥控站、各地区、各大洲、可保证收听频时统计；61：各月可听率对比；71：频率平均可听率统计表";
	public static final String ALIAS_REPORT_TYPE = "报表类型  1：国际台效果报告统计  2：海外落地效果报告统计";
	public static final String ALIAS_ALL_LISTENS = "地区或大洲_>=3分_总次数_可听率% ";
	public static final String ALIAS_RUNPLAN_ID = "运行图id, 为了变频时统计频时数后加的字段";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Integer dataId;
    /**
     * 报表ID       db_column: REPORT_ID 
     */	
	
	private Integer reportId;
    /**
     * 播音时间       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * 语言       db_column: LANGUAGE_NAME 
     */	
	private String languageName;
    /**
     * 频率       db_column: FREQ 
     */	
	
	private Integer freq;
    /**
     * 发射台       db_column: TRANSMIT_STATION 
     */	
	private String transmitStation;
    /**
     * 发射方向       db_column: TRANSMIT_DIRECTION 
     */	
	
	private Integer transmitDirection;
    /**
     * 发射功率       db_column: TRANSMIT_POWER 
     */	
	
	private Integer transmitPower;
    /**
     * 服务区       db_column: SERVICE_AREA 
     */	
	private String serviceArea;
    /**
     * 收测地点       db_column: RECEIVE_CODE 
     */	
	private String receiveCode;
    /**
     * 收测次数       db_column: RECEIVE_COUNT 
     */	
	
	private Integer receiveCount;
    /**
     * 0分的       db_column: FEN0 
     */	
	
	private Integer fen0;
    /**
     * 1分的       db_column: FEN1 
     */	
	
	private Integer fen1;
    /**
     * 2分的       db_column: FEN2 
     */	
	
	private Integer fen2;
    /**
     * 3分的       db_column: FEN3 
     */	
	
	private Integer fen3;
    /**
     * 4分的       db_column: FEN4 
     */	
	
	private Integer fen4;
    /**
     * 5分的       db_column: FEN5 
     */	
	
	private Integer fen5;
    /**
     * 可听率%       db_column: LISTEN 
     */	
	
	private Integer listen;
    /**
     * 可听度中值       db_column: LISTEN_MIDDLE 
     */	
	
	private Integer listenMiddle;
    /**
     * 备注       db_column: BAK 
     */	
	private String bak;
    /**
     * 遥控站名       db_column: RECEIVE_NAME 
     */	
	private String receiveName;
    /**
     * 发射台_>=3分_总次数_可听率%  例如：2022_88_123_78,2032_23_423_28       db_column: TRANSMIT_STATION_LISTENS 
     */	
	private String transmitStationListens;
    /**
     * 遥控站名_总频时  例如：大阪_96,吉隆坡_34       db_column: RECEIVE_NAME_TOTAL_HOURS 
     */	
	private String receiveNameTotalHours;
    /**
     * 保证收听频时 _基本可收听频时 _有时可收听频时_ 无法收听频时_总频时       db_column: RECEIVE_LISTENS 
     */	
	private String receiveListens;
    /**
     * 语言_>=3分_总次数_可听率%  例如：德 _88_123_78,2032_23_423_28       db_column: LANGUAGE_NAME_LISTENS 
     */	
	private String languageNameListens;
    /**
     * 地区 如：欧洲       db_column: STATE_NAME 
     */	
	private String stateName;
    /**
     * 各月可听率 一月_二月_三月_四月_五月_六月_七月_八月_九月_十月_十一月_十二月 如：1_2_3_4_5_7_8_8_2_10_33_44       db_column: MONTH_LISTENS 
     */	
	private String monthListens;
    /**
     * 平均可听率%       db_column: AVERAGE_LISTENS 
     */	
	private String averageListens;
    /**
     * 子报表类型  11：国际台广播效果统计；21：发射台总体播出效果统计1；22：发射台总体播出效果统计2；23：发射台总体播出效果统计3；31：语言总体播出效果统计1；32：语言总体播出效果统计2；41：各遥控站、各地区、各大洲、可听率统计；51：各遥控站、各地区、各大洲、可保证收听频时统计；61：各月可听率对比；71：频率平均可听率统计表       db_column: SUB_REPORT_TYPE 
     */	
	private String subReportType;
    /**
     * 报表类型  1：国际台效果报告统计  2：海外落地效果报告统计       db_column: REPORT_TYPE 
     */	
	private String reportType;
    /**
     * 地区或大洲_>=3分_总次数_可听率%        db_column: ALL_LISTENS 
     */	
	private String allListens;
    /**
     * 运行图id, 为了变频时统计频时数后加的字段       db_column: RUNPLAN_ID 
     */	
	
	private Integer runplanId;
	//columns END

	public ZrstRepEffectStatisticsTab(){
	}

	public ZrstRepEffectStatisticsTab(
		Integer dataId
	){
		this.dataId = dataId;
	}

	public void setDataId(Integer value) {
		this.dataId = value;
	}
	
	public Integer getDataId() {
		return this.dataId;
	}
	public void setReportId(Integer value) {
		this.reportId = value;
	}
	
	public Integer getReportId() {
		return this.reportId;
	}
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	public void setLanguageName(String value) {
		this.languageName = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	public void setFreq(Integer value) {
		this.freq = value;
	}
	
	public Integer getFreq() {
		return this.freq;
	}
	public void setTransmitStation(String value) {
		this.transmitStation = value;
	}
	
	public String getTransmitStation() {
		return this.transmitStation;
	}
	public void setTransmitDirection(Integer value) {
		this.transmitDirection = value;
	}
	
	public Integer getTransmitDirection() {
		return this.transmitDirection;
	}
	public void setTransmitPower(Integer value) {
		this.transmitPower = value;
	}
	
	public Integer getTransmitPower() {
		return this.transmitPower;
	}
	public void setServiceArea(String value) {
		this.serviceArea = value;
	}
	
	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setReceiveCode(String value) {
		this.receiveCode = value;
	}
	
	public String getReceiveCode() {
		return this.receiveCode;
	}
	public void setReceiveCount(Integer value) {
		this.receiveCount = value;
	}
	
	public Integer getReceiveCount() {
		return this.receiveCount;
	}
	public void setFen0(Integer value) {
		this.fen0 = value;
	}
	
	public Integer getFen0() {
		return this.fen0;
	}
	public void setFen1(Integer value) {
		this.fen1 = value;
	}
	
	public Integer getFen1() {
		return this.fen1;
	}
	public void setFen2(Integer value) {
		this.fen2 = value;
	}
	
	public Integer getFen2() {
		return this.fen2;
	}
	public void setFen3(Integer value) {
		this.fen3 = value;
	}
	
	public Integer getFen3() {
		return this.fen3;
	}
	public void setFen4(Integer value) {
		this.fen4 = value;
	}
	
	public Integer getFen4() {
		return this.fen4;
	}
	public void setFen5(Integer value) {
		this.fen5 = value;
	}
	
	public Integer getFen5() {
		return this.fen5;
	}
	public void setListen(Integer value) {
		this.listen = value;
	}
	
	public Integer getListen() {
		return this.listen;
	}
	public void setListenMiddle(Integer value) {
		this.listenMiddle = value;
	}
	
	public Integer getListenMiddle() {
		return this.listenMiddle;
	}
	public void setBak(String value) {
		this.bak = value;
	}
	
	public String getBak() {
		return this.bak;
	}
	public void setReceiveName(String value) {
		this.receiveName = value;
	}
	
	public String getReceiveName() {
		return this.receiveName;
	}
	public void setTransmitStationListens(String value) {
		this.transmitStationListens = value;
	}
	
	public String getTransmitStationListens() {
		return this.transmitStationListens;
	}
	public void setReceiveNameTotalHours(String value) {
		this.receiveNameTotalHours = value;
	}
	
	public String getReceiveNameTotalHours() {
		return this.receiveNameTotalHours;
	}
	public void setReceiveListens(String value) {
		this.receiveListens = value;
	}
	
	public String getReceiveListens() {
		return this.receiveListens;
	}
	public void setLanguageNameListens(String value) {
		this.languageNameListens = value;
	}
	
	public String getLanguageNameListens() {
		return this.languageNameListens;
	}
	public void setStateName(String value) {
		this.stateName = value;
	}
	
	public String getStateName() {
		return this.stateName;
	}
	public void setMonthListens(String value) {
		this.monthListens = value;
	}
	
	public String getMonthListens() {
		return this.monthListens;
	}
	public void setAverageListens(String value) {
		this.averageListens = value;
	}
	
	public String getAverageListens() {
		return this.averageListens;
	}
	public void setSubReportType(String value) {
		this.subReportType = value;
	}
	
	public String getSubReportType() {
		return this.subReportType;
	}
	public void setReportType(String value) {
		this.reportType = value;
	}
	
	public String getReportType() {
		return this.reportType;
	}
	public void setAllListens(String value) {
		this.allListens = value;
	}
	
	public String getAllListens() {
		return this.allListens;
	}
	public void setRunplanId(Integer value) {
		this.runplanId = value;
	}
	
	public Integer getRunplanId() {
		return this.runplanId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("PlayTime",getPlayTime())
			.append("LanguageName",getLanguageName())
			.append("Freq",getFreq())
			.append("TransmitStation",getTransmitStation())
			.append("TransmitDirection",getTransmitDirection())
			.append("TransmitPower",getTransmitPower())
			.append("ServiceArea",getServiceArea())
			.append("ReceiveCode",getReceiveCode())
			.append("ReceiveCount",getReceiveCount())
			.append("Fen0",getFen0())
			.append("Fen1",getFen1())
			.append("Fen2",getFen2())
			.append("Fen3",getFen3())
			.append("Fen4",getFen4())
			.append("Fen5",getFen5())
			.append("Listen",getListen())
			.append("ListenMiddle",getListenMiddle())
			.append("Bak",getBak())
			.append("ReceiveName",getReceiveName())
			.append("TransmitStationListens",getTransmitStationListens())
			.append("ReceiveNameTotalHours",getReceiveNameTotalHours())
			.append("ReceiveListens",getReceiveListens())
			.append("LanguageNameListens",getLanguageNameListens())
			.append("StateName",getStateName())
			.append("MonthListens",getMonthListens())
			.append("AverageListens",getAverageListens())
			.append("SubReportType",getSubReportType())
			.append("ReportType",getReportType())
			.append("AllListens",getAllListens())
			.append("RunplanId",getRunplanId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepEffectStatisticsTab == false) return false;
		if(this == obj) return true;
		ZrstRepEffectStatisticsTab other = (ZrstRepEffectStatisticsTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

