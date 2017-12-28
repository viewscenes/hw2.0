
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicReportTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicReportTypeTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_TAB_NAME = "tabName";
	public static final String ALIAS_TAB_NAME2 = "tabName2";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * name       db_column: NAME 
     */	
	private String name;
    /**
     * tabName       db_column: TAB_NAME 
     */	
	private String tabName;
    /**
     * tabName2       db_column: TAB_NAME2 
     */	
	private String tabName2;
	//columns END

	public DicReportTypeTab(){
	}

	public DicReportTypeTab(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setTabName(String value) {
		this.tabName = value;
	}
	
	public String getTabName() {
		return this.tabName;
	}
	public void setTabName2(String value) {
		this.tabName2 = value;
	}
	
	public String getTabName2() {
		return this.tabName2;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("TabName",getTabName())
			.append("TabName2",getTabName2())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicReportTypeTab == false) return false;
		if(this == obj) return true;
		DicReportTypeTab other = (DicReportTypeTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

