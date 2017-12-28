
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResAntennaTab;
import com.hw.domain.po.query.ResAntennaTabQuery;


public interface ResAntennaTabMapper {

    public Integer insert(ResAntennaTab bean);

    public Integer update(ResAntennaTab bean);

    public Page selectList(ResAntennaTabQuery query);

    public ResAntennaTab selectById(Integer id);

    public Integer delete(ResAntennaTab bean);
}
