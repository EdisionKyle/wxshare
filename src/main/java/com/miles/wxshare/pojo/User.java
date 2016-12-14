package com.miles.wxshare.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *  类名：用户实体类
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月14日 下午2:36:41
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -3100978814553263282L;
	private String uid;
	private String uname;
	private String address;
	private String job;
	private String hobit;
	private Date regDate;

	public User() {
		super();
	}

	public User(String uid, String uname, String address, String job, String hobit, Date regDate) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
		this.job = job;
		this.hobit = hobit;
		this.regDate = regDate;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHobit() {
		return hobit;
	}

	public void setHobit(String hobit) {
		this.hobit = hobit;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
