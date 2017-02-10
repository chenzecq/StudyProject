package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSBindingFactory;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

import static org.apache.cxf.message.Message.ENDPOINT_ADDRESS;
import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by yangming on 2017/2/10.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class YangmingWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase{
        protected void run() {
            Object implementor = new YangmingWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/YangmingWS";
            Endpoint.publish(address, implementor);
        }
        public static void main(String[] args) {
            try {
                SimpleServer s = new SimpleServer();
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done!");
            }
        }
    }

    @org.junit.Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/YangmingWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));

    }

    @Before
    public void init() {
        launchServer(SimpleServer.class, true);
    }
}
