package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Author: by guzhonghui
 * @Date: Created in 9:21 2017/2/21
 * @Description:
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class GuzhonghuiSenderTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private GuzhonghuiSender guzhonghuiSender;

    @Test
    public void send() {
        guzhonghuiSender.sendMessage("Hello");
    }
}
