package com.laiai.job.controller;

import com.laiai.core.Result;
import com.laiai.core.BaseController;
import com.laiai.job.model.JobConfig;
import com.laiai.job.service.JobConfigService;
import com.laiai.job.swagger.JobConfigSwagger;
import org.springframework.validation.BindingResult;
import com.laiai.core.validator.ValidatorHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.io.IOException;
import javax.validation.Valid;



/**
 * @description:
 * @author zengyou
 * @date 2019-04-08 11:52:19
 */
@RestController
@RequestMapping("/job/config")
public class JobConfigController extends BaseController implements JobConfigSwagger {
    @Resource
    private JobConfigService jobConfigService;

    @PostMapping
    @Override
    public Result add(@RequestBody @Valid JobConfig jobConfig,BindingResult result) throws IOException  {
    	ValidatorHelper.validate(result);
        jobConfigService.save(jobConfig);
        return success();
    }

    @DeleteMapping("/{id}")
    @Override
    public Result delete(@PathVariable Long id) {
        jobConfigService.deleteById(id);
        return success();
    }

    @PutMapping
    @Override
    public Result update(@RequestBody JobConfig jobConfig) {
        ValidatorHelper.notEmpty("id",jobConfig.getId());
        jobConfigService.update(jobConfig);
        return success();
    }

    @GetMapping("/{id}")
    @Override
    public Result<JobConfig> view(@PathVariable Long id) {
        JobConfig jobConfig = jobConfigService.findById(id);
        return success(jobConfig);
    }


    @PostMapping("/page")
    @Override
    public Result<PageInfo<List<JobConfig>>> pageList(@RequestBody JobConfig model, @RequestParam(defaultValue = "1") Integer current, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(current, pageSize);
        List<JobConfig> list = jobConfigService.findList(model);
        PageInfo pageInfo = new PageInfo(list);
        return success(pageInfo);
    }
}
