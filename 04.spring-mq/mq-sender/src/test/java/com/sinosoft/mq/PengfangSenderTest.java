package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pengfang on 2017/2/26.
 */
//加载配置文件
@ContextConfiguration(locations = {
        "classpath:/spring/spring-mq-sender.xml",
        "classpath:/spring/spring-mq.xml"
})
public class PengfangSenderTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private PengfangSender pengfangSender;
    @Test
    public void testSender(){
        pengfangSender.sendMessage("helloWorld!");
    }
}
