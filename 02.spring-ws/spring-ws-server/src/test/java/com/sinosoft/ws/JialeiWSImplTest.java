package com.sinosoft.ws;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.assertTrue;

/**
 * Created by Theron on 2017/2/15.
 */

@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        }
)
@WebAppConfiguration
public class JialeiWSImplTest extends AbstractJUnit4SpringContextTests{
    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            //把webService发布到SimpleServer,发布WSDl
            Object implementor = new JialeiWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/JialeiWS";
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

    @Before
    public void init() {
        launchServer(SimpleServer.class, true);
    }

    @org.junit.Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/JialeiWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));

    }


}
