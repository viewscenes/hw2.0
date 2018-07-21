package com.hw.domain.po.asr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 语音识别发送命令对象类
 *
 * @author thinkpad
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ASRCmdBean {
	// 服务类型：WorkFlow;TaskStatus
	private String type = "TaskStatus";
	// 任务流类型:BC573
	private String wfType = "BC573";
	// 录音文件名称
	private String file;
	// 文件的录音开始时间
	private String fileStartTime;
	// 文件的录音结束时间
	private String fileEndTime;
	// 待分析的有效时间段的开始时间
	private String taskStartTime;
	// 待分析的有效时间段的结束时间
	private String taskEndTime;
	//频率
	private String freq;
	//语言
	private String language;
	// 采集方式（录音方式：遥控站实时1、遥控站回传2、采集点实时3、采集点回传4）
	private String collectMethod;
	// 参考源通道（阿拉伯数字，从1，2……21）
	private String collectChannel;

	//接收机类型(545/713/NI1000)
	private String receiverType;

	//业务系统ID号(字符串，除“_”外)
	private String taskId;




}
