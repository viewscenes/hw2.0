
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SecUserTabQuery  implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** userId */
	private Long userId;
	/** 登陆名 */
	private String userCode;
	/** 真实姓名 */
	private String userName;
	/** 登陆密码 */
	private String userPassword;
	/** 年龄 */
	private Long age;
	/** 性别1男2女0未指定 */
	private Long sex;
	/** 移动电话 */
	private String mobilephone;
	/** 办公电话 */
	private String telephone;
	/** 地址 */
	private String address;
	/** 职位 */
	private String post;
	/** 说明 */
	private String description;
	/** email */
	private String email;
	/** 权限 */
	private Long priority;
	/** 0未删除1删除 */
	private Long isDelete;

	public SecUserTabQuery(){};

	public Long getUserId() {
		return this.userId;
	}
	
	public void setUserId(Long value) {
		this.userId = value;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	
	public void setUserCode(String value) {
		this.userCode = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	public void setUserPassword(String value) {
		this.userPassword = value;
	}
	
	public Long getAge() {
		return this.age;
	}
	
	public void setAge(Long value) {
		this.age = value;
	}
	
	public Long getSex() {
		return this.sex;
	}
	
	public void setSex(Long value) {
		this.sex = value;
	}
	
	public String getMobilephone() {
		return this.mobilephone;
	}
	
	public void setMobilephone(String value) {
		this.mobilephone = value;
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(String value) {
		this.telephone = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getPost() {
		return this.post;
	}
	
	public void setPost(String value) {
		this.post = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public Long getPriority() {
		return this.priority;
	}
	
	public void setPriority(Long value) {
		this.priority = value;
	}
	
	public Long getIsDelete() {
		return this.isDelete;
	}
	
	public void setIsDelete(Long value) {
		this.isDelete = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

