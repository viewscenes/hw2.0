package com.hw.controller;

import com.hw.common.constant.SystemConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页入口.
 */
@Controller
public class WelcomeController  {
    public static final String VIEW_PATH = "/";

    @GetMapping(value = {"/index","/"})
    public String index(){
        return SystemConstants.SYSTEM_INDEX;
    }

}
