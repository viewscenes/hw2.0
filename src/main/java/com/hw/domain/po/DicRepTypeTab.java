
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


public class DicRepTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicRepTypeTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "报表名称";
	public static final String ALIAS_TYPE = "报表类型8 未知 7 任意 6 年报 5 半年报 4 季报 3 月报 2 周报 1 日报";
	public static final String ALIAS_TAB_NAME = "报表对应的数据库表";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 报表名称       db_column: NAME 
     */	
	private String name;
    /**
     * 报表类型8 未知 7 任意 6 年报 5 半年报 4 季报 3 月报 2 周报 1 日报       db_column: TYPE 
     */	
	
	private Long type;
    /**
     * 报表对应的数据库表       db_column: TAB_NAME 
     */	
	private String tabName;
	//columns END

	public DicRepTypeTab(){
	}

	public DicRepTypeTab(
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
	public void setType(Long value) {
		this.type = value;
	}
	
	public Long getType() {
		return this.type;
	}
	public void setTabName(String value) {
		this.tabName = value;
	}
	
	public String getTabName() {
		return this.tabName;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("Type",getType())
			.append("TabName",getTabName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicRepTypeTab == false) return false;
		if(this == obj) return true;
		DicRepTypeTab other = (DicRepTypeTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

