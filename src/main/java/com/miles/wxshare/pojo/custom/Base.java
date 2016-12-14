/**
 *  工程名：wxshare
 *  文件名：Base.java
 *  包名：com.miles.wxshare.pojo.custom
 *  创建时间：2016年12月14日 下午2:06:31
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare.pojo.custom;

import java.io.Serializable;

/**
 *  类名：客服消息基类
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:06:31
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public abstract class Base implements Serializable {

	private static final long serialVersionUID = 1L;

	private String touser;

	private String msgtype;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

}
