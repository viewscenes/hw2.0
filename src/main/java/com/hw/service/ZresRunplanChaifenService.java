
package com.hw.service;


import com.hw.domain.po.ZresRunplanChaifenTab;
import com.hw.domain.po.query.ZresRunplanChaifenTabQuery;

import java.util.List;

public interface ZresRunplanChaifenService{

    public Integer insert(ZresRunplanChaifenTab bean);

    public Integer update(ZresRunplanChaifenTab bean);

    public List selectList(ZresRunplanChaifenTabQuery query);

    public ZresRunplanChaifenTab selectById(Integer id);

    public Integer delete(ZresRunplanChaifenTab bean);
}
