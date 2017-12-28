
package com.hw.service;



import com.hw.domain.po.RadioStreamMarkResultTab;
import com.hw.domain.po.query.RadioStreamMarkResultTabQuery;

import java.util.List;

public interface RadioStreamMarkResultService {

    public Integer insert(RadioStreamMarkResultTab bean);

    public Integer update(RadioStreamMarkResultTab bean);

    public List selectPage(RadioStreamMarkResultTabQuery query);

    public List<RadioStreamMarkResultTab> selectList(RadioStreamMarkResultTabQuery query);

    public RadioStreamMarkResultTab selectById(Integer id);

    public Integer delete(RadioStreamMarkResultTab bean);

    public Integer batchInsert(List<RadioStreamMarkResultTab> list);
}
