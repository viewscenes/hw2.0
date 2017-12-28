
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.DicReportTypeTab;
import com.hw.domain.po.query.DicReportTypeTabQuery;


public interface DicReportTypeTabMapper {

    public Integer insert(DicReportTypeTab bean);

    public Integer update(DicReportTypeTab bean);

    public Page selectList(DicReportTypeTabQuery query);

    public DicReportTypeTab selectById(Integer id);

    public Integer delete(DicReportTypeTab bean);
}
