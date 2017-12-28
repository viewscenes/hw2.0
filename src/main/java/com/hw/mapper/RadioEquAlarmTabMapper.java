
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquAlarmTab;
import com.hw.domain.po.query.RadioEquAlarmTabQuery;


public interface RadioEquAlarmTabMapper {
    public Integer insert(RadioEquAlarmTab bean);

    public Integer update(RadioEquAlarmTab bean);

    public Page selectList(RadioEquAlarmTabQuery query);

    public RadioEquAlarmTab selectById(Integer id);

    public Integer delete(RadioEquAlarmTab bean);

}
