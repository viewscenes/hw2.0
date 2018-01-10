package com.hw.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RunpalnStatisticsVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String typeValue;

    private Integer playCount;

    private BigDecimal playTime;

    private Integer qualityCount;

    private BigDecimal qualityTime;

    private Integer effectCount;

    private BigDecimal effectTime;


}
