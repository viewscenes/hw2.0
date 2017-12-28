
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepEffectSummaryTab;
import com.hw.domain.po.query.ZrstRepEffectSummaryTabQuery;


public interface ZrstRepEffectSummaryTabMapper {

    public Integer insert(ZrstRepEffectSummaryTab bean);

    public Integer update(ZrstRepEffectSummaryTab bean);

    public Page selectList(ZrstRepEffectSummaryTabQuery query);

    public ZrstRepEffectSummaryTab selectById(Integer id);

    public Integer delete(ZrstRepEffectSummaryTab bean);
}
