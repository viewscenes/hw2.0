
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicHeadendManufacturerTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 厂商版本名称，非厂商名称 */
	private String manufacturerName;
	/** 版本 */
	private String version;
	/** 设备类型 */
	private Long headendType;
	/** 接收机id */
	private String receiverList;
	/** 电池电压下限 */
	private Long upsLowerPower;
	/** 备注 */
	private String remark;
	/** 接收机名称 */
	private String receiverNameList;
	/** 接收机code */
	private String receiverCodeList;
	/** 关联厂商字典表id */
	private Long manufacturerId;
	/** 关联接口版本字典id */
	private Long versionId;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getManufacturerName() {
		return this.manufacturerName;
	}
	
	public void setManufacturerName(String value) {
		this.manufacturerName = value;
	}
	
	public String getVersion() {
		return this.version;
	}
	
	public void setVersion(String value) {
		this.version = value;
	}
	
	public Long getHeadendType() {
		return this.headendType;
	}
	
	public void setHeadendType(Long value) {
		this.headendType = value;
	}
	
	public String getReceiverList() {
		return this.receiverList;
	}
	
	public void setReceiverList(String value) {
		this.receiverList = value;
	}
	
	public Long getUpsLowerPower() {
		return this.upsLowerPower;
	}
	
	public void setUpsLowerPower(Long value) {
		this.upsLowerPower = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getReceiverNameList() {
		return this.receiverNameList;
	}
	
	public void setReceiverNameList(String value) {
		this.receiverNameList = value;
	}
	
	public String getReceiverCodeList() {
		return this.receiverCodeList;
	}
	
	public void setReceiverCodeList(String value) {
		this.receiverCodeList = value;
	}
	
	public Long getManufacturerId() {
		return this.manufacturerId;
	}
	
	public void setManufacturerId(Long value) {
		this.manufacturerId = value;
	}
	
	public Long getVersionId() {
		return this.versionId;
	}
	
	public void setVersionId(Long value) {
		this.versionId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

