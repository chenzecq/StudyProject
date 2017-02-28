package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by WQM on 2017/2/28.
 */
@ContextConfiguration(
        locations = {"classpath:spring/spring-dubbo.xml"}
)
public class WangqingminApiImplTest extends AbstractJUnit4SpringContextTests {
    @Test
    @Ignore//测试的时候要注掉
    //运行此方法可以启动dubbo服务
    public void service() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }
}
