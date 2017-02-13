package com.sinosoft.controller;

import com.sinosoft.service.YangyangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jarod on 2017/2/9.
 */
@Controller
public class YangyangController {


    @Autowired
    private YangyangService yangyangService;

    @RequestMapping(path = "/yangyang/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloYangyang(@PathVariable String params){
        return yangyangService.yangyang(params);
    }
}
