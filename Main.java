package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(IocConfig.class);
		
	ICustomerService customerService=applicationContext.getBean("service",ICustomerService.class);	
   
    customerService.add();
		
	}
}
