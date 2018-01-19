/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zx.platform.common.service.CrudService;
import com.zx.platform.modules.cms.dao.ArticleDataDao;
import com.zx.platform.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * @author Vayne
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
