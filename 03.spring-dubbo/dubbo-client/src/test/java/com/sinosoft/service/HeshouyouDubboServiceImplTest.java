package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Administrator on 2017/2/16/016.
 */

@ContextConfiguration(
        locations = {
                "classpath:spring/spring-dubbo.xml"
        }
)

public class HeshouyouDubboServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private HeshouyouDubboService heshouyouDubboService;

    @Test
    @Ignore
    public void sendMsg() throws  Exception{
        System.out.println(heshouyouDubboService.sendMsg("这是一个Dubbo的测试案例"));
    }
}
