package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.io.IOException;

/**
 * @Author: by guzhonghui
 * @Date: Created in 13:26 2017/2/15
 * @Description:
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class GuzhonghuiApiImplTest extends AbstractJUnit4SpringContextTests {

    @Test
    @Ignore
    public void server() throws InterruptedException, IOException {


        Thread.sleep(Long.MAX_VALUE);
    }
}
