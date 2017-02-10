package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by sinosoft.zyf on 2017/2/10.
 * service组件实现类
 */
@Service
public class ZhangyafengServiceImpl implements ZhangyafengService{
    public String zhangyafeng(String talk) {
        return talk;
    }
}
