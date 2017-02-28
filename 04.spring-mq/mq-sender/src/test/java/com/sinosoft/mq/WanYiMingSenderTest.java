package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by WanYiMing on 2017/2/28.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class WanYiMingSenderTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private  WanYiMingSender wanYiMingSender;

    @Test
    public void sender(){
        wanYiMingSender.sendMessage("SKTOne!");
    }



}
