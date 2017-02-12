package com.sinosoft.controller;

import com.sinosoft.service.ZhangjdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jarod on 2017/2/11
 */
@Controller
public class ZhangjdController {


    @Autowired
    private ZhangjdService zhangjdservice;

    @RequestMapping(path = "/Zhangjd/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloZhangjd(@PathVariable String params){
        return zhangjdservice.Zhangjd(params);
    }
}
