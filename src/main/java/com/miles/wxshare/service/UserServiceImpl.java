package com.miles.wxshare.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.miles.wxshare.dao.UserDao;
import com.miles.wxshare.pojo.User;

/**
 *  类名：类名：用户操作服务层实现
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:37:45
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public List<User> findAllUser() {
		return userDao.findAllUser();
	}

}
