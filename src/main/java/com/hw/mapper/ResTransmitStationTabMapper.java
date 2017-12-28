
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResTransmitStationTab;
import com.hw.domain.po.query.ResTransmitStationTabQuery;

import java.util.List;


public interface ResTransmitStationTabMapper {

    public Integer insert(ResTransmitStationTab bean);

    public Integer update(ResTransmitStationTab bean);

    public Page selectListPage(ResTransmitStationTabQuery query);

    public ResTransmitStationTab selectById(Integer id);

    public Integer delete(ResTransmitStationTab bean);

    public List<ResTransmitStationTab> selectList(ResTransmitStationTabQuery query);
}
