
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResHeadendMonitorRuleTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 站点代码 */
	private String headCode;
	/** 效果录音两次之间的时间间隔 */
	private String effectSleepTime;
	/** 效果录音文件长度 */
	private String effectRecordLength;
	/** 效果录音压缩码率 */
	private String effectBps;
	/** 质量录音两次之间的时间间隔 */
	private String qualitySleepTime;
	/** 质量录音文件长度 */
	private String qualityRecordLength;
	/** 质量录音压缩码率 */
	private String qualityBps;
	/** id */
	private String id;
	/** 站点名称 */
	private String shortname;

	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getEffectSleepTime() {
		return this.effectSleepTime;
	}
	
	public void setEffectSleepTime(String value) {
		this.effectSleepTime = value;
	}
	
	public String getEffectRecordLength() {
		return this.effectRecordLength;
	}
	
	public void setEffectRecordLength(String value) {
		this.effectRecordLength = value;
	}
	
	public String getEffectBps() {
		return this.effectBps;
	}
	
	public void setEffectBps(String value) {
		this.effectBps = value;
	}
	
	public String getQualitySleepTime() {
		return this.qualitySleepTime;
	}
	
	public void setQualitySleepTime(String value) {
		this.qualitySleepTime = value;
	}
	
	public String getQualityRecordLength() {
		return this.qualityRecordLength;
	}
	
	public void setQualityRecordLength(String value) {
		this.qualityRecordLength = value;
	}
	
	public String getQualityBps() {
		return this.qualityBps;
	}
	
	public void setQualityBps(String value) {
		this.qualityBps = value;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String value) {
		this.id = value;
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

