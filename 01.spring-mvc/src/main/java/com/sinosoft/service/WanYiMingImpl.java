package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by MyUser on 2017/2/12.
 */
@Service  //标注 WanYiMingService 实现类
public class WanYiMingImpl implements  WanYiMingService{
    public String wanYiMing(String param) {
        return param;
    }
}

