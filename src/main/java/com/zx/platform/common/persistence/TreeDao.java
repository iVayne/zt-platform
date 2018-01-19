/**
 * Copyright &copy; 2012-2016 邯郸市众翔信息科技有限公司 All rights reserved.
 */
package com.zx.platform.common.persistence;

import java.util.List;

/**
 * DAO支持类实现
 * @author Vayne
 * @version 2014-05-16
 * @param <T>
 */
public interface TreeDao<T extends TreeEntity<T>> extends CrudDao<T> {

	/**
	 * 找到所有子节点
	 * @param entity
	 * @return
	 */
	public List<T> findByParentIdsLike(T entity);

	/**
	 * 更新所有父节点字段
	 * @param entity
	 * @return
	 */
	public int updateParentIds(T entity);
	
}