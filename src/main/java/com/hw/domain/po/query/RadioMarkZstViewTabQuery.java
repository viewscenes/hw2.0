
package com.hw.domain.po.query;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

@Data
@AllArgsConstructor
@NoArgsConstructor
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


}

