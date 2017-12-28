
package com.hw.mapper;


import com.hw.domain.po.DicHeadendManufacturerTab;
import com.hw.domain.po.query.DicHeadendManufacturerTabQuery;

import java.util.List;


public interface DicHeadendManufacturerTabMapper{

    public Integer insert(DicHeadendManufacturerTab bean);

    public Integer update(DicHeadendManufacturerTab bean);

    public List selectList(DicHeadendManufacturerTabQuery query);

    public DicHeadendManufacturerTab selectById(Integer id);

    public Integer delete(DicHeadendManufacturerTab bean);
}
