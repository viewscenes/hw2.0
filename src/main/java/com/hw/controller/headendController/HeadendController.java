package com.hw.controller.headendController;

import com.hw.common.constant.SystemConstants;
import com.hw.domain.po.ResHeadendTab;
import com.hw.domain.po.query.ResHeadendTabQuery;
import com.hw.domain.vo.FtpServerVo;
import com.hw.service.ResHeadendService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liubin11 on 2017/12/21.
 */
@Controller
@RequestMapping("/headend")
public class HeadendController {

    private final Logger log = LoggerFactory.getLogger(HeadendController.class);

    @Resource
    private ResHeadendService headendService;
    /**
     * 设备id
     * @param searchPara
     * 按照大洲进行分
     * @return
     */
    @PostMapping(value="/query")
    @ResponseBody
    public List<ResHeadendTab> queryHeandend(String searchPara )  {
        List<ResHeadendTab>  headendList  =null;
        try{
           if(searchPara!=null)
           {
                   ResHeadendTabQuery query =new ResHeadendTabQuery();
                   if (StringUtils.isNumeric(searchPara)){
                       query.setHeadId(Integer.parseInt(searchPara));
                   }
                   query.setServiceName(searchPara);
                   query.setCode(searchPara);
                   query.setShortname(searchPara);
                   query.setCountry(searchPara);
                   query.setDefaultLanguage(searchPara);
                   query.setSite(searchPara);
                   query.setStationName(searchPara);
                   query.setIp(searchPara);
               headendList =  headendService.fuzzySearchHeand(query);
           }
        } catch (Exception e) {
            log.error("查询站点信息失败：",e);
        }
        return  headendList;
    }

}
