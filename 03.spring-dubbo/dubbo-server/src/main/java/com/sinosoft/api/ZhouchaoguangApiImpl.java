package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by Zhoucg.  on 2017/2/18.
 */
@Service
class ZhouchaoguangApiImpl implements ZhouchaoguangApi {
    public String sendMsg(String str) {
        return "Server"+str;
    }
}
