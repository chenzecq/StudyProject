package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Author: by guzhonghui
 * @Date: Created in 13:36 2017/2/15
 * @Description:
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class GuzhonghuiDubboServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private GuzhonghuiDubboService guzhonghuiDubboService;

    @Test

    public void sendMsg() throws Exception {

        System.out.println(guzhonghuiDubboService.sendMsg("Hello"));
    }
}
