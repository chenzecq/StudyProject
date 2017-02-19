package com.sinosoft.controller;

import com.sinosoft.service.BaihaichongDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by baihc on 2017/2/15.
 */
@Controller
public class BaihaichongController {
    @Autowired
    BaihaichongDubboService baihaichongDubboService;

    @RequestMapping(path = "/dubbo/{msg}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("msg") String msg){
        return baihaichongDubboService.sendMsg(msg);
    }
}
