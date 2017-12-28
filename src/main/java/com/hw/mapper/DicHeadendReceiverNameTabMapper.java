
package com.hw.mapper;



import com.github.pagehelper.Page;
import com.hw.domain.po.DicHeadendReceiverNameTab;
import com.hw.domain.po.query.DicHeadendReceiverNameTabQuery;


public interface DicHeadendReceiverNameTabMapper {

    public Integer insert(DicHeadendReceiverNameTab bean);

    public Integer update(DicHeadendReceiverNameTab bean);

    public Page selectList(DicHeadendReceiverNameTabQuery query);

    public DicHeadendReceiverNameTab selectById(Integer id);

    public Integer delete(DicHeadendReceiverNameTab bean);
}
