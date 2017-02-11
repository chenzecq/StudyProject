package com.sinosoft.controller;

import com.sinosoft.service.LigaomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ligm on 2017/2/9.
 */
@Controller
public class LigaomingController {
    @Autowired
    private LigaomingService ligaomingService;
    @RequestMapping(path = "/test/{a}",method = RequestMethod.GET)//设置访问地址
    @ResponseBody
    public String Hello(@PathVariable String a,String b){//@PathVariable 取路径中的变量
        b = " world!";
        return ligaomingService.test(a,b);
    }
}
