
package com.hw.service;


import com.hw.domain.po.SmsSendstateTab;
import com.hw.domain.po.query.SmsSendstateTabQuery;

import java.util.List;

public interface SmsSendstateService{
    public Integer insert(SmsSendstateTab bean);

    public Integer update(SmsSendstateTab bean);

    public List selectList(SmsSendstateTabQuery query);

    public SmsSendstateTab selectById(Integer id);

    public Integer delete(SmsSendstateTab bean);

}
