package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.HashMap;


/**
 * Created by mali on 2017/2/15.
 */
//加载配置文件
@ContextConfiguration(locations = {"classpath:spring/spring-mq-sender.xml"
                        ,"classpath:spring/spring-mq.xml"})
public class MaliSenderTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private MaliSender maliSender;
    @Test
    @Ignore
    public void sendData(){
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("name","mali");
        maliSender.sendMessage(hashMap);
    }
}