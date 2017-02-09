package com.sinosoft.controller;

import com.sinosoft.service.YangmingService;
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
public class YangmingController {


    @Autowired
    private YangmingService yangmingService;

    @RequestMapping(path = "/yangming/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloYangming(@PathVariable String params){
        return yangmingService.yangming(params);
    }
}
