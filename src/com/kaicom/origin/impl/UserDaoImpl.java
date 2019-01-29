package com.kaicom.origin.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.kaicom.bean.UserBean;
import com.kaicom.origin.dao.UserDao;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<UserBean> listUser1() {
		SqlSession sqlSession = super.getSqlSession();
		return sqlSession.selectList("listUser1");
	}

	@Override
	public List<UserBean> listUser2() {
		SqlSession sqlSession = super.getSqlSession();
		return sqlSession.selectList("listUser2");
	}

	@Override
	public Integer insertUser(UserBean bean) {
		SqlSession sqlSession = super.getSqlSession();
		return sqlSession.insert("insertUser",bean);
	}

}
