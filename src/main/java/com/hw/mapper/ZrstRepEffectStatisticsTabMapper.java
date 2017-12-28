
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepEffectStatisticsTab;
import com.hw.domain.po.query.ZrstRepEffectStatisticsTabQuery;

import java.util.List;


public interface ZrstRepEffectStatisticsTabMapper {

    public Integer insert(ZrstRepEffectStatisticsTab bean);

    public Integer update(ZrstRepEffectStatisticsTab bean);

    public Page selectList(ZrstRepEffectStatisticsTabQuery query);

    public ZrstRepEffectStatisticsTab selectById(Integer id);

    public Integer delete(ZrstRepEffectStatisticsTab bean);

    public List<ZrstRepEffectStatisticsTab> selectRepEffectStatisticsDetail(ZrstRepEffectStatisticsTabQuery query);
}
