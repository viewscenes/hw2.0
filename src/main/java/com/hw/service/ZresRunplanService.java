
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanTab;
import com.hw.domain.po.query.ZresRunplanTabQuery;
import com.hw.domain.vo.RunpalnStatisticsVo;
import com.hw.domain.vo.query.RunplanStatisticsQuery;

import java.util.List;

public interface ZresRunplanService{

    public Integer insert(ZresRunplanTab bean);

    public Integer update(ZresRunplanTab bean);

    public Page selectPage(ZresRunplanTabQuery query);
    public List<ZresRunplanTab> selectList(ZresRunplanTabQuery query);
    public ZresRunplanTab selectById(Integer id);

    public Integer delete(ZresRunplanTabQuery bean);


    public List<RunpalnStatisticsVo> gjtStatistics(RunplanStatisticsQuery query);

    public List<RunpalnStatisticsVo> hwldStatistics(RunplanStatisticsQuery query);
}
