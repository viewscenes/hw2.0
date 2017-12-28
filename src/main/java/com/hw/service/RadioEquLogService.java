
package com.hw.service;


import com.hw.domain.po.RadioEquLogTab;
import com.hw.domain.po.query.RadioEquLogTabQuery;

import java.util.List;

public interface RadioEquLogService{

    public Integer insert(RadioEquLogTab bean);

    public Integer update(RadioEquLogTab bean);

    public List selectList(RadioEquLogTabQuery query);

    public RadioEquLogTab selectById(Integer id);

    public Integer delete(RadioEquLogTab bean);
}
