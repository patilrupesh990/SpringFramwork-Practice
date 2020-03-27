package com.spring.ioccontainers.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beanfactory.xml" });
		BeanFactory factory = context;
		Student student = (Student) factory.getBean("student");
		student.getStudentDetails();
		System.out.println("-------------------------------------");
		student.setRollNo(123);
		student.setName("Kunal");
		student.setBranch("Electrical");
		System.out.println(
				"student Name::" + student.getName() + "\n" + "Roll Number::" + student.getRollNo() + "\n" + "Branch::" + student.getBranch());

	}
}
