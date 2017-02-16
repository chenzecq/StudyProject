package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhanglipo on 2017/2/16.
 */
@Service
public class ZhanglipoServiceImpl implements ZhanglipoService {
    @Override
    public String dealMsg(String msg) {
        return msg;
    }
}
