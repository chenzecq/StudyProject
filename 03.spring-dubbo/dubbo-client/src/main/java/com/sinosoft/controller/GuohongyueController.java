package com.sinosoft.controller;

import com.sinosoft.service.GuohongyueDubbleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Henry on 2017-02-19 0019.
 */
@Controller
public class GuohongyueController {

    @Autowired
    private GuohongyueDubbleService guohongyueDubbleService;

    @RequestMapping(value = "/GuohongyueDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){
        return guohongyueDubbleService.sendMessage(params);
    }
}
