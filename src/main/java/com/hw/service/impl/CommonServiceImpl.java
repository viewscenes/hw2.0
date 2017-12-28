
package com.hw.service.impl;


import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;
import com.hw.service.CommonService;
import com.hw.service.ResHeadendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    private ResHeadendService resHeadendService;

    @Override
    public Map getHeadendMap_headcodeAndheadname() {
        ResHeadendTabQuery query =new ResHeadendTabQuery();
        Map headendMap=new HashMap();
        List<ResHeadendTab> list=  resHeadendService.selectDistinctHeadendList(query);
        for(int i=0;i<list.size();i++)
        {
            headendMap.put(list.get(i).getCode(),list.get(i).getSite());
        }
        return headendMap;
    }
}
