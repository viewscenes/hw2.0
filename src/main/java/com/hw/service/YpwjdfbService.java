
package com.hw.service;



import com.hw.domain.po.Ypwjdfb;
import com.hw.domain.po.query.YpwjdfbQuery;

import java.util.List;

public interface YpwjdfbService{
    public Integer insert(Ypwjdfb bean);

    public Integer update(Ypwjdfb bean);

    public List selectList(YpwjdfbQuery query);

    public Ypwjdfb selectById(Integer id);

    public Integer delete(Ypwjdfb bean);

}
