package com.laiai.job.jobs;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author zengyou
 * @Description:
 * @date 2019/4/8 13:12
 */
@Data
public class MyJob {

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private Long id;

    /**
     * cron时间表达式
     */
    @Column(name = "cron_time")
    @ApiModelProperty(value = "cron时间表达式")
    private String cronTime;

    /**
     * 映射实体
     */
    @Column(name = "full_entity")
    @ApiModelProperty(value = "映射实体")
    private String fullEntity;

    /**
     * 分组名称
     */
    @Column(name = "group_name")
    @ApiModelProperty(value = "分组名称")
    private String groupName;

    /**
     * 定时任务名称
     */
    @Column(name = "job_name")
    @ApiModelProperty(value = "定时任务名称")
    private String jobName;

    /**
     * 定时任务状态 默认开启 0:关闭 1:开启
     */
    @Column(name = "job_status")
    @ApiModelProperty(value = "定时任务状态 默认开启 0:关闭 1:开启")
    private Byte jobStatus;

    /**
     * 定时任务说明
     */
    @ApiModelProperty(value = "定时任务说明")
    private String remarks;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;
}
