package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by shenqi on 2017/2/20.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class ShenQiApiImplTest extends AbstractJUnit4SpringContextTests{

    @Test
    @Ignore
    public void server() throws InterruptedException {

        Thread.sleep(Long.MAX_VALUE);
    }

}
