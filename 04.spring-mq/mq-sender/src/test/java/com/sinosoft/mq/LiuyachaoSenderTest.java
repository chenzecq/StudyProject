package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by lyc on 2017/2/19.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class LiuyachaoSenderTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private LiuyachaoSender LiuyachaoSender;
@Test
    public void senderMessage(){
     LiuyachaoSender.sendMessage("success");
    }
}
