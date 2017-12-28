
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicServicesareaTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 服务区id */
	private Long id;
	/** 服务区中文名称 */
	private String chineseName;
	/** 服务区英文名称 */
	private String englishName;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getChineseName() {
		return this.chineseName;
	}
	
	public void setChineseName(String value) {
		this.chineseName = value;
	}
	
	public String getEnglishName() {
		return this.englishName;
	}
	
	public void setEnglishName(String value) {
		this.englishName = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

