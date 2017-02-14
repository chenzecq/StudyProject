package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by xiexiaoyang on 2017/2/11.
 */
@Service //spring启动时实例化
public class XiexiaoyangServiceImpl implements XiexiaoyangService {

    public String xiexiaoyang(String z) {
        return z;
    }
}
