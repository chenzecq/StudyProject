package com.sinosoft.controller;

import com.sinosoft.service.LizhiyueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lzy on 2017-02-13
 */
@Controller
public class LizhiyueController {


    @Autowired
    private LizhiyueService lizhiyueService;

    @RequestMapping(path = "/lizhiyue/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloSpring(@PathVariable String params){
        return lizhiyueService.lizhiyue(params);
    }
}
