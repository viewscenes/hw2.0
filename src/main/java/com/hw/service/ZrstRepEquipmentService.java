
package com.hw.service;



import com.hw.domain.po.ZrstRepEquipmentTab;
import com.hw.domain.po.query.ZrstRepEquipmentTabQuery;

import java.util.List;

public interface ZrstRepEquipmentService{

    public Integer insert(ZrstRepEquipmentTab bean);

    public Integer update(ZrstRepEquipmentTab bean);

    public List selectList(ZrstRepEquipmentTabQuery query);

    public ZrstRepEquipmentTab selectById(Integer id);

    public Integer delete(ZrstRepEquipmentTab bean);
}
