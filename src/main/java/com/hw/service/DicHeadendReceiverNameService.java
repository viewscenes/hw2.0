
package com.hw.service;



import com.github.pagehelper.Page;
import com.hw.domain.po.DicHeadendReceiverNameTab;
import com.hw.domain.po.query.DicHeadendReceiverNameTabQuery;

public interface DicHeadendReceiverNameService{

    public Integer insert(DicHeadendReceiverNameTab bean);

    public Integer update(DicHeadendReceiverNameTab bean);

    public Page selectList(DicHeadendReceiverNameTabQuery query);

    public DicHeadendReceiverNameTab selectById(Integer id);

    public Integer delete(DicHeadendReceiverNameTab bean);
}
