
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepTimeStatisticsTab;
import com.hw.domain.po.query.ZrstRepTimeStatisticsTabQuery;


public interface ZrstRepTimeStatisticsTabDao{
    public Integer insert(ZrstRepTimeStatisticsTab bean);

    public Integer update(ZrstRepTimeStatisticsTab bean);

    public Page selectList(ZrstRepTimeStatisticsTabQuery query);

    public ZrstRepTimeStatisticsTab selectById(Integer id);

    public Integer delete(ZrstRepTimeStatisticsTab bean);

}
