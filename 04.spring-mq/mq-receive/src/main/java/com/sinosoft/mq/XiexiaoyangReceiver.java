package com.sinosoft.mq;

import org.springframework.stereotype.Service;

import javax.jms.Message;
/**
 * Created by apple-pc on 2017/2/21.
 */
@Service
public class XiexiaoyangReceiver extends Receiver {
    void dealMessage(Message message){
        System.out.println(message);
    }
}
