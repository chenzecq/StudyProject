package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by hasee on 2017/3/1.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq.xml"
        }
)
public class LiujiachengReceiverTest extends AbstractJUnit4SpringContextTests {
    @Test
    public void dealMessage() throws Exception {

//        Thread.sleep(Long.MAX_VALUE);
    }
}
