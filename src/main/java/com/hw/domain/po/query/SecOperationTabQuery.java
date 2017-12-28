
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class SecOperationTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** operationId */
	private Integer operationId;
	/** 模块名 */
	private String operationName;
	/** 模块描述 */
	private String operationDescription;
	/** 类型 */
	private Integer type;
	/** 父节点id */
	private Integer parentOperationId;
	/** 描述 */
	private String description;
	/** 0为internet子系统，1为数据处理子系统 */
	private Integer broadcastType;
	/** 是否显示 1显示 0不显示 */
	private Integer showFlag;
	/** 菜单显示的名称 */
	private String showName;
	/** 模块对应的swf路径 */
	private String classPath;
	/** 显示的图片 */
	private String iconSource;
	/** 显示的图片2 */
	private String fastIconSource;
	/** 功能类型  1：菜单    2：按钮或其他需要控制的功能   */
	private Long funcType;
    /**用户对应的角色id集合 */
    private List<Integer> roleIdList;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
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

    public List<Integer> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<Integer> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public String getOperationName() {
		return this.operationName;
	}
	
	public void setOperationName(String value) {
		this.operationName = value;
	}
	
	public String getOperationDescription() {
		return this.operationDescription;
	}
	
	public void setOperationDescription(String value) {
		this.operationDescription = value;
	}
	

	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}

	

	
	public String getShowName() {
		return this.showName;
	}
	
	public void setShowName(String value) {
		this.showName = value;
	}
	
	public String getClassPath() {
		return this.classPath;
	}
	
	public void setClassPath(String value) {
		this.classPath = value;
	}
	
	public String getIconSource() {
		return this.iconSource;
	}
	
	public void setIconSource(String value) {
		this.iconSource = value;
	}
	
	public String getFastIconSource() {
		return this.fastIconSource;
	}
	
	public void setFastIconSource(String value) {
		this.fastIconSource = value;
	}
	
	public Long getFuncType() {
		return this.funcType;
	}
	
	public void setFuncType(Long value) {
		this.funcType = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

