package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;


/**
 * Created by Henry on 2017-02-19 0019.
 */

@Service
public class GuohongyueApiImpl implements GuohongyueAPI {

    public String sendMessage(String arg) {

        return "Server:"+arg;
    }
}
