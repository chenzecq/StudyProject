package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by WQM on 2017/2/28.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class WangqingminDubboServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WangqingminDubboService wangqingminDubboService;

    @Test
    @Ignore//测试的时候要注掉
    public void sendMsg() {
        System.out.println(wangqingminDubboService.sendMsg("WangQingmin!"));
    }
}
