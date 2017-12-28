
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepEffectViewTab;
import com.hw.domain.po.query.ZrstRepEffectViewTabQuery;


public interface ZrstRepEffectViewTabMapper {

    public Integer insert(ZrstRepEffectViewTab bean);

    public Integer update(ZrstRepEffectViewTab bean);

    public Page selectList(ZrstRepEffectViewTabQuery query);

    public ZrstRepEffectViewTab selectById(Integer id);

    public Integer delete(ZrstRepEffectViewTab bean);
}
