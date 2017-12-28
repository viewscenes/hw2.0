
package com.hw.service;


import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;

import java.util.List;


public interface ResHeadendService{
    public Integer insert(ResHeadendTab bean);

    public Integer update(ResHeadendTab bean);

    public List selectHeadendPage(ResHeadendTabQuery query);

    public ResHeadendTab selectById(Integer id);

    public Integer delete(ResHeadendTab bean);

    public List<ResHeadendTab> selectHeadendList(ResHeadendTabQuery query);


    public List<ResHeadendTab> selectDistinctHeadendList(ResHeadendTabQuery query);
}
