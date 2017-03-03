package io.vicp.goradical.intellirec.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 抽象的实体超类，专门用于继承
 */
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 6893731361119450101L;

	public abstract Integer getId();

	public abstract void setId(Integer id);

	@Override
	public String toString() {
		String jsonStr = JSON.toJSONStringWithDateFormat(this, "yyyy-MM-dd HH:mm:ss");
		return jsonStr;
	}

}
