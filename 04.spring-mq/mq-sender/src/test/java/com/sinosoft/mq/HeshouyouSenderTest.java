package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Administrator on 2017/2/19/019.
 */

@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)

public class HeshouyouSenderTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private HeshouyouSender heshouyouSender;

    @Test
    public void dealMsg() throws Exception{
        heshouyouSender.sendMessage("ActiveMQ测试发送消息！");
    }
}
