
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioTaskTimeCycleTab;
import com.hw.domain.po.query.RadioTaskTimeCycleTabQuery;


public interface RadioTaskTimeCycleTabMapper {

    public Integer insert(RadioTaskTimeCycleTab bean);

    public Integer update(RadioTaskTimeCycleTab bean);

    public Page selectList(RadioTaskTimeCycleTabQuery query);

    public RadioTaskTimeCycleTab selectById(Integer id);

    public Integer delete(RadioTaskTimeCycleTab bean);
}
