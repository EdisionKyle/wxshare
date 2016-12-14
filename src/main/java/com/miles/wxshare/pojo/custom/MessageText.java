/**
 *  工程名：wxshare
 *  文件名：MessageText.java
 *  包名：com.miles.wxshare.pojo.custom
 *  创建时间：2016年12月14日 下午2:08:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.pojo.custom;
/**
 *  类名：文本消息
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:08:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class MessageText extends Base {

	private static final long serialVersionUID = 1L;

	private Text text;

	public MessageText() {
		super();
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

}
