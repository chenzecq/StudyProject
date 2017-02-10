package com.sinosoft.service;

import com.sinosoft.ws.YangmingWS;
import org.springframework.stereotype.Service;

/**
 * Created by yangming on 2017/2/10.
 */
@Service
public class YangmingServiceImpl implements YangmingService {


    public String dealMsg(String msg) {
        return msg;
    }
}
