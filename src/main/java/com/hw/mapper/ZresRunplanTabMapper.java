
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanTab;
import com.hw.domain.po.query.ZresRunplanTabQuery;

import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface ZresRunplanTabMapper {

     Integer insert(ZresRunplanTab bean);

     Integer update(ZresRunplanTab bean);

     Page selectPage(ZresRunplanTabQuery query);

     List<ZresRunplanTab> selectList(ZresRunplanTabQuery query);

     ZresRunplanTab selectById(Integer id);

     Integer delete(ZresRunplanTabQuery bean);

     ZresRunplanTab getRunplanByTaskId(@Param("taskId") Integer taskId);

     List<ZresRunplanTab> queryTodayRunplan();
}
