package com.sinosoft.api;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * Created by mali on 2017/2/15.
 */
//加载配置文件
@ContextConfiguration(locations = {"classpath:spring/spring-dubbo.xml"})
public class MaliApiImplTest extends AbstractJUnit4SpringContextTests {
    //这个测试方法，其实是为了加载上述的配置文件，配置文件加载时会启动dubbo服务，并注册到ZooKeeper中
    //记得先启动ZooKeeper。使用时要把 @Ignore 注解注释掉，否则测试方法被忽略。
    @Test
    @Ignore
    public void serviceStart() throws Exception{
        System.in.read();
    }
}