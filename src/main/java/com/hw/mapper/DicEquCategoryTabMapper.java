
package com.hw.mapper;



import com.github.pagehelper.Page;
import com.hw.domain.po.DicEquCategoryTab;
import com.hw.domain.po.query.DicEquCategoryTabQuery;


public interface DicEquCategoryTabMapper{

    public Integer insert(DicEquCategoryTab bean);

    public Integer update(DicEquCategoryTab bean);

    public Page selectList(DicEquCategoryTabQuery query);

    public DicEquCategoryTab selectById(Integer id);

    public Integer delete(DicEquCategoryTab bean);
}
