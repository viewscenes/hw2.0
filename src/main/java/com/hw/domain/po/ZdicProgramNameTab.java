
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


public class ZdicProgramNameTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZdicProgramNameTab";
	public static final String ALIAS_PROGRAM_ID = "节目id";
	public static final String ALIAS_PROGRAM_NAME = "节目名称";
	public static final String ALIAS_IS_DELETE = "是否删除";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 节目id       db_column: PROGRAM_ID 
     */	
	
	private Long programId;
    /**
     * 节目名称       db_column: PROGRAM_NAME 
     */	
	private String programName;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
	//columns END

	public ZdicProgramNameTab(){
	}

	public ZdicProgramNameTab(
		Long programId
	){
		this.programId = programId;
	}

	public void setProgramId(Long value) {
		this.programId = value;
	}
	
	public Long getProgramId() {
		return this.programId;
	}
	public void setProgramName(String value) {
		this.programName = value;
	}
	
	public String getProgramName() {
		return this.programName;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ProgramId",getProgramId())
			.append("ProgramName",getProgramName())
			.append("IsDelete",getIsDelete())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getProgramId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZdicProgramNameTab == false) return false;
		if(this == obj) return true;
		ZdicProgramNameTab other = (ZdicProgramNameTab)obj;
		return new EqualsBuilder()
			.append(getProgramId(),other.getProgramId())
			.isEquals();
	}
}

