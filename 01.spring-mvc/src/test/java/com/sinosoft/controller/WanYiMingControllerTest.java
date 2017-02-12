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
 * Created by MyUser on 2017/2/12.
 AbstractJUnit4SpringContextTests  Spring框架的测试类
 */

@ContextConfiguration(//加载指定资源
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration //标注为测试类
public class WanYiMingControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac; //web应用上下文
    private MockMvc  mockMvc;//模拟web请求

    @Test //注解 该方法为测试方法
    public void helloWanYiMing() throws  Exception{
         this.mockMvc.perform(
                 MockMvcRequestBuilders
                         .get("/wanyiming/gogoing")
                         .accept(MediaType.TEXT_HTML_VALUE))  //构造一个url为/mingzheng/abc的get请求,格式为text/html
                 //校验是否 成功打开页面
                 .andExpect(MockMvcResultMatchers.status().isOk())
                 //校验 打开页面的内容是abc,当结果不对时会出现错误,并列明错误值及期望值
                 .andExpect(MockMvcResultMatchers.content().string("gogoing"));
    }
    @Before  //在测试test开始之前执行
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }  //初始化MockMvc对象

}
