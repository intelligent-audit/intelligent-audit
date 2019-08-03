

package com.ark.cloud.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ark.cloud.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author peixiuyue
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
