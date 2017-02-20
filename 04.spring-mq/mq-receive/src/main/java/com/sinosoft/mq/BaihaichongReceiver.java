package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

/**
 * Created by baihc on 2017/2/16.
 */
@Service
public class BaihaichongReceiver extends Receiver {
    @Override
    void dealMessage(Message message) {
        System.out.println("BaihaichongReceiver接收"+message);
        if(message instanceof ObjectMessage){
            ObjectMessage obm= (ObjectMessage) message;
            try {
                String s=(String) obm.getObject();
                System.out.println("BaihaichongReceiver接收"+s);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
