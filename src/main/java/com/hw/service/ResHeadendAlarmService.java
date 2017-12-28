
package com.hw.service;



import com.hw.domain.po.ResHeadendAlarmTab;
import com.hw.domain.po.query.ResHeadendAlarmTabQuery;

import java.util.List;

public interface ResHeadendAlarmService{

    public Integer insert(ResHeadendAlarmTab bean);

    public Integer update(ResHeadendAlarmTab bean);

    public List selectList(ResHeadendAlarmTabQuery query);

    public ResHeadendAlarmTab selectById(Integer id);

    public Integer delete(ResHeadendAlarmTab bean);
}
