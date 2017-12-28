
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;

import java.util.List;


public interface ResHeadendTabMapper {
    public Integer insert(ResHeadendTab bean);

    public Integer update(ResHeadendTab bean);

    public Page selectList(ResHeadendTabQuery query);

    public ResHeadendTab selectById(Integer id);

    public Integer delete(ResHeadendTab bean);

    public List<ResHeadendTab> selectHeadendList(ResHeadendTabQuery query);


    public List<ResHeadendTab> selectDistinctHeadendList(ResHeadendTabQuery query);

}
