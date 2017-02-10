package com.sinosoft.controller;
import com.sinosoft.service.ShikunpengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by fosun02 on 2017-02-10.
 */
@Controller
public class ShikunpengController{


        @Autowired
        private ShikunpengService shikunpengService;

        @RequestMapping(path = "/shikunpeng/{params}",method = RequestMethod.GET)
        @ResponseBody
        public String shikunpeng(@PathVariable String params){
                return shikunpengService.shikunpeng(params);
        }
}