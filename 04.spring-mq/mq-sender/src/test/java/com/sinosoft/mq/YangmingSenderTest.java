package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by yangming on 2017/2/15.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class YangmingSenderTest extends AbstractJUnit4SpringContextTests {

        @Autowired
        private YangmingSender yangmingSender;

        @Test
        public void sender(){
                yangmingSender.sendMessage("sdfsdfsdf");
        }

}