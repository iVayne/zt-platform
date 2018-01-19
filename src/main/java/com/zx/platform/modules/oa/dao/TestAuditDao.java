/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.modules.oa.dao;

import com.zx.platform.common.persistence.CrudDao;
import com.zx.platform.common.persistence.annotation.MyBatisDao;
import com.zx.platform.modules.oa.entity.TestAudit;

/**
 * 审批DAO接口
 * @author Vayne
 * @version 2014-05-16
 */
@MyBatisDao
public interface TestAuditDao extends CrudDao<TestAudit> {

	public TestAudit getByProcInsId(String procInsId);
	
	public int updateInsId(TestAudit testAudit);
	
	public int updateHrText(TestAudit testAudit);
	
	public int updateLeadText(TestAudit testAudit);
	
	public int updateMainLeadText(TestAudit testAudit);
	
}
