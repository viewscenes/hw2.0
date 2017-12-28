
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


public class DicHeadendManufacturerTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicHeadendManufacturerTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MANUFACTURER_NAME = "厂商版本名称，非厂商名称";
	public static final String ALIAS_VERSION = "版本";
	public static final String ALIAS_HEADEND_TYPE = "设备类型";
	public static final String ALIAS_RECEIVER_LIST = "接收机id";
	public static final String ALIAS_UPS_LOWER_POWER = "电池电压下限";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_RECEIVER_NAME_LIST = "接收机名称";
	public static final String ALIAS_RECEIVER_CODE_LIST = "接收机code";
	public static final String ALIAS_MANUFACTURER_ID = "关联厂商字典表id";
	public static final String ALIAS_VERSION_ID = "关联接口版本字典id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 厂商版本名称，非厂商名称       db_column: MANUFACTURER_NAME 
     */	
	private String manufacturerName;
    /**
     * 版本       db_column: VERSION 
     */	
	private String version;
    /**
     * 设备类型       db_column: HEADEND_TYPE 
     */	
	private Long headendType;
    /**
     * 接收机id       db_column: RECEIVER_LIST 
     */	
	private String receiverList;
    /**
     * 电池电压下限       db_column: UPS_LOWER_POWER 
     */	
	private Long upsLowerPower;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
    /**
     * 接收机名称       db_column: RECEIVER_NAME_LIST 
     */	
	private String receiverNameList;
    /**
     * 接收机code       db_column: RECEIVER_CODE_LIST 
     */	
	private String receiverCodeList;
    /**
     * 关联厂商字典表id       db_column: MANUFACTURER_ID 
     */	
	
	private Long manufacturerId;
    /**
     * 关联接口版本字典id       db_column: VERSION_ID 
     */	
	
	private Long versionId;
	//columns END

	public DicHeadendManufacturerTab(){
	}

	public DicHeadendManufacturerTab(
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
	public void setManufacturerName(String value) {
		this.manufacturerName = value;
	}
	
	public String getManufacturerName() {
		return this.manufacturerName;
	}
	public void setVersion(String value) {
		this.version = value;
	}
	
	public String getVersion() {
		return this.version;
	}
	public void setHeadendType(Long value) {
		this.headendType = value;
	}
	
	public Long getHeadendType() {
		return this.headendType;
	}
	public void setReceiverList(String value) {
		this.receiverList = value;
	}
	
	public String getReceiverList() {
		return this.receiverList;
	}
	public void setUpsLowerPower(Long value) {
		this.upsLowerPower = value;
	}
	
	public Long getUpsLowerPower() {
		return this.upsLowerPower;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setReceiverNameList(String value) {
		this.receiverNameList = value;
	}
	
	public String getReceiverNameList() {
		return this.receiverNameList;
	}
	public void setReceiverCodeList(String value) {
		this.receiverCodeList = value;
	}
	
	public String getReceiverCodeList() {
		return this.receiverCodeList;
	}
	public void setManufacturerId(Long value) {
		this.manufacturerId = value;
	}
	
	public Long getManufacturerId() {
		return this.manufacturerId;
	}
	public void setVersionId(Long value) {
		this.versionId = value;
	}
	
	public Long getVersionId() {
		return this.versionId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ManufacturerName",getManufacturerName())
			.append("Version",getVersion())
			.append("HeadendType",getHeadendType())
			.append("ReceiverList",getReceiverList())
			.append("UpsLowerPower",getUpsLowerPower())
			.append("Remark",getRemark())
			.append("ReceiverNameList",getReceiverNameList())
			.append("ReceiverCodeList",getReceiverCodeList())
			.append("ManufacturerId",getManufacturerId())
			.append("VersionId",getVersionId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicHeadendManufacturerTab == false) return false;
		if(this == obj) return true;
		DicHeadendManufacturerTab other = (DicHeadendManufacturerTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

