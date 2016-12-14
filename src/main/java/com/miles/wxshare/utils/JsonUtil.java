/**
 *  工程名：wxshare
 *  文件名：JsonUtil.java
 *  包名：com.miles.wxshare.utils
 *  创建时间：2016年12月13日 下午3:12:05
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 *  类名：Json操作工具类
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月13日 下午3:12:05
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class JsonUtil {

	public static Object toBean(String text) {
		return JSON.parse(text);
	}

	public static <T> T toBean(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	// 转换为数组
	public static <T> Object[] toArray(String text) {
		return toArray(text, null);
	}

	// 转换为数组
	public static <T> Object[] toArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz).toArray();
	}

	// 转换为List
	public static <T> List<T> toList(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	/**
	 * 将javabean转化为序列化的json字符串
	 * 
	 * @param keyvalue
	 * @return
	 */
	public static String beanToJson(Object o) {
		String textJson = JSON.toJSONString(o);
		return textJson;
	}

	/**
	 * 将string转化为序列化的json字符串
	 * 
	 * @param keyvalue
	 * @return
	 */
	public static Object textToJson(String text) {
		Object objectJson = JSON.parse(text);
		return objectJson;
	}

	/**
	 * json字符串转化为map
	 * 
	 * @param s
	 * @return
	 */
	public static Map<?, ?> stringToCollect(String s) {
		Map<?, ?> m = JSONObject.parseObject(s);
		return m;
	}

	/**
	 * 将map转化为string
	 * 
	 * @param m
	 * @return
	 */
	public static String collectToString(Map<?, ?> m) {
		String s = JSONObject.toJSONString(m);
		return s;
	}

}
