package com.sinosoft.api;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by lyc on 2017/2/16.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class LiuyachaoApiImplTest extends AbstractJUnit4SpringContextTests {
    @Test
    public void  server() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }
}
