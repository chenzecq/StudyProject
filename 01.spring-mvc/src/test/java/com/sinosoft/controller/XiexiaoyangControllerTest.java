package com.sinosoft.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by xiexiaoyang on 2017/2/11.
 */
//加载配置文件
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
//使用web应用程序的默认根目录载入ApplicationContext
@WebAppConfiguration
public class XiexiaoyangControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Test
    public void helloXiexiaoyang() throws Exception{
        this.mockMvc.perform(  //执行一个请求
                MockMvcRequestBuilders  //构造一个请求
                        .get("/xiexiaoyang/hello")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //返回结果，通过返回结果确认测试是否成功
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }

    //在Test方法之前运行的方法，初始化mockMvc
    @Before
    public void setup(){this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();}




}
