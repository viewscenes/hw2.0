
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.RadioEquLogTab;
import com.hw.domain.po.query.RadioEquLogTabQuery;


public interface RadioEquLogTabMapper {

    public Integer insert(RadioEquLogTab bean);

    public Integer update(RadioEquLogTab bean);

    public Page selectList(RadioEquLogTabQuery query);

    public RadioEquLogTab selectById(Integer id);

    public Integer delete(RadioEquLogTab bean);
}
