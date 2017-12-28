
package com.hw.service;



import com.hw.domain.po.RadioEquAlarmParamTab;
import com.hw.domain.po.query.RadioEquAlarmParamTabQuery;

import java.util.List;

public interface RadioEquAlarmParamService{

    public Integer insert(RadioEquAlarmParamTab bean);

    public Integer update(RadioEquAlarmParamTab bean);

    public List selectList(RadioEquAlarmParamTabQuery query);

    public RadioEquAlarmParamTab selectById(Integer id);

    public Integer delete(RadioEquAlarmParamTab bean);
}
