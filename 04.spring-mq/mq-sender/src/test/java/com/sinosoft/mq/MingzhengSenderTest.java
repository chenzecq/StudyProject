package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by mingzheng on 2017/2/16.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class MingzhengSenderTest extends AbstractJUnit4SpringContextTests {

        @Autowired
        private MingzhengSender mingzhengSender;

        @Test
        public void sender(){
                for(int i=0;i<20;i++){
                        mingzhengSender.sendMessage("发送消息"+i);
                }
        }

}