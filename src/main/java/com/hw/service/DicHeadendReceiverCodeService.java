
package com.hw.service;


import com.hw.domain.po.DicHeadendReceiverCodeTab;
import com.hw.domain.po.query.DicHeadendReceiverCodeTabQuery;

import java.util.List;

public interface DicHeadendReceiverCodeService{

    public Integer insert(DicHeadendReceiverCodeTab bean);

    public Integer update(DicHeadendReceiverCodeTab bean);

    public List selectList(DicHeadendReceiverCodeTabQuery query);

    public DicHeadendReceiverCodeTab selectById(Integer id);

    public Integer delete(DicHeadendReceiverCodeTab bean);
}
