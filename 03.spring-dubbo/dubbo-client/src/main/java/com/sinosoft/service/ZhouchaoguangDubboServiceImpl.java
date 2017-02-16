package com.sinosoft.service;

import com.sinosoft.api.ZhouchaoguangApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zhoucg.  on 2017/2/16.
 */

@Service
public class ZhouchaoguangDubboServiceImpl implements ZhouchaoguangDubboService {
    @Autowired
    private ZhouchaoguangApi zhouchaoguangApi;
    public String sendMsg(String msg) {
        return zhouchaoguangApi.sendMsg(msg);
    }
}
