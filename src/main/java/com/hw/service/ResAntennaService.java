
package com.hw.service;


import com.hw.domain.po.ResAntennaTab;
import com.hw.domain.po.query.ResAntennaTabQuery;

import java.util.List;

public interface ResAntennaService{

    public Integer insert(ResAntennaTab bean);

    public Integer update(ResAntennaTab bean);

    public List selectList(ResAntennaTabQuery query);

    public ResAntennaTab selectById(Integer id);

    public Integer delete(ResAntennaTab bean);
}
