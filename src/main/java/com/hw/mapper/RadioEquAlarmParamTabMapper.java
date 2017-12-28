
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquAlarmParamTab;
import com.hw.domain.po.query.RadioEquAlarmParamTabQuery;


public interface RadioEquAlarmParamTabMapper {

    public Integer insert(RadioEquAlarmParamTab bean);

    public Integer update(RadioEquAlarmParamTab bean);

    public Page selectList(RadioEquAlarmParamTabQuery query);

    public RadioEquAlarmParamTab selectById(Integer id);

    public Integer delete(RadioEquAlarmParamTab bean);
}
