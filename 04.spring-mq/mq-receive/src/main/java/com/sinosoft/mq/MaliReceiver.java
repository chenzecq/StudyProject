package com.sinosoft.mq;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.jms.Message;
import java.util.HashMap;

/**
 * @description： 消息队列的接收类
 * @author： mali
 * @create： 2017-02-15 23:32
 **/
@Service
public class MaliReceiver extends Receiver{
    private final Logger logger = LogManager.getLogger(getClass());
    @Override
    void dealMessage(Message message) {
        if(message instanceof HashMap){
            HashMap hashMap = (HashMap<String,String>)message;
            logger.info("HashMap:"+hashMap.toString());
        }else{
            logger.info("Message:"+message.toString());
        }
    }
}
