/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.modules.sys.service;

import java.util.List;

import com.zx.platform.common.service.TreeService;
import com.zx.platform.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zx.platform.modules.sys.dao.AreaDao;
import com.zx.platform.modules.sys.entity.Area;

/**
 * 区域Service
 * @author Vayne
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {

	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}

	@Transactional(readOnly = false)
	public void save(Area area) {
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}
