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
 * Created by Administrator on 2017/2/11.
 */
@ContextConfiguration(//加载配置文件
        locations = {
                "classpath:spring/spring-context.xml"
        })
@WebAppConfiguration
public class ZhaotuoWSImplTest extends AbstractJUnit4SpringContextTests {
    public static class SimpleServer extends AbstractBusTestServerBase {  //在test之前，init方法创建内部类的服务端
        protected void run() {
            Object implementor = new ZhaotuoWSImpl();
            String address = "http://localhost:"+8080+"/soap/ZhaotuoWS";
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
        Client client = dynamicClient.createClient("http://localhost:8080/soap/ZhaotuoWS?wsdl"); //创建客户端
        Object[] objects = client.invoke("sendMsg", "zhaotuo");  //调用服务端的sendMsg方法，得到服务端返回的数据
        System.out.println(objects!=null);
        System.out.println(objects.length);
        System.out.println(objects[0].toString());
        System.out.println(objects[0].equals("0204"));
       /* assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));*/

    }
    @Before    //创建服务端
    public void init() {
        launchServer(SimpleServer.class, true);
    }
}
