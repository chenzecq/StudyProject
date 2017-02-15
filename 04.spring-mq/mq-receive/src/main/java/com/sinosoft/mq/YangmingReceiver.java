package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by yangming on 2017/2/15.
 */
@Service
public class YangmingReceiver extends Receiver {
    void dealMessage(Message message) {
        System.out.println(message);
    }
}
