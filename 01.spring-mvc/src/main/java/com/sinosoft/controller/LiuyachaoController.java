package com.sinosoft.controller;

import com.sinosoft.service.LiuyachaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyc on 2017/2/11.
 */
@Controller
public class LiuyachaoController {
    @Autowired
    private LiuyachaoService LiuyachaoService;

    @RequestMapping(path = "/liuyachao/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloliuyachao(@PathVariable String params){

        return LiuyachaoService.liuyachao(params);
    }

}
