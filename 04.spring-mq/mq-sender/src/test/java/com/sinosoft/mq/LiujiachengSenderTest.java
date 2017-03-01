package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by hasee on 2017/3/1.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class LiujiachengSenderTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private LiujiachengSender LiujiachengSender ;

    @Test
    public void sender(){
        LiujiachengSender.sendMessage("ActiveMQ");
    }


}
