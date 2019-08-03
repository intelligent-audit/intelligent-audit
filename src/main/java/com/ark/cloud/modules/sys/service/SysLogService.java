

package com.ark.cloud.modules.sys.service;


import com.ark.cloud.common.utils.PageUtils;
import com.ark.cloud.modules.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;


/**
 * 系统日志
 *
 * @author peixiuyue
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
