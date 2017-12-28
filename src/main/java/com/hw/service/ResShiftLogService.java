
package com.hw.service;


import com.hw.domain.po.ResShiftLogTab;
import com.hw.domain.po.query.ResShiftLogTabQuery;

import java.util.List;

public interface ResShiftLogService{
    public Integer insert(ResShiftLogTab bean);

    public Integer update(ResShiftLogTab bean);

    public List selectList(ResShiftLogTabQuery query);

    public ResShiftLogTab selectById(Integer id);

    public Integer delete(ResShiftLogTab bean);

}
