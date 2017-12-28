
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


public class SecUserTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

    /**
     * userId       db_column: USER_ID 
     */	
	
	private Integer userId;
    /**
     * 登陆名       db_column: USER_CODE 
     */	
	private String userCode;
    /**
     * 真实姓名       db_column: USER_NAME 
     */	
	private String userName;
    /**
     * 登陆密码       db_column: USER_PASSWORD 
     */	
	private String userPassword;
    /**
     * 年龄       db_column: AGE 
     */	
	
	private Integer age;
    /**
     * 性别1男2女0未指定       db_column: SEX 
     */	
	
	private Integer sex;
    /**
     * 移动电话       db_column: MOBILEPHONE 
     */	
	private String mobilephone;
    /**
     * 办公电话       db_column: TELEPHONE 
     */	
	private String telephone;
    /**
     * 地址       db_column: ADDRESS 
     */	
	private String address;
    /**
     * 职位       db_column: POST 
     */	
	private String post;
    /**
     * 说明       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * email       db_column: EMAIL 
     */	
	private String email;
    /**
     * 权限       db_column: PRIORITY 
     */	
	
	private Integer priority;
    /**
     * 0未删除1删除       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
	//columns END

	public SecUserTab(){
	}

	public SecUserTab(
		Integer userId
	){
		this.userId = userId;
	}

	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	public void setUserCode(String value) {
		this.userCode = value;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserPassword(String value) {
		this.userPassword = value;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	public void setAge(Integer value) {
		this.age = value;
	}
	
	public Integer getAge() {
		return this.age;
	}
	public void setSex(Integer value) {
		this.sex = value;
	}
	
	public Integer getSex() {
		return this.sex;
	}
	public void setMobilephone(String value) {
		this.mobilephone = value;
	}
	
	public String getMobilephone() {
		return this.mobilephone;
	}
	public void setTelephone(String value) {
		this.telephone = value;
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setPost(String value) {
		this.post = value;
	}
	
	public String getPost() {
		return this.post;
	}
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setPriority(Integer value) {
		this.priority = value;
	}
	
	public Integer getPriority() {
		return this.priority;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
			.append("UserId",getUserId())
			.append("UserCode",getUserCode())
			.append("UserName",getUserName())
			.append("UserPassword",getUserPassword())
			.append("Age",getAge())
			.append("Sex",getSex())
			.append("Mobilephone",getMobilephone())
			.append("Telephone",getTelephone())
			.append("Address",getAddress())
			.append("Post",getPost())
			.append("Description",getDescription())
			.append("Email",getEmail())
			.append("Priority",getPriority())
			.append("IsDelete",getIsDelete())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecUserTab == false) return false;
		if(this == obj) return true;
		SecUserTab other = (SecUserTab)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.isEquals();
	}
}

