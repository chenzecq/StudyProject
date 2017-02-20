package com.sinosoft.service;

import org.springframework.stereotype.Service;

/**
 * Created by gezheng on 2017/2/19.
 */
@Service
public class GezhengServiceImpl implements GezhengService {
    public String gezheng(String sName) {
        return sName;
    }
}
