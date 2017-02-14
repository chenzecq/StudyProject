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

//加载spring的配置文件，类似启动web服务的时候，我们会去读取Spring的配置文件
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)


/**
 * Created by chency on 2017/2/10.。
 */
@WebAppConfiguration
public class ChencaiyongControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac; //应用容器
    private MockMvc mockMvc;//网上这样说:MockMvc实现了对Http请求的模拟，能够直接使用网络的形式，转换到Controller的调用(

    //运行测试前执行的方法
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void callChencaiyong() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/chencaiyong/chency")//在SpringMVC的专门管理各种请求地址的类里面获取指定的URL请求地址
                .accept(MediaType.TEXT_HTML_VALUE))//设置接受返回结果的数据格式
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("chency"));//"chency"是测试的期望结果,如果不是“chency”，测不通过

    }
}
