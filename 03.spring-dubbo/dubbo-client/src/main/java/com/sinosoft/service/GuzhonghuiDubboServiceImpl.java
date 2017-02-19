package com.sinosoft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sinosoft.api.GuzhonghuiApi;
import org.springframework.stereotype.Service;


/**
 * @Author: by guzhonghui
 * @Date: Created in 13:30 2017/2/15
 * @Description:
 */
@Service   //添加Spring注解
public class GuzhonghuiDubboServiceImpl implements GuzhonghuiDubboService {
    @Reference
    private GuzhonghuiApi guzhonghuiApi;

    public String sendMsg(String str) {
        return guzhonghuiApi.sengMsg(str);
    }
}
