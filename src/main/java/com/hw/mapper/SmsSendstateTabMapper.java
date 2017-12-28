
package com.hw.mapper;


import com.github.pagehelper.Page;
import com.hw.domain.po.SmsSendstateTab;
import com.hw.domain.po.query.SmsSendstateTabQuery;


public interface SmsSendstateTabMapper {
    public Integer insert(SmsSendstateTab bean);

    public Integer update(SmsSendstateTab bean);

    public Page selectList(SmsSendstateTabQuery query);

    public SmsSendstateTab selectById(Integer id);

    public Integer delete(SmsSendstateTab bean);

}
