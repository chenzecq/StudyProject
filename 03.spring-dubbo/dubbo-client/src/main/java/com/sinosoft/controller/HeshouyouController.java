package com.sinosoft.controller;

import com.sinosoft.service.HeshouyouDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/16/016.
 */

@Controller
public class HeshouyouController {

    @Autowired
    private HeshouyouDubboService heshouyouDubboService;

    @RequestMapping(value = "/Heshouyou/{param}",method = RequestMethod.GET)
    @ResponseBody
    public String sendMsg(@PathVariable("param") String msg){
        return heshouyouDubboService.sendMsg(msg);
    }
}
