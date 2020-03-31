package com.spring.transaction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.transaction.dao.EmployeeDao;
import com.spring.transaction.model.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		  @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("transactionbean.xml");
		  EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDaoImpl");
		  
		  System.out.println("------Records Creation--------" );
		  employeeDao.create("Raaz", 25, 50000l);
		   
		  System.out.println("------Listing Multiple Records--------" );
		  List<Employee> employees = employeeDao.listEmployees();
		  for (Employee employee : employees) {
		          System.out.print(employee);
		     }
		 }
}
