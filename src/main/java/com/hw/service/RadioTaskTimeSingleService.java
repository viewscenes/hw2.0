
package com.hw.service;



import com.hw.domain.po.RadioTaskTimeSingleTab;
import com.hw.domain.po.query.RadioTaskTimeSingleTabQuery;

import java.util.List;

public interface RadioTaskTimeSingleService{

    public Integer insert(RadioTaskTimeSingleTab bean);

    public Integer update(RadioTaskTimeSingleTab bean);

    public List selectList(RadioTaskTimeSingleTabQuery query);

    public RadioTaskTimeSingleTab selectById(Integer id);

    public Integer delete(RadioTaskTimeSingleTab bean);
}
