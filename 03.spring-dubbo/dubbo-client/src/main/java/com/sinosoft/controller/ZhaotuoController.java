package com.sinosoft.controller;

import com.sinosoft.service.ZhaotuoDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/17.
 */
@Controller
public class ZhaotuoController {


    @Autowired
    private ZhaotuoDubboService zhaotuoDubboService;

    @RequestMapping(value = "/ZhaotuoDubbo/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String service(@PathVariable("params") String params){

        return zhaotuoDubboService.sendMsg(params);
    }
}
