package com.sinosoft.controller;

import com.sinosoft.service.MaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description： Controller练习
 * @author： mali
 * @create： 2017-02-10 17:42
 **/
@Controller
public class MaliController {
    @Autowired
    private MaliService maliService;
    @RequestMapping(path = "/users/{userName}",method = RequestMethod.GET)
    @ResponseBody
    public String helloSomebody(@PathVariable String userName){
        String str = null;
        //调用Service
        str = maliService.helloSomebody(userName);
        return str;
    }

}
