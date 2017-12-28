
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.ResHeadendMonitorRuleTab;
import com.hw.domain.po.query.ResHeadendMonitorRuleTabQuery;


public interface ResHeadendMonitorRuleTabMapper {

    public Integer insert(ResHeadendMonitorRuleTab bean);

    public Integer update(ResHeadendMonitorRuleTab bean);

    public Page selectList(ResHeadendMonitorRuleTabQuery query);

    public ResHeadendMonitorRuleTab selectById(Integer id);

    public Integer delete(ResHeadendMonitorRuleTab bean);
}
