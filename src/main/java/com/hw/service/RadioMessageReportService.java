
package com.hw.service;

import com.hw.domain.po.RadioMessageReportTab;
import com.hw.domain.po.query.RadioMessageReportTabQuery;

import java.util.List;


public interface RadioMessageReportService{

    public Integer insert(RadioMessageReportTab bean);

    public Integer update(RadioMessageReportTab bean);

    public List selectList(RadioMessageReportTabQuery query);

    public RadioMessageReportTab selectById(Integer id);

    public Integer delete(RadioMessageReportTab bean);
}
