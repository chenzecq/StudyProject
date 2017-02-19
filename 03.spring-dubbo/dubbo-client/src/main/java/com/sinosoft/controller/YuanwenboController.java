package com.sinosoft.controller;

import com.sinosoft.service.YuanwenboDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ywb on 2017/2/16.
 */
@Controller
public class YuanwenboController {
    @Autowired
    private YuanwenboDubboService yuanwenboDubboService;
    @RequestMapping(value = "/yuanwenboDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){
        return  yuanwenboDubboService.sendMsg(params);
    }
}
