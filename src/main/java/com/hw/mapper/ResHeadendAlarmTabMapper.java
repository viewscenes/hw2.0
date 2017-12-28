
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResHeadendAlarmTab;
import com.hw.domain.po.query.ResHeadendAlarmTabQuery;


public interface ResHeadendAlarmTabMapper {

    public Integer insert(ResHeadendAlarmTab bean);

    public Integer update(ResHeadendAlarmTab bean);

    public Page selectList(ResHeadendAlarmTabQuery query);

    public ResHeadendAlarmTab selectById(Integer id);

    public Integer delete(ResHeadendAlarmTab bean);
}
