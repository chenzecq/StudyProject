package com.sinosoft.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by shenqi on 2017/2/12.
 */

@ContextConfiguration(  //手动指定加载的配置文件
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration
public class ShenQiControllerTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private WebApplicationContext mWeb;//Web上下文
    private MockMvc mMockMVC;

    @Test
    public void testShenQi() throws Exception {
        this.mMockMVC.perform(
                MockMvcRequestBuilders
                        .get("/shenqi/page")//在SpringMVC的专门管理各种请求地址的类里面获取指定的URL请求地址
                        .accept(MediaType.TEXT_HTML_VALUE))//请求的格式
                .andExpect(MockMvcResultMatchers.status().isOk())
                //校验数据 打开页面的内容应为page,否则测试失败
                .andExpect(MockMvcResultMatchers.content().string("page"));


    }

    //测试方法执行前执行的方法
    @Before
    public void setup() {
        this.mMockMVC = MockMvcBuilders.webAppContextSetup(this.mWeb).build();
    }


}
