package com.sinosoft.controller;

import com.sinosoft.service.ZhouchaoguangDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Zhoucg.  on 2017/2/16.
 */

@Controller
public class ZhouchaoguangController {
    @Autowired
    private ZhouchaoguangDubboService zhouchaoguangDubboService;
    @RequestMapping(value = "/ZhouchaoguangDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){
        return zhouchaoguangDubboService.sendMsg(params);
    }
}
