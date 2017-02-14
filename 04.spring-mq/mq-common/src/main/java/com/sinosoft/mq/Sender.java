package com.sinosoft.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangming on 2017/2/14.
 */
public abstract class Sender<T extends Serializable> {

    private static Logger logger = LogManager.getLogger(Sender.class.getName());
    private static Map<String, Destination> destinationMap = new HashMap<String, Destination>();

    public Destination getDestination(String destinationName) {
        return destinationMap.get(destinationName);
    }

    @Autowired
    private JmsTemplate template;

    /**
     * 发送消息到指定的消息队列
     *
     * @param queueName 消息队列名称
     * @param ser       序列化的消息内容
     * @return fasle：发送失败；true：发送成功
     */
    private boolean sendMessage(String queueName, T ser) {
        if (logger.isTraceEnabled()) {
            logger.entry(queueName, ser);
        }
        try {
            // 传入需要发送的序列化对象
            final Serializable seri = ser;
            // 发送消息
            logger.debug("seri:" + seri);
            Destination destination = destinationMap.get(queueName);
            if (destination == null) {
                destination = new ActiveMQQueue(queueName);
                destinationMap.put(queueName, destination);
            }
            template.send(destination, new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    return session.createObjectMessage(seri);
                }
            });
            return true;
        } catch (Exception ex) {
            logger.error(ex);
            return false;
        }
    }

    public boolean sendMessage(T t) {
        String queueName = this.getClass().getSimpleName().replaceAll("Sender", "");
        return sendMessage(queueName, t);
    }

}
