
package com.hw.service;


import com.hw.domain.po.ZrstRepQualityTab;
import com.hw.domain.po.query.ZrstRepQualityTabQuery;

import java.util.List;

public interface ZrstRepQualityService{

    public Integer insert(ZrstRepQualityTab bean);

    public Integer update(ZrstRepQualityTab bean);

    public List selectList(ZrstRepQualityTabQuery query);

    public ZrstRepQualityTab selectById(Integer id);

    public Integer delete(ZrstRepQualityTab bean);
}
