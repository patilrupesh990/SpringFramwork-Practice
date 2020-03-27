package com.spring.springconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringConfigApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfiguration.xml");
		Country country=(Country) context.getBean("country");
		System.out.println(country.getCountryName());
	}
}
