package com.sinosoft.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Created by cao on 2017/2/13.
 */
@Service
public class CaonianServiceImp implements CaonianService {
    public String getMsg(String tMsg) {
        System.out.print("输出----------"+tMsg);
        Logger.getLogger("输出――――――――――――――――――――"+tMsg);
        return tMsg;
    }
}
