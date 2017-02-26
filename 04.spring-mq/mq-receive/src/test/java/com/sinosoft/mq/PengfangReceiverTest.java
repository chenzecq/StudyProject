package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pengfang on 2017/2/26.
 */
@ContextConfiguration(locations = {
        "classpath:/spring/spring-mq.xml"
})
public class PengfangReceiverTest extends AbstractJUnit4SpringContextTests{
    @Test
    public void dealMessage() throws Exception {
        //Thread.sleep(Long.MIN_VALUE);
    }
}
