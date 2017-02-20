package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by zhouxiaoyan on 2017/2/17.
 * 服务端测试
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-dubbo.xml"
        }
)
public class ZhouxiaoyanApiImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    @Ignore
    public void testSendMsg() throws Exception {
        Thread.sleep(Long.MAX_VALUE);
    }
}