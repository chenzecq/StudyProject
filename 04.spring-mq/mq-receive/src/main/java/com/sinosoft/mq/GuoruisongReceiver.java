package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

/**
 * Created by grs on 2017/2/15.
 */
@Service
public class GuoruisongReceiver extends Receiver {
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
