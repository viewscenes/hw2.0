
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioQualityRealtimeTab;
import com.hw.domain.po.query.RadioQualityRealtimeTabQuery;


public interface RadioQualityRealtimeTabMapper {

    public Integer insert(RadioQualityRealtimeTab bean);

    public Integer update(RadioQualityRealtimeTab bean);

    public Page selectList(RadioQualityRealtimeTabQuery query);

    public RadioQualityRealtimeTab selectById(Integer id);

    public Integer delete(RadioQualityRealtimeTab bean);
}
