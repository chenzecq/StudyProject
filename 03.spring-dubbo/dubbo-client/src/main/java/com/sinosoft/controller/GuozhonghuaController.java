package com.sinosoft.controller;

import com.sinosoft.service.GuozhonghuaDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guozhonghua on 2017/2/16.
 */
@Controller
public class GuozhonghuaController {

    @Autowired
    private GuozhonghuaDubboService guozhonghuaDubboService;


    @RequestMapping(value = "/GuozhonghuaDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return guozhonghuaDubboService.sendMsg(params);
    }
}
