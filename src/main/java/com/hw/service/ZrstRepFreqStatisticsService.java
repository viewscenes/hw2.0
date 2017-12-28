
package com.hw.service;



import com.hw.domain.po.ZrstRepFreqStatisticsTab;
import com.hw.domain.po.query.ZrstRepFreqStatisticsTabQuery;

import java.util.List;

public interface ZrstRepFreqStatisticsService{

    public Integer insert(ZrstRepFreqStatisticsTab bean);

    public Integer update(ZrstRepFreqStatisticsTab bean);

    public List selectList(ZrstRepFreqStatisticsTabQuery query);

    public ZrstRepFreqStatisticsTab selectById(Integer id);

    public Integer delete(ZrstRepFreqStatisticsTab bean);
}
