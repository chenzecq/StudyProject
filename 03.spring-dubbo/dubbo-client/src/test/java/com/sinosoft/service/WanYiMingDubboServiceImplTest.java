package com.sinosoft.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by WanYiMing on 2017/2/19.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class WanYiMingDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
    @Autowired
    private  WanYiMingDubboService wanYiMingDubboService ;

    @Test
    public  void  sendMsg(){
            System.out.println(wanYiMingDubboService.sendMsg("gogo!"));
    }


}
