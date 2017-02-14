package com.sinosoft.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangming on 2017/2/14.
 */
public abstract class Receiver extends DefaultMessageListenerContainer {

    @Autowired
    private ConnectionFactory activeConnectionFactory;

    private static Map<String, Destination> destinationMap = new HashMap<String, Destination>();

    @PostConstruct
    public void init() {
        super.setConnectionFactory(activeConnectionFactory);
        String queueName = this.getClass().getSimpleName().replaceAll("Receiver", "");
        Destination destination = destinationMap.get(queueName);
        if (destination == null) {
            destination = new ActiveMQQueue(queueName);
        }
        super.setDestination(destination);

        super.setMessageListener(new MessageListener() {
            public void onMessage(Message message) {
                dealMessage(message);
            }
        });
    }

    abstract void dealMessage(Message message);

}
