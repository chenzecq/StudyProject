package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by liujc on 2017/2/15.
 */
//加载配置文件
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class LiujiachengApiImplTest extends AbstractJUnit4SpringContextTests {

    //对包含测试类的类或@Test注解方法使用@Ignore注解将使被注解的类或方法不会被当做测试执行
    //JUnit执行结果中会报告被忽略的测试数
    @Test
    @Ignore
    public void server() throws InterruptedException {

        Thread.sleep(Long.MAX_VALUE);//线程休眠
    }

}