
package com.hw.service;


import com.hw.domain.po.ZrstRepEffectViewTab;
import com.hw.domain.po.query.ZrstRepEffectViewTabQuery;

import java.util.List;

public interface ZrstRepEffectViewService{

    public Integer insert(ZrstRepEffectViewTab bean);

    public Integer update(ZrstRepEffectViewTab bean);

    public List selectList(ZrstRepEffectViewTabQuery query);

    public ZrstRepEffectViewTab selectById(Integer id);

    public Integer delete(ZrstRepEffectViewTab bean);
}
