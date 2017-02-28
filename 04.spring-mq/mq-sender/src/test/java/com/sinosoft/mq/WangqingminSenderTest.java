package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by WQM on 2017/2/28.
 */
@ContextConfiguration(locations = {
        "classpath:/spring/spring-mq-sender.xml",
        "classpath:/spring/spring-mq.xml"
})
public class WangqingminSenderTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WangqingminSender wangqingminSender;

    @Test
    public void service() {
        wangqingminSender.sendMessage("好消息");
    }
}
