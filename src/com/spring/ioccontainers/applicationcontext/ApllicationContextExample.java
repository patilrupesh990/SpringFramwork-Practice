package com.spring.ioccontainers.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApllicationContextExample {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("aplicationcontext.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Employee Id:"+employee.getName()+"\n"+"Employee Name:"+employee.getId()+"\n"+"Designation:"+employee.getDesignation());
		System.out.println("--------------------------------------------");
		employee.setName("Kunal");
		employee.setId(23);
		employee.setDesignation("electrician");
		System.out.println("Employee Id:"+employee.getName()+"\n"+"Employee Name:"+employee.getId()+"\n"+"Designation:"+employee.getDesignation());

		
	}

}
