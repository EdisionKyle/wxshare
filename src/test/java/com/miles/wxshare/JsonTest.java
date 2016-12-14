/**
 *  工程名：wxshare
 *  文件名：JsonTest.java
 *  包名：com.miles.wxshare
 *  创建时间：2016年12月14日 下午2:03:36
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.miles.wxshare;

import com.miles.wxshare.pojo.custom.MessageText;
import com.miles.wxshare.pojo.custom.Text;
import com.miles.wxshare.utils.JsonUtil;

/**
 *  类名：JsonTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:03:36
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class JsonTest {

	public static void main(String[] args) {
		MessageText mt = new MessageText();
		mt.setTouser("tianpc0318");
		mt.setMsgtype("text");
		mt.setText(new Text("小编很伤心，公司裁员咯。"));
		System.out.println(JsonUtil.beanToJson(mt));
	}

}
