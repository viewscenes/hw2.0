
package com.hw.service;


import com.hw.domain.po.RadioQualityRealtimeTab;
import com.hw.domain.po.query.RadioQualityRealtimeTabQuery;

import java.util.List;

public interface RadioQualityRealtimeService{

    public Integer insert(RadioQualityRealtimeTab bean);

    public Integer update(RadioQualityRealtimeTab bean);

    public List selectList(RadioQualityRealtimeTabQuery query);

    public RadioQualityRealtimeTab selectById(Integer id);

    public Integer delete(RadioQualityRealtimeTab bean);
}
