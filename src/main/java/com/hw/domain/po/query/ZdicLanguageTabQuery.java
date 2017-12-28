
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZdicLanguageTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 语言id */
	private Long languageId;
	/** 语言名称 */
	private String languageName;
	/** 是否删除 */
	private Long isDelete;

	public Long getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Long value) {
		this.languageId = value;
	}
	
	public String getLanguageName() {
		return this.languageName;
	}
	
	public void setLanguageName(String value) {
		this.languageName = value;
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

