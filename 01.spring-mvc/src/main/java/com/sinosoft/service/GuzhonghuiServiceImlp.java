package com.sinosoft.service;


import org.springframework.stereotype.Service;

/**
 * Created by gzh on 2017/2/10.
 * <p>
 * SpringMVC   的业务层
 * 将业务层的类加入到Spring容器中一般选取 @Service
 *
 * @Service
 */
@Service         //将这个类加入到Spring容器中
public class GuzhonghuiServiceImlp implements GuzhonghuiService {
    public String guzhonghui(String z) {
        return z;
    }
}
