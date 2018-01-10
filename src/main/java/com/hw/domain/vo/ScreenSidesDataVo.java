package com.hw.domain.vo;



import com.hw.domain.po.ResHeadendTab;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScreenSidesDataVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<AreaAlarmDataVo> areaAlarmDataVoList;
    private List<ResHeadendTab> headendList;


}
