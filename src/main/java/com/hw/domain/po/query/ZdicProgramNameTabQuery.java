
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZdicProgramNameTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 节目id */
	private Long programId;
	/** 节目名称 */
	private String programName;
	/** 是否删除 */
	private Long isDelete;

	public Long getProgramId() {
		return this.programId;
	}
	
	public void setProgramId(Long value) {
		this.programId = value;
	}
	
	public String getProgramName() {
		return this.programName;
	}
	
	public void setProgramName(String value) {
		this.programName = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

