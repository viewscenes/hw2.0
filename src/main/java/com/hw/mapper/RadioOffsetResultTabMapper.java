
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioOffsetResultTab;
import com.hw.domain.po.query.RadioOffsetResultTabQuery;


public interface RadioOffsetResultTabMapper {

    public Integer insert(RadioOffsetResultTab bean);

    public Integer update(RadioOffsetResultTab bean);

    public Page selectList(RadioOffsetResultTabQuery query);

    public RadioOffsetResultTab selectById(Integer id);

    public Integer delete(RadioOffsetResultTab bean);
}
