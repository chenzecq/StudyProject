package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * @Author: by guzhonghui
 * @Date: Created in 17:38 2017/2/15
 * @Description:
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/spring-mq-sender.xml",
                "classpath:/spring/spring-mq.xml"
        }
)
public class GuzhonghuiSenderTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private GuzhonghuiSender guzhonghuiSender;

    @Test
    @Ignore
    public void sendMsg() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("语文");
        arrayList.add("数学");
        arrayList.add("外语");
        HashMap<String, ArrayList> hashMap = new HashMap<String, ArrayList>();
        hashMap.put("user", arrayList);
        guzhonghuiSender.sendMessage(hashMap);
    }
}
