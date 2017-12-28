
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSpectrumStatTab;
import com.hw.domain.po.query.RadioSpectrumStatTabQuery;


public interface RadioSpectrumStatTabMapper {

    public Integer insert(RadioSpectrumStatTab bean);

    public Integer update(RadioSpectrumStatTab bean);

    public Page selectList(RadioSpectrumStatTabQuery query);

    public RadioSpectrumStatTab selectById(Integer id);

    public Integer delete(RadioSpectrumStatTab bean);
}
