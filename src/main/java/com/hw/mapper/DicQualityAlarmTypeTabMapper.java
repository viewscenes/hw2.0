
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicQualityAlarmTypeTab;
import com.hw.domain.po.query.DicQualityAlarmTypeTabQuery;


public interface DicQualityAlarmTypeTabMapper {

    public Integer insert(DicQualityAlarmTypeTab bean);

    public Integer update(DicQualityAlarmTypeTab bean);

    public Page selectList(DicQualityAlarmTypeTabQuery query);

    public DicQualityAlarmTypeTab selectById(Integer id);

    public Integer delete(DicQualityAlarmTypeTab bean);
}
