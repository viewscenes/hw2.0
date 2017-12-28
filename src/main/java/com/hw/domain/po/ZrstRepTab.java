
package com.hw.domain.po;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * reportId       db_column: REPORT_ID 
     */	
	
	private Integer reportId;
    /**
     * 创建报表日期       db_column: REPORT_DATE 
     */	
	
	private Date reportDate;
    /**
     * 报表类型       db_column: REPORT_TYPE 
     */	
	
	private Integer reportType;
    /**
     * 报表方式：1日报，2周报，3月报，4季报，5年报，6其他       db_column: PERIOD_TYPE 
     */	
	
	private Integer periodType;
    /**
     * 开始时间       db_column: START_DATETIME 
     */	
	
	private Date startDatetime;
    /**
     * 结束时间       db_column: END_DATETIME 
     */	
	
	private Date endDatetime;
    /**
     * character       db_column: CHARACTER 
     */	
	private String character;
    /**
     * 条目数       db_column: DATA_NUM 
     */	
	
	private Integer dataNum;
    /**
     * 修改状态：0，未修改1，修改       db_column: MODIFY_STATUS 
     */	
	
	private Integer modifyStatus;
    /**
     * 修改人       db_column: MODIFY_USER 
     */	
	private String modifyUser;
    /**
     * 修改日期       db_column: MODIFY_DATETIME 
     */	
	
	private Date modifyDatetime;
    /**
     * 导入状态：0，未导入1，导入       db_column: IMPORT_STATUS 
     */	
	
	private Integer importStatus;
    /**
     * 导入人       db_column: IMPORT_USER 
     */	
	private String importUser;
    /**
     * 导入日期       db_column: IMPORT_DATETIME 
     */	
	
	private Date importDatetime;
    /**
     * 校对状态：0，未校对1，校对       db_column: VERIFY_STATUS 
     */	
	
	private Integer verifyStatus;
    /**
     * 校对人       db_column: VERIFY_USER 
     */	
	private String verifyUser;
    /**
     * 校对时间       db_column: VERIFY_DATETIME 
     */	
	
	private Date verifyDatetime;
    /**
     * 审核状态：0，未审核1，审核       db_column: AUTHENTIC_STATUS 
     */	
	
	private Integer authenticStatus;
    /**
     * 审核人       db_column: AUTHENTIC_USER 
     */	
	private String authenticUser;
    /**
     * 审核时间       db_column: AUTHENTIC_DATETIME 
     */	
	
	private Date authenticDatetime;
    /**
     * 备注       db_column: REMARK 
     */	
	private String remark;
    /**
     * 统计表名；
     */
    private String tabName;
	//columns END

	public ZrstRepTab(){
	}

	public ZrstRepTab(
		Integer reportId
	){
		this.reportId = reportId;
	}

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public void setReportId(Integer value) {
		this.reportId = value;
	}
	
	public Integer getReportId() {
		return this.reportId;
	}

	
	public void setReportDate(Date value) {
		this.reportDate = value;
	}
	
	public Date getReportDate() {
		return this.reportDate;
	}
	public void setReportType(Integer value) {
		this.reportType = value;
	}
	
	public Integer getReportType() {
		return this.reportType;
	}
	public void setPeriodType(Integer value) {
		this.periodType = value;
	}
	
	public Integer getPeriodType() {
		return this.periodType;
	}

	
	public void setStartDatetime(Date value) {
		this.startDatetime = value;
	}
	
	public Date getStartDatetime() {
		return this.startDatetime;
	}

	
	public void setEndDatetime(Date value) {
		this.endDatetime = value;
	}
	
	public Date getEndDatetime() {
		return this.endDatetime;
	}
	public void setCharacter(String value) {
		this.character = value;
	}
	
	public String getCharacter() {
		return this.character;
	}
	public void setDataNum(Integer value) {
		this.dataNum = value;
	}
	
	public Integer getDataNum() {
		return this.dataNum;
	}
	public void setModifyStatus(Integer value) {
		this.modifyStatus = value;
	}
	
	public Integer getModifyStatus() {
		return this.modifyStatus;
	}
	public void setModifyUser(String value) {
		this.modifyUser = value;
	}
	
	public String getModifyUser() {
		return this.modifyUser;
	}

	public void setModifyDatetime(Date value) {
		this.modifyDatetime = value;
	}
	
	public Date getModifyDatetime() {
		return this.modifyDatetime;
	}
	public void setImportStatus(Integer value) {
		this.importStatus = value;
	}
	
	public Integer getImportStatus() {
		return this.importStatus;
	}
	public void setImportUser(String value) {
		this.importUser = value;
	}
	
	public String getImportUser() {
		return this.importUser;
	}

	
	public void setImportDatetime(Date value) {
		this.importDatetime = value;
	}
	
	public Date getImportDatetime() {
		return this.importDatetime;
	}
	public void setVerifyStatus(Integer value) {
		this.verifyStatus = value;
	}
	
	public Integer getVerifyStatus() {
		return this.verifyStatus;
	}
	public void setVerifyUser(String value) {
		this.verifyUser = value;
	}
	
	public String getVerifyUser() {
		return this.verifyUser;
	}

	
	public void setVerifyDatetime(Date value) {
		this.verifyDatetime = value;
	}
	
	public Date getVerifyDatetime() {
		return this.verifyDatetime;
	}
	public void setAuthenticStatus(Integer value) {
		this.authenticStatus = value;
	}
	
	public Integer getAuthenticStatus() {
		return this.authenticStatus;
	}
	public void setAuthenticUser(String value) {
		this.authenticUser = value;
	}
	
	public String getAuthenticUser() {
		return this.authenticUser;
	}

	
	public void setAuthenticDatetime(Date value) {
		this.authenticDatetime = value;
	}
	
	public Date getAuthenticDatetime() {
		return this.authenticDatetime;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

}

