

package com.ark.cloud.modules.job.service;

import com.ark.cloud.common.utils.PageUtils;
import com.ark.cloud.modules.job.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author peixiuyue
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
