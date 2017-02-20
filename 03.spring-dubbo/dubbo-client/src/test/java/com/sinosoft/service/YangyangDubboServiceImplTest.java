package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yangyang on 2017/2/17.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class YangyangDubboServiceImplTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private YangyangDubboService   yangyangDubboService;

    @Test
    @Ignore
    public void sendMsg() throws Exception {
         System.out.println(yangyangDubboService.sendMsg("sdf"));
    }

}
