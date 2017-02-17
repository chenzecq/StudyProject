package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: by guzhonghui
 * @Date: Created in 17:51 2017/2/15
 * @Description: mq消息接受端   继承了Receiver的监听类 实现消息的监听
 */
@Service
public class GuzhonghuiReceiver extends Receiver {

    @Override
    void dealMessage(Message message) {
        if (message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            try {
                HashMap<String, ArrayList> o = (HashMap<String, ArrayList>) objectMessage.getObject();
                ArrayList arrayList = o.get("user");
                for (Object a : arrayList) {
                    System.out.println(a);
                }
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
