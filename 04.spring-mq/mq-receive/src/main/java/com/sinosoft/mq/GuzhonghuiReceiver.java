package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

/**
 * @Author: by guzhonghui
 * @Date: Created in 9:23 2017/2/21
 * @Description:
 */
@Service
public class GuzhonghuiReceiver extends Receiver {
    @Override
    void dealMessage(Message message) {
        if (message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            try {
                Object o = objectMessage.getObject();
                System.out.println(o);

            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
