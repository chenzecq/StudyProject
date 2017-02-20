package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yanchongyu on 2017/2/18
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class YanchongyuDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private YanchongyuDubboService yanchongyuDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception {

        System.out.println(yanchongyuDubboService.sendMsg("yanchongyu"));
    }

}