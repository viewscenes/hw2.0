
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


public class SecOperationTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * operationId       db_column: OPERATION_ID 
     */	
	
	private Integer operationId;
    /**
     * 模块名       db_column: OPERATION_NAME 
     */	
	private String operationName;
    /**
     * 模块描述       db_column: OPERATION_DESCRIPTION 
     */	
	private String operationDescription;
    /**
     * 类型       db_column: TYPE 
     */	
	
	private Integer type;
    /**
     * 父节点id       db_column: PARENT_OPERATION_ID 
     */	
	
	private Integer parentOperationId;
    /**
     * 描述       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 0为internet子系统，1为数据处理子系统       db_column: BROADCAST_TYPE 
     */	
	private Integer broadcastType;
    /**
     * 是否显示 1显示 0不显示       db_column: SHOW_FLAG 
     */	
	
	private Integer showFlag;
    /**
     * 菜单显示的名称       db_column: SHOW_NAME 
     */	
	private String showName;
    /**
     * 模块对应的url路径       db_column: CLASS_PATH
     */	
	private String classPath;
    /**
     * 显示的图片       db_column: ICON_SOURCE 
     */	
	private String iconSource;
    /**
     * 显示的图片2       db_column: FAST_ICON_SOURCE 
     */	
	private String fastIconSource;
    /**
     * 功能类型  1级菜单，2级菜单，3级菜单，4级菜单
     */	
	
	private Integer funcType;
	//columns END

	public SecOperationTab(){
	}


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentOperationId() {
        return parentOperationId;
    }

    public void setParentOperationId(Integer parentOperationId) {
        this.parentOperationId = parentOperationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBroadcastType() {
        return broadcastType;
    }

    public void setBroadcastType(Integer broadcastType) {
        this.broadcastType = broadcastType;
    }

    public Integer getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(Integer showFlag) {
        this.showFlag = showFlag;
    }

    public String getFastIconSource() {
        return fastIconSource;
    }

    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    public void setShowName(String value) {
		this.showName = value;
	}
	
	public String getShowName() {
		return this.showName;
	}
	public void setClassPath(String value) {
		this.classPath = value;
	}
	
	public String getClassPath() {
		return this.classPath;
	}
	public void setIconSource(String value) {
		this.iconSource = value;
	}
	
	public String getIconSource() {
		return this.iconSource;
	}
	public void setFastIconSource(String value) {
		this.fastIconSource = value;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("OperationId",getOperationId())
			.append("OperationName",getOperationName())
			.append("OperationDescription",getOperationDescription())
			.append("Type",getType())
			.append("ParentOperationId",getParentOperationId())
			.append("Description",getDescription())
			.append("BroadcastType",getBroadcastType())
			.append("ShowFlag",getShowFlag())
			.append("ShowName",getShowName())
			.append("ClassPath",getClassPath())
			.append("IconSource",getIconSource())
			.append("FastIconSource",getFastIconSource())
			.append("FuncType",getFuncType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getOperationId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SecOperationTab == false) return false;
		if(this == obj) return true;
		SecOperationTab other = (SecOperationTab)obj;
		return new EqualsBuilder()
			.append(getOperationId(),other.getOperationId())
			.isEquals();
	}
}

