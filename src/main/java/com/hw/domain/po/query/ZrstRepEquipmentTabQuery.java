
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


public class ZrstRepEquipmentTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** dataId */
	private Long dataId;
	/** reportId */
	private Long reportId;
	/** headName */
	private String headName;
	/** headCode */
	private String headCode;
	/** starttime */
	private Date starttimeBegin;
	private Date starttimeEnd;
	/** endtime */
	private Date endtimeBegin;
	private Date endtimeEnd;
	/** count */
	private String count;
	/** type */
	private String type;
	/** typeName */
	private String typeName;
	/** handle */
	private String handle;
	/** handle2 */
	private String handle2;
	/** remark */
	private String remark;
	/** isDelete */
	private Long isDelete;
	/** equ */
	private String equ;
	/** advice */
	private String advice;

	public Long getDataId() {
		return this.dataId;
	}
	
	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getReportId() {
		return this.reportId;
	}
	
	public void setReportId(Long value) {
		this.reportId = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}
	
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public Date getStarttimeBegin() {
		return this.starttimeBegin;
	}
	
	public void setStarttimeBegin(Date value) {
		this.starttimeBegin = value;
	}	
	
	public Date getStarttimeEnd() {
		return this.starttimeEnd;
	}
	
	public void setStarttimeEnd(Date value) {
		this.starttimeEnd = value;
	}
	
	public Date getEndtimeBegin() {
		return this.endtimeBegin;
	}
	
	public void setEndtimeBegin(Date value) {
		this.endtimeBegin = value;
	}	
	
	public Date getEndtimeEnd() {
		return this.endtimeEnd;
	}
	
	public void setEndtimeEnd(Date value) {
		this.endtimeEnd = value;
	}
	
	public String getCount() {
		return this.count;
	}
	
	public void setCount(String value) {
		this.count = value;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getTypeName() {
		return this.typeName;
	}
	
	public void setTypeName(String value) {
		this.typeName = value;
	}
	
	public String getHandle() {
		return this.handle;
	}
	
	public void setHandle(String value) {
		this.handle = value;
	}
	
	public String getHandle2() {
		return this.handle2;
	}
	
	public void setHandle2(String value) {
		this.handle2 = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public String getEqu() {
		return this.equ;
	}
	
	public void setEqu(String value) {
		this.equ = value;
	}
	
	public String getAdvice() {
		return this.advice;
	}
	
	public void setAdvice(String value) {
		this.advice = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

