package com.sinosoft.controller;


import com.sinosoft.service.YanchongyuDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yanchongyu on 2017/2/18
 */
@Controller
public class YanchongyuController {

    @Autowired
    private YanchongyuDubboService yanchongyuDubboService;


    @RequestMapping(value = "/YanchongyuDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return yanchongyuDubboService.sendMsg(params);
    }
}
