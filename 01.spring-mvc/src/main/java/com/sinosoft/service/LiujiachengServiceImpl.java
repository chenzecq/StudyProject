package com.sinosoft.service;


import org.springframework.stereotype.Service;

/**
 * Created by ljc on 2017/2/11.
 * <p>
 * SpringMVC   的业务层
 *
 */
@Service         //将用于标注业务层   自动注册到spring容器
public class LiujiachengServiceImpl implements LiujiachengService{

    public String liujiacherng(String z) {
        return z;
    }
}
