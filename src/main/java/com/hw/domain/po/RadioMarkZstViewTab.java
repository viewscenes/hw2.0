
package com.hw.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RadioMarkZstViewTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 打分id       db_column: MARK_ID 
     */	
	private Long markId;
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
}

