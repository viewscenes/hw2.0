
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.HeadendStateCount;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;

import java.util.List;


public interface ResHeadendTabMapper {
     Integer insert(ResHeadendTab bean);

     Integer update(ResHeadendTab bean);

     Page selectList(ResHeadendTabQuery query);

     ResHeadendTab selectById(Integer id);

     Integer delete(ResHeadendTab bean);

     List<ResHeadendTab> selectHeadendList(ResHeadendTabQuery query);

     List<HeadendStateCount> queryHeadCountByState();
     List<ResHeadendTab> selectDistinctHeadendList(ResHeadendTabQuery query);

}
