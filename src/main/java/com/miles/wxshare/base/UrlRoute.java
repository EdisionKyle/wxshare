/**
 *  工程名：wxshare
 *  文件名：UrlRoute.java
 *  包名：com.miles.wxshare.base
 *  创建时间：2016年12月13日 上午9:43:45
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.base;
/**
 *  类名：微信接口路径定义
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月13日 上午9:43:45
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class UrlRoute {

	// 获取access_token
	public static final String ACCESS_TOKEN = "/accessToken";
	// 获取access_token的接口地址，需要将appID和appsecret替换
	public static final String WX_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx4464394a112982c8&secret=d59c8e7b366863881fb13e68b12b890d";
	// 获取微信服务器IP地址
	public static final String IP_LIST = "/ipList";
	// 获取微信服务器IP地址的接口地址，需要将appID和appsecret替换
	public static final String WX_IP_LIST = "https://api.weixin.qq.com/cgi-bin/getcallbackip?access_token=vgMeaYJkKjUIPKKyafVx9rq8yB2n7-49iR80H92JiaT845-FBzagH13VZQuoBxhD6vxPWYE2BxFbH9CdxXJd_JKSWXuNar9uH-q5deg0Isq5700ITHoqxoPL9I2LUR-lFLNeAEALRT";
	// 验证消息真实性
	public static final String CHECK_SIGNATURE = "/checkSignature";
	// 客服帐号管理
	public static final String KF_ACCOUNT = "/kfaccount";
	// 添加客服帐号
	public static final String KF_ACCOUNT_ADD = "https://api.weixin.qq.com/customservice/kfaccount/add?access_token=SIaouKPwy7M6XshSHw0ZrnbuQkZW5TpTupAzvkCobng9_P3ys0Ajy6S4-nS8JwKbVJkyJ0Cosn8K-_hn0ccGC0oKCnnmbjlQVyCQT0Lf_K-SeOCVLOlMRgzbR7yY9HCaVVJcAFAMMA";
	// 修改客服帐号
	public static final String KF_ACCOUNT_UPDATE = "https://api.weixin.qq.com/customservice/kfaccount/update?access_token=SIaouKPwy7M6XshSHw0ZrnbuQkZW5TpTupAzvkCobng9_P3ys0Ajy6S4-nS8JwKbVJkyJ0Cosn8K-_hn0ccGC0oKCnnmbjlQVyCQT0Lf_K-SeOCVLOlMRgzbR7yY9HCaVVJcAFAMMA";
	// 删除客服帐号
	public static final String KF_ACCOUNT_DEL = "https://api.weixin.qq.com/customservice/kfaccount/del?access_token=SIaouKPwy7M6XshSHw0ZrnbuQkZW5TpTupAzvkCobng9_P3ys0Ajy6S4-nS8JwKbVJkyJ0Cosn8K-_hn0ccGC0oKCnnmbjlQVyCQT0Lf_K-SeOCVLOlMRgzbR7yY9HCaVVJcAFAMMA";
	// 人工消息处理(客服)-主动发送消息给普通用户
	public static final String CUSTOM_MSG_SEND = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=rJJndrRJM99Xn-v-oVhQ6z3By06KIljtt1OKBKq9NLJwtGWCqzMk3a4uhjuH4xGO0bjgLf6Y_LnlgAPVh4CRj8MpLmm4h-3tN3ZGm1TrOhAMbyPd7ewDU1txrJ-RiJIkTEWiAGACNF";
	// 微信接口配置URL
	public static final String WEIXIN = "/weixin";

}
