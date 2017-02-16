package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.PengfangApi;
import org.springframework.stereotype.Service;

/**
 * Created by pengfang on 2017/2/16.
 */
@Service
public class PengfangDubboServiceImpl implements PengfangDubboService{
    @Reference//Dubbo的引用方法
    private PengfangApi pengfangApi;
    public String sandMsg(String pengfang) {
        return pengfangApi.sengMsg(pengfang);
    }
}
