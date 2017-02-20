package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by Administrator on 2017/2/19/019.
 */
@Service
public class HeshouyouReceiver extends Receiver {

    @Override
    void dealMessage(Message message) {
        System.out.println("Message=="+message);
    }
}
