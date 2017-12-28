
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


public class ResHeadendMonitorRuleTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "站点监测录音规则表";
	public static final String ALIAS_HEAD_CODE = "站点代码";
	public static final String ALIAS_EFFECT_SLEEP_TIME = "效果录音两次之间的时间间隔";
	public static final String ALIAS_EFFECT_RECORD_LENGTH = "效果录音文件长度";
	public static final String ALIAS_EFFECT_BPS = "效果录音压缩码率";
	public static final String ALIAS_QUALITY_SLEEP_TIME = "质量录音两次之间的时间间隔";
	public static final String ALIAS_QUALITY_RECORD_LENGTH = "质量录音文件长度";
	public static final String ALIAS_QUALITY_BPS = "质量录音压缩码率";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SHORTNAME = "站点名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 站点代码       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 效果录音两次之间的时间间隔       db_column: EFFECT_SLEEP_TIME 
     */	
	private String effectSleepTime;
    /**
     * 效果录音文件长度       db_column: EFFECT_RECORD_LENGTH 
     */	
	private String effectRecordLength;
    /**
     * 效果录音压缩码率       db_column: EFFECT_BPS 
     */	
	private String effectBps;
    /**
     * 质量录音两次之间的时间间隔       db_column: QUALITY_SLEEP_TIME 
     */	
	private String qualitySleepTime;
    /**
     * 质量录音文件长度       db_column: QUALITY_RECORD_LENGTH 
     */	
	private String qualityRecordLength;
    /**
     * 质量录音压缩码率       db_column: QUALITY_BPS 
     */	
	private String qualityBps;
    /**
     * id       db_column: ID 
     */	
	private String id;
    /**
     * 站点名称       db_column: SHORTNAME 
     */	
	private String shortname;
	//columns END

	public ResHeadendMonitorRuleTab(){
	}

	public ResHeadendMonitorRuleTab(
		String headCode
	){
		this.headCode = headCode;
	}

	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setEffectSleepTime(String value) {
		this.effectSleepTime = value;
	}
	
	public String getEffectSleepTime() {
		return this.effectSleepTime;
	}
	public void setEffectRecordLength(String value) {
		this.effectRecordLength = value;
	}
	
	public String getEffectRecordLength() {
		return this.effectRecordLength;
	}
	public void setEffectBps(String value) {
		this.effectBps = value;
	}
	
	public String getEffectBps() {
		return this.effectBps;
	}
	public void setQualitySleepTime(String value) {
		this.qualitySleepTime = value;
	}
	
	public String getQualitySleepTime() {
		return this.qualitySleepTime;
	}
	public void setQualityRecordLength(String value) {
		this.qualityRecordLength = value;
	}
	
	public String getQualityRecordLength() {
		return this.qualityRecordLength;
	}
	public void setQualityBps(String value) {
		this.qualityBps = value;
	}
	
	public String getQualityBps() {
		return this.qualityBps;
	}
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setShortname(String value) {
		this.shortname = value;
	}
	
	public String getShortname() {
		return this.shortname;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("HeadCode",getHeadCode())
			.append("EffectSleepTime",getEffectSleepTime())
			.append("EffectRecordLength",getEffectRecordLength())
			.append("EffectBps",getEffectBps())
			.append("QualitySleepTime",getQualitySleepTime())
			.append("QualityRecordLength",getQualityRecordLength())
			.append("QualityBps",getQualityBps())
			.append("Id",getId())
			.append("Shortname",getShortname())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getHeadCode())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResHeadendMonitorRuleTab == false) return false;
		if(this == obj) return true;
		ResHeadendMonitorRuleTab other = (ResHeadendMonitorRuleTab)obj;
		return new EqualsBuilder()
			.append(getHeadCode(),other.getHeadCode())
			.isEquals();
	}
}

