package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by WQM on 2017/2/28.
 */
@ContextConfiguration(locations = {
        "classpath:/spring/spring-mq.xml"
})
public class WangqingminReceiverTest extends AbstractJUnit4SpringContextTests {
    @Test
    @Ignore
    public void service() throws Exception {
        System.out.println("接收端已启动");
        Thread.sleep(Long.MAX_VALUE);
    }
}
