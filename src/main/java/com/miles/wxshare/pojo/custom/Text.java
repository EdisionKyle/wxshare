/**
 *  工程名：wxshare
 *  文件名：Text.java
 *  包名：com.miles.wxshare.pojo.custom
 *  创建时间：2016年12月14日 下午2:10:34
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.pojo.custom;

import java.io.Serializable;

/**
 *  类名：文本消息专有
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:10:34
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class Text implements Serializable {

	private static final long serialVersionUID = 1L;

	private String content;

	public Text() {
		super();
	}

	public Text(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
