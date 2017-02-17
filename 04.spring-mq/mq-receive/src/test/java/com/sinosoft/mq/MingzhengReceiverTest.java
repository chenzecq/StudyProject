package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.io.IOException;

/**
 * Created by mingzheng on 2017/2/16.
 */
@ContextConfiguration(locations = {"classpath:/spring/spring-mq.xml"})
public class MingzhengReceiverTest extends AbstractJUnit4SpringContextTests{
    @Test
    public void dealMessage() throws IOException {
        System.in.read();
    }
}