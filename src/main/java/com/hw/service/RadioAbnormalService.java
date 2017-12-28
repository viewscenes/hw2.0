
package com.hw.service;



import com.hw.domain.po.RadioAbnormalTab;
import com.hw.domain.po.query.RadioAbnormalTabQuery;

import java.util.List;

public interface RadioAbnormalService{

    public Integer insert(RadioAbnormalTab bean);

    public Integer update(RadioAbnormalTab bean);

    public List selectList(RadioAbnormalTabQuery query);

    public RadioAbnormalTab selectById(Integer id);

    public Integer delete(RadioAbnormalTab bean);
}
