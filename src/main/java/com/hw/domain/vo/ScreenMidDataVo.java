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
public class ScreenMidDataVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<AreaDataVo> allAreaDataList;
    private List<ResHeadendTab> headendListAll;
    private List<ResHeadendTab> headendListCJD;
    private List<ResHeadendTab> headendListYKZ;
    private List<ResHeadendTab> headendListAlarm;
    private List<ResHeadendTab> headendListOnline;
    private List<ResHeadendTab> headendListOffline;


}
