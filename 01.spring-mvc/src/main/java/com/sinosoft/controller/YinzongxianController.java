package com.sinosoft.controller;

import com.sinosoft.service.YinzongxianService;
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
public class YinzongxianController {


    @Autowired
    private YinzongxianService yinzongxianService;

    @RequestMapping(path = "/yinzongxian/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloYinzongxian(@PathVariable String params){
        return yinzongxianService.yinzongxian(params);
    }
}
