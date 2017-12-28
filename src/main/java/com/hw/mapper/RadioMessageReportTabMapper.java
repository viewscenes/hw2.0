
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioMessageReportTab;
import com.hw.domain.po.query.RadioMessageReportTabQuery;


public interface RadioMessageReportTabMapper {

    public Integer insert(RadioMessageReportTab bean);

    public Integer update(RadioMessageReportTab bean);

    public Page selectList(RadioMessageReportTabQuery query);

    public RadioMessageReportTab selectById(Integer id);

    public Integer delete(RadioMessageReportTab bean);
}
