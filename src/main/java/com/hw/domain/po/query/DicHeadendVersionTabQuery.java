
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicHeadendVersionTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 接口版本管理表id */
	private Long versionId;
	/** 名称 */
	private String versionName;

	public Long getVersionId() {
		return this.versionId;
	}
	
	public void setVersionId(Long value) {
		this.versionId = value;
	}
	
	public String getVersionName() {
		return this.versionName;
	}
	
	public void setVersionName(String value) {
		this.versionName = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

