
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepTab;
import com.hw.domain.po.query.ZrstRepTabQuery;


public interface ZrstRepTabMapper {

    public Integer insert(ZrstRepTab bean);

    public Integer update(ZrstRepTab bean);

    public Page selectList(ZrstRepTabQuery query);

    public ZrstRepTab selectById(Integer id);

    public Integer delete(ZrstRepTab bean);

    public ZrstRepTab getReportFromStarttimeEndtimeReportType(ZrstRepTabQuery query);
}
