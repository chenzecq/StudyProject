package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.YangmingApi;

/**
 * Created by yangming on 2017/2/12.
 */
public class YangmingDubboServiceImpl implements YangmingDubboService {

    @Reference
    private YangmingApi yangmingApi;
}
