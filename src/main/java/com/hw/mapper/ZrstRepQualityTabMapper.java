
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepQualityTab;
import com.hw.domain.po.query.ZrstRepQualityTabQuery;


public interface ZrstRepQualityTabMapper {

    public Integer insert(ZrstRepQualityTab bean);

    public Integer update(ZrstRepQualityTab bean);

    public Page selectList(ZrstRepQualityTabQuery query);

    public ZrstRepQualityTab selectById(Integer id);

    public Integer delete(ZrstRepQualityTab bean);
}
