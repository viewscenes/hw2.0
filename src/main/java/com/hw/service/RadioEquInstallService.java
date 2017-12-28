
package com.hw.service;

import com.hw.domain.po.RadioEquInstallTab;
import com.hw.domain.po.query.RadioEquInstallTabQuery;

import java.util.List;


public interface RadioEquInstallService{

    public Integer insert(RadioEquInstallTab bean);

    public Integer update(RadioEquInstallTab bean);

    public List selectList(RadioEquInstallTabQuery query);

    public RadioEquInstallTab selectById(Integer id);

    public Integer delete(RadioEquInstallTab bean);
}
