package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by gezheng on 2017/3/1.
 */

@ContextConfiguration(
    locations= {  "classpath:/spring/spring-mq.xml"
            }
)

public class GezhengReceiverTest extends AbstractJUnit4SpringContextTests {
    @Test
    public void dealMessage() throws Exception {
    }
}