package com.miles.wxshare.service;

import java.util.List;

import com.miles.wxshare.pojo.User;

/**
 *  类名：用户操作服务层接口
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:37:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
public interface UserService {

	public List<User> findAllUser();

}
