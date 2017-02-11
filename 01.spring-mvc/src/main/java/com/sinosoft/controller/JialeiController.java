package com.sinosoft.controller;

import com.sinosoft.service.JialeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Theron on 2017/2/11.
 */
@Controller
public class JialeiController {
    @Autowired
    private JialeiService jialeiService;

    @RequestMapping(path = "/jialei/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String hellojialei(@PathVariable String params){
        return jialeiService.jialei(params);
    }

}
