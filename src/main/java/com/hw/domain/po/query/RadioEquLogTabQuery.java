
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


public class RadioEquLogTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** logId */
	private Long logId;
	/** 日志日期 */
	private Date logDatetimeBegin;
	private Date logDatetimeEnd;
	/** 描述 */
	private String description;
	/** 备注 */
	private String remark;
	/** 类型 */
	private Long typeId;
	/** 前端code */
	private String headCode;

	public Long getLogId() {
		return this.logId;
	}
	
	public void setLogId(Long value) {
		this.logId = value;
	}
	
	public Date getLogDatetimeBegin() {
		return this.logDatetimeBegin;
	}
	
	public void setLogDatetimeBegin(Date value) {
		this.logDatetimeBegin = value;
	}	
	
	public Date getLogDatetimeEnd() {
		return this.logDatetimeEnd;
	}
	
	public void setLogDatetimeEnd(Date value) {
		this.logDatetimeEnd = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Long getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

