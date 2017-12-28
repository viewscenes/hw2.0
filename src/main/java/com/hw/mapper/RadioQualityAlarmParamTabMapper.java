
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityAlarmParamTab;
import com.hw.domain.po.query.RadioQualityAlarmParamTabQuery;


public interface RadioQualityAlarmParamTabMapper {

    public Integer insert(RadioQualityAlarmParamTab bean);

    public Integer update(RadioQualityAlarmParamTab bean);

    public Page selectList(RadioQualityAlarmParamTabQuery query);

    public RadioQualityAlarmParamTab selectById(Integer id);

    public Integer delete(RadioQualityAlarmParamTab bean);
}
