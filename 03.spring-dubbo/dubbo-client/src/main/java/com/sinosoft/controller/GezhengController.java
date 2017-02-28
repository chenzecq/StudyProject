package com.sinosoft.controller;

import com.sinosoft.service.ChencaiyongDubboService;
import com.sinosoft.service.GezhengDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by Gezheng on 2017/2/28.
 */
@Controller
public class GezhengController {

    @Autowired
    private GezhengDubboService gezhengDubboService;

    @RequestMapping(path = "/dubbo/{msg}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("msg") String msg){
        return gezhengDubboService.sendMsg(msg);

    }


}
