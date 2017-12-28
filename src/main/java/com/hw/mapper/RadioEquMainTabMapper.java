
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquMainTab;
import com.hw.domain.po.query.RadioEquMainTabQuery;


public interface RadioEquMainTabMapper {
    public Integer insert(RadioEquMainTab bean);

    public Integer update(RadioEquMainTab bean);

    public Page selectList(RadioEquMainTabQuery query);

    public RadioEquMainTab selectById(Integer id);

    public Integer delete(RadioEquMainTab bean);

}
