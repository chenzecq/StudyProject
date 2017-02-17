package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.XiexiaoyangApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple-pc on 2017/2/16.
 */
@Service
public class XiexiaoyangDubboServiceImpl implements XiexiaoyangDubboService{
    @Reference
    private XiexiaoyangApi xiexiaoyangApi;
    public String sendMsg(String msg) {
        return xiexiaoyangApi.sengMsg(msg);
    }
}
