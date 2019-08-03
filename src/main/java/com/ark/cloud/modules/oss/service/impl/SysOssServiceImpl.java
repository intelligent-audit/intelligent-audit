

package com.ark.cloud.modules.oss.service.impl;

import com.ark.cloud.common.utils.PageUtils;
import com.ark.cloud.modules.oss.dao.SysOssDao;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ark.cloud.common.utils.Query;
import com.ark.cloud.modules.oss.entity.SysOssEntity;
import com.ark.cloud.modules.oss.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<SysOssEntity> page = this.page(
			new Query<SysOssEntity>().getPage(params)
		);

		return new PageUtils(page);
	}
	
}
