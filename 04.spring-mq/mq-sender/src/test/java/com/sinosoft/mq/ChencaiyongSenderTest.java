package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by chency on 2017/2/18.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class ChencaiyongSenderTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private  ChencaiyongSender chencaiyongSender;

    @Test
    public void sender(){
        chencaiyongSender.sendMessage("发送消息：1111");
    }

    }
