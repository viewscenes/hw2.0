
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSpectrumRealtimeTab;
import com.hw.domain.po.query.RadioSpectrumRealtimeTabQuery;


public interface RadioSpectrumRealtimeTabMapper {

    public Integer insert(RadioSpectrumRealtimeTab bean);

    public Integer update(RadioSpectrumRealtimeTab bean);

    public Page selectList(RadioSpectrumRealtimeTabQuery query);

    public RadioSpectrumRealtimeTab selectById(Integer id);

    public Integer delete(RadioSpectrumRealtimeTab bean);
}
