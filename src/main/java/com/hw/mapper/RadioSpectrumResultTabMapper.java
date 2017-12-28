
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSpectrumResultTab;
import com.hw.domain.po.query.RadioSpectrumResultTabQuery;


public interface RadioSpectrumResultTabMapper {

    public Integer insert(RadioSpectrumResultTab bean);

    public Integer update(RadioSpectrumResultTab bean);

    public Page selectList(RadioSpectrumResultTabQuery query);

    public RadioSpectrumResultTab selectById(Integer id);

    public Integer delete(RadioSpectrumResultTab bean);
}
