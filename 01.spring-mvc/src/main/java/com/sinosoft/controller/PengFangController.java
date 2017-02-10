package com.sinosoft.controller;

import com.sinosoft.service.PengFangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pengfang on 2017/2/10.
 */
@Controller
public class PengFangController {
    @Autowired
    private PengFangService pengFangService;
    @RequestMapping(path = "/pengfang/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String testPengfang(@PathVariable String params){
        return pengFangService.pengFang("age");
    }
}
