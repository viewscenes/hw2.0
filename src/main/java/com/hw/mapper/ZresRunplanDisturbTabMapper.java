
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanDisturbTab;
import com.hw.domain.po.query.ZresRunplanDisturbTabQuery;

import java.util.List;


public interface ZresRunplanDisturbTabMapper{

    public Integer insert(ZresRunplanDisturbTab bean);

    public Integer update(ZresRunplanDisturbTab bean);

    public Page selectPage(ZresRunplanDisturbTabQuery query);

    public ZresRunplanDisturbTab selectById(Integer id);

    public Integer delete(ZresRunplanDisturbTab bean);

    public List<ZresRunplanDisturbTab> selectList(ZresRunplanDisturbTabQuery query);
}
