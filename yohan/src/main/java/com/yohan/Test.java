package com.yohan;

import com.yohan.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello spring");

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService = (MyService) applicationContext.getBean("myService");

		myService.introduce();
	}
}