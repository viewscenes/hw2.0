
package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquInstallTab;
import com.hw.domain.po.query.RadioEquInstallTabQuery;


public interface RadioEquInstallTabMapper {

    public Integer insert(RadioEquInstallTab bean);

    public Integer update(RadioEquInstallTab bean);

    public Page selectList(RadioEquInstallTabQuery query);

    public RadioEquInstallTab selectById(Integer id);

    public Integer delete(RadioEquInstallTab bean);
}
