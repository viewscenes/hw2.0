
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


public class RadioEquMainTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 前段id */
	private Long headId;
	/** 安装情况 */
	private String installation;
	/** 使用情况 */
	private String useCase;
	/** 故障情况 */
	private String fault;
	/** 更换情况 */
	private String replacement;
	/** 维护情况 */
	private String maintain;
	/** 设备数量 */
	private String equNumber;
	/** 设备编号 */
	private String equId;
	/** 前段代码 */
	private String headCode;
	/** 维护时间 */
	private Date mainDatetimeBegin;
	private Date mainDatetimeEnd;
	/** 站点名称 */
	private String headName;
	/** 文件路径 */
	private String picPath;
	/** 故障开始时间 */
	private Date startTimeBegin;
	private Date startTimeEnd;
	/** 故障结束时间 */
	private Date endTimeBegin;
	private Date endTimeEnd;
	/** 维护人 */
	private String person;
	/** 处理结果 */
	private String resault;
	/** 录音文件路径 */
	private String recordPath;
	/** 旧设备编号 */
	private String oldEqu;
	/** 旧设备去向，0站点保存 1使馆寄存 */
	private String oldPlace;
	/** 旧设备状态：0可以修复，1已经报废 */
	private String oldStatus;
	/** 新设备编号 */
	private String newEqu;
	/** 新设备来源:0邮寄过去，1站点存储，2使馆存储 */
	private String newFrom;
	/** 邮件单号 */
	private String mailOrder;
	/** 邮寄时间 */
	private Date mailTimeBegin;
	private Date mailTimeEnd;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public String getInstallation() {
		return this.installation;
	}
	
	public void setInstallation(String value) {
		this.installation = value;
	}
	
	public String getUseCase() {
		return this.useCase;
	}
	
	public void setUseCase(String value) {
		this.useCase = value;
	}
	
	public String getFault() {
		return this.fault;
	}
	
	public void setFault(String value) {
		this.fault = value;
	}
	
	public String getReplacement() {
		return this.replacement;
	}
	
	public void setReplacement(String value) {
		this.replacement = value;
	}
	
	public String getMaintain() {
		return this.maintain;
	}
	
	public void setMaintain(String value) {
		this.maintain = value;
	}
	
	public String getEquNumber() {
		return this.equNumber;
	}
	
	public void setEquNumber(String value) {
		this.equNumber = value;
	}
	
	public String getEquId() {
		return this.equId;
	}
	
	public void setEquId(String value) {
		this.equId = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public Date getMainDatetimeBegin() {
		return this.mainDatetimeBegin;
	}
	
	public void setMainDatetimeBegin(Date value) {
		this.mainDatetimeBegin = value;
	}	
	
	public Date getMainDatetimeEnd() {
		return this.mainDatetimeEnd;
	}
	
	public void setMainDatetimeEnd(Date value) {
		this.mainDatetimeEnd = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}
	
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public String getPicPath() {
		return this.picPath;
	}
	
	public void setPicPath(String value) {
		this.picPath = value;
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
	
	public String getPerson() {
		return this.person;
	}
	
	public void setPerson(String value) {
		this.person = value;
	}
	
	public String getResault() {
		return this.resault;
	}
	
	public void setResault(String value) {
		this.resault = value;
	}
	
	public String getRecordPath() {
		return this.recordPath;
	}
	
	public void setRecordPath(String value) {
		this.recordPath = value;
	}
	
	public String getOldEqu() {
		return this.oldEqu;
	}
	
	public void setOldEqu(String value) {
		this.oldEqu = value;
	}
	
	public String getOldPlace() {
		return this.oldPlace;
	}
	
	public void setOldPlace(String value) {
		this.oldPlace = value;
	}
	
	public String getOldStatus() {
		return this.oldStatus;
	}
	
	public void setOldStatus(String value) {
		this.oldStatus = value;
	}
	
	public String getNewEqu() {
		return this.newEqu;
	}
	
	public void setNewEqu(String value) {
		this.newEqu = value;
	}
	
	public String getNewFrom() {
		return this.newFrom;
	}
	
	public void setNewFrom(String value) {
		this.newFrom = value;
	}
	
	public String getMailOrder() {
		return this.mailOrder;
	}
	
	public void setMailOrder(String value) {
		this.mailOrder = value;
	}
	
	public Date getMailTimeBegin() {
		return this.mailTimeBegin;
	}
	
	public void setMailTimeBegin(Date value) {
		this.mailTimeBegin = value;
	}	
	
	public Date getMailTimeEnd() {
		return this.mailTimeEnd;
	}
	
	public void setMailTimeEnd(Date value) {
		this.mailTimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

