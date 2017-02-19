package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by pinghengheng on 2017/2/18.
 * 这是Service层接口的实现类。
 */
@Service
public class PinghenghengServiceImpl implements PinghenghengService{
    public String dealMsg(String msg){
        return msg;
    }
}
