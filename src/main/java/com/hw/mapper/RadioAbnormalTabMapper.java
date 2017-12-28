
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioAbnormalTab;
import com.hw.domain.po.query.RadioAbnormalTabQuery;


public interface RadioAbnormalTabMapper {

    public Integer insert(RadioAbnormalTab bean);

    public Integer update(RadioAbnormalTab bean);

    public Page selectList(RadioAbnormalTabQuery query);

    public RadioAbnormalTab selectById(Integer id);

    public Integer delete(RadioAbnormalTab bean);
}
