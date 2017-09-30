package com.syx.controller;

import com.alibaba.fastjson.JSON;
import com.syx.domain.UserInfo;
import com.syx.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shao_yx on 2017/9/26.
 */
@Controller
@EnableAutoConfiguration
public class DemoController {
    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {
        return "hello";
    }


    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser() {
        UserInfo userInfo = userInfoService.get(1L);
        return JSON.toJSONString(userInfo);
    }
}
