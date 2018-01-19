/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.test.dao;

import com.zx.platform.common.persistence.TreeDao;
import com.zx.platform.common.persistence.annotation.MyBatisDao;
import com.zx.platform.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author Vayne
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}