package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by pengfang on 2017/2/26.
 */
@Service
public class PengfangReceiver extends Receiver {
    @Override
    void dealMessage(Message message) {
        System.out.println(message);
    }
}
