package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by yangming on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq.xml"
        }
)
public class YangmingReceiverTest extends AbstractJUnit4SpringContextTests {



    @Test
    public void dealMessage() throws Exception {

//        Thread.sleep(Long.MAX_VALUE);
    }

}