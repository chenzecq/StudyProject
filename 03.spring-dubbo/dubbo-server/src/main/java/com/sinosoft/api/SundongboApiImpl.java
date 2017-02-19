package com.sinosoft.api;

/**
 * Project ask
 * Created by sundongbo on 2017/2/18.
 * <pre>
 * 林花谢了春红，太匆匆，无奈朝来寒雨晚来风。
 * 胭脂泪，相留醉，几时重，自是人生长恨水长东。
 *
 * --翼羽水淼起辰月，秋山红日望紫枫--
 * </pre>
 */

@com.alibaba.dubbo.config.annotation.Service
public class SundongboApiImpl implements SundongboApi {
    public String sendMsg(String msg) {
        return "Dubble Server :" +msg;
    }
}
