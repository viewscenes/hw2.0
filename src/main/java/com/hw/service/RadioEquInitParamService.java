
package com.hw.service;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquInitParamTab;
import com.hw.domain.po.query.RadioEquInitParamTabQuery;


public interface RadioEquInitParamService{

    public Integer insert(RadioEquInitParamTab bean);

    public Integer update(RadioEquInitParamTab bean);

    public Page selectList(RadioEquInitParamTabQuery query);

    public RadioEquInitParamTab selectById(Integer id);

    public Integer delete(RadioEquInitParamTab bean);
}
