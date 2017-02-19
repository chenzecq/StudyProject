package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by yangming on 2017/2/10.
 */
// 在业务逻辑层(service层)使用，用于配置文件的注解，会把它修改的类注入到Spring.xml中，变成一个Bean节点
@Service
public class LiujiachengServiceImpl implements LiujiachengService {


    public String dealMsg(String msg) {
        return msg;
    }
}
