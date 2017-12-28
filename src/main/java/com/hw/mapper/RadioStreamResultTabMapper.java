
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioStreamResultTab;
import com.hw.domain.po.query.RadioStreamResultTabQuery;


public interface RadioStreamResultTabMapper {

    public Integer insert(RadioStreamResultTab bean);

    public Integer update(RadioStreamResultTab bean);

    public Page selectList(RadioStreamResultTabQuery query);

    public RadioStreamResultTab selectById(Integer id);

    public Integer delete(RadioStreamResultTab bean);

    public Page selectNotExistsStreamMark(RadioStreamResultTabQuery query);
}
