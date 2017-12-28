
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.ZrstRepAbnormalTab;
import com.hw.domain.po.query.ZrstRepAbnormalTabQuery;

public interface ZrstRepAbnormalService{
    public Integer insert(ZrstRepAbnormalTab bean);

    public Integer update(ZrstRepAbnormalTab bean);

    public Page selectList(ZrstRepAbnormalTabQuery query);

    public ZrstRepAbnormalTab selectById(Integer id);

    public Integer delete(ZrstRepAbnormalTab bean);

}
