
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


public class RadioEquInstallTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RadioEquInstallTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HEAD_ID = "站点id";
	public static final String ALIAS_HEAD_NAME = "站点名称";
	public static final String ALIAS_HEAD_CODE = "站点代码";
	public static final String ALIAS_EQU_NAME = "设备名称";
	public static final String ALIAS_EQU_ID = "设备编号";
	public static final String ALIAS_STATUS = "设备状态(0:使用,1:备用,2:可修复,3:报废)";
	public static final String ALIAS_MAIL_TIME = "邮寄时间";
	public static final String ALIAS_ORDER_NO = "邮件单号";
	public static final String ALIAS_SAVE_PLACE = "设备存放地点:0站点保存,1使馆寄存";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 站点id       db_column: HEAD_ID 
     */	
	
	private Long headId;
    /**
     * 站点名称       db_column: HEAD_NAME 
     */	
	private String headName;
    /**
     * 站点代码       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 设备名称       db_column: EQU_NAME 
     */	
	private String equName;
    /**
     * 设备编号       db_column: EQU_ID 
     */	
	private String equId;
    /**
     * 设备状态(0:使用,1:备用,2:可修复,3:报废)       db_column: STATUS 
     */	
	
	private Long status;
    /**
     * 邮寄时间       db_column: MAIL_TIME 
     */	
	
	private Date mailTime;
    /**
     * 邮件单号       db_column: ORDER_NO 
     */	
	private String orderNo;
    /**
     * 设备存放地点:0站点保存,1使馆寄存       db_column: SAVE_PLACE 
     */	
	private String savePlace;
	//columns END

	public RadioEquInstallTab(){
	}

	public RadioEquInstallTab(
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
	public void setHeadId(Long value) {
		this.headId = value;
	}
	
	public Long getHeadId() {
		return this.headId;
	}
	public void setHeadName(String value) {
		this.headName = value;
	}
	
	public String getHeadName() {
		return this.headName;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setEquName(String value) {
		this.equName = value;
	}
	
	public String getEquName() {
		return this.equName;
	}
	public void setEquId(String value) {
		this.equId = value;
	}
	
	public String getEquId() {
		return this.equId;
	}
	public void setStatus(Long value) {
		this.status = value;
	}
	
	public Long getStatus() {
		return this.status;
	}

	
	public void setMailTime(Date value) {
		this.mailTime = value;
	}
	
	public Date getMailTime() {
		return this.mailTime;
	}
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	public String getOrderNo() {
		return this.orderNo;
	}
	public void setSavePlace(String value) {
		this.savePlace = value;
	}
	
	public String getSavePlace() {
		return this.savePlace;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("HeadId",getHeadId())
			.append("HeadName",getHeadName())
			.append("HeadCode",getHeadCode())
			.append("EquName",getEquName())
			.append("EquId",getEquId())
			.append("Status",getStatus())
			.append("MailTime",getMailTime())
			.append("OrderNo",getOrderNo())
			.append("SavePlace",getSavePlace())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RadioEquInstallTab == false) return false;
		if(this == obj) return true;
		RadioEquInstallTab other = (RadioEquInstallTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

