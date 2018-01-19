/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.modules.sys.dao;

import com.zx.platform.common.persistence.CrudDao;
import com.zx.platform.common.persistence.annotation.MyBatisDao;
import com.zx.platform.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author Vayne
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
