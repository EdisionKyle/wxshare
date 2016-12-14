package com.miles.wxshare.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miles.wxshare.service.UserService;

/**
 *  类名：用户操作控制器
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:34:44
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/list")
	@ResponseBody
	public Map<String, Object> detail(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", userService.findAllUser());
		map.put("code", "10000");
		map.put("msg", "操作成功");
		return map;
	}

}
