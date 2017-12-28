
package com.hw.service.language;

import com.github.pagehelper.Page;
import com.hw.domain.po.ZdicLanguageTab;
import com.hw.domain.po.query.ZdicLanguageTabQuery;

import java.util.List;


public interface ZdicLanguageService{
    public Integer insert(ZdicLanguageTab bean);

    public Integer update(ZdicLanguageTab bean);

    public Page selectPage(ZdicLanguageTabQuery query);

    public List<ZdicLanguageTab> selectList(ZdicLanguageTabQuery query);

    public ZdicLanguageTab selectById(Integer id);

    public Integer delete(ZdicLanguageTab bean);

    public List<ZdicLanguageTab> selectLanguageList(ZdicLanguageTabQuery query);

}
