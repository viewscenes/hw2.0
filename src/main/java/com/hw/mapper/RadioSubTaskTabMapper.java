
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioSubTaskTab;
import com.hw.domain.po.query.RadioSubTaskTabQuery;


public interface RadioSubTaskTabMapper {
    public Integer insert(RadioSubTaskTab bean);

    public Integer update(RadioSubTaskTab bean);

    public Page selectList(RadioSubTaskTabQuery query);

    public RadioSubTaskTab selectById(Integer id);

    public Integer delete(RadioSubTaskTab bean);

}
