package com.sinosoft.controller;

import com.sinosoft.service.LigaomingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ligm on 2017/2/9.
 */
public class LigaomingController {
    private LigaomingService ligaomingService;
    @RequestMapping(path = "/ligm/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String Hello(String a){
        return ligaomingService.test(a);
    }
}
