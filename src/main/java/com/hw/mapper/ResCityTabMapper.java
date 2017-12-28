
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.ResCityTab;
import com.hw.domain.po.query.ResCityTabQuery;

import java.util.List;


public interface ResCityTabMapper {

    public Integer insert(ResCityTab bean);

    public Integer update(ResCityTab bean);

    public Page selectList(ResCityTabQuery query);

    public ResCityTab selectById(Integer id);

    public Integer delete(ResCityTab bean);


    public List<ResCityTab> getAllContryList();

    public List<ResCityTab> getCityByCountry(ResCityTabQuery query);
}
