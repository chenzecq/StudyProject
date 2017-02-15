package com.sinosoft.controller;

import com.sinosoft.service.ZhouChaoGuangService;
import com.sinosoft.service.ZhouChaoGuangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Zhoucg.  on 2017/2/15.
 */

@Controller
public class ZhouChaoGuangController {

    @Autowired
    private ZhouChaoGuangService zhouChaoGuangService;

    @RequestMapping(path="/zhouchaogua/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String zhou(@PathVariable String params) {
        System.out.println(params);
        return zhouChaoGuangService.excute(params);
    }
}
