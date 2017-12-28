
package com.hw.service.transmitStation;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResTransmitStationTab;
import com.hw.domain.po.query.ResTransmitStationTabQuery;

import java.util.List;

public interface ResTransmitStationService{

    public Integer insert(ResTransmitStationTab bean);

    public Integer update(ResTransmitStationTab bean);

    public Page selectListPage(ResTransmitStationTabQuery query);

    public List<ResTransmitStationTab> selectList(ResTransmitStationTabQuery query);

    public ResTransmitStationTab selectById(Integer id);

    public Integer delete(ResTransmitStationTab bean);
}
