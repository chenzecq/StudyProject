package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Author: by guzhonghui
 * @Date: Created in 9:24 2017/2/21
 * @Description:
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq.xml"
        }
)
public class GuzhonghuiReceiverTest extends AbstractJUnit4SpringContextTests {
    @Test
    @Ignore
    public void dealMessage() throws Exception {

        System.in.read();
    }
}
