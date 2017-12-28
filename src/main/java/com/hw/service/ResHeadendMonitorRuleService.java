
package com.hw.service;

import com.hw.domain.po.ResHeadendMonitorRuleTab;
import com.hw.domain.po.query.ResHeadendMonitorRuleTabQuery;

import java.util.List;


public interface ResHeadendMonitorRuleService{

    public Integer insert(ResHeadendMonitorRuleTab bean);

    public Integer update(ResHeadendMonitorRuleTab bean);

    public List selectList(ResHeadendMonitorRuleTabQuery query);

    public ResHeadendMonitorRuleTab selectById(Integer id);

    public Integer delete(ResHeadendMonitorRuleTab bean);
}
