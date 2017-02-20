package com.sinosoft.controller;

import com.sinosoft.service.YangyangDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yangyang on 2017/2/16.
 */
@Controller
public class YangyangController {

    @Autowired
    private YangyangDubboService yangyangDubboService;

    @RequestMapping(value = "/YangyangDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return yangyangDubboService.sendMsg(params);
    }
}
