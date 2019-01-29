package com.kaicom.origin.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaicom.bean.UserBean;
import com.kaicom.origin.dao.UserDao;

public class UserDaoTest {
	private static Logger logger = Logger.getLogger(UserDaoTest.class);
	
	ApplicationContext context = null ;
	
	UserDao userDao = null ;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:com/kaicom/origin/applicationContext.xml");
		userDao = (UserDao)context.getBean("userDao");
	}

	@Test
	public void testListUser1() {
		List<UserBean> listUser = userDao.listUser1();
		for(UserBean bean : listUser){
			logger.info(bean);
		}
	}

	@Test
	public void testListUser2() {
		List<UserBean> listUser = userDao.listUser2();
		for(UserBean bean : listUser){
			logger.info(bean);
		}
	}
	
	@Test
	public void testInsertUser() {
		try{
			UserBean bean = new UserBean(null, "abcd", "大黄蜂", "dhf", "123456", "D1b6fcd4c", null);
			Integer count = userDao.insertUser(bean);
			if(count > 0 ){
				logger.info("新增成功");
				logger.info("新增的数据为------>"+bean);;
			}else{
				logger.info("新增失败");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
