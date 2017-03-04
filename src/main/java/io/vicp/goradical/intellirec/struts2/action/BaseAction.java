package io.vicp.goradical.intellirec.struts2.action;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.ParentPackage;

import java.lang.reflect.ParameterizedType;

/**
 * Created by Kenny on 2017/3/3.
 *
 * 抽象Action，专门用于继承
 * @param <T>
 */
@ParentPackage("basePackage")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>, Preparable{
	private static final Logger LOG = LogManager.getLogger(BaseAction.class);

	/**
	 * 泛型化模型 model
	 */
	protected T model;

	public BaseAction() {
		try {
			ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
			Class clazz = (Class) type.getActualTypeArguments()[0];
			model = (T) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public T getModel(){
		return model;
	};

	@Override
	public void prepare() throws Exception {

	}

	protected void writeJson(Object object) {
		try {
			String jsonStr = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
			ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(jsonStr);
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}
}
