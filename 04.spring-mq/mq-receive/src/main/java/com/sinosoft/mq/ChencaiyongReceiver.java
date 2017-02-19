package com.sinosoft.mq;


import javax.jms.Message;

/**
 * Created by chency on 2017/2/18.
 */
public class ChencaiyongReceiver extends Receiver{
    void  dealMessage(Message msg){
        System.out.println("收到消息"+msg.toString());
    }
}
