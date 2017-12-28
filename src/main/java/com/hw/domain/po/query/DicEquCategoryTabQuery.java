
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicEquCategoryTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 设备回收日志id */
	private Long categoryId;
	/** 设备回收日志类型 */
	private String category;

	public Long getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(Long value) {
		this.categoryId = value;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setCategory(String value) {
		this.category = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

