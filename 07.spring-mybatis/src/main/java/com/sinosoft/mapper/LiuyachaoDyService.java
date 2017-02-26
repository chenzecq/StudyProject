package com.sinosoft.mapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lyc on 2017/2/26.
 */
@Service
public class LiuyachaoDyService {
    @Resource
    LiuyachaoDyMapper mapper;
    public String getCol2(int id,String col1,String col2) {
        LiuyachaoEntity lyc=new LiuyachaoEntity();
        lyc.setCol1(col1);
        lyc.setCol2(col2);
        lyc.setId(id);
        LiuyachaoEntity test = mapper.selectgetclo2(lyc);
        return test.getCol2();
    }
}
