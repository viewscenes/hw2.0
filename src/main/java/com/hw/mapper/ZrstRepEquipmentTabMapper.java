
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepEquipmentTab;
import com.hw.domain.po.query.ZrstRepEquipmentTabQuery;


public interface ZrstRepEquipmentTabMapper {

    public Integer insert(ZrstRepEquipmentTab bean);

    public Integer update(ZrstRepEquipmentTab bean);

    public Page selectList(ZrstRepEquipmentTabQuery query);

    public ZrstRepEquipmentTab selectById(Integer id);

    public Integer delete(ZrstRepEquipmentTab bean);
}
