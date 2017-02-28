package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

/**
 * Created by WQM on 2017/2/28.
 */
@Service
public class WangqingminReceiver extends Receiver {
    void dealMessage(Message message) {
        if (message instanceof ObjectMessage) {
            ObjectMessage obm = (ObjectMessage) message;
            try {
                String m = (String) obm.getObject();
                System.out.println("WangqingminReceiver接收：" + m);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
