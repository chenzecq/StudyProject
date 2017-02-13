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
 * Created by wangna on 2017-02-13.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-context.xml",
        "classpath:spring/spring-servlet.xml"
})//加载Spring配置文件
@WebAppConfiguration  //调用javaWEB的组件
public class WangnanaControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;//定义MockMvc，MockMvc是SpringMVC提供的Controller测试类

    @Test
    public void helloWangnana() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/wangnana/helloWord")//请求的url,请求的方法是get
                        .accept(MediaType.TEXT_HTML_VALUE))     //数据格式
                //成功打开页面，判断是否可正常打开url，如不能抛出错误，能则往下进行
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 验证测试结果是否为期望值"helloWord",如不是，则测试不通过
                .andExpect(MockMvcResultMatchers.content().string("helloWord"));
    }

    @Before  //这个方法在每个方法执行之前都会执行一遍
    public void setup(){
            this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }//初始化MockMvc对象



}
