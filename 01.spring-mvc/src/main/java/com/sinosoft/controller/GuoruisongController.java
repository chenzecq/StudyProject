package com.sinosoft.controller;

import com.sinosoft.service.GuoruisongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by grs on 2017/2/10.
 */
@Controller
public class GuoruisongController {


    @Autowired
    private GuoruisongService guoruisongService;

    @RequestMapping(path = "/guoruisong/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloYangming(@PathVariable String params){//绑定参数  将请求url中的params传递到方法的参数中
        return guoruisongService.guoruisong(params);
    }
}
