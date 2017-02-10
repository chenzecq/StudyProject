package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by cimo on 2017/2/9.
 */
@Service
public class MingzhengServiceImpl implements MingzhengService{ //service 接口实现类

    public String mingzheng(String z ){
        return z;
    } //接受参数并直接返回
}
