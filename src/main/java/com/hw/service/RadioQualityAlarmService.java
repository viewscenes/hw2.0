
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityAlarmTab;
import com.hw.domain.po.query.RadioQualityAlarmTabQuery;

public interface RadioQualityAlarmService{

    public Integer insert(RadioQualityAlarmTab bean);

    public Integer update(RadioQualityAlarmTab bean);

    public Page selectList(RadioQualityAlarmTabQuery query);

    public RadioQualityAlarmTab selectById(Integer id);

    public Integer delete(RadioQualityAlarmTab bean);
}
