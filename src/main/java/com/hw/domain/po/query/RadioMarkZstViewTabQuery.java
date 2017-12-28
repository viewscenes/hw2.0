
package com.hw.domain.po.query;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioMarkZstViewTabQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 打分id */
	private Long markId;
	/** 打分人 */
	private String markUser;
	/** 打分时间 */
	private Date markDatetimeBegin;
	private Date markDatetimeEnd;
	/** 设备code */
	private String headCode;
	/** 接收机 */
	private String equCode;
	/** 频率 */
	private Long frequency;
	/** 运行图id */
	private Long runplanId;
	/** I */
	private Long counti;
	/** o */
	private Long counto;
	/** s */
	private Long counts;
	/** 干扰类型 */
	private String description;
	/** 打分类型 1:实时,2录音 */
	private String markType;
	/** 修改人 */
	private String editUser;
	/** 打分单元 */
	private String unit;
	/** 录音文件路径 */
	private String markFileUrl;
	/** 录音文件原始名称 */
    private String fileName;

    /** 录音文件原始名称 */
    private List<String> fileNameList;
	/** 录音长度（秒） */
	private String fileLength;
	/** 录音开始时间 */
	private String recordStartTime;
	/** 录音结束时间 */
	private String recordEndTime;
	/** 发射台id */
	private Long stationId;
	/** 发射台名称 */
	private String stationName;
	/** 前端名称 */
	private String headname;
	/** 播音时间 */
	private String playTime;
	/** 任务id */
	private Long taskId;
	/** 任务名称 */
	private String taskName;
	/** 电平中值 */
	private Long levelValue;
	/** 调制度中值 */
	private Long fmValue;
	/** 调幅度中值 */
	private Long amValue;
	/** 频偏中值 */
	private Long offsetValue;
	/** 备注(可能包含同领频的备注信息) */
	private String remark;
	/** 语音识别类型1 */
	private Long asrType;
	/** 结果类型: BC573 */
	private String resultType;
	/** 停播、空播、话少 */
	private String status;
	/** 语音长度（秒） */
	private Long wavelen;
	/** 音乐比例 */
	private String musicratio;
	/** 噪声比例 */
	private String noiseratio;
	/** 话音长度（秒） */
	private Long speechlen;
	/** 总体置信度 */
	private Long totalcm;
	/** 可听度得分(0-5分)，s(0-5分),i(0-5分）,o(0-5分),如1,2,3 */
	private String audibilityscore;
	/** 可听度置信度（0-100） */
	private Long audibilityconfidence;
	/** 台名识别结果（台名模板名字） */
	private String channelname;
	/** 台名识别置信度(0-100) */
	private Long channelnameconfidence;
	/** 节目比对结果（国际1-21） */
	private String programname;
	/** 节目比对置信度（0-100） */
	private Long programnameconfidence;
	/** 语种模板名字（英 汉） */
	private String languagename1;
	/** 语种模板名字（英 汉） */
	private String languagename2;
	/** 语种模板名字（英 汉） */
	private String languagename3;
	/** 语种模板名字（英 汉） */
	private String languagename4;
	/** 语种模板名字（英 汉） */
	private String languagename5;
	/** 语种模板名字（英 汉） */
	private Long languageconfidence1;
	/** 语种模板名字（英 汉） */
	private Long languageconfidence2;
	/** 语种模板名字（英 汉） */
	private Long languageconfidence3;
	/** 语种模板名字（英 汉） */
	private Long languageconfidence4;
	/** 语种模板名字（英 汉） */
	private Long languageconfidence5;

	public Long getMarkId() {
		return this.markId;
	}
	
	public void setMarkId(Long value) {
		this.markId = value;
	}
	
	public String getMarkUser() {
		return this.markUser;
	}
	
	public void setMarkUser(String value) {
		this.markUser = value;
	}
	
	public Date getMarkDatetimeBegin() {
		return this.markDatetimeBegin;
	}
	
	public void setMarkDatetimeBegin(Date value) {
		this.markDatetimeBegin = value;
	}	
	
	public Date getMarkDatetimeEnd() {
		return this.markDatetimeEnd;
	}
	
	public void setMarkDatetimeEnd(Date value) {
		this.markDatetimeEnd = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getEquCode() {
		return this.equCode;
	}
	
	public void setEquCode(String value) {
		this.equCode = value;
	}
	
	public Long getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(Long value) {
		this.frequency = value;
	}
	
	public Long getRunplanId() {
		return this.runplanId;
	}
	
	public void setRunplanId(Long value) {
		this.runplanId = value;
	}
	
	public Long getCounti() {
		return this.counti;
	}
	
	public void setCounti(Long value) {
		this.counti = value;
	}
	
	public Long getCounto() {
		return this.counto;
	}
	
	public void setCounto(Long value) {
		this.counto = value;
	}
	
	public Long getCounts() {
		return this.counts;
	}
	
	public void setCounts(Long value) {
		this.counts = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getMarkType() {
		return this.markType;
	}
	
	public void setMarkType(String value) {
		this.markType = value;
	}
	
	public String getEditUser() {
		return this.editUser;
	}
	
	public void setEditUser(String value) {
		this.editUser = value;
	}
	
	public String getUnit() {
		return this.unit;
	}
	
	public void setUnit(String value) {
		this.unit = value;
	}
	
	public String getMarkFileUrl() {
		return this.markFileUrl;
	}
	
	public void setMarkFileUrl(String value) {
		this.markFileUrl = value;
	}

    public List<String> getFileNameList() {
        return fileNameList;
    }

    public void setFileNameList(List<String> fileNameList) {
        this.fileNameList = fileNameList;
    }

    public String getFileName() {
		return this.fileName;
	}
	
	public void setFileName(String value) {
		this.fileName = value;
	}
	
	public String getFileLength() {
		return this.fileLength;
	}
	
	public void setFileLength(String value) {
		this.fileLength = value;
	}
	
	public String getRecordStartTime() {
		return this.recordStartTime;
	}
	
	public void setRecordStartTime(String value) {
		this.recordStartTime = value;
	}
	
	public String getRecordEndTime() {
		return this.recordEndTime;
	}
	
	public void setRecordEndTime(String value) {
		this.recordEndTime = value;
	}
	
	public Long getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Long value) {
		this.stationId = value;
	}
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	public String getHeadname() {
		return this.headname;
	}
	
	public void setHeadname(String value) {
		this.headname = value;
	}
	
	public String getPlayTime() {
		return this.playTime;
	}
	
	public void setPlayTime(String value) {
		this.playTime = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public void setTaskName(String value) {
		this.taskName = value;
	}
	
	public Long getLevelValue() {
		return this.levelValue;
	}
	
	public void setLevelValue(Long value) {
		this.levelValue = value;
	}
	
	public Long getFmValue() {
		return this.fmValue;
	}
	
	public void setFmValue(Long value) {
		this.fmValue = value;
	}
	
	public Long getAmValue() {
		return this.amValue;
	}
	
	public void setAmValue(Long value) {
		this.amValue = value;
	}
	
	public Long getOffsetValue() {
		return this.offsetValue;
	}
	
	public void setOffsetValue(Long value) {
		this.offsetValue = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public Long getAsrType() {
		return this.asrType;
	}
	
	public void setAsrType(Long value) {
		this.asrType = value;
	}
	
	public String getResultType() {
		return this.resultType;
	}
	
	public void setResultType(String value) {
		this.resultType = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public Long getWavelen() {
		return this.wavelen;
	}
	
	public void setWavelen(Long value) {
		this.wavelen = value;
	}
	
	public String getMusicratio() {
		return this.musicratio;
	}
	
	public void setMusicratio(String value) {
		this.musicratio = value;
	}
	
	public String getNoiseratio() {
		return this.noiseratio;
	}
	
	public void setNoiseratio(String value) {
		this.noiseratio = value;
	}
	
	public Long getSpeechlen() {
		return this.speechlen;
	}
	
	public void setSpeechlen(Long value) {
		this.speechlen = value;
	}
	
	public Long getTotalcm() {
		return this.totalcm;
	}
	
	public void setTotalcm(Long value) {
		this.totalcm = value;
	}
	
	public String getAudibilityscore() {
		return this.audibilityscore;
	}
	
	public void setAudibilityscore(String value) {
		this.audibilityscore = value;
	}
	
	public Long getAudibilityconfidence() {
		return this.audibilityconfidence;
	}
	
	public void setAudibilityconfidence(Long value) {
		this.audibilityconfidence = value;
	}
	
	public String getChannelname() {
		return this.channelname;
	}
	
	public void setChannelname(String value) {
		this.channelname = value;
	}
	
	public Long getChannelnameconfidence() {
		return this.channelnameconfidence;
	}
	
	public void setChannelnameconfidence(Long value) {
		this.channelnameconfidence = value;
	}
	
	public String getProgramname() {
		return this.programname;
	}
	
	public void setProgramname(String value) {
		this.programname = value;
	}
	
	public Long getProgramnameconfidence() {
		return this.programnameconfidence;
	}
	
	public void setProgramnameconfidence(Long value) {
		this.programnameconfidence = value;
	}
	
	public String getLanguagename1() {
		return this.languagename1;
	}
	
	public void setLanguagename1(String value) {
		this.languagename1 = value;
	}
	
	public String getLanguagename2() {
		return this.languagename2;
	}
	
	public void setLanguagename2(String value) {
		this.languagename2 = value;
	}
	
	public String getLanguagename3() {
		return this.languagename3;
	}
	
	public void setLanguagename3(String value) {
		this.languagename3 = value;
	}
	
	public String getLanguagename4() {
		return this.languagename4;
	}
	
	public void setLanguagename4(String value) {
		this.languagename4 = value;
	}
	
	public String getLanguagename5() {
		return this.languagename5;
	}
	
	public void setLanguagename5(String value) {
		this.languagename5 = value;
	}
	
	public Long getLanguageconfidence1() {
		return this.languageconfidence1;
	}
	
	public void setLanguageconfidence1(Long value) {
		this.languageconfidence1 = value;
	}
	
	public Long getLanguageconfidence2() {
		return this.languageconfidence2;
	}
	
	public void setLanguageconfidence2(Long value) {
		this.languageconfidence2 = value;
	}
	
	public Long getLanguageconfidence3() {
		return this.languageconfidence3;
	}
	
	public void setLanguageconfidence3(Long value) {
		this.languageconfidence3 = value;
	}
	
	public Long getLanguageconfidence4() {
		return this.languageconfidence4;
	}
	
	public void setLanguageconfidence4(Long value) {
		this.languageconfidence4 = value;
	}
	
	public Long getLanguageconfidence5() {
		return this.languageconfidence5;
	}
	
	public void setLanguageconfidence5(Long value) {
		this.languageconfidence5 = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

