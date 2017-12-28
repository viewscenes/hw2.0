
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioTaskTimeSingleTab;
import com.hw.domain.po.query.RadioTaskTimeSingleTabQuery;


public interface RadioTaskTimeSingleTabMapper {

    public Integer insert(RadioTaskTimeSingleTab bean);

    public Integer update(RadioTaskTimeSingleTab bean);

    public Page selectList(RadioTaskTimeSingleTabQuery query);

    public RadioTaskTimeSingleTab selectById(Integer id);

    public Integer delete(RadioTaskTimeSingleTab bean);
}
