package com.sinosoft.controller;

import com.sinosoft.service.PengfangDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pengfang on 2017/2/15.
 */

@Controller
public class PengfangController {
    @Autowired
    private PengfangDubboService pengfangDubboService;
    @RequestMapping(value = "/PengfangDubbo/{params}",method = RequestMethod.GET )
    @ResponseBody
    public String service(@PathVariable("params") String msg){
        return pengfangDubboService.sandMsg(msg);
    }

}
