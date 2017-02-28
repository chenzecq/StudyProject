package com.sinosoft.mapper;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.List;

/**
 * Created by yuanwenbo on 2017/2/28.
 */
@ContextConfiguration(
        locations = {
                "classpath:/spring/database-context.xml",
                "classpath:/spring/spring-mybatis.xml"
        }
)
public class YuanwenboMapperTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private YuanwenboService yuanwenboService;

    @Ignore
    @Test
    public void testMapper(){
        YuanwenboEntity  yuanwenboEntity=new YuanwenboEntity();
        yuanwenboEntity.setId(2);
        yuanwenboEntity.setCol1("这是测试数据");
        yuanwenboEntity.setCol2("这是测试数据2");
       // yuanwenboService.insert(yuanwenboEntity);
      //  yuanwenboService.delete(yuanwenboEntity);
       // System.out.println( yuanwenboService.getById(2).getCol1());
        List<YuanwenboEntity> list=yuanwenboService.selectAll();
        for (YuanwenboEntity obj:list){
            System.out.println( obj.getCol1());
        }

    }
}