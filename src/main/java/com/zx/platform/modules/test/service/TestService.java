/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zx.platform.common.service.CrudService;
import com.zx.platform.modules.test.entity.Test;
import com.zx.platform.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author Vayne
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
