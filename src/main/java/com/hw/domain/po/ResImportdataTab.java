
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


public class ResImportdataTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResImportdataTab";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_FILE_NAME = "文件名称";
	public static final String ALIAS_FILE_PATH = "文件路径";
	public static final String ALIAS_FILE_DATE = "文件日期 ";
	public static final String ALIAS_FILE_SIZE = "文件大小";
	public static final String ALIAS_FLAG = "导入标志1成功0为成功。";
	
	//date formats

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 文件名称       db_column: FILE_NAME 
     */	
	private String fileName;
    /**
     * 文件路径       db_column: FILE_PATH 
     */	
	private String filePath;
    /**
     * 文件日期        db_column: FILE_DATE 
     */	
	
	private Date fileDate;
    /**
     * 文件大小       db_column: FILE_SIZE 
     */	
	
	private Long fileSize;
    /**
     * 导入标志1成功0为成功。       db_column: FLAG 
     */	
	
	private Long flag;
	//columns END

	public ResImportdataTab(){
	}

	public ResImportdataTab(
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
	public void setFileName(String value) {
		this.fileName = value;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	public void setFilePath(String value) {
		this.filePath = value;
	}
	
	public String getFilePath() {
		return this.filePath;
	}

	
	public void setFileDate(Date value) {
		this.fileDate = value;
	}
	
	public Date getFileDate() {
		return this.fileDate;
	}
	public void setFileSize(Long value) {
		this.fileSize = value;
	}
	
	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFlag(Long value) {
		this.flag = value;
	}
	
	public Long getFlag() {
		return this.flag;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("FileName",getFileName())
			.append("FilePath",getFilePath())
			.append("FileDate",getFileDate())
			.append("FileSize",getFileSize())
			.append("Flag",getFlag())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ResImportdataTab == false) return false;
		if(this == obj) return true;
		ResImportdataTab other = (ResImportdataTab)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

