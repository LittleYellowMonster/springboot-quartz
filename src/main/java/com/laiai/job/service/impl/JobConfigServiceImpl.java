package com.laiai.job.service.impl;

import com.laiai.job.mapper.JobConfigMapper;
import com.laiai.job.model.JobConfig;
import com.laiai.job.service.JobConfigService;
import com.laiai.core.abstractbean.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @description:
 * @author zengyou
 * @date 2019-04-08 11:52:19
 */
@Service
public class JobConfigServiceImpl extends AbstractService<JobConfig> implements JobConfigService {
    @Resource
    private JobConfigMapper jobConfigMapper;

    @Override
    public List<JobConfig> findAllByStatus(Byte status) {
        JobConfig jobConfig = new JobConfig();
        jobConfig.setJobStatus(status);
        return jobConfigMapper.select(jobConfig);
    }
}
