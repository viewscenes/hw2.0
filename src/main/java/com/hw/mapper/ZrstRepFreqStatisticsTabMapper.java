
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepFreqStatisticsTab;
import com.hw.domain.po.query.ZrstRepFreqStatisticsTabQuery;


public interface ZrstRepFreqStatisticsTabMapper {

    public Integer insert(ZrstRepFreqStatisticsTab bean);

    public Integer update(ZrstRepFreqStatisticsTab bean);

    public Page selectList(ZrstRepFreqStatisticsTabQuery query);

    public ZrstRepFreqStatisticsTab selectById(Integer id);

    public Integer delete(ZrstRepFreqStatisticsTab bean);
}
