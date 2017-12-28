
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicEquLogTypeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 设备日志详细id */
	private Long typeId;
	/** 设备日志详细 */
	private String type;
	/** 设备日志类型id */
	private Long categoryId;

	public Long getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(Long value) {
		this.typeId = value;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public Long getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(Long value) {
		this.categoryId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

