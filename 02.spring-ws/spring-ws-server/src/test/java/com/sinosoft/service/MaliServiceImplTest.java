package com.sinosoft.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.bind.annotation.XmlMimeType;

import static org.junit.Assert.*;

/**
 * Created by mali on 2017/2/12.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class MaliServiceImplTest {
    @Autowired
    private MaliService maliService;

    @Test
    public void dealMsgTest(){
        String str = "here";
        if (maliService != null){
            System.out.println("return :"+maliService.dealMsg(str));
        }else{
            System.out.println("service is null .");
        }
    }


}