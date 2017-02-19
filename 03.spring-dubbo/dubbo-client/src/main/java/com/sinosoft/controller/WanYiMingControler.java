package com.sinosoft.controller;

import com.sinosoft.service.WanYiMingDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WanYiMing on 2017/2/19.
 */
@Controller
public class WanYiMingControler {
    @Autowired
    private WanYiMingDubboService wanYiMingDubboService;

    @RequestMapping(value = "/WanYiMingDubbo/{params}" ,method = RequestMethod.GET)
    @ResponseBody
    public String  server(@PathVariable("params") String params){
        return wanYiMingDubboService.sendMsg(params);
    }

}
