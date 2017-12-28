
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SecOperationDetailTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** detailId */
	private Long detailId;
	/** operationName */
	private String operationName;
	/** operationId */
	private Long operationId;
	/** levelvalue */
	private Long levelvalue;
	/** isLog */
	private Long isLog;

	public Long getDetailId() {
		return this.detailId;
	}
	
	public void setDetailId(Long value) {
		this.detailId = value;
	}
	
	public String getOperationName() {
		return this.operationName;
	}
	
	public void setOperationName(String value) {
		this.operationName = value;
	}
	
	public Long getOperationId() {
		return this.operationId;
	}
	
	public void setOperationId(Long value) {
		this.operationId = value;
	}
	
	public Long getLevelvalue() {
		return this.levelvalue;
	}
	
	public void setLevelvalue(Long value) {
		this.levelvalue = value;
	}
	
	public Long getIsLog() {
		return this.isLog;
	}
	
	public void setIsLog(Long value) {
		this.isLog = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

