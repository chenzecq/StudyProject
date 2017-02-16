package com.sinosoft.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by pengfang on 2017/2/16.
 */
//加载配置文件
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class PengfangDubboServiceImlTest extends AbstractJUnit4SpringContextTests {
    @Autowired //自动注入
    private PengfangDubboService pengfangDubboService;
    @Test
    @Ignore
    public void cilent(){
        System.out.println(pengfangDubboService.sandMsg("pengfang"));
    }
}
