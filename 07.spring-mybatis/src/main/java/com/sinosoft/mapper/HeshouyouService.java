package com.sinosoft.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/28/028.
 */
@Service
public class HeshouyouService extends CommonService<HeshouyouMapper,HeshouyouEntity> {

    @Autowired
    private HeshouyouMapper heshouyouMapper;

    public void insertInfo(HeshouyouEntity heshouyouEntity){
        heshouyouMapper.insertInfo(heshouyouEntity);
    }

    public void updateInfo(HeshouyouEntity heshouyouEntity){
        heshouyouMapper.updateInfo(heshouyouEntity);
    }

    public HeshouyouEntity getInfoById(Integer id){
        return heshouyouMapper.getInfoById(id);
    }

    public void deleteInfoById(Integer id){
        heshouyouMapper.deleteInfoById(id);
    }
}
