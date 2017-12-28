
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.ZresFreqTimeTab;
import com.hw.domain.po.query.ZresFreqTimeTabQuery;

public interface ZresFreqTimeService{

    public Integer insert(ZresFreqTimeTab bean);

    public Integer update(ZresFreqTimeTab bean);

    public Page selectList(ZresFreqTimeTabQuery query);

    public ZresFreqTimeTab selectById(Integer id);

    public Integer delete(ZresFreqTimeTab bean);
}
