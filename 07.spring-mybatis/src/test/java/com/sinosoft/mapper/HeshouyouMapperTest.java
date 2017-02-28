package com.sinosoft.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by Administrator on 2017/2/28/028.
 */
@ContextConfiguration(
        locations = {
                "classpath:spring/database-context.xml",
                "classpath:spring/spring-mybatis.xml"
        }
)
public class HeshouyouMapperTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private HeshouyouService heshouyouService;

    @Test
    public void testMybatis(){
        HeshouyouEntity heshouyouEntity = new HeshouyouEntity();
        heshouyouEntity.setId(1);
        heshouyouEntity.setCol1("1111");
        heshouyouEntity.setCol2("22222");
        heshouyouService.insert(heshouyouEntity);
        System.out.println(heshouyouService.selectByPrimaryKey(1));
        heshouyouService.delete(heshouyouEntity);
    }

    @Test
    public void test(){
        HeshouyouEntity heshouyouEntity = new HeshouyouEntity();
        heshouyouEntity.setId(1);
        heshouyouEntity.setCol1("1111");
        heshouyouEntity.setCol2("22222");
        heshouyouService.insertInfo(heshouyouEntity);
        heshouyouEntity.setId(1);
        heshouyouEntity.setCol1("66666");
        heshouyouEntity.setCol2("44444");
        heshouyouService.updateInfo(heshouyouEntity);
        System.out.println(heshouyouService.getInfoById(1));
        heshouyouService.deleteInfoById(1);
    }
}
