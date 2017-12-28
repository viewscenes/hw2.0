
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.DicSunspotTab;
import com.hw.domain.po.query.DicSunspotTabQuery;


public interface DicSunspotTabMapper {

    public Integer insert(DicSunspotTab bean);

    public Integer update(DicSunspotTab bean);

    public Page selectList(DicSunspotTabQuery query);

    public DicSunspotTab selectById(Integer id);

    public Integer delete(DicSunspotTab bean);
}
