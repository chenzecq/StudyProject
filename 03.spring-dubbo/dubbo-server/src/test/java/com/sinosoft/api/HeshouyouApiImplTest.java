package com.sinosoft.api;


import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by Administrator on 2017/2/16/016.
 */

@ContextConfiguration(
        locations = {
                "classpath:spring/spring-dubbo.xml"
        }
)

public class HeshouyouApiImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    @Ignore
    public void Server() throws InterruptedException{
        //让服务器当前线程一直睡眠long的最大值毫秒
        Thread.sleep(Long.MAX_VALUE);
    }
}
