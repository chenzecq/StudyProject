package com.sinosoft.mq;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.xml.bind.annotation.XmlMimeType;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by mali on 2017/2/15.
 */
@ContextConfiguration(locations = {"classpath:/spring/spring-mq.xml"})
public class MaliReceiverTest extends AbstractJUnit4SpringContextTests{
    @Test
    @Ignore
    public void mqListenerStart() throws IOException {
        System.in.read();
    }
}