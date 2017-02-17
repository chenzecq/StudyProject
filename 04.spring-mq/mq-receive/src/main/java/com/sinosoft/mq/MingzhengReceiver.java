package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 * Created by mingzheng on 17/2/16.
 */
@Service
public class MingzhengReceiver extends Receiver {
    void dealMessage(Message msg){
        try {
            System.out.println("=====sleep start===");
            Thread.sleep(5000);
            System.out.println("=====sleep end===");
            if (msg instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) msg;
                try {
                    Object o = objectMessage.getObject();
                    System.out.println("消费消息:"+o);

                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
