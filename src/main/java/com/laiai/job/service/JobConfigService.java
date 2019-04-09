package com.laiai.job.service;
import com.laiai.job.model.JobConfig;
import com.laiai.core.abstractbean.Service;

import java.util.List;


/**
 * @description:
 * @author zengyou
 * @date 2019-04-08 11:52:19
 */
public interface JobConfigService extends Service<JobConfig> {

    List<JobConfig> findAllByStatus(Byte status);
}
