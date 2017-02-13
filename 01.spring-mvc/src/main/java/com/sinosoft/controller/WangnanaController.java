package com.sinosoft.controller;

import com.sinosoft.service.WangnanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangna on 2017-02-10.
 */
@Controller //���ڱ�ע���Ʋ����
public class WangnanaController {
    @Autowired //�Գ�Ա�������б�ע������Զ�װ�䣨�������ͽ����Զ�װ�䣬����Ҫ�������ƣ��������@Qualifierʹ�ã�
    private WangnanaService tWangnanaService;

    @RequestMapping(path = "/wangnana/{params}", method = RequestMethod.GET)
    //Ո�󅢔�ע��,pathΪ�����url·����{params}Ϊ��������б�����Ӧ���������е�PathVariable��
    //methodΪ�����method���ͣ���ΪGET POST��

    @ResponseBody
    public String helloWangnana(@PathVariable String params){
        return tWangnanaService.getInputString(params);
    }//�����������ݴ�������Զ�ƥ�䴦����


}
