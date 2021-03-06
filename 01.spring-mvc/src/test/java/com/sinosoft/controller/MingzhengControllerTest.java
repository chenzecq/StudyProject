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
 * Created by cimo on 2017/2/9.
 */
@ContextConfiguration(  //手动指定加载的资源文件
        locations = {
                "classpath:spring/spring-context.xml",
                "classpath:spring/spring-servlet.xml"
        }
)
@WebAppConfiguration  //貌似测试环境必要,但是不太理解
public class MingzhengControllerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;  //web应用上下文
    private MockMvc mockMvc; //不知道可不可以理解为 MVC的测试模拟器,包含各种功能模拟web请求
    @Test //自动化测试注解
    public void helloMingzheng() throws Exception {


        this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/mingzheng/abc")
                        .accept(MediaType.TEXT_HTML_VALUE))  //构造一个url为/mingzheng/abc的get请求,格式为text/html
                //校验是否 成功打开页面
                .andExpect(MockMvcResultMatchers.status().isOk())
                //校验 打开页面的内容是abc,当结果不对时会出现错误,并列明错误值及期望值
                .andExpect(MockMvcResultMatchers.content().string("abc"));
    }

    @Before  //在测试test开始之前执行
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }  //初始化MockMvc对象

}