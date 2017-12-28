
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioMarkZstViewTab;
import com.hw.domain.po.query.RadioMarkZstViewTabQuery;

import java.util.List;


public interface RadioMarkZstViewTabMapper {

    public Integer insert(RadioMarkZstViewTab bean);

    public Integer update(RadioMarkZstViewTab bean);

    public Page selectList(RadioMarkZstViewTabQuery query);

    public RadioMarkZstViewTab selectById(Integer id);

    public Integer delete(RadioMarkZstViewTab bean);

    public List<RadioMarkZstViewTab> queryList(RadioMarkZstViewTabQuery query);
}
