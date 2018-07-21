
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanTab;
import com.hw.domain.po.query.ZresRunplanTabQuery;
import com.hw.domain.vo.RunpalnStatisticsVo;
import com.hw.domain.vo.query.RunplanStatisticsQuery;

import java.util.List;

public interface ZresRunplanService{

     Integer insert(ZresRunplanTab bean);

     Integer update(ZresRunplanTab bean);

     Page selectPage(ZresRunplanTabQuery query);
     List<ZresRunplanTab> selectList(ZresRunplanTabQuery query);
     ZresRunplanTab selectById(Integer id);

     Integer delete(ZresRunplanTabQuery bean);


     List<RunpalnStatisticsVo> gjtStatistics(RunplanStatisticsQuery query);

     List<RunpalnStatisticsVo> hwldStatistics(RunplanStatisticsQuery query);


     ZresRunplanTab getRunplanByTaskId(Integer taskId);
}
