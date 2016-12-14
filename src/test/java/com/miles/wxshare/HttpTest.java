package com.miles.wxshare;

import com.miles.wxshare.utils.HttpUtil;

public class HttpTest {

	public static void main(String[] args) {

		String url = "http://localhost:8080/wxshare/user/list";
		String result = HttpUtil.getInstance().sendHttpGet(url);
		System.out.println(result);
	}

}
