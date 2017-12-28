
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResTaskUnitTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 前端code */
	private String headCode;
	/** 单元时间 */
	private String unittime;
	/** 单元时间内总的录音时间 */
	private Long countMinutes;
	/** 接收机 */
	private String equCode;
	/** 运行图录音任务类型 质量 录音 */
	private String recordType;

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
	
	public String getUnittime() {
		return this.unittime;
	}
	
	public void setUnittime(String value) {
		this.unittime = value;
	}
	
	public Long getCountMinutes() {
		return this.countMinutes;
	}
	
	public void setCountMinutes(Long value) {
		this.countMinutes = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public String getRecordType() {
		return this.recordType;
	}
	
	public void setRecordType(String value) {
		this.recordType = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

