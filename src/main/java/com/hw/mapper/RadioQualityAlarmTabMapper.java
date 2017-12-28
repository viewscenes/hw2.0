
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityAlarmTab;
import com.hw.domain.po.query.RadioQualityAlarmTabQuery;


public interface RadioQualityAlarmTabMapper {

    public Integer insert(RadioQualityAlarmTab bean);

    public Integer update(RadioQualityAlarmTab bean);

    public Page selectList(RadioQualityAlarmTabQuery query);

    public RadioQualityAlarmTab selectById(Integer id);

    public Integer delete(RadioQualityAlarmTab bean);
}
