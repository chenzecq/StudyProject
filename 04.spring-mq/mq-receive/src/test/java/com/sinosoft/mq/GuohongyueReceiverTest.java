package com.sinosoft.mq;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Henry on 2017-02-20 0020.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq.xml"
        }
)
public class GuohongyueReceiverTest extends AbstractJUnit4SpringContextTests{
    public void dealMessage() throws Exception{

    }
}
