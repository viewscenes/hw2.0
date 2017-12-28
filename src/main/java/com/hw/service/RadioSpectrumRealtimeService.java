
package com.hw.service;

import com.hw.domain.po.RadioSpectrumRealtimeTab;
import com.hw.domain.po.query.RadioSpectrumRealtimeTabQuery;

import java.util.List;


public interface RadioSpectrumRealtimeService{

    public Integer insert(RadioSpectrumRealtimeTab bean);

    public Integer update(RadioSpectrumRealtimeTab bean);

    public List selectList(RadioSpectrumRealtimeTabQuery query);

    public RadioSpectrumRealtimeTab selectById(Integer id);

    public Integer delete(RadioSpectrumRealtimeTab bean);
}
