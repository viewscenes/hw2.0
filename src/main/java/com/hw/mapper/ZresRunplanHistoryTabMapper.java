
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanHistoryTab;
import com.hw.domain.po.query.ZresRunplanHistoryTabQuery;


public interface ZresRunplanHistoryTabMapper {

    public Integer insert(ZresRunplanHistoryTab bean);

    public Integer update(ZresRunplanHistoryTab bean);

    public Page selectList(ZresRunplanHistoryTabQuery query);

    public ZresRunplanHistoryTab selectById(Integer id);

    public Integer delete(ZresRunplanHistoryTab bean);
}
