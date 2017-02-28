package com.sinosoft.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuanwenbo on 2017/2/28.
 */
@Service
public class YuanwenboService extends CommonService<YuanwenboMapper,YuanwenboEntity> {
    @Autowired
    private YuanwenboMapper yuanwenboMapper;
    public YuanwenboEntity getById(int id){
        return yuanwenboMapper.getById(id);
    }


}
