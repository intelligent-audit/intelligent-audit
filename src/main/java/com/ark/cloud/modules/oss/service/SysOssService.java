

package com.ark.cloud.modules.oss.service;

import com.ark.cloud.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ark.cloud.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author peixiuyue
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
