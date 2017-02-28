package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by WanYiMing on 2017/2/28.
 */
@Service
public class WanYiMingReceiver extends  Receiver{
    void dealMessage(Message message) {
        System.out.println(message);
    }
}
