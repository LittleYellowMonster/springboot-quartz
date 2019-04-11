package com.laiai.job.jobs;

import com.laiai.job.model.JobConfig;
import com.laiai.job.service.JobConfigService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author zengyou
 * @Description:
 * @date 2019/4/8 13:12
 */
@Component
public class MyJob implements Job {
    @Autowired
    private JobConfigService jobConfigService;

    public void execute(JobExecutionContext context) {
        System.out.println();
        System.out.println();
        //是哪个定时任务配置在执行，可以看到，因为在前面我们将描述设置为了配置类的toString结果
        System.out.println(context.getJobDetail().getDescription());
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(this.toString() + ":" + f.format(new Date()) +
                "正在执行Job executing...");
        List<JobConfig> configs = jobConfigService.findAllByStatus((byte)1);
        for (JobConfig config : configs) {
            System.out.println(config.toString());
        }
    }}
