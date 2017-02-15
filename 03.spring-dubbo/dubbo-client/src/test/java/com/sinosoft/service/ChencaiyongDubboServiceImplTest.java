package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by chency on 2017/2/14.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class ChencaiyongDubboServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private ChencaiyongDubboService chencaiyongDubboService;
    @Test
    @Ignore
    public  void sendMsg()throws Exception{
        chencaiyongDubboService.sendMsg("chencaiyong");
    }
}
