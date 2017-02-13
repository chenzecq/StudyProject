package com.sinosoft.controller;

import com.sinosoft.service.YuanwenboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ywb on 2017/2/12.
 */
@Controller
public class YuanwenboController {
    @Autowired
    private YuanwenboService yuanwenboService;
@RequestMapping(path = "/ywb/{api}",method = RequestMethod.GET)
@ResponseBody
public String getFinanciaResult(@PathVariable("api") String api) {

    return yuanwenboService.yuanwenbo(api);
}

}
