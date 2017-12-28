
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashSet;
import java.util.Set;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicEventTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicEventTypeTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TYPE_NAME = "故障类型名称";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 故障类型名称       db_column: TYPE_NAME 
     */	
	
	private Object typeName;
	//columns END

	public DicEventTypeTab(){
	}

	public DicEventTypeTab(
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
	public void setTypeName(Object value) {
		this.typeName = value;
	}
	
	public Object getTypeName() {
		return this.typeName;
	}
	
	private Set radioEquEventTabs = new HashSet(0);
	public void setRadioEquEventTabs(Set<RadioEquEventTab> radioEquEventTab){
		this.radioEquEventTabs = radioEquEventTab;
	}
	
	public Set<RadioEquEventTab> getRadioEquEventTabs() {
		return radioEquEventTabs;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("TypeName",getTypeName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicEventTypeTab == false) return false;
		if(this == obj) return true;
		DicEventTypeTab other = (DicEventTypeTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

