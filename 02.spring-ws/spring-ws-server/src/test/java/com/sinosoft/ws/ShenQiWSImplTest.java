package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.assertTrue;

/**
 * Created by shenqi on 2017/2/15.
 */
@ContextConfiguration(
        //读取配置文件
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class ShenQiWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            Object implementor = new ShenQiWSImpl();
            String address = "http://localhost:" + 8203 + "/soap/ShenQiWS";
            Endpoint.publish(address, implementor);
        }
        public static void main(String[] args) {//程序入口处
            try {
                ShenQiWSImplTest.SimpleServer s = new ShenQiWSImplTest.SimpleServer();
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done!");
            }
        }
    }

    @Test
    public void dealData() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8203/soap/ShenQiWS?wsdl");
        Object[] objects = client.invoke("sendData", "0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));

    }

    @Before
    public void init() {
        launchServer(ShenQiWSImplTest.SimpleServer.class, true);
    }


}
