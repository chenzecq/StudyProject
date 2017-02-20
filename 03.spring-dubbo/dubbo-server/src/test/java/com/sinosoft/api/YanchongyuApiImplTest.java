package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yanchongyu on 2017/2/18
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class YanchongyuApiImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    @Ignore
    public void server() throws InterruptedException {

        Thread.sleep(Long.MAX_VALUE);
    }

}