package com.kaicom.origin.dao;

import java.util.List;

import com.kaicom.bean.UserBean;

public interface UserDao {
	List<UserBean> listUser1();
	List<UserBean> listUser2();
	Integer insertUser(UserBean bean);
}
