package io.vicp.goradical.intellirec.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by Kenny on 2017/3/3.
 * <p>
 * 抽象的实体超类，所有需要持久化的数据均实现序列化并且添加代理主键 id, 专门用于继承
 */
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 6893731361119450101L;

	/**
	 * 返回对象的代理主键 id
	 *
	 * @return 代理主键 id
	 */
	public abstract Integer getId();

	/**
	 * 设置对象的代理主键 id
	 *
	 * @param id 代理主键 id
	 */
	public abstract void setId(Integer id);

	/**
	 * 使用 json 格式来格式化对象实体
	 *
	 * @return
	 */
	@Override
	public String toString() {
		String jsonStr = JSON.toJSONStringWithDateFormat(this, "yyyy-MM-dd HH:mm:ss");
		return jsonStr;
	}

}
