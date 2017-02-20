package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Henry on 2017-02-20 0020.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class GuohongyueSenderTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private GuohongyueSender guohongyueSender;

    @Test
    public void sender(){
        guohongyueSender.sendMessage("Hello MQ!");
    }
}
