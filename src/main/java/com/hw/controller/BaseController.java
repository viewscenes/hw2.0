package com.hw.controller;

import com.hw.common.enums.LogTypeEnum;
import com.hw.common.utils.WebCookieUtils;


import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author huanghaiping
 */
public  class BaseController {

    private static final org.slf4j.Logger log  = LogTypeEnum.DEFAULT.getLog();


    public
    @Resource
    WebCookieUtils webCookieUtils;

    public Cookie readCookie(HttpServletRequest request, String name) {
        return webCookieUtils.readCookie(request, name);
    }

    //提供没有加密的cookie
    public void createCookie(HttpServletResponse response, int maxAge, String path, String name, String value) {
        Cookie cookie = webCookieUtils.createCookie( maxAge, path, name, value);
        webCookieUtils.setCookie(response, cookie);
    }


}
