package com.miles.wxshare.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 *  类名：微信交互校验工具类
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:38:49
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
public class SignUtil {
	// token定义，在微信公众平台配置
	private static final String token = "meng520xxxxx";
	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	/**
	 * 检验signature是否一致
	 * 
	 * @param signature
	 *            加密签名
	 * @param timestamp
	 *            时间戳
	 * @param nonce
	 *            随机数
	 * @return 校验请求来源于微信
	 */
	public static boolean checkSignature(String signature, String timestamp,
			String nonce) {
		// 将token、timestamp、nonce三个参数进行字典序排序
		String[] arr = new String[] { token, timestamp, nonce };
		Arrays.sort(arr);
		// 将三个参数字符串拼接成一个字符串进行sha1加密
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			str.append(arr[i]);
		}
		String tmpStr = null;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
			messageDigest.update(str.toString().getBytes());
			tmpStr = getFormattedText(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		str.setLength(0);
		// 加密后的字符串可与signature对比，标识该请求来源于微信
		return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	}

	private static String getFormattedText(byte[] bytes) {
		int len = bytes.length;
		StringBuilder buf = new StringBuilder(len * 2);
		// 把密文转换成十六进制的字符串形式
		for (int j = 0; j < len; j++) {
			buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0X0F]);
			buf.append(HEX_DIGITS[bytes[j] & 0X0F]);
		}
		return buf.toString();
	}

}
