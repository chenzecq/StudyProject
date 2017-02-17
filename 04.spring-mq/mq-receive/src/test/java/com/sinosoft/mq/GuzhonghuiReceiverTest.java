package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.io.IOException;

/**
 * @Author: by guzhonghui
 * @Date: Created in 18:06 2017/2/16
 * @Description:
 */

@ContextConfiguration(locations = {
        "classpath:/spring/spring-mq.xml"
})
public class GuzhonghuiReceiverTest extends AbstractJUnit4SpringContextTests {
    @Test
    @Ignore
    public void test() throws IOException {
        System.in.read();
    }
}
