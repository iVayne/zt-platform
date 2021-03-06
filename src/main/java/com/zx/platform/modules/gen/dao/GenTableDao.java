/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.modules.gen.dao;

import com.zx.platform.common.persistence.CrudDao;
import com.zx.platform.common.persistence.annotation.MyBatisDao;
import com.zx.platform.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 * @author Vayne
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
