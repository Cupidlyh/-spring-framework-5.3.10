package com.yohan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yohan.service.MyClassPathXmlService;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello spring");

        // AnnotationConfigApplicationContext annotationConfigApplicationContext =
        // new AnnotationConfigApplicationContext(AppConfig.class);
        //
        // MyService myService = (MyService)annotationConfigApplicationContext.getBean("myService");
        //
        // myService.introduceMyService();

        System.out.println("------------------------------------");

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext("config.xml");
        MyClassPathXmlService myClassPathXmlService =
            classPathXmlApplicationContext.getBean(MyClassPathXmlService.class);
        myClassPathXmlService.introduceMyClassPathXmlService();
    }
}