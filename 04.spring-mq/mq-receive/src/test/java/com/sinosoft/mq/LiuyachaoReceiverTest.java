package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by lyc on 2017/2/19.
 */
@ContextConfiguration(
        locations = {"classpath:/spring/spring-mq.xml"}
)
public class LiuyachaoReceiverTest extends AbstractJUnit4SpringContextTests{
    @Test
    @Ignore
    public void dealMessage() throws InterruptedException {
        Thread.sleep(10000);
    }
}
