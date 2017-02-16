package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Zhoucg on 2017/2/16.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class ZhouchaoguangDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private ZhouchaoguangDubboService zhouchaoguangDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception {

        System.out.println(zhouchaoguangDubboService.sendMsg("sdf"));
    }

}