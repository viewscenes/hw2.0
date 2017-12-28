
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


public class SysAsrRunConfigTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private Long id;
	/** ip */
	private String ip;
	/** status */
	private String status;
	/** lastruntime */
	private Date lastruntimeBegin;
	private Date lastruntimeEnd;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getIp() {
		return this.ip;
	}
	
	public void setIp(String value) {
		this.ip = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public Date getLastruntimeBegin() {
		return this.lastruntimeBegin;
	}
	
	public void setLastruntimeBegin(Date value) {
		this.lastruntimeBegin = value;
	}	
	
	public Date getLastruntimeEnd() {
		return this.lastruntimeEnd;
	}
	
	public void setLastruntimeEnd(Date value) {
		this.lastruntimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

