
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityAlarmTabLog;
import com.hw.domain.po.query.RadioQualityAlarmTabLogQuery;


public interface RadioQualityAlarmTabLogMapper {

    public Integer insert(RadioQualityAlarmTabLog bean);

    public Integer update(RadioQualityAlarmTabLog bean);

    public Page selectList(RadioQualityAlarmTabLogQuery query);

    public RadioQualityAlarmTabLog selectById(Integer id);

    public Integer delete(RadioQualityAlarmTabLog bean);
}
