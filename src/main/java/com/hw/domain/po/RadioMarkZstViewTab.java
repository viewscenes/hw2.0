
package com.hw.domain.po;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RadioMarkZstViewTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 打分id       db_column: MARK_ID 
     */	
	private Integer markId;
    /**
     * 打分人       db_column: MARK_USER 
     */	
	private String markUser;
    /**
     * 打分时间       db_column: MARK_DATETIME 
     */	
	
	private Date markDatetime;
    /**
     * 设备code       db_column: HEAD_CODE 
     */	
	private String headCode;
    /**
     * 接收机       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Integer frequency;
    /**
     * 运行图id       db_column: RUNPLAN_ID 
     */	
	
	private Integer runplanId;
    /**
     * I       db_column: COUNTI 
     */	
	
	private Integer counti;
    /**
     * o       db_column: COUNTO 
     */	
	
	private Integer counto;
    /**
     * s       db_column: COUNTS 
     */	
	
	private Integer counts;
    /**
     * 干扰类型       db_column: DESCRIPTION 
     */	
	private String description;
    /**
     * 打分类型 1:实时,2录音       db_column: MARK_TYPE 
     */	
	private String markType;
    /**
     * 修改人       db_column: EDIT_USER 
     */	
	private String editUser;
    /**
     * 打分单元       db_column: UNIT 
     */	
	private String unit;
    /**
     * 录音文件路径       db_column: MARK_FILE_URL 
     */	
	private String markFileUrl;
    /**
     * 录音文件原始名称       db_column: FILE_NAME 
     */	
	private String fileName;
    /**
     * 录音长度（秒）       db_column: FILE_LENGTH 
     */	
	private String fileLength;
    /**
     * 录音开始时间       db_column: RECORD_START_TIME 
     */	
	private String recordStartTime;
    /**
     * 录音结束时间       db_column: RECORD_END_TIME 
     */	
	private String recordEndTime;
    /**
     * 发射台id       db_column: STATION_ID 
     */	
	
	private Integer stationId;
    /**
     * 发射台名称       db_column: STATION_NAME 
     */	
	private String stationName;
    /**
     * 前端名称       db_column: HEADNAME 
     */	
	private String headname;
    /**
     * 播音时间       db_column: PLAY_TIME 
     */	
	private String playTime;
    /**
     * 任务id       db_column: TASK_ID 
     */	
	
	private Integer taskId;
    /**
     * 任务名称       db_column: TASK_NAME 
     */	
	private String taskName;
    /**
     * 电平中值       db_column: LEVEL_VALUE 
     */	
	
	private Float levelValue;
    /**
     * 调制度中值       db_column: FM_VALUE 
     */	
	
	private Float fmValue;
    /**
     * 调幅度中值       db_column: AM_VALUE 
     */	
	
	private Float amValue;
    /**
     * 频偏中值       db_column: OFFSET_VALUE 
     */	
	
	private Float offsetValue;
    /**
     * 备注(可能包含同领频的备注信息)       db_column: REMARK 
     */	
	private String remark;
    /**
     * 语音识别类型1       db_column: ASR_TYPE 
     */	
	
	private Integer asrType;
    /**
     * 结果类型: BC573       db_column: RESULT_TYPE 
     */	
	private String resultType;
    /**
     * 停播、空播、话少       db_column: STATUS 
     */	
	private String status;
    /**
     * 语音长度（秒）       db_column: WAVELEN 
     */	
	
	private Integer wavelen;
    /**
     * 音乐比例       db_column: MUSICRATIO 
     */	
	private String musicratio;
    /**
     * 噪声比例       db_column: NOISERATIO 
     */	
	private String noiseratio;
    /**
     * 话音长度（秒）       db_column: SPEECHLEN 
     */	
	
	private Integer speechlen;
    /**
     * 总体置信度       db_column: TOTALCM 
     */	
	
	private Integer totalcm;
    /**
     * 可听度得分(0-5分)，s(0-5分),i(0-5分）,o(0-5分),如1,2,3       db_column: AUDIBILITYSCORE 
     */	
	private String audibilityscore;
    /**
     * 可听度置信度（0-100）       db_column: AUDIBILITYCONFIDENCE 
     */	
	
	private Integer audibilityconfidence;
    /**
     * 台名识别结果（台名模板名字）       db_column: CHANNELNAME 
     */	
	private String channelname;
    /**
     * 台名识别置信度(0-100)       db_column: CHANNELNAMECONFIDENCE 
     */	
	
	private Integer channelnameconfidence;
    /**
     * 节目比对结果（国际1-21）       db_column: PROGRAMNAME 
     */	
	private String programname;
    /**
     * 节目比对置信度（0-100）       db_column: PROGRAMNAMECONFIDENCE 
     */	
	
	private Integer programnameconfidence;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGENAME1 
     */	
	private String languagename1;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGENAME2 
     */	
	private String languagename2;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGENAME3 
     */	
	private String languagename3;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGENAME4 
     */	
	private String languagename4;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGENAME5 
     */	
	private String languagename5;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGECONFIDENCE1 
     */	
	
	private Integer languageconfidence1;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGECONFIDENCE2 
     */	
	
	private Integer languageconfidence2;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGECONFIDENCE3 
     */	
	
	private Integer languageconfidence3;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGECONFIDENCE4 
     */	
	
	private Integer languageconfidence4;
    /**
     * 语种模板名字（英 汉）       db_column: LANGUAGECONFIDENCE5 
     */	
	
	private Integer languageconfidence5;
	//columns END

	public RadioMarkZstViewTab(){
	}



	public void setMarkId(Integer value) {
		this.markId = value;
	}
	
	public Integer getMarkId() {
		return this.markId;
	}
	public void setMarkUser(String value) {
		this.markUser = value;
	}
	
	public String getMarkUser() {
		return this.markUser;
	}

	
	public void setMarkDatetime(Date value) {
		this.markDatetime = value;
	}
	
	public Date getMarkDatetime() {
		return this.markDatetime;
	}
	public void setHeadCode(String value) {
		this.headCode = value;
	}
	
	public String getHeadCode() {
		return this.headCode;
	}
	public void setEquCode(String value) {
		this.equCode = value;
	}

    public String getEquCode() {
        return equCode;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getRunplanId() {
        return runplanId;
    }

    public void setRunplanId(Integer runplanId) {
        this.runplanId = runplanId;
    }

    public Integer getCounti() {
        return counti;
    }

    public void setCounti(Integer counti) {
        this.counti = counti;
    }

    public Integer getCounto() {
        return counto;
    }

    public void setCounto(Integer counto) {
        this.counto = counto;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarkType() {
        return markType;
    }

    public void setMarkType(String markType) {
        this.markType = markType;
    }

    public String getEditUser() {
        return editUser;
    }

    public void setEditUser(String editUser) {
        this.editUser = editUser;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMarkFileUrl() {
        return markFileUrl;
    }

    public void setMarkFileUrl(String markFileUrl) {
        this.markFileUrl = markFileUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLength() {
        return fileLength;
    }

    public void setFileLength(String fileLength) {
        this.fileLength = fileLength;
    }

    public String getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(String recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public String getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(String recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getHeadname() {
        return headname;
    }

    public void setHeadname(String headname) {
        this.headname = headname;
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Float getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(Float levelValue) {
        this.levelValue = levelValue;
    }

    public Float getFmValue() {
        return fmValue;
    }

    public void setFmValue(Float fmValue) {
        this.fmValue = fmValue;
    }

    public Float getAmValue() {
        return amValue;
    }

    public void setAmValue(Float amValue) {
        this.amValue = amValue;
    }

    public Float getOffsetValue() {
        return offsetValue;
    }

    public void setOffsetValue(Float offsetValue) {
        this.offsetValue = offsetValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAsrType() {
        return asrType;
    }

    public void setAsrType(Integer asrType) {
        this.asrType = asrType;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getWavelen() {
        return wavelen;
    }

    public void setWavelen(Integer wavelen) {
        this.wavelen = wavelen;
    }

    public String getMusicratio() {
        return musicratio;
    }

    public void setMusicratio(String musicratio) {
        this.musicratio = musicratio;
    }

    public String getNoiseratio() {
        return noiseratio;
    }

    public void setNoiseratio(String noiseratio) {
        this.noiseratio = noiseratio;
    }

    public Integer getSpeechlen() {
        return speechlen;
    }

    public void setSpeechlen(Integer speechlen) {
        this.speechlen = speechlen;
    }

    public Integer getTotalcm() {
        return totalcm;
    }

    public void setTotalcm(Integer totalcm) {
        this.totalcm = totalcm;
    }

    public String getAudibilityscore() {
        return audibilityscore;
    }

    public void setAudibilityscore(String audibilityscore) {
        this.audibilityscore = audibilityscore;
    }

    public Integer getAudibilityconfidence() {
        return audibilityconfidence;
    }

    public void setAudibilityconfidence(Integer audibilityconfidence) {
        this.audibilityconfidence = audibilityconfidence;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public Integer getChannelnameconfidence() {
        return channelnameconfidence;
    }

    public void setChannelnameconfidence(Integer channelnameconfidence) {
        this.channelnameconfidence = channelnameconfidence;
    }

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname;
    }

    public Integer getProgramnameconfidence() {
        return programnameconfidence;
    }

    public void setProgramnameconfidence(Integer programnameconfidence) {
        this.programnameconfidence = programnameconfidence;
    }

    public String getLanguagename1() {
        return languagename1;
    }

    public void setLanguagename1(String languagename1) {
        this.languagename1 = languagename1;
    }

    public String getLanguagename2() {
        return languagename2;
    }

    public void setLanguagename2(String languagename2) {
        this.languagename2 = languagename2;
    }

    public String getLanguagename3() {
        return languagename3;
    }

    public void setLanguagename3(String languagename3) {
        this.languagename3 = languagename3;
    }

    public String getLanguagename4() {
        return languagename4;
    }

    public void setLanguagename4(String languagename4) {
        this.languagename4 = languagename4;
    }

    public String getLanguagename5() {
        return languagename5;
    }

    public void setLanguagename5(String languagename5) {
        this.languagename5 = languagename5;
    }

    public Integer getLanguageconfidence1() {
        return languageconfidence1;
    }

    public void setLanguageconfidence1(Integer languageconfidence1) {
        this.languageconfidence1 = languageconfidence1;
    }

    public Integer getLanguageconfidence2() {
        return languageconfidence2;
    }

    public void setLanguageconfidence2(Integer languageconfidence2) {
        this.languageconfidence2 = languageconfidence2;
    }

    public Integer getLanguageconfidence3() {
        return languageconfidence3;
    }

    public void setLanguageconfidence3(Integer languageconfidence3) {
        this.languageconfidence3 = languageconfidence3;
    }

    public Integer getLanguageconfidence4() {
        return languageconfidence4;
    }

    public void setLanguageconfidence4(Integer languageconfidence4) {
        this.languageconfidence4 = languageconfidence4;
    }

    public Integer getLanguageconfidence5() {
        return languageconfidence5;
    }

    public void setLanguageconfidence5(Integer languageconfidence5) {
        this.languageconfidence5 = languageconfidence5;
    }
}

