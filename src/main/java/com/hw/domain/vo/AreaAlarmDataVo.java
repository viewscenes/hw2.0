package com.hw.domain.vo;



import com.hw.domain.po.RadioEquAlarmTab;
import com.hw.domain.po.RadioQualityAlarmTab;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaAlarmDataVo implements Serializable,Comparable {

    private static final long serialVersionUID = 1L;

    private Integer id;//大洲id
    private String name;//大洲名称
    private Integer alarmCountValue;//大洲报警站点数量;
    private List<RadioEquAlarmTab> equAlarmList;//设备报警站点
    private List<RadioQualityAlarmTab> qualityAlarmList;//指标报警站点;

    @Override
    public int compareTo(Object o) {
        return this.alarmCountValue.compareTo(((AreaAlarmDataVo)o).getAlarmCountValue());
    }
}
