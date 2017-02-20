package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by lyc on 2017/2/19.
 */
@Service
public class LiuyachaoReceiver extends Receiver {
    void dealMessage(Message message ){
        System.out.println(message);
    }
}
