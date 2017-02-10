package com.sinosoft.service;

import org.springframework.stereotype.Service;
import org.testng.log4testng.Logger;

/**
 * Created by henrykuo on 17-2-9.
 */
@Service
public class GuohongyueServiceImpl implements GuohongyueService {

    Logger logger = Logger.getLogger(GuohongyueServiceImpl.class);


    public String echo(String echo) {
        logger.info(" 输入项为 ： "+ echo   );
        return echo;
    }
}
