package com.sinosoft.controller;

import com.sinosoft.service.XingshilongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sl on 2017-2-12.
 */
@Controller
public class XingshilongController {

    @Autowired
    private XingshilongService XingshilongService;
    @RequestMapping(path = "/xingshilong/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String AskName(@PathVariable String params){
        return XingshilongService.xingshilong(params);
    }


}
