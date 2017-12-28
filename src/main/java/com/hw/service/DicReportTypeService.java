
package com.hw.service;

import com.hw.domain.po.DicReportTypeTab;
import com.hw.domain.po.query.DicReportTypeTabQuery;

import java.util.List;


public interface DicReportTypeService{

    public Integer insert(DicReportTypeTab bean);

    public Integer update(DicReportTypeTab bean);

    public List selectList(DicReportTypeTabQuery query);

    public DicReportTypeTab selectById(Integer id);

    public Integer delete(DicReportTypeTab bean);
}
