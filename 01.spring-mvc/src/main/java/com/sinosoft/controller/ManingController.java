package com.sinosoft.controller;

import com.sinosoft.service.ManingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by maning on 2017/2/21.
 * SpringMVC例子 Controller
 */
@Controller
public class ManingController {
    @Autowired
    private ManingService maningService;

    @RequestMapping(path = "/maning/{result}", method = RequestMethod.GET)
    @ResponseBody
    public String getResult(@PathVariable String result) {
        return maningService.getResult(result);
    }

}
