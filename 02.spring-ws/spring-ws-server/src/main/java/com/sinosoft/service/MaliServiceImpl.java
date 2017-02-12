package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * @description：服务端处理类
 * @author： mali
 * @create： 2017-02-12 20:34
 **/
@Service
public class MaliServiceImpl implements MaliService {
    public String dealMsg(String msg) {
        return msg;
    }
}
