package io.vicp.goradical.intellirec.util;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Kenny on 2017/3/3.
 *
 * 校验工具类
 */
public class ValidateUtil {
	/**
	 * 判断字符串有效性
	 * @param src
	 * @return
	 */
	public static boolean isValid(String src) {
		if (src == null || "".equals(src.trim())) {
			return false;
		}
		return true;
	}

	/**
	 * 判断集合的有效性
	 * @param coll
	 * @return
	 */
	public static boolean isValid(Collection coll) {
		if (coll == null || coll.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * 判断Map的有效性
	 * @param map
	 * @return
	 */
	public static boolean isValid(Map map) {
		if (map == null || map.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * 判断数组是否有效
	 * @param arr
	 * @return
	 */
	public static boolean isValid(Object[] arr) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		return true;
		// update
	}

}
