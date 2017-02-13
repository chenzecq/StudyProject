package com.sinosoft.controller;

import com.sinosoft.service.YangmingDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangming on 2017/2/12.
 */
@Controller
public class YangmingController {

    @Autowired
    private YangmingDubboService yangmingDubboService;


    @RequestMapping(value = "/YangmingDubbo/{params}",method = RequestMethod.GET)
    public String service(@PathVariable("params") String params){

        return yangmingDubboService.sendMsg(params);
    }
}
