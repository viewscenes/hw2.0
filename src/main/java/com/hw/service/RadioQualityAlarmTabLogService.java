
package com.hw.service;

import com.hw.domain.po.RadioQualityAlarmTabLog;
import com.hw.domain.po.query.RadioQualityAlarmTabLogQuery;

import java.util.List;


public interface RadioQualityAlarmTabLogService{

    public Integer insert(RadioQualityAlarmTabLog bean);

    public Integer update(RadioQualityAlarmTabLog bean);

    public List selectList(RadioQualityAlarmTabLogQuery query);

    public RadioQualityAlarmTabLog selectById(Integer id);

    public Integer delete(RadioQualityAlarmTabLog bean);
}
