
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


public class SecOperationLogTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** logId */
	private Long logId;
	/** operationId */
	private Long operationId;
	/** operationName */
	private String operationName;
	/** userId */
	private Long userId;
	/** userName */
	private String userName;
	/** logDatetime */
	private Date logDatetimeBegin;
	private Date logDatetimeEnd;
	/** description */
	private String description;

	public Long getLogId() {
		return this.logId;
	}
	
	public void setLogId(Long value) {
		this.logId = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public String getOperationName() {
		return this.operationName;
	}
	
	public void setOperationName(String value) {
		this.operationName = value;
	}
	
	public Long getUserId() {
		return this.userId;
	}
	
	public void setUserId(Long value) {
		this.userId = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String value) {
		this.userName = value;
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
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

