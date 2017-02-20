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
 * Created by WQM on 2017/2/17.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        }
)
@WebAppConfiguration
public class WangqingminWSImplTest extends AbstractJUnit4SpringContextTests {
    @Test
    public void sendMsg() throws Exception {
//模拟创建客户端
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/WangqingminWS?wsdl");
        Object[] objects = client.invoke("sendMsg", "0204");
        assertTrue(objects != null);
        assertTrue(objects.length == 1);
        assertTrue(objects[0] != null);
        assertTrue(objects[0].equals("0204"));
    }

    @Before
    public void init() {
        launchServer(WangqingminWSImplTest.SimpleService.class, true);
    }

    public static class SimpleService extends AbstractBusTestServerBase {
        public static void main(String[] args) {
            try {
                SimpleService s = new SimpleService();
                s.start();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done");
            }
        }

        protected void run() {
            Object implementor = new WangqingminWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/WangqingminWS"; //服务地址
            Endpoint.publish(address, implementor); //发布服务

        }

    }

}
