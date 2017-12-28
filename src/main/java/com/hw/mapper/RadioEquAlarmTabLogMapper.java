
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquAlarmTabLog;
import com.hw.domain.po.query.RadioEquAlarmTabLogQuery;


public interface RadioEquAlarmTabLogMapper {

    public Integer insert(RadioEquAlarmTabLog bean);

    public Integer update(RadioEquAlarmTabLog bean);

    public Page selectList(RadioEquAlarmTabLogQuery query);

    public RadioEquAlarmTabLog selectById(Integer id);

    public Integer delete(RadioEquAlarmTabLog bean);
}
