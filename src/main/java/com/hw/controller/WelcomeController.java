package com.hw.controller;

import com.hw.common.constant.SystemConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页入口.
 */
@Controller
public class WelcomeController  {
    public static final String VIEW_PATH = "/";

    @RequestMapping(value = {"/index"})
    public String index(){
        return SystemConstants.SYSTEM_INDEX;
    }

}
