
package com.hw.service;


import com.hw.domain.po.RadioEquAlarmTabLog;
import com.hw.domain.po.query.RadioEquAlarmTabLogQuery;

import java.util.List;

public interface RadioEquAlarmTabLogService{

    public Integer insert(RadioEquAlarmTabLog bean);

    public Integer update(RadioEquAlarmTabLog bean);

    public List selectList(RadioEquAlarmTabLogQuery query);

    public RadioEquAlarmTabLog selectById(Integer id);

    public Integer delete(RadioEquAlarmTabLog bean);
}
