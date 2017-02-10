package com.sinosoft.controller;

import com.sinosoft.service.GuzhonghuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gzh on 2017/2/10.
 */
@Controller   //此层是控制层   因此用@Controller注解
public class GuzhonghuiController {

    @Autowired  //将业务层的接口注入    目的：将业务层和控制层减低耦合度
    private GuzhonghuiService guzhonghuiService;


    @RequestMapping(path = "/guzhonghui/{params}", method = RequestMethod.GET)
    //path 为请求地址 其中 {params}  请求参数
    //method  请求方式
    @ResponseBody
    //向页面传值
    public String helloGuzhong(@PathVariable String params) {
        return guzhonghuiService.guzhonghui(params);
    }
}
