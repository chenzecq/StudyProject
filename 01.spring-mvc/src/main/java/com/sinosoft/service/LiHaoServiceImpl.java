package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by lihao on 2017/2/11.
 */
@Service
public class LiHaoServiceImpl implements LiHaoService{ //service 接口实现类

    public String lihao(String z ){
        return z;
    } //接受参数并直接返回
}
