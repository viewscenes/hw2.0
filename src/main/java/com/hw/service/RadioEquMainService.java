
package com.hw.service;

import com.hw.domain.po.RadioEquMainTab;
import com.hw.domain.po.query.RadioEquMainTabQuery;

import java.util.List;


public interface RadioEquMainService{
    public Integer insert(RadioEquMainTab bean);

    public Integer update(RadioEquMainTab bean);

    public List selectList(RadioEquMainTabQuery query);

    public RadioEquMainTab selectById(Integer id);

    public Integer delete(RadioEquMainTab bean);

}
