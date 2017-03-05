package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pinghengheng on 2017/3/5.
 * 消息接受类的测试类。
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq.xml"
        }
)
public class PinghenghengReceiverTest extends AbstractJUnit4SpringContextTests{
    @Test
    public void dealMessage() throws Exception{

    }
}
