package com.laiai.job.model;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "job_config")
public class JobConfig {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
