package com.sinosoft.mapper;

import tk.mybatis.mapper.common.Mapper;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public interface HeshouyouMapper extends Mapper<HeshouyouEntity> {
    //插入
    public void insertInfo(HeshouyouEntity heshouyouEntity);
    //查询
    public HeshouyouEntity getInfoById(Integer id);
    //更新
    public void updateInfo(HeshouyouEntity heshouyouEntity);
    //删除
    public void deleteInfoById(Integer id);
}
