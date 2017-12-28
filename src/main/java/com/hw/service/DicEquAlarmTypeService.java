
package com.hw.service;

import com.hw.domain.po.DicEquAlarmTypeTab;
import com.hw.domain.po.query.DicEquAlarmTypeTabQuery;

import java.util.List;


public interface DicEquAlarmTypeService{

    public Integer insert(DicEquAlarmTypeTab bean);

    public Integer update(DicEquAlarmTypeTab bean);

    public List selectList(DicEquAlarmTypeTabQuery query);

    public DicEquAlarmTypeTab selectById(Integer id);

    public Integer delete(DicEquAlarmTypeTab bean);
}
