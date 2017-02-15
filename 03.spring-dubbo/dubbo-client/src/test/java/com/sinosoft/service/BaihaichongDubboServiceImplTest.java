package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by baihc on 2017/2/15.
 */
public class BaihaichongDubboServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    BaihaichongDubboService baihaichongDubboService;

    @Test
    @Ignore
    public void sendMsg(){
        System.out.println(baihaichongDubboService.sendMsg("bhc"));
    }
}
