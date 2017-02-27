package com.sinosoft.mapper;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by lyc on 2017/2/26.
 */
//copy
@ContextConfiguration(
        locations = {
                "classpath:/spring/database-context.xml",
                "classpath:/spring/spring-mybatis.xml"
        }
)
public class LiuyachaoMapperTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private LiuyachaoService liuyachaoService;

    @Ignore
    @Test
    public void testMapper() {
        LiuyachaoEntity liuyachaoEntity = new LiuyachaoEntity();
        LiuyachaoEntity aa = new LiuyachaoEntity();
        liuyachaoEntity.setId(4);
//        liuyachaoEntity.setCol1("4");
//        liuyachaoEntity.setCol2("2");
//        liuyachaoService.insert(liuyachaoEntity);
//        liuyachaoService.updateByPrimaryKey(liuyachaoEntity);
        List<LiuyachaoEntity> list1 = liuyachaoService.selectAll();
        List<LiuyachaoEntity> list2 = liuyachaoService.select(liuyachaoEntity);
        LiuyachaoEntity test = list2.iterator().next();

        System.out.println(list1.size());
        System.out.println(test.getCol1());


    }


    @Test
    public void getCol2() throws Exception {

        LiuyachaoEntity liuyachaoEntity = liuyachaoService.getCol2(4, null, null);

    }

}
