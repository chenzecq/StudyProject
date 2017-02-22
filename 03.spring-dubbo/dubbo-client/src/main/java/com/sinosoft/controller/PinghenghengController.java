package com.sinosoft.controller;

import com.sinosoft.service.PinghenghengDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pinghengheng on 2017/2/19.
 * 控制类
 */
@Controller
public class PinghenghengController {

    @Autowired
    private PinghenghengDubboService pinghenghengDubboService;

    @RequestMapping(value = "/PinghenghengDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return pinghenghengDubboService.sendMsg(params);

    }
}
