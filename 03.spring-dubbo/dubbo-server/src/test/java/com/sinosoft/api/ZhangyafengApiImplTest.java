package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by sinosoft.zyf on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-dubbo.xml"
        }
)
public class ZhangyafengApiImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    @Ignore
    public void testSendMsg() throws Exception {
        Thread.sleep(Long.MAX_VALUE);
    }
}