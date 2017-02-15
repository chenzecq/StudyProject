package com.sinosoft.controller;

import com.sinosoft.service.ChencaiyongDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chency on 2017/2/14.
 */
@Controller
public class ChencaiyongController {
    @Autowired
    private ChencaiyongDubboService chencaiyongDubboService;
    @RequestMapping(value = "/ChencaiyongDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params")String params){
        return  chencaiyongDubboService.sendMsg(params)      ;
    }
}
