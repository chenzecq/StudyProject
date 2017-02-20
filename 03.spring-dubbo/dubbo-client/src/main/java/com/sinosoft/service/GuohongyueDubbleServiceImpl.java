package com.sinosoft.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.GuohongyueAPI;
import org.springframework.stereotype.Service;

/**
 * Created by Henry on 2017-02-19 0019.
 */
@Service
public class GuohongyueDubbleServiceImpl implements GuohongyueDubbleService{
    @Reference
    private GuohongyueAPI guohongyueAPI;

    public String sendMessage(String args) {
        return guohongyueAPI.sendMessage(args);
    }
}
