package com.sinosoft.mq;

import javax.jms.Message;

/**
 * Created by Administrator on 2017/3/1.
 */
public class GezhengReceiver extends Receiver{
    @Override
    void dealMessage(Message message) {
        System.out.println(message);
    }
}
