package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by gzh on 2017/2/12 0012.
 */
@Service    //将业务处理实现类 添加到Spring容器
public class GuzhonghuiServiceImpl implements GuzhonghuiService {
    public String dealMsg(String msg) {
        System.out.println("Hello "+msg);
        return msg;
    }
}
