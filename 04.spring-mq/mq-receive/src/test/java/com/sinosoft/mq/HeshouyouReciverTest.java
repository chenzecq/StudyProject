package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Administrator on 2017/2/19/019.
 */

@ContextConfiguration(
        locations = {
                "classpath:spring/spring-mq.xml"
        }
)

public class HeshouyouReciverTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void dealMsg() throws  Exception{

//        Thread.sleep(Long.MAX_VALUE);
    }
}
