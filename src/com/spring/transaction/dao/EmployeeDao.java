package com.spring.transaction.dao;

import java.util.List;

import com.spring.transaction.model.Employee;

public interface EmployeeDao {
	void create(String name, Integer age, Long salary);

	 Employee getEmployee(Integer empid);

	 List<Employee> listEmployees();
	
	 void delete(Integer empid);
	 
	 void update(Integer empid, Integer age);

}
