
package com.hw.mapper;

import com.hw.domain.po.DicEventTypeTab;
import com.hw.domain.po.query.DicEventTypeTabQuery;

import java.util.List;


public interface DicEventTypeTabMapper{

    public Integer insert(DicEventTypeTab bean);

    public Integer update(DicEventTypeTab bean);

    public List selectList(DicEventTypeTabQuery query);

    public DicEventTypeTab selectById(Integer id);

    public Integer delete(DicEventTypeTab bean);
}
