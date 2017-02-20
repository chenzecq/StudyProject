package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by zhouxiaoyan on 2017/2/17.
 * 首先采用junit测试通过
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class ZhouxiaoyanDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private ZhouxiaoyanDubboService zhouxiaoyanDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception {

        System.out.println(zhouxiaoyanDubboService.sendMsg("zxy-test"));
    }

}