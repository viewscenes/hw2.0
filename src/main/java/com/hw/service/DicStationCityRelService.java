
package com.hw.service;



import com.hw.domain.po.DicStationCityRelTab;
import com.hw.domain.po.query.DicStationCityRelTabQuery;

import java.util.List;

public interface DicStationCityRelService{
    public Integer insert(DicStationCityRelTab bean);

    public Integer update(DicStationCityRelTab bean);

    public List selectList(DicStationCityRelTabQuery query);

    public DicStationCityRelTab selectById(Integer id);

    public Integer delete(DicStationCityRelTab bean);

}
