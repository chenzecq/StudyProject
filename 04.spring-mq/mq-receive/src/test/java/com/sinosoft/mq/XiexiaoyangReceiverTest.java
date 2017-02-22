package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by apple-pc on 2017/2/21.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq.xml"
        }
)
public class XiexiaoyangReceiverTest extends AbstractJUnit4SpringContextTests {
    @Test
    public void dealMessage() throws Exception{

    }
}
