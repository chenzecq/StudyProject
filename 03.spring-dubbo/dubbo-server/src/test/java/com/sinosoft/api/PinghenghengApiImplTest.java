package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pinghengheng on 2017/2/19.
 * 该类是PinghenghengApi实现类的测试类。
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class PinghenghengApiImplTest extends AbstractJUnit4SpringContextTests{

    @Test
    @Ignore
    public void server() throws InterruptedException{
        Thread.sleep(Long.MAX_VALUE);
    }

}
