package com.hw.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaDataVo implements Serializable,Comparable {

    private static final long serialVersionUID = 1L;

    private Integer id;//大洲id
    private String name;//大洲名称
    private Integer countValue;//大洲站点总数量;
    private Integer cjdCountValue;//大洲采集点站点数量;
    private Integer ykzCountValue;//大洲遥控站站点数量;
    private Integer cjdAlarmCountValue;//大洲采集点报警站点数量;
    private Integer ykzAlarmCountValue;//大洲遥控站报警站点数量;



    @Override
    public int compareTo(Object o) {
        return this.countValue.compareTo(((AreaDataVo)o).getCountValue());
    }
}
