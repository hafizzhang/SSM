package com.hafiz.www.cron;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Desc:基于Spring整合Quartz进行完成定时任务
 * Created by hafiz.zhang on 2016/12/11.
 */
public class ThirdCron {
    private static final Logger logger = LoggerFactory.getLogger(ThirdCron.class);

    public void executeJob() {
        logger.info("定时任务3进行中.......");
        // do something else
    }
}
