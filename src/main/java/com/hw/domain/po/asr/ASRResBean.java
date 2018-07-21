package com.hw.domain.po.asr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 语音识别接收返回结果对象类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ASRResBean {
	// 固定1
	private String type;
	// 订单ID，即任务ID
	private String orderID;
	// 结果类型: BC573
	private String timePeriodType;
	// 停播、空播、话少
	private String status;
	// 执行状态
	private String taskStatus;
	// 错误描述
	private String errorMessage;
	// 录音文件名称
	private String file;
	// 文件开始时间
	private String startTime;
	// 文件结束时间
	private String endTime;

	//语音长度（秒）
	private String wavelen;

	//音乐比例
	private String musicratio;

	//噪声比例
	private String noiseratio;

	//话音长度（秒）
	private String speechlen;

	//总体置信度
	private String totalcm;

	// 可听度得分
	private String audibilityScore;
	// 可听度置信度
	private String audibilityConfidence;
	// 台名识别结果
	private String channelName;
	// 台名识别置信度
	private String channelNameConfidence;
	// 节目比对结果
	private String programName;
	// 节目比对置信度
	private String programNameConfidence;

	// 前5名语种识别结果及其置信度
	private String languageName1;
	private String languageName2;
	private String languageName3;
	private String languageName4;
	private String languageName5;
	private String languageConfidence1;
	private String languageConfidence2;
	private String languageConfidence3;
	private String languageConfidence4;
	private String languageConfidence5;




}
