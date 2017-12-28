
package com.hw.service;


import com.hw.domain.po.RadioTaskTimeCycleTab;
import com.hw.domain.po.query.RadioTaskTimeCycleTabQuery;

import java.util.List;

public interface RadioTaskTimeCycleService{

    public Integer insert(RadioTaskTimeCycleTab bean);

    public Integer update(RadioTaskTimeCycleTab bean);

    public List selectList(RadioTaskTimeCycleTabQuery query);

    public RadioTaskTimeCycleTab selectById(Integer id);

    public Integer delete(RadioTaskTimeCycleTab bean);
}
