package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by Zhoucg.  on 2017/2/15.
 */

@Service
public class ZhouChaoGuangServiceImpl implements ZhouChaoGuangService {
    public String excute(String str) {
        System.out.println(str);
        return str;
    }
}
