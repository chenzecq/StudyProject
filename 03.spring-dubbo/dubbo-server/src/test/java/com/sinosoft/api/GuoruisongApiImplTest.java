package com.sinosoft.api;


import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.io.IOException;

/**
 * Created by grs on 2017/2/15.
 */
@ContextConfiguration(locations = {
        "classpath:spring/spring-dubbo.xml"
})
public class GuoruisongApiImplTest  extends AbstractJUnit4SpringContextTests {

    public static  void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:spring/spring-dubbo.xml"});
        context.start();
        System.out.println("Provider_1 is started.");
        System.in.read();

    }

    @Test
    @Ignore
    public void server() throws InterruptedException {

        Thread.sleep(Long.MAX_VALUE);
    }

}