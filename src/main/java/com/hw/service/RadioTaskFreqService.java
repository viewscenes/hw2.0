
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.RadioTaskFreqTab;
import com.hw.domain.po.query.RadioTaskFreqTabQuery;

public interface RadioTaskFreqService{
    public Integer insert(RadioTaskFreqTab bean);

    public Integer update(RadioTaskFreqTab bean);

    public Page selectList(RadioTaskFreqTabQuery query);

    public RadioTaskFreqTab selectById(Integer id);

    public Integer delete(RadioTaskFreqTab bean);

}
