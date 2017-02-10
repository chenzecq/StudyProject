package com.sinosoft.controller;

import com.sinosoft.service.GuohongyueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by henrykuo on 17-2-9.
 */
@Controller
public class GuohongyueController {


    @Autowired
    private GuohongyueService guohongyueService;
	
	@RequestMapping(path = "/guohongyue/{params}",method = RequestMethod.GET)
    @ResponseBody
    public String helloGuohongyue(@PathVariable String params){
        return guohongyueService.echo(params);
    }

}
