package com.sinosoft.controller;

/**
 * Created by gezheng on 2017/2/19.
 */

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 1、准备测试环境
 * 2、通过MockMvc执行请求
 * 3.1、添加验证断言
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-context.xml",
        "classpath:spring/spring-servlet.xml"
})
//WebAppConfiguration:测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的
@WebAppConfiguration
public class GezhengControllerTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private WebApplicationContext webApplicationContext;//注入web环境的ApplicationContext容器
    private MockMvc mockMvc;//定义MockMvc

    /**
     * MockMvcBuilders:MockMvc构造器；
     * 指定webAppContextSetup，得到相应的控制器，获得相应的MockMvc,---测试环境搭建完成
     */
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void helloBai() throws Exception {
        /**
         * mockMvc.perform执行一个RequestBuilder请求,会自动执行SpringMVC的流程并映射到相应的控制器执行处理
         * ResultActions.andExpect:添加执行完成后的断言
         *
         */
        mockMvc.perform(
                //根据url得到一个GET方式的 MockHttpServletRequestBuilder,指定请求的Accept头信息
                MockMvcRequestBuilders.get("/gezheng/hello").accept(MediaType.TEXT_HTML_VALUE)
        )
                //添加验证断言,
                // MockMvcResultMatchers:Spring mvc测试框架为了测试方便提供的静态工厂
                //MockMvcResultMatchers.status()得到响应状态验证器
                //MockMvcResultMatchers.content得到响应内容验证器
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello"))
                .andDo(MockMvcResultHandlers.print());
    }
}
