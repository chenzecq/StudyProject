package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Henry on 2017-02-19 0019.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class GuohongyueDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private GuohongyueDubbleService guohongyueDubbleService;

    @Test
    @Ignore
    public  void  sendMessage() throws Exception{
        System.out.println(guohongyueDubbleService.sendMessage("haha"));
    }
}
