package com.hw.controller;

import com.hw.common.enums.LogTypeEnum;
import com.hw.common.utils.MD5;
import com.hw.common.utils.Result;
import com.hw.common.utils.ResultFactory;
import com.hw.domain.po.SecUserTab;
import com.hw.domain.po.query.SecUserTabQuery;
import com.hw.service.user.SecUserService;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liubin11 on 2017/10/13.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Log log  = LogTypeEnum.DEFAULT.getLog();
    @Resource
    private SecUserService secUserService;

    /**
     * 登录
     * @param query
     * @return
     */
    @RequestMapping(value="/login" , method = RequestMethod.POST)
    @ResponseBody
    public Result update(@RequestBody SecUserTabQuery query )  {
        Result result ;
        try{
            MD5 md5 = new MD5();
            query.setUserPassword(md5.getMD5ofStr(query.getUserPassword()));
            SecUserTab user =  secUserService.selectOneUser(query);
            if (user != null) {
                result =  ResultFactory.getSuccessResult();
            } else {
                result = ResultFactory.getErrorResult("用户名或者密码错误，请重新登录!");
            }
        } catch (Exception e) {
            log.error("登录失败！",e);
            result = ResultFactory.getErrorResult("登录失败!");
        }
        return result;
    }
}
