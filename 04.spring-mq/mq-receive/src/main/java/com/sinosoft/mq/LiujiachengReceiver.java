package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by hasee on 2017/3/1.
 */
@Service
public class LiujiachengReceiver extends Receiver{
    void dealMessage(Message message) {
        System.out.println("--------------------------------------------------------"+message);
    }
}
