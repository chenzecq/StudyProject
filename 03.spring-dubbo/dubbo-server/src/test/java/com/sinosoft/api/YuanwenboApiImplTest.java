package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by ywb on 2017/2/16.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-dubbo.xml"
        }
)
public class YuanwenboApiImplTest {

    @Test
    @Ignore
    public void server() throws  InterruptedException{
       Thread.sleep(Long.MAX_VALUE);
    }
}
