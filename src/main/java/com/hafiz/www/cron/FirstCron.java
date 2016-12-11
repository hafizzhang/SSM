package com.hafiz.www.cron;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Desc:第一个基于SpringTask的调度任务
 * Created by hafiz.zhang on 2016/12/11.
 */
public class FirstCron {
    private static final Logger logger = LoggerFactory.getLogger(FirstCron.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void cron() {
        logger.info("定时任务进行中.......");
        // do something else
    }
}
