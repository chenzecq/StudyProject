package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by chency on 2017/2/18.
 */
@ContextConfiguration(
        locations = {  "classpath:/spring/spring-mq.xml"
        }
)
public class ChencaiyongReceiverTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void dealMessage() throws Exception {

//        Thread.sleep(Long.MAX_VALUE);
    }
}
