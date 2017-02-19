package com.sinosoft.api;

import org.eclipse.jetty.util.log.Log;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by ${WanYiMing} on 2017/2/16.
 */
@ContextConfiguration(
       locations = {"classpath:spring/spring-dubbo.xml"}
)
public class WanYiMingApiImplTest extends AbstractJUnit4SpringContextTests{
    @Test
    //@Ignore
    public  void  service() throws  InterruptedException{
        Thread.sleep(Long.MAX_VALUE);
    }
}
