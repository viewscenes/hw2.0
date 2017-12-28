
package com.hw.service;



import com.hw.domain.po.RadioEquEventTab;
import com.hw.domain.po.query.RadioEquEventTabQuery;

import java.util.List;

public interface RadioEquEventService{

    public Integer insert(RadioEquEventTab bean);

    public Integer update(RadioEquEventTab bean);

    public List selectList(RadioEquEventTabQuery query);

    public RadioEquEventTab selectById(Integer id);

    public Integer delete(RadioEquEventTab bean);
}
