package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by apple-pc on 2017/2/21.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class XiexiaoyangSerderTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private XiexiaoyangSender xiexiaoyangSender;
    @Test
    public void sender() {
        xiexiaoyangSender.sendMessage("abc");
    }
}
