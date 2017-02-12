package com.sinosoft.controller;

import com.sinosoft.service.WeixiangyouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wei on 2017/2/12.
 */
@Controller
public class WeixiangyouController {
    //完成自动装配的工作
    @Autowired
    public WeixiangyouService weixiangyouService;

    @RequestMapping(path = "/weixiangyou/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String callWeixiangyou(@PathVariable String params){
        return weixiangyouService.getName(params);
    }
}
