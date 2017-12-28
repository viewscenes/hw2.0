
package com.hw.service;

import com.hw.domain.po.DicQualityAlarmTypeTab;
import com.hw.domain.po.query.DicQualityAlarmTypeTabQuery;

import java.util.List;


public interface DicQualityAlarmTypeService{

    public Integer insert(DicQualityAlarmTypeTab bean);

    public Integer update(DicQualityAlarmTypeTab bean);

    public List selectList(DicQualityAlarmTypeTabQuery query);

    public DicQualityAlarmTypeTab selectById(Integer id);

    public Integer delete(DicQualityAlarmTypeTab bean);
}
