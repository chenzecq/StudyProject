package com.sinosoft.mq;

import javax.jms.Message;

/**
 * Created by Henry on 2017-02-20 0020.
 */
public class GuohongyueReceiver extends Receiver{

    @Override
    void dealMessage(Message message) {
        System.out.println(message);
    }
}
