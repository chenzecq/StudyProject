package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pinghengheng on 2017/3/5.
 * 发送类的测试类
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class PinghenghengSenderTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private PinghenghengSender pinghenghengSender;
    @Test
    public void sender(){
        pinghenghengSender.sendMessage("adcdefg");
    }
}
