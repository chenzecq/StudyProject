package com.sinosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by shenqi on 2017/2/20.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class ShenQiDubboServiceImplTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private ShenQiDubboService mShenQiDubboService;

    public void sendMsg() throws Exception{

        System.out.println(mShenQiDubboService.sendMsg("sdf"));
    }

}
