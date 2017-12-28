
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.ResHeadendOpenTab;
import com.hw.domain.po.query.ResHeadendOpenTabQuery;


public interface ResHeadendOpenTabMapper {

    public Integer insert(ResHeadendOpenTab bean);

    public Integer update(ResHeadendOpenTab bean);

    public Page selectList(ResHeadendOpenTabQuery query);

    public ResHeadendOpenTab selectById(Integer id);

    public Integer delete(ResHeadendOpenTab bean);
}
