package com.sinosoft.controller;

import com.sinosoft.service.JialeiDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.NullSourceExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Theron on 2017/2/16.
 */
@Controller
public class JialeiController {
    @Autowired
    private JialeiDubboService jialeiDubboService;

    @RequestMapping(value = "JialeiDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){
        return jialeiDubboService.sendMsg(params);
    }
}
