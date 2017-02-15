package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.ChencaiyongApi;
import org.springframework.stereotype.Service;

/**
 * Created by chency on 2017/2/14.
 */
@Service
public class ChencaiyongDubboServiceImpl implements ChencaiyongDubboService {

   @Reference
   private ChencaiyongApi chencaiyongApi;


    public String sendMsg(String msg) {
        return chencaiyongApi.sengMsg(msg);
    }
}
