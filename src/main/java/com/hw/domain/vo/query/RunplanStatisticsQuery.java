
package com.hw.domain.vo.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RunplanStatisticsQuery  implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 发射台 */
	private Integer stationId;
	/** 语言id */
    private Integer languageId;
    /** 服务区 */
    private String serviceArea;

    /** 播音时间 */
    private String palyTime;

    /** 季节代号 */
    private String seasonId;

    /** 开始时间 */
    private Date startTime;

    /** 开始时间 */
    private Date endTime;
    /** 统计类型 */
    private Integer type;
    /**
     * 运行图类型
     */
    private Integer runplanTypeId;


}

