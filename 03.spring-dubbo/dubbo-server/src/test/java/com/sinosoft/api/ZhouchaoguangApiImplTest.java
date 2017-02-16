package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by sinosoft.zyf on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-dubbo.xml"
        }
)
public class ZhouchaoguangApiImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    @Ignore
    public void testSendMsg() throws Exception {
        Thread.sleep(Long.MAX_VALUE);
    }
}