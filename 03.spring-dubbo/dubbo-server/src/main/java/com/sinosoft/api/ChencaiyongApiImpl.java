package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by chency on 2017/2/14.
 */
@Service
public class ChencaiyongApiImpl implements  ChencaiyongApi {
  public  String sengMsg(String msg){
        return "Service:"+msg;
    }

}
