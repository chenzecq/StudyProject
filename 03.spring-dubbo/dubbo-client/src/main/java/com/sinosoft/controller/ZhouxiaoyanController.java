package com.sinosoft.controller;

import com.sinosoft.service.ZhouxiaoyanDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhouxiaoyan on 2017/2/16.
 * 接收浏览器请求信息，在页面显示
 */
@Controller
public class ZhouxiaoyanController {

    @Autowired
    ZhouxiaoyanDubboService zhouxiaoyanDubboService;

    @RequestMapping(value = "/ZhouxiaoyanDubbo/{parms}" , method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("parms") String parms)
    {
        return zhouxiaoyanDubboService.sendMsg(parms);

    }

}
