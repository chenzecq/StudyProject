package com.sinosoft.api;


/**
 * Created by liujc on 2017/2/15.
 */
@com.alibaba.dubbo.config.annotation.Service
//特别注意，这个注解，这是Dubbo的Service注解。  用于声明provider的注解   <dubbo:annotation package="这里是包名" />
// 而Spring 中的 用于标注业务层组件 <context:component-scan base-package="这里是包名" ></context:component-scan>
public class LiujiachengApiImpl implements YangmingApi {

    public String sengMsg(String str) {

        return "Server:"+str;
    }
}
