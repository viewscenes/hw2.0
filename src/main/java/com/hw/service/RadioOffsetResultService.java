
package com.hw.service;



import com.hw.domain.po.RadioOffsetResultTab;
import com.hw.domain.po.query.RadioOffsetResultTabQuery;

import java.util.List;

public interface RadioOffsetResultService{

    public Integer insert(RadioOffsetResultTab bean);

    public Integer update(RadioOffsetResultTab bean);

    public List selectList(RadioOffsetResultTabQuery query);

    public RadioOffsetResultTab selectById(Integer id);

    public Integer delete(RadioOffsetResultTab bean);
}
