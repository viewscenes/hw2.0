
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


public class ZrstRepEquipmentTab  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZrstRepEquipmentTab";
	public static final String ALIAS_DATA_ID = "dataId";
	public static final String ALIAS_REPORT_ID = "reportId";
	public static final String ALIAS_HEAD_NAME = "headName";
	public static final String ALIAS_HEAD_CODE = "headCode";
	public static final String ALIAS_STARTTIME = "starttime";
	public static final String ALIAS_ENDTIME = "endtime";
	public static final String ALIAS_COUNT = "count";
	public static final String ALIAS_TYPE = "type";
	public static final String ALIAS_TYPE_NAME = "typeName";
	public static final String ALIAS_HANDLE = "handle";
	public static final String ALIAS_HANDLE2 = "handle2";
	public static final String ALIAS_REMARK = "remark";
	public static final String ALIAS_IS_DELETE = "isDelete";
	public static final String ALIAS_EQU = "equ";
	public static final String ALIAS_ADVICE = "advice";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * dataId       db_column: DATA_ID 
     */	
	
	private Long dataId;
    /**
     * reportId       db_column: REPORT_ID 
     */	
	
	private Long reportId;
    /**
     * headName       db_column: HEAD_NAME 
     */	
	private String headName;
    /**
     * headCode       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * starttime       db_column: STARTTIME 
     */	
	
	private Date starttime;
    /**
     * endtime       db_column: ENDTIME 
     */	
	
	private Date endtime;
    /**
     * count       db_column: COUNT 
     */	
	private String count;
    /**
     * type       db_column: TYPE 
     */	
	private String type;
    /**
     * typeName       db_column: TYPE_NAME 
     */	
	private String typeName;
    /**
     * handle       db_column: HANDLE 
     */	
	private String handle;
    /**
     * handle2       db_column: HANDLE2 
     */	
	private String handle2;
    /**
     * remark       db_column: REMARK 
     */	
	private String remark;
    /**
     * isDelete       db_column: IS_DELETE 
     */	
	
	private Long isDelete;
    /**
     * equ       db_column: EQU 
     */	
	private String equ;
    /**
     * advice       db_column: ADVICE 
     */	
	private String advice;
	//columns END

	public ZrstRepEquipmentTab(){
	}

	public ZrstRepEquipmentTab(
		Long dataId
	){
		this.dataId = dataId;
	}

	public void setDataId(Long value) {
		this.dataId = value;
	}
	
	public Long getDataId() {
		return this.dataId;
	}
	public void setReportId(Long value) {
		this.reportId = value;
	}
	
	public Long getReportId() {
		return this.reportId;
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


	
	public void setStarttime(Date value) {
		this.starttime = value;
	}
	
	public Date getStarttime() {
		return this.starttime;
	}


	public void setEndtime(Date value) {
		this.endtime = value;
	}
	
	public Date getEndtime() {
		return this.endtime;
	}
	public void setCount(String value) {
		this.count = value;
	}
	
	public String getCount() {
		return this.count;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	public void setTypeName(String value) {
		this.typeName = value;
	}
	
	public String getTypeName() {
		return this.typeName;
	}
	public void setHandle(String value) {
		this.handle = value;
	}
	
	public String getHandle() {
		return this.handle;
	}
	public void setHandle2(String value) {
		this.handle2 = value;
	}
	
	public String getHandle2() {
		return this.handle2;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	public void setEqu(String value) {
		this.equ = value;
	}
	
	public String getEqu() {
		return this.equ;
	}
	public void setAdvice(String value) {
		this.advice = value;
	}
	
	public String getAdvice() {
		return this.advice;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("DataId",getDataId())
			.append("ReportId",getReportId())
			.append("HeadName",getHeadName())
			.append("HeadCode",getHeadCode())
			.append("Starttime",getStarttime())
			.append("Endtime",getEndtime())
			.append("Count",getCount())
			.append("Type",getType())
			.append("TypeName",getTypeName())
			.append("Handle",getHandle())
			.append("Handle2",getHandle2())
			.append("Remark",getRemark())
			.append("IsDelete",getIsDelete())
			.append("Equ",getEqu())
			.append("Advice",getAdvice())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDataId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZrstRepEquipmentTab == false) return false;
		if(this == obj) return true;
		ZrstRepEquipmentTab other = (ZrstRepEquipmentTab)obj;
		return new EqualsBuilder()
			.append(getDataId(),other.getDataId())
			.isEquals();
	}
}

