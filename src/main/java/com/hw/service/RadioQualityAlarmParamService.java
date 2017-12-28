
package com.hw.service;


import com.hw.domain.po.RadioQualityAlarmParamTab;
import com.hw.domain.po.query.RadioQualityAlarmParamTabQuery;

import java.util.List;

public interface RadioQualityAlarmParamService{

    public Integer insert(RadioQualityAlarmParamTab bean);

    public Integer update(RadioQualityAlarmParamTab bean);

    public List selectList(RadioQualityAlarmParamTabQuery query);

    public RadioQualityAlarmParamTab selectById(Integer id);

    public Integer delete(RadioQualityAlarmParamTab bean);
}
