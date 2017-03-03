package io.vicp.goradical.intellirec.service.impl;

import io.vicp.goradical.intellirec.dao.BaseDao;
import io.vicp.goradical.intellirec.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

/**
 * Created by Kenny on 2017/3/3.
 *
 * 抽象的BaseService,专门用于继承
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	//注入dao
	@Autowired
	private BaseDao<T> dao;

	private Class<T> clazz;

	public BaseServiceImpl() {
		//得到泛型化的超类
		ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}

	/**
	 * 根据实体 id 检索实体对象
	 *
	 * @param id 序列化 id
	 * @return 实体对象
	 */
	@Override
	public T loadEntity(Serializable id) {
		return dao.loadEntity(id);
	}

	/**
	 * 保存实体对象
	 *
	 * @param t 泛型化的实体对象 t
	 * @return 对象保存成功后的对象序列化 id
	 */
	@Override
	public Serializable saveEntity(T t) {
		return dao.saveEntity(t);
	}

	/**
	 * 保存/更新实体对象
	 *
	 * @param t 泛型化的实体对象 t
	 */
	@Override
	public void saveOrUpdateEntity(T t) {
		dao.saveOrUpdateEntity(t);
	}

	/**
	 * 更新实体对象
	 *
	 * @param t 泛型化的实体对象 t
	 */
	@Override
	public void updateEntity(T t) {
		dao.updateEntity(t);
	}

	/**
	 * 实体对象的 merge 操作,详细说明参阅官方文档
	 *
	 * @param t 泛型化的实体对象 t
	 * @return 实体对象
	 */
	@Override
	public T mergeEntity(T t) {
		return dao.mergeEntity(t);
	}

	/**
	 * 持久化实体对象 t
	 *
	 * @param t 泛型化的实体对象 t
	 */
	@Override
	public void persistEntity(T t) {
		dao.persistEntity(t);
	}

	/**
	 * 删除实体对象
	 *
	 * @param t 泛型化的实体对象 t
	 */
	@Override
	public void deleteEntity(T t) {
		dao.deleteEntity(t);
	}

	/**
	 * 刷新实体对象
	 *
	 * @param t 泛型化的实体对象 t
	 */
	@Override
	public void refreshEntity(T t) {
		dao.refreshEntity(t);
	}

	/**
	 * 获取实体对象
	 *
	 * @param id
	 * @return
	 */
	@Override
	public T getEntity(Serializable id) {
		return dao.getEntity(id);
	}

	/**
	 * 通过 Query 批量操作实体对象
	 *
	 * @param hql hql 语句
	 */
	@Override
	public int batchEntityByHQL(String hql) {
		return dao.batchEntityByHQL(hql);
	}

	/**
	 * 通过 Query 批量操作实体对象
	 *
	 * @param hql     hql 语句
	 * @param objects Object对象数组,通过参数位置方式给 hql 语句添加参数,不推荐使用
	 */
	@Override
	public int batchEntityByHQL(String hql, Object... objects) {
		return dao.batchEntityByHQL(hql, objects);
	}

	/**
	 * 批量操作实体对象
	 *
	 * @param hql    hql 语句
	 * @param params Map 对象,通过参数名方式给 hql 语句添加参数,推荐使用
	 */
	@Override
	public int batchEntityByHQL(String hql, Map<String, Object> params) {
		return dao.batchEntityByHQL(hql, params);
	}

	/**
	 * 通过 Query 执行原生 sql 语句
	 *
	 * @param sql 原生 sql 语句
	 * @return 语句执行后受影响的数据行数
	 */
	@Override
	public int executeSQL(String sql) {
		return dao.executeSQL(sql);
	}

	/**
	 * 通过 Query 执行原生 sql 语句
	 *
	 * @param sql     原生 sql 语句
	 * @param objects Object对象数组,通过参数位置方式给 sql 语句添加参数
	 * @return
	 */
	@Override
	public int executeSQL(String sql, Object... objects) {
		return dao.executeSQL(sql, objects);
	}

	/**
	 * 通过 Query 检索实体对象
	 *
	 * @param hql hql 语句
	 * @return 实体对象List
	 */
	@Override
	public List<T> findEntityByHQL(String hql) {
		return dao.findEntityByHQL(hql);
	}

	/**
	 * 通过 Query 检索实体对象
	 *
	 * @param hql  hql 语句
	 * @param page 要检索数据的页数
	 * @param rows 每页的数据行数
	 * @return 实体对象 List
	 */
	@Override
	public List<T> findEntityByHQL(String hql, int page, int rows) {
		return dao.findEntityByHQL(hql, page, rows);
	}

	/**
	 * 通过 Query 检索实体对象
	 *
	 * @param hql     hql 语句
	 * @param objects Object对象数组, 通过参数位置方式给 hql 语句添加参数,不推荐使用
	 * @return 实体对象 List
	 */
	@Override
	public List<T> findEntityByHQL(String hql, Object... objects) {
		return dao.findEntityByHQL(hql, objects);
	}

	/**
	 * 通过 Query 检索实体对象
	 *
	 * @param hql    hql 语句
	 * @param params Map 对象,通过参数名方式给 hql 语句添加参数,推荐使用
	 * @return 实体对象 List
	 */
	@Override
	public List<T> findEntityByHQL(String hql, Map<String, Object> params) {
		return dao.findEntityByHQL(hql, params);
	}

	/**
	 * 通过 Query 检索实体对象
	 *
	 * @param hql    hql 语句
	 * @param params Map 对象,通过参数名方式给 hql 语句添加参数,推荐使用
	 * @param page   要检索数据的页数
	 * @param rows   每页的数据行数
	 * @return 实体对象 List
	 */
	@Override
	public List<T> findEntityByHQL(String hql, Map<String, Object> params, int page, int rows) {
		return dao.findEntityByHQL(hql, params, page, rows);
	}

	/**
	 * 通过 Query 执行单值检索,如聚合函数 sum(), count(), 要求 hql 语句执行后返回数据最多只有一条
	 *
	 * @param hql hql 语句
	 * @return 单值检索得到 Object 对象
	 */
	@Override
	public Object uniqueResult(String hql) {
		return dao.uniqueResult(hql);
	}

	/**
	 * 通过 Query 执行单值检索,如聚合函数 sum(), count(), 要求 hql 语句执行后返回数据最多只有一条
	 *
	 * @param hql     hql 语句
	 * @param objects Object 对象数据,通过参数位置方式给 hql 语句添加参数,不推荐使用
	 * @return 单值检索得到的 Object 对象
	 */
	@Override
	public Object uniqueResult(String hql, Object... objects) {
		return dao.uniqueResult(hql, objects);
	}

	/**
	 * 通过 Query 执行单值检索,如聚合函数 sum(), count(), 要求 hql 语句执行后返回数据最多只有一条
	 *
	 * @param hql    hql 语句
	 * @param params Map 对象,通过参数名方式给 hql 语句添加参数,推荐使用
	 * @return 单值检索得到的 Object 对象
	 */
	@Override
	public Object uniqueResult(String hql, Map<String, Object> params) {
		return dao.uniqueResult(hql, params);
	}

	/**
	 * 执行原生 SQL 检索
	 *
	 * @param clazz 要检索的类对象,为空则表示不封装成实体
	 * @param sql   sql 语句
	 * @return List 对象
	 */
	@Override
	public List executeSQLQuery(Class clazz, String sql) {
		return dao.executeSQLQuery(clazz, sql);
	}

	/**
	 * 执行原生 SQL 检索
	 *
	 * @param clazz   要检索的类对象,为空则表示不封装成实体
	 * @param sql     sql 语句
	 * @param objects Object 对象数据,通过参数位置方式给 sql 语句添加参数
	 * @return List 对象
	 */
	@Override
	public List executeSQLQuery(Class clazz, String sql, Object... objects) {
		return dao.executeSQLQuery(clazz, sql, objects);
	}

	/**
	 * 得到检索结果的第一条数据
	 *
	 * @param hql hql 语句
	 * @return 实体对象
	 */
	@Override
	public T getFirstEntity(String hql) {
		return dao.getFirstEntity(hql);
	}

	/**
	 * 得到检索结果的第一条数据
	 *
	 * @param hql     hql 语句
	 * @param objects Object 对象数组,通过参数位置方式给 hql 语句添加参数,不推荐使用
	 * @return 实体对象
	 */
	@Override
	public T getFirstEntity(String hql, Object... objects) {
		return dao.getFirstEntity(hql, objects);
	}

	/**
	 * 得到检索结果的第一条数据
	 *
	 * @param hql    hql 语句
	 * @param params Map 对象,通过参数名方式给 hql 语句添加参数,推荐使用
	 * @return 实体对象
	 */
	@Override
	public T getFirstEntity(String hql, Map<String, Object> params) {
		return dao.getFirstEntity(hql, params);
	}

	/**
	 * 检索所有实体对象
	 * @return 所有实体对象
	 */
	@Override
	public List<T> findAllEntities() {
		String hql = "from " + clazz.getSimpleName();
		return findEntityByHQL(hql);
	}
}
