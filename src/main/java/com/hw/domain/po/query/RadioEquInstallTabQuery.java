
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


public class RadioEquInstallTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 站点id */
	private Long headId;
	/** 站点名称 */
	private String headName;
	/** 站点代码 */
	private String headCode;
	/** 设备名称 */
	private String equName;
	/** 设备编号 */
	private String equId;
	/** 设备状态(0:使用,1:备用,2:可修复,3:报废) */
	private Long status;
	/** 邮寄时间 */
	private Date mailTimeBegin;
	private Date mailTimeEnd;
	/** 邮件单号 */
	private String orderNo;
	/** 设备存放地点:0站点保存,1使馆寄存 */
	private String savePlace;

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
	
	public String getEquName() {
		return this.equName;
	}
	
	public void setEquName(String value) {
		this.equName = value;
	}
	
	public String getEquId() {
		return this.equId;
	}
	
	public void setEquId(String value) {
		this.equId = value;
	}
	
	public Long getStatus() {
		return this.status;
	}
	
	public void setStatus(Long value) {
		this.status = value;
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
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	public String getSavePlace() {
		return this.savePlace;
	}
	
	public void setSavePlace(String value) {
		this.savePlace = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

