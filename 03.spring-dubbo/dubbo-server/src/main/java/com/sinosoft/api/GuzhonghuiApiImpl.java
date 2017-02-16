package com.sinosoft.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Author: by guzhonghui
 * @Date: Created in 13:23 2017/2/15
 * @Description:
 */
@Service   //添加Dubbo  的注解
public class GuzhonghuiApiImpl implements GuzhonghuiApi {
    public String sengMsg(String str) {
        return "Dubbo 服务端的业务处理" + str;
    }
}
