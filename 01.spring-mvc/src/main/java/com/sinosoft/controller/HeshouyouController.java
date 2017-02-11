package com.sinosoft.controller;

import com.sinosoft.service.HeshouyouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 何守优 on 2017/2/10.
 */
@Controller
public class HeshouyouController {

    @Autowired
    private HeshouyouService heshouyouService;

    @RequestMapping(path = "/heshouyou/{param}" ,method = RequestMethod.GET)
    @ResponseBody
    public String heshouyou(@PathVariable String param){
        return heshouyouService.heshouyou(param);
    }
}
