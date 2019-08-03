

package com.ark.cloud.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ark.cloud.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author peixiuyue
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
