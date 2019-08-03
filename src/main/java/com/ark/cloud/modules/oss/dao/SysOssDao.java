

package com.ark.cloud.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ark.cloud.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author peixiuyue
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
