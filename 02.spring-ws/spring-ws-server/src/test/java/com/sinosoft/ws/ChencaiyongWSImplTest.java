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
 * Created by chency on 2017/2/11.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        })//加载Spring的配置文件
@WebAppConfiguration
public class ChencaiyongWSImplTest  extends AbstractJUnit4SpringContextTests {

    public static class SimpleServer extends AbstractBusTestServerBase {
        protected void run() {
            Object implementor = new ChencaiyongWSImpl();
            String address = "http://localhost:" + 8080 + "/soap/ChencaiyongWS";//设置服务端的接口地址
            Endpoint.publish(address, implementor);//发布接口
        }
    /*    public static void main(String[] args) {
            try {
                ChencaiyongWSImplTest.SimpleServer s = new ChencaiyongWSImplTest.SimpleServer();
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done!");
            }
        }*/
    }




    @org.junit.Test
    public void sendMsg() throws Exception {
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8080/soap/ChencaiyongWS?wsdl");//创建一个客户端，设置好请求地址
        Object[] objects = client.invoke("sendMsg", "8888");//设置请求方法和请求内容
        assertTrue(objects!=null);//判断返回的对象数组是否为空，条件不成立，则抛出异常
        assertTrue(objects.length==1);//判断返回的对象数组的长度是否为1，条件不成立，则抛出异常
        assertTrue(objects[0]!=null);//判断返回的对象数组的第一个对象是否为空，条件不成立，则抛出异常
        assertTrue(objects[0].equals("8888"));//判断返回的对象数组的第一个对象的值是否等于“8888”，条件不成立，则抛出异常

    }
    //启动服务端
    @Before
    public void init() {
        launchServer(ChencaiyongWSImplTest.SimpleServer.class, true);
    }

    public static void main(String[] args) {
        try {
            ChencaiyongWSImplTest.SimpleServer s = new ChencaiyongWSImplTest.SimpleServer();
            s.start();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(-1);
        } finally {
            System.out.println("done!");
        }
    }
}
