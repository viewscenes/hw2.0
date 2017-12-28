
package com.hw.domain.po.query;



import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ZrstRepTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** reportId */
	private Integer reportId;
	/** 创建报表日期 */
	private Date reportDate;
	/** 报表类型 */
	private Integer reportType;
	/** 报表方式：1日报，2周报，3月报，4季报，5年报，6其他 */
	private Integer periodType;
	/** 开始时间 */
	private Date startDatetime;
	/** 结束时间 */
	private Date endDatetime;
	/** character */
	private String character;
	/** 条目数 */
	private Integer dataNum;
	/** 修改状态：0，未修改1，修改 */
	private Integer modifyStatus;
	/** 修改人 */
	private String modifyUser;
	/** 修改日期 */
	private Date modifyDatetime;
	/** 导入状态：0，未导入1，导入 */
	private Integer importStatus;
	/** 导入人 */
	private String importUser;
	/** 导入日期 */
	private Date importDatetime;
	/** 校对状态：0，未校对1，校对 */
	private Integer verifyStatus;
	/** 校对人 */
	private String verifyUser;
	/** 校对时间 */
	private Date verifyDatetime;
	/** 审核状态：0，未审核1，审核 */
	private Integer authenticStatus;
	/** 审核人 */
	private String authenticUser;
	/** 审核时间 */
	private Date authenticDatetime;
	/** 备注 */
	private String remark;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Integer getDataNum() {
        return dataNum;
    }

    public void setDataNum(Integer dataNum) {
        this.dataNum = dataNum;
    }

    public Integer getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(Integer modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public Integer getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(Integer importStatus) {
        this.importStatus = importStatus;
    }

    public String getImportUser() {
        return importUser;
    }

    public void setImportUser(String importUser) {
        this.importUser = importUser;
    }

    public Date getImportDatetime() {
        return importDatetime;
    }

    public void setImportDatetime(Date importDatetime) {
        this.importDatetime = importDatetime;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getVerifyUser() {
        return verifyUser;
    }

    public void setVerifyUser(String verifyUser) {
        this.verifyUser = verifyUser;
    }

    public Date getVerifyDatetime() {
        return verifyDatetime;
    }

    public void setVerifyDatetime(Date verifyDatetime) {
        this.verifyDatetime = verifyDatetime;
    }

    public Integer getAuthenticStatus() {
        return authenticStatus;
    }

    public void setAuthenticStatus(Integer authenticStatus) {
        this.authenticStatus = authenticStatus;
    }

    public String getAuthenticUser() {
        return authenticUser;
    }

    public void setAuthenticUser(String authenticUser) {
        this.authenticUser = authenticUser;
    }

    public Date getAuthenticDatetime() {
        return authenticDatetime;
    }

    public void setAuthenticDatetime(Date authenticDatetime) {
        this.authenticDatetime = authenticDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

