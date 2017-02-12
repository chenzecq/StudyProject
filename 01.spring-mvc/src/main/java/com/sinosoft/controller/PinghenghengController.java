package com.sinosoft.controller;


import com.sinosoft.service.PinghenghengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pinghengheng on 2017/2/12.
 * 平恒恒-测试-主要的控制类，处理业务逻辑，调用Service。
 */
@Controller
public class PinghenghengController {
    @Autowired
    private PinghenghengService pinghenghengService;

    @RequestMapping(path = "/pinghengheng/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloPinghengheng(@PathVariable String params){
        return pinghenghengService.pinghengheng(params);
    }
}
