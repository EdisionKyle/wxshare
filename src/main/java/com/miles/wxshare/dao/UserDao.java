package com.miles.wxshare.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.miles.wxshare.pojo.User;

/**
 *  类名：用户操作数据层
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:36:10
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
@Repository
public interface UserDao {

	public List<User> findAllUser();

}
