
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanTab;
import com.hw.domain.po.query.ZresRunplanTabQuery;

import java.util.List;


public interface ZresRunplanTabMapper {

    public Integer insert(ZresRunplanTab bean);

    public Integer update(ZresRunplanTab bean);

    public Page selectPage(ZresRunplanTabQuery query);

    public List<ZresRunplanTab> selectList(ZresRunplanTabQuery query);

    public ZresRunplanTab selectById(Integer id);

    public Integer delete(ZresRunplanTabQuery bean);
}
