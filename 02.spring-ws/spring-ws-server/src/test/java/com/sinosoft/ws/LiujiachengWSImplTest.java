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
 * Created by liujc on 2017/2/13.
 */
//加载配置文件
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })
//注解在类上,用来声明加载的
@WebAppConfiguration
public class LiujiachengWSImplTest extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase{
        protected void run() {
            Object implementor = new LiujiachengWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/LiujiachengWS";
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
//        访问地址
        Client client = dynamicClient.createClient("http://localhost:8080/soap/LiujiachengWS?wsdl");
//        objects 返回结果
        Object[] objects = client.invoke("sendMsg", "0204");//sendMsg,0204 访问参数
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));

    }
//初始化
    @Before
    public void init() {
        launchServer(SimpleServer.class, true);
    }
}
