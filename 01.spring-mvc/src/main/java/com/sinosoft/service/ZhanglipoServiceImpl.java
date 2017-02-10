package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhanglipo on 2017/2/10.
 */
@Service
//标注业务层组件
public class ZhanglipoServiceImpl implements ZhanglipoService {
    @Override
    public String zhanglipo(String z) {
        return z;
    }
}
