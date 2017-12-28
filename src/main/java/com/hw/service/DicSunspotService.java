
package com.hw.service;



import com.hw.domain.po.DicSunspotTab;
import com.hw.domain.po.query.DicSunspotTabQuery;

import java.util.List;

public interface DicSunspotService{

    public Integer insert(DicSunspotTab bean);

    public Integer update(DicSunspotTab bean);

    public List selectList(DicSunspotTabQuery query);

    public DicSunspotTab selectById(Integer id);

    public Integer delete(DicSunspotTab bean);
}
