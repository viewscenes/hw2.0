
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ResImportdataTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** 文件名称 */
	private String fileName;
	/** 文件路径 */
	private String filePath;
	/** 文件日期  */
	private Date fileDateBegin;
	private Date fileDateEnd;
	/** 文件大小 */
	private Long fileSize;
	/** 导入标志1成功0为成功。 */
	private Long flag;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public void setFileName(String value) {
		this.fileName = value;
	}
	
	public String getFilePath() {
		return this.filePath;
	}
	
	public void setFilePath(String value) {
		this.filePath = value;
	}
	
	public Date getFileDateBegin() {
		return this.fileDateBegin;
	}
	
	public void setFileDateBegin(Date value) {
		this.fileDateBegin = value;
	}	
	
	public Date getFileDateEnd() {
		return this.fileDateEnd;
	}
	
	public void setFileDateEnd(Date value) {
		this.fileDateEnd = value;
	}
	
	public Long getFileSize() {
		return this.fileSize;
	}
	
	public void setFileSize(Long value) {
		this.fileSize = value;
	}
	
	public Long getFlag() {
		return this.flag;
	}
	
	public void setFlag(Long value) {
		this.flag = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

