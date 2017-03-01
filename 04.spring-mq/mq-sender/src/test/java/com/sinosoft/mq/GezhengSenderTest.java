package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


/**
 * Created by Administrator on 2017/3/1.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
                }
)
public class GezhengSenderTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private GezhengSender gezhengSender;
    @Test
    public void dealMsg() throws Exception{
        gezhengSender.sendMessage("Activemq消息测试成功！");

}
}
