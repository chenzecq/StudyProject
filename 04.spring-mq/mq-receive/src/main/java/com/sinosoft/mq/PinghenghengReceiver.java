package com.sinosoft.mq;

import org.springframework.stereotype.Service;
import javax.jms.Message;

/**
 * Created by pinghengheng on 2017/3/5.
 * 接受消息类。
 */
@Service
public class PinghenghengReceiver extends Receiver{
    void dealMessage(Message message){
        System.out.print(message);
    }
}
