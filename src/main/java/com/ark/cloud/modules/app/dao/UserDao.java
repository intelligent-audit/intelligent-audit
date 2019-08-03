

package com.ark.cloud.modules.app.dao;

import com.ark.cloud.modules.app.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author peixiuyue
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
