
package com.hw.service;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepTab;
import com.hw.domain.po.query.ZrstRepTabQuery;

import java.util.List;

public interface ZrstRepService{

    public Integer insert(ZrstRepTab bean);

    public Integer update(ZrstRepTab bean);

    public List selectList(ZrstRepTabQuery query);

    public ZrstRepTab selectById(Integer id);

    public ZrstRepTab getReportFromStarttimeEndtimeReportType(ZrstRepTabQuery query);

    public Integer delete(ZrstRepTab bean);

    public Page selectReportDetailList(ZrstRepTab report);
}
