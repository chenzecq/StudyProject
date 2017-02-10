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

import static org.junit.Assert.*;

/**
 * Created by xyt on 2017/2/10.
 */
//需要加载的配置文件，由于Junit不会加载整个项目(web.xml)，所以需要将spring所需要的配置文件加载进来
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
//会启动真实的Servlet服务
@WebAppConfiguration
//AbstractJUnit4SpringContextTests如果使用了事物管理，就必须实现
public class XuyutaoControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext webApplicationContext;//web应用服务对象
    private MockMvc mockMvc;//模拟http请求，直接使用网络的形式对controller进行调用
    @Test
    public void helloXuyutao() throws Exception {
        //执行一个请求，会自动执行spring的流程并映射到相应的控制器执行处理
        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/xuyutao/hellomorning")
                        .accept(MediaType.TEXT_HTML_VALUE))
                //成功打开页面
                .andExpect(MockMvcResultMatchers.status().isOk())
                //打开页面的内容是hello
                .andExpect(MockMvcResultMatchers.content().string("hellomorning"));
    }
    //在所有拦截器之前进行执行
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

}