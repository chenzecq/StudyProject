package com.sinosoft.controller;

import com.sinosoft.service.GuoruisongDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by grs on 2017/2/15.
 */
@Controller
public class GuoruisongController {

    @Autowired
    private GuoruisongDubboService guoruisongDubboService;


    @RequestMapping(value = "/GuoruisongDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return guoruisongDubboService.sendMsg(params);
    }
}
