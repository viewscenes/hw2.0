
package com.hw.domain.po;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class DicSeasonTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键id       db_column: id
     */
    private Integer id;
    /**
     * 季节代号       db_column: CODE 
     */	
	private String code;
    /**
     * 开始时间       db_column: START_TIME 
     */	
	
	private Date startTime;
    /**
     * 结束时间       db_column: END_TIME 
     */	
	
	private Date endTime;
    /**
     * 是否当前       db_column: IS_NOW 
     */	

    private String startTimeString;
    private String endTimeString;
	private Boolean isNow;
	//columns END

	public DicSeasonTab(){
	}

	public DicSeasonTab(
		String code
	){
		this.code = code;
	}

	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}

    public String getStartTimeString() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(this.getStartTime());
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public String getEndTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(this.getStartTime());
    }

    public void setEndTimeString(String endTimeString) {
        this.endTimeString = endTimeString;
    }

    public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public void setIsNow(Boolean value) {
		this.isNow = value;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsNow() {
        return  !this.isNow;
	}


}

