package com.sinosoft.controller;

import com.sinosoft.service.XiexiaoyangDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by apple-pc on 2017/2/16.
 */
@Controller
public class XiexiaoyangController {
    @Autowired
    private XiexiaoyangDubboService xiexiaoyangDubboService;


    @RequestMapping(value = "/XiexiaoyangDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return xiexiaoyangDubboService.sendMsg(params);
    }
}
