/**
 *  工程名：wxshare
 *  文件名：WeixinController.java
 *  包名：com.miles.wxshare.controller
 *  创建时间：2016年12月13日 上午9:36:22
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miles.wxshare.base.MessageType;
import com.miles.wxshare.base.UrlRoute;
import com.miles.wxshare.base.WeixinUtil;
import com.miles.wxshare.pojo.custom.MessageText;
import com.miles.wxshare.pojo.custom.Text;
import com.miles.wxshare.utils.HttpUtil;
import com.miles.wxshare.utils.JsonUtil;
import com.miles.wxshare.utils.SignUtil;

/**
 *  类名：微信操作控制器
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月13日 上午9:36:22
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */

@Controller  
public class WeixinController {

	/**
	 * 获取access_token
	 * @author pengcheng.tian
	 * @return
	 */
	@RequestMapping(value = UrlRoute.ACCESS_TOKEN, method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> accessToken() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("accessToken", JsonUtil.stringToCollect(HttpUtil.getInstance().sendHttpGet(UrlRoute.WX_ACCESS_TOKEN)));
		map.put("code", 10000);
		return map;
	}

	/**
	 * 获取微信服务器IP地址
	 * @author pengcheng.tian
	 * @return
	 */
	@RequestMapping(value = UrlRoute.IP_LIST, method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> ipList() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ipList", JsonUtil.stringToCollect(HttpUtil.getInstance().sendHttpGet(UrlRoute.WX_IP_LIST)));
		map.put("code", 10000);
		return map;
	}

	/**
	 * 验证消息真实性(首次提交验证申请时效验)
	 * @author pengcheng.tian
	 * @return
	 */
	@RequestMapping(value = UrlRoute.CHECK_SIGNATURE, method = RequestMethod.GET)
	@ResponseBody
	public void checkSignature(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}
		out.close();
	}
	
	/**
	 * 交互入口。接收微信公众号的消息，处理后再做相应的回复
	 * 
	 * @author pengcheng.tian
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = UrlRoute.WEIXIN, method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public void Message(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String replyMessage = "";
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			Map<String, String> reqMap = WeixinUtil.parseXml(request);
			System.out.println("request参数：" + reqMap);
			if (MessageType.REQ_MESSAGE_TYPE_TEXT.equals(reqMap.get("MsgType"))) {//接收普通消息-文本消息
				String replyContent = "亲爱的朋友，回复1将有惊喜哟，年底大奖等你来拿。";
				replyMessage = WeixinUtil.formatXmlText(reqMap.get("FromUserName"), reqMap.get("ToUserName"),
						replyContent);
			} else if (MessageType.REQ_MESSAGE_TYPE_LOCATION.equals(reqMap.get("MsgType"))) {//接收普通消息-地理位置消息
				System.out.println("OpenId为" + reqMap.get("FromUserName") + "发送地理位置...");
			} else if (MessageType.REQ_MESSAGE_TYPE_EVENT.equals(reqMap.get("MsgType"))) {//接收事件推送
				if (MessageType.EVENT_TYPE_SUBSCRIBE.equals(reqMap.get("Event"))) {
					String replyContent = "亲爱的朋友，欢迎加入公众号->孤客工作室，我们将为您提供优质的服务。";
					replyMessage = WeixinUtil.formatXmlText(reqMap.get("FromUserName"), reqMap.get("ToUserName"),
							replyContent);
				} else if (MessageType.EVENT_TYPE_UNSUBSCRIBE.equals(reqMap.get("Event"))) {
					System.out.println("OpenId为" + reqMap.get("FromUserName") + "的用户取消订阅...So Sad...");
				}
			}
			System.out.println("token验证成功，即将返回：" + replyMessage);
			out.print(replyMessage);
		}
		out.close();
		System.out.println("replyMessage成功响应...");
	}

	/**
	 * 客服帐号管理(需在公众平台官网为公众号设置微信号)
	 * @author pengcheng.tian
	 * @return
	 */
	@RequestMapping(value = UrlRoute.KF_ACCOUNT, method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> kfAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, String> param = new HashMap<String, String>();
		param.put("kf_account", "xiaojin@gh_13c9a6f23acc");
		param.put("nickname", "小金客服");
		param.put("password", "xiaojin@z");
		map.put("result", JsonUtil.stringToCollect(HttpUtil.getInstance().sendHttpPostJson(UrlRoute.KF_ACCOUNT_ADD, JsonUtil.collectToString(param))));
		map.put("code", 10000);
		return map;
	}

	/**
	 * 客服主动发送消息
	 * @author pengcheng.tian
	 * @return
	 */
	@RequestMapping(value = "customMsgSend", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> customMsgSend(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		MessageText mt = new MessageText();
		mt.setTouser("ouXdauGTgKZ560OjVofR-DwSL_Kw");
		mt.setMsgtype("text");
		mt.setText(new Text("小编很悲伤，公司要裁员。"));
		map.put("result", JsonUtil.stringToCollect(HttpUtil.getInstance().sendHttpPostJson(UrlRoute.CUSTOM_MSG_SEND, JsonUtil.beanToJson(mt))));
		map.put("code", 10000);
		return map;
	}

}
