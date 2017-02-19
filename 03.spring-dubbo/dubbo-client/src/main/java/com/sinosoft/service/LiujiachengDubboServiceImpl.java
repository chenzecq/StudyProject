package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.LiujiachengApi;
import org.springframework.stereotype.Service;

/**
 * Created by liujc on 2017/2/15.
 */
@Service //要注意这是Spring的
public class LiujiachengDubboServiceImpl implements LiujiachengDubboService {

    //和@Autowire作用一样，区别：@Autowire默认按照类型装配；@Reference：默认按照名称装配，当找不到与名称匹配的bean才会按照类型装配
    //Dubbo 的引用方法，该注解 调用LiujiachengApi ，会自动调用它的实现类（LiujiachengApiImpl）
    @Reference
    private LiujiachengApi liujiachengApi;


    public String sendMsg(String msg) {
        return liujiachengApi.sengMsg(msg);
    }
}
