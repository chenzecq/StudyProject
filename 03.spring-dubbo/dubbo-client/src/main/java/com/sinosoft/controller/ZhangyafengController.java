package com.sinosoft.controller;

import com.sinosoft.service.ZhangyafengDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sinosoft.zyf on 2017/2/15.
 */
@Controller
public class ZhangyafengController {

    @Autowired
    ZhangyafengDubboService zhangyafengDubboService;

    @RequestMapping(value = "/ZhangyafengDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable String params){
        String s = zhangyafengDubboService.sendMsg(params);
        return s;
    }

}
