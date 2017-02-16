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
 * Created by Administrator on 2017/2/15/015.
 */

//声明加载的spring的xml文件的位置
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        }
)

//表示ApplicationContext使用的是WebApplicationContext
@WebAppConfiguration
public class HeshouyouWSImplTest  extends AbstractJUnit4SpringContextTests{

    //声明一个静态内部类
    public static class SimpleServer extends AbstractBusTestServerBase{
        //重写抽象类中的run方法
        @Override
        protected void run() {
            //创建一个WebService实现类的实例
            Object obj = new HeshouyouWSImpl();
            //访问WebService的地址，
            String address = "http://localhost:"+8080+"/soap/HeshouyouWS";
            //
            Endpoint.publish(address,obj);
        }

        public static void main(String []args){
            try{
                //创建内部类对象
                SimpleServer simpleServer = new SimpleServer();
                //调用start方法运行
                simpleServer.start();
            }catch (Exception ex){
                ex.printStackTrace();
                //虚拟机退出
                System.exit(-1);
            }finally {
                System.out.println("do it!");
            }
        }
    }

    @org.junit.Test
    public void sendMsg() throws Exception{
        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient("http://localhost:8080/soap/HeshouyouWS?wsdl");
        Object[] objects = client.invoke("sendMsg","0204");
        assertTrue(objects!=null);
        assertTrue(objects.length == 1);
        assertTrue(objects[0]!=null);
        assertTrue("0204".equals(objects[0]));
    }

    @Before
    public void init(){
        launchServer(SimpleServer.class,true);
    }
}
