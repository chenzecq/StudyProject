package com.sinosoft.mq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by baihc on 2017/2/16.
 */
@ContextConfiguration(
        locations = {"classpath:spring/spring-mq-sender.xml",
                    "classpath:spring/spring-mq.xml"
        }
)
public class BaihaichongSenderTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private BaihaichongSender baihaichongSender;

    @Test
    public void send(){
        baihaichongSender.sendMessage("mq");
    }
}
