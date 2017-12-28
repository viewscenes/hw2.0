
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SysAsrRunConfigTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SysAsrRunConfigTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_IP = "ip";
	public static final String ALIAS_STATUS = "status";
	public static final String ALIAS_LASTRUNTIME = "lastruntime";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * ip       db_column: IP 
     */	
	private String ip;
    /**
     * status       db_column: STATUS 
     */	
	private String status;
    /**
     * lastruntime       db_column: LASTRUNTIME 
     */	
	
	private Date lastruntime;
	//columns END

	public SysAsrRunConfigTab(){
	}

	public SysAsrRunConfigTab(
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
	public void setIp(String value) {
		this.ip = value;
	}
	
	public String getIp() {
		return this.ip;
	}
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return this.status;
	}

	
	public void setLastruntime(Date value) {
		this.lastruntime = value;
	}
	
	public Date getLastruntime() {
		return this.lastruntime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Ip",getIp())
			.append("Status",getStatus())
			.append("Lastruntime",getLastruntime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SysAsrRunConfigTab == false) return false;
		if(this == obj) return true;
		SysAsrRunConfigTab other = (SysAsrRunConfigTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

