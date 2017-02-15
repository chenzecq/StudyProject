package com.sinosoft.service;

/**
 * @Author: by guzhonghui
 * @Date: Created in 13:28 2017/2/15
 * @Description: 向控制层提供的接口   达到降低内聚作用  具体的业务由本次实现类实现即可
 */
public interface GuzhonghuiDubboService {
    public String sendMsg(String str);
}
