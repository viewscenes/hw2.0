
package com.hw.domain.po;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashSet;
import java.util.Set;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicTaskTypeTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "DicTaskTypeTab";
	public static final String ALIAS_TASK_TYPE_ID = "任务类型id";
	public static final String ALIAS_TYPE = "任务类型";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 任务类型id       db_column: TASK_TYPE_ID 
     */	
	
	private Long taskTypeId;
    /**
     * 任务类型       db_column: TYPE 
     */	
	private String type;
	//columns END

	public DicTaskTypeTab(){
	}

	public DicTaskTypeTab(
		Long taskTypeId
	){
		this.taskTypeId = taskTypeId;
	}

	public void setTaskTypeId(Long value) {
		this.taskTypeId = value;
	}
	
	public Long getTaskTypeId() {
		return this.taskTypeId;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	
	private Set radioUnifyTaskTabs = new HashSet(0);
	public void setRadioUnifyTaskTabs(Set<RadioUnifyTaskTab> radioUnifyTaskTab){
		this.radioUnifyTaskTabs = radioUnifyTaskTab;
	}
	
	public Set<RadioUnifyTaskTab> getRadioUnifyTaskTabs() {
		return radioUnifyTaskTabs;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("TaskTypeId",getTaskTypeId())
			.append("Type",getType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTaskTypeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof DicTaskTypeTab == false) return false;
		if(this == obj) return true;
		DicTaskTypeTab other = (DicTaskTypeTab)obj;
		return new EqualsBuilder()
			.append(getTaskTypeId(),other.getTaskTypeId())
			.isEquals();
	}
}

