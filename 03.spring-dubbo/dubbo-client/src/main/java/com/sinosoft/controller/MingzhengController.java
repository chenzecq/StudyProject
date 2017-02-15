package com.sinosoft.controller;

import com.sinosoft.service.MingzhengDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mingzheng on 17/2/15.
 */
@Controller
public class MingzhengController {
    @Autowired
    private MingzhengDubboService mingzhengDubboService;

    @RequestMapping(value = "/mingzhengDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){
        return mingzhengDubboService.sendMsg(params);
    }
}
