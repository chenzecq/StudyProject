package com.sinosoft.controller;

import com.sinosoft.service.YanchongyuService;
import com.sinosoft.service.YangmingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Yanchongyu on 2017/2/912
 */
@Controller
public class YanchongyuController {


    @Autowired
    private YanchongyuService yanchongyuService;

    @RequestMapping(path = "/yanchongyu/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloYanchongyu(@PathVariable String params){
        return yanchongyuService.yanchongyu(params);
    }
}
