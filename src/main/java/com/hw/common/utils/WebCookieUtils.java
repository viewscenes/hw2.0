package com.hw.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class WebCookieUtils {
    public void setCookie(HttpServletResponse response, Cookie cookie) {
        response.addCookie(cookie);
    }
    
    public Cookie readCookie(HttpServletRequest request, String name){
        Cookie[] cookies = request.getCookies();
        if(cookies==null||cookies.length<=0){
            return null;
        }
        for(Cookie cookie : cookies){
            if(StringUtils.equals(cookie.getName(), name)){
                return cookie;
            }
        }
        return null;
    }
    //提供没有加密的cookie
    public Cookie createCookie(int maxAge, String path, String name, String value){
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(maxAge);
        cookie.setPath(path);
        return cookie;
    }

    public static Cookie getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
        }
        return null;
    }
}
