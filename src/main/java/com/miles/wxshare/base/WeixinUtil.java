/**
 *  工程名：wxshare
 *  文件名：WeixinUtil.java
 *  包名：com.miles.wxshare.base
 *  创建时间：2016年12月13日 上午9:53:34
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.base;

import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *  类名：微信相关工具类
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月13日 上午9:53:34
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class WeixinUtil {

	/**
	 * 解析request中的xml 并将数据存储到一个Map中返回
	 * 
	 * @param request
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> parseXml(HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			InputStream inputStream = request.getInputStream();
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputStream);
			Element root = document.getRootElement();
			List<Element> elementList = root.elements();
			for (Element e : elementList)
				// 遍历xml将数据写入map
				map.put(e.getName(), e.getText());
			inputStream.close();
			inputStream = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 文字类的返回消息
	 * 
	 * @param toUser
	 * @param fromUser
	 * @param content
	 * @return
	 */
	public static String formatXmlText(String toUser, String fromUser, String content) {
		StringBuffer sb = new StringBuffer();
		Date date = new Date();
		sb.append("<xml><ToUserName><![CDATA[");
		sb.append(toUser);
		sb.append("]]></ToUserName><FromUserName><![CDATA[");
		sb.append(fromUser);
		sb.append("]]></FromUserName><CreateTime>");
		sb.append(date.getTime());
		sb.append("</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[");
		sb.append(content);
		sb.append("]]></Content></xml>");
		return sb.toString();
	}

	/**
	 * 图片类的返回消息
	 * 
	 * @param toUser
	 * @param fromUser
	 * @param image
	 * @param media_id
	 * @return
	 */
	public static String formatXmlImage(String toUser, String fromUser, String media_id) {

		StringBuffer sb = new StringBuffer();
		Date date = new Date();

		sb.append("<xml><ToUserName><![CDATA[");
		sb.append(toUser);
		sb.append("]]></ToUserName><FromUserName><![CDATA[");
		sb.append(fromUser);
		sb.append("]]></FromUserName><CreateTime>");
		sb.append(date.getTime());
		sb.append("</CreateTime><MsgType><![CDATA[");
		sb.append("image");
		sb.append("]]></MsgType>");
		sb.append("<Image><MediaId><![CDATA[");
		sb.append(media_id);
		sb.append("]]></MediaId></Image></xml>");

		return sb.toString();
	}

}
