package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pinghengheng on 2017/2/19.
 * 该类是PinghenghengDubboService实现类的测试类。
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class PinghenghengDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private PinghenghengDubboService pinghenghengDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception{
        System.out.println(pinghenghengDubboService.sendMsg("sdf"));
    }

}
