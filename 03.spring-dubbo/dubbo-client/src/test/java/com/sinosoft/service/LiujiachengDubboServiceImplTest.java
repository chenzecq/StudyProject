package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by liujc on 2017/2/15.
 */
//加载配置文件
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class LiujiachengDubboServiceImplTest extends AbstractJUnit4SpringContextTests{
//    完成自动装配（由Spring 帮忙new一个对象 ）
    @Autowired
    private LiujiachengDubboService liujiachengDubboService;

    @Test
    @Ignore
    //由@Ignore修饰就不在当做测试类执行（不懂什么意思）
    public void sendMsg() throws Exception {

        System.out.println(liujiachengDubboService.sendMsg("sdf"));
    }

}