package com.sinosoft.controller;

import com.sinosoft.service.YangmingDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by yangming on 2017/2/12.
 */
@Controller
public class YangmingController {

    @Autowired
    private YangmingDubboService yangmingDubboService;
}
