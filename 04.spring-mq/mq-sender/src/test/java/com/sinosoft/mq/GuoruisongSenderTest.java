package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by grs on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class GuoruisongSenderTest extends AbstractJUnit4SpringContextTests {

        @Autowired
        private GuoruisongSender guoruisongSender;

        @Test
        public void sender(){
                guoruisongSender.sendMessage("消息队列");
        }

}