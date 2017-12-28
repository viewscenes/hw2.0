
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicTaskTypeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 任务类型id */
	private Long taskTypeId;
	/** 任务类型 */
	private String type;

	public Long getTaskTypeId() {
		return this.taskTypeId;
	}
	
	public void setTaskTypeId(Long value) {
		this.taskTypeId = value;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

