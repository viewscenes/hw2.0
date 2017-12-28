
package com.hw.mapper;
import com.github.pagehelper.Page;
import com.hw.domain.po.DicTaskTypeTab;
import com.hw.domain.po.query.DicTaskTypeTabQuery;


public interface DicTaskTypeTabMapper {

    public Integer insert(DicTaskTypeTab bean);

    public Integer update(DicTaskTypeTab bean);

    public Page selectList(DicTaskTypeTabQuery query);

    public DicTaskTypeTab selectById(Integer id);

    public Integer delete(DicTaskTypeTab bean);
}
