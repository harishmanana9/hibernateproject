package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.UserBean;
import com.spring.dao.UserDao;

public class UserApp {

	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeans.xml");

		UserBean usr = new UserBean();
		usr.setUserName("John Wiseman");
		usr.setCity("Kolkata");

		UserDao userDao = (UserDao) appCtx.getBean("userDao");
		userDao.saveNewUser(usr);

	}
}
