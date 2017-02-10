package com.sinosoft.service;

import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by henrykuo on 17-2-9.
 */
@Service
public class GuohongyueServiceImpl implements GuohongyueService {

    private static Logger logger = LogManager.getLogger(GuohongyueServiceImpl.class);


    public String echo(String echo) {
        logger.info(" 输入项为 ： "+ echo   );
        return echo;
    }
}
