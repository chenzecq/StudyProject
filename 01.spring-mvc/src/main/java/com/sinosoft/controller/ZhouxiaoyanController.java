package com.sinosoft.controller;

import com.sinosoft.service.ZhouxiaoyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jarod on 2017/2/9.
 */
@Controller
public class ZhouxiaoyanController {


    @Autowired
    private ZhouxiaoyanService zhouxiaoyanService;

    @RequestMapping(path = "/zhouxiaoyan/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloZhouxiaoyan(@PathVariable String params){
        return zhouxiaoyanService.zhouxiaoyan(params);
    }
}
