
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.Ypwjdfb;
import com.hw.domain.po.query.YpwjdfbQuery;


public interface YpwjdfbMapper {
    public Integer insert(Ypwjdfb bean);

    public Integer update(Ypwjdfb bean);

    public Page selectList(YpwjdfbQuery query);

    public Ypwjdfb selectById(Integer id);

    public Integer delete(Ypwjdfb bean);

}
