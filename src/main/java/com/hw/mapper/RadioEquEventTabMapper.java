
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquEventTab;
import com.hw.domain.po.query.RadioEquEventTabQuery;


public interface RadioEquEventTabMapper {

    public Integer insert(RadioEquEventTab bean);

    public Integer update(RadioEquEventTab bean);

    public Page selectList(RadioEquEventTabQuery query);

    public RadioEquEventTab selectById(Integer id);

    public Integer delete(RadioEquEventTab bean);
}
