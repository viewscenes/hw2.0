
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicRepTypeTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 报表名称 */
	private String name;
	/** 报表类型8 未知 7 任意 6 年报 5 半年报 4 季报 3 月报 2 周报 1 日报 */
	private Long type;
	/** 报表对应的数据库表 */
	private String tabName;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public Long getType() {
		return this.type;
	}
	
	public void setType(Long value) {
		this.type = value;
	}
	
	public String getTabName() {
		return this.tabName;
	}
	
	public void setTabName(String value) {
		this.tabName = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

