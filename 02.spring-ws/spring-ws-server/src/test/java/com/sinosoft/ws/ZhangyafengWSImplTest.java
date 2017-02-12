package com.sinosoft.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;
import org.apache.cxf.testutil.common.AbstractClientServerTestBase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.ws.Endpoint;

import static org.apache.cxf.testutil.common.AbstractClientServerTestBase.launchServer;
import static org.junit.Assert.*;

/**
 * Created by sinosoft.zyf on 2017/2/11.
 * 1.在web.xml中配置Spring的配置文件，配置CXFServlet
 * 2.创建WS相关的Spring xml配置文件，配置文件中需要引入xmlns:jaxws="http://cxf.apache.org/jaxws
 *   同时要导入几个文件：
 *      <import resource="classpath:META-INF/cxf/cxf.xml"/>
 *      <import resource="classpath:META-INF/cxf/cxf-extension-soap.xml"/>
 *      <import resource="classpath:META-INF/cxf/cxf-servlet.xml"/>
 * 3.开发服务端接口和实现
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-ws.xml"
        }
)
@WebAppConfiguration
public class ZhangyafengWSImplTest extends AbstractJUnit4SpringContextTests{

    public static class SimpleServer extends AbstractBusTestServerBase{
        @Override
        protected void run() {
            Object implementor = new ZhangyafengWSImpl();
            String address = "http://localhost:8080/soap/ZhangyafengWS";
            // 发布服务
            Endpoint.publish(address, implementor);
        }

        public static void main(String[] args) {
            SimpleServer s = new SimpleServer();
            s.start();
        }
    }

    @Before
    public void setUp() throws Exception {
        // 启动服务
        launchServer(SimpleServer.class,true);
    }

    @Test
    public void testSendMsg() throws Exception {
        // 客户端工厂类
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        // 创建客户端对象
        Client client = factory.createClient("http://localhost:8080/soap/ZhangyafengWS?wsdl");
        // 调用服务方法
        Object[] objects = client.invoke("sendMsg","Hi, this is client.");
        System.out.println("objects.lenght="+objects.length);
        System.out.println("objects[0]="+objects[0]);

    }

}