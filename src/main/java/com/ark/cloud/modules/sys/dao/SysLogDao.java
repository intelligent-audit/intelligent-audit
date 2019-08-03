

package com.ark.cloud.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ark.cloud.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author peixiuyue
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
