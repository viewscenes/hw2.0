
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
public class RadioStreamResultTab   implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * resultId       db_column: RESULT_ID 
     */	
	
	private Integer resultId;
    /**
     * 波段       db_column: BAND 
     */	
	private String band;
    /**
     * 任务id       db_column: TASK_ID 
     */	
	
	private Integer taskId;
    /**
     * 录音开始时间       db_column: START_DATETIME 
     */	
	
	private Date startDatetime;
    /**
     * 录音结束时间       db_column: END_DATETIME 
     */	
	
	private Date endDatetime;
    /**
     * 频率       db_column: FREQUENCY 
     */	
	
	private Integer frequency;
    /**
     * 文件名称       db_column: FILENAME 
     */	
	private String filename;
    /**
     * 文件长度       db_column: FILESIZE 
     */	
	
	private Integer filesize;
    /**
     * 设备id       db_column: HEAD_ID 
     */	
	
	private Integer headId;
    /**
     * 录音文件地址       db_column: URL 
     */	
	private String url;
    /**
     * 录音类型：0：效果录音，1质量录音，2实时录音，3：临时录音       db_column: REPORT_TYPE 
     */	
	
	private Integer reportType;
    /**
     * 是否回收回来       db_column: IS_STORED 
     */	
	
	private Integer isStored;
    /**
     * 是否删除       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 存储时间       db_column: STORE_DATETIME 
     */	
	
	private Date storeDatetime;
    /**
     * 打分文件名       db_column: MARK_FILE_NAME 
     */	
	private String markFileName;
    /**
     * 运行图id       db_column: RUNPLAN_ID 
     */	
	
	private Integer runplanId;
    /**
     * 设备接收机code       db_column: EQU_CODE 
     */	
	private String equCode;
    /**
     * 调幅度值       db_column: FM_MODULATION 
     */	
	private String fmModulation;
    /**
     * 调制度值       db_column: AM_MODULATION 
     */	
	private String amModulation;
    /**
     * 频偏值       db_column: OFFSET 
     */	
	private String offset;
    /**
     * 电平值       db_column: LEVEL_VALUE 
     */	
	private String levelValue;
    /**
     * 接收机类型       db_column: RECEIVE_TYPE 
     */	
	private String receiveType;
    /**
     * language       db_column: LANGUAGE 
     */	
	private String language;
    /**
     * stationName       db_column: STATION_NAME 
     */	
	private String stationName;



     //打分表字段信息
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
	//columns END

}

