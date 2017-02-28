package com.sinosoft.controller;


import com.sinosoft.service.WangqingminDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WQM on 2017/2/27.
 */
@Controller
public class WangqingminController {
    @Autowired
    private WangqingminDubboService wangqingminDubboService;

    @RequestMapping(value = "/WangqingminDubbo/{params}", method = RequestMethod.GET)

    @ResponseBody
    public String server(@PathVariable("params") String params) {
        return wangqingminDubboService.sendMsg(params);
    }

}
