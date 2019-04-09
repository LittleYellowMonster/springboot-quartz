package com.laiai.job.swagger;
import com.laiai.core.Result;
import com.laiai.job.model.JobConfig;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import java.io.IOException;



/**
 * @description:
 * @author zengyou
 * @date 2019-04-08 11:52:19
 */
@Api(tags = "定时任务配置表管理")
public interface JobConfigSwagger {

     @ApiOperation(value="新增", notes="新增JobConfig")
     public Result add(JobConfig jobConfig, BindingResult result) throws IOException;


     @ApiOperation(value="删除", notes="以主键id删除JobConfig")
     public Result delete(@PathVariable Long id);


     @ApiOperation(value="更新", notes="更新jobConfig")
     public Result update(@RequestBody JobConfig jobConfig);


     @ApiOperation(value="详情", notes="获取详情")
     public Result view(@PathVariable Long id);


     @ApiOperation(value="按条件及分页查找", notes="按条件及分页查找")
     public Result pageList(@RequestBody JobConfig obj, @RequestParam(defaultValue = "1") Integer current, @RequestParam(defaultValue = "10") Integer pageSize);
}
