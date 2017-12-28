
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ZresRunplanChaifenTab;
import com.hw.domain.po.query.ZresRunplanChaifenTabQuery;


public interface ZresRunplanChaifenTabMapper {

    public Integer insert(ZresRunplanChaifenTab bean);

    public Integer update(ZresRunplanChaifenTab bean);

    public Page selectList(ZresRunplanChaifenTabQuery query);

    public ZresRunplanChaifenTab selectById(Integer id);

    public Integer delete(ZresRunplanChaifenTab bean);
}
