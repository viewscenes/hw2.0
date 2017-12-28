/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.hw.mapper;

import com.github.pagehelper.Page;
import com.hw.domain.po.RadioStreamMarkResultTab;
import com.hw.domain.po.query.RadioStreamMarkResultTabQuery;

import java.util.List;


public interface RadioStreamMarkResultTabMapper {

    public Integer insert(RadioStreamMarkResultTab bean);

    public Integer update(RadioStreamMarkResultTab bean);

    public Page selectPage(RadioStreamMarkResultTabQuery query);

    public List<RadioStreamMarkResultTab> selectList(RadioStreamMarkResultTabQuery query);

    public RadioStreamMarkResultTab selectById(Integer id);

    public Integer delete(RadioStreamMarkResultTab bean);

    public Integer batchInsert(List<RadioStreamMarkResultTab> list);

}
