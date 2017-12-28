
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicStationCityRelTab;
import com.hw.domain.po.query.DicStationCityRelTabQuery;


public interface DicStationCityRelTabMapper {
    public Integer insert(DicStationCityRelTab bean);

    public Integer update(DicStationCityRelTab bean);

    public Page selectList(DicStationCityRelTabQuery query);

    public DicStationCityRelTab selectById(Integer id);

    public Integer delete(DicStationCityRelTab bean);

}
