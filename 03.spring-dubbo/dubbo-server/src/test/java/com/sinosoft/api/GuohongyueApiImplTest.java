package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:spring/spring-dubbo.xml"})
/**
 * Created by Henry on 2017-02-19 0019.
 */
public class GuohongyueApiImplTest extends AbstractJUnit4SpringContextTests {
    @Test
    @Ignore
    public void server() throws InterruptedException{

        Thread.sleep(Long.MAX_VALUE);
    }
}
