package com.hafiz.www.cron;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Desc:第二个基于Spring Quartz的定时任务
 * Created by hafiz.zhang on 2016/12/11.
 */
public class SecondCron extends QuartzJobBean {
    private static final Logger logger = LoggerFactory.getLogger(SecondCron.class);
    private Integer timeout;

    //调度工厂实例化后，经过timeout时间开始执行调度
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("定时任务2进行中.......");
        // do something else
    }
}
