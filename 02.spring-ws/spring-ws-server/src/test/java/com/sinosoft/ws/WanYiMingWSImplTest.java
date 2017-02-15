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
 * Created by MyUser on 2017/2/14.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/spring-context.xml"
        }
)
@WebAppConfiguration
public class WanYiMingWSImplTest extends AbstractJUnit4SpringContextTests{
    public  static  class  SimpleService extends AbstractBusTestServerBase{
        protected void run() {
            Object implementor= new WanYiMingWSImpl();// 我的WebService实现类
            String address = "http://localhost:" + 8082 + "/soap/WanYiMingWS"; //服务地址
            Endpoint.publish(address,implementor); //发布服务
        }
        public static void main(String[] args) { //启动这个静态类
            try {
                  SimpleService s=   new SimpleService();
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally {
                System.out.println("done!");
            }
        }
    }
    @Test //标注测试方法
    public  void dealMsg() throws Exception{
        //模拟创建一个客户端
        JaxWsDynamicClientFactory dynamicClient = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClient.createClient("http://localhost:8082/soap/WanYiMingWS?wsdl"); //填写客户端URL
        Object[] objects = client.invoke("sendMsg", "0204");
        assertTrue(objects!=null);
        assertTrue(objects.length==1);
        assertTrue(objects[0]!=null);
        assertTrue(objects[0].equals("0204"));
    }

    @Before
    public void init(){
        launchServer(SimpleService.class,true);
    }

}
