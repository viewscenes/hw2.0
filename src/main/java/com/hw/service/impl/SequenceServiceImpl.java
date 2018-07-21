
package com.hw.service.impl;


import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;
import com.hw.mapper.SequenceMapper;
import com.hw.service.CommonService;
import com.hw.service.ResHeadendService;
import com.hw.service.SequenceService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
public class SequenceServiceImpl implements SequenceService {

    @Resource
    private SequenceMapper sequenceMapper;


    @Override
    public Long getNextSequence(String sequence) {
        return sequenceMapper.getNextSequence(sequence);
    }
}
