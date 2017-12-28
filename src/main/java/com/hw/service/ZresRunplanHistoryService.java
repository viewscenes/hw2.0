
package com.hw.service;


import com.hw.domain.po.ZresRunplanHistoryTab;
import com.hw.domain.po.query.ZresRunplanHistoryTabQuery;

import java.util.List;

public interface ZresRunplanHistoryService{

    public Integer insert(ZresRunplanHistoryTab bean);

    public Integer update(ZresRunplanHistoryTab bean);

    public List selectList(ZresRunplanHistoryTabQuery query);

    public ZresRunplanHistoryTab selectById(Integer id);

    public Integer delete(ZresRunplanHistoryTab bean);
}
