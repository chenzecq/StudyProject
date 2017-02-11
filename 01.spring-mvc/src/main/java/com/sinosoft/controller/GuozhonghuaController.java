package com.sinosoft.controller;

import com.sinosoft.service.GuozhonghuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description：Controller test
 * @author： guozhonghua
 * @create： 2017-02-11 10:30
 **/
@Controller
public class GuozhonghuaController {


    @Autowired
    private GuozhonghuaService guozhonghuaService;

    @RequestMapping(path = "/guozhonghua/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloSpringMvc(@PathVariable String params){
        return guozhonghuaService.helloSpringMvc(params);
    }
}
