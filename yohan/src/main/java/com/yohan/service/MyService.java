package com.yohan.service;

import com.yohan.dao.MyServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Autowired
	MyServiceDao myServiceDao;

	public void introduceMyService() {
		System.out.println("my name is myService");
		myServiceDao.introduceMyServiceDao();
	}
}
