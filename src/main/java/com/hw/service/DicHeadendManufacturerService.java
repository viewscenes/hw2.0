
package com.hw.service;



import com.hw.domain.po.DicHeadendManufacturerTab;
import com.hw.domain.po.query.DicHeadendManufacturerTabQuery;

import java.util.List;

public interface DicHeadendManufacturerService{

    public Integer insert(DicHeadendManufacturerTab bean);

    public Integer update(DicHeadendManufacturerTab bean);

    public List selectList(DicHeadendManufacturerTabQuery query);

    public DicHeadendManufacturerTab selectById(Integer id);

    public Integer delete(DicHeadendManufacturerTab bean);
}
