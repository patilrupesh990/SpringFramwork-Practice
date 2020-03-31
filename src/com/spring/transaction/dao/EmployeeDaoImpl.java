package com.spring.transaction.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.spring.transaction.mapper.EmployeeMapper;
import com.spring.transaction.model.Employee;

@Component
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	@Override
	public void create(String name, Integer age, Long salary) {

		try {
			String SQL = "INSERT INTO Employee (name, age, salary) VALUES (?, ?, ?)";
			getJdbcTemplate().update(SQL, new Object[] { name, age, salary });
			System.out.println("Created Record Name = " + name + " Age = " + age + " Salary = " + salary);
			// to simulate the exception.
//			throw new RuntimeException("simulate Error condition");
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
	}

	@Override
	public Employee getEmployee(Integer empid) {
		String SQL = "SELECT * FROM Employee WHERE empid = ?";
		Employee employee = (Employee) getJdbcTemplate().queryForObject(SQL, new Object[] { empid },
				new EmployeeMapper());
		return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		String SQL = "SELECT * FROM Employee";
		List<Employee> employees = (List<Employee>) getJdbcTemplate().query(SQL, new EmployeeMapper());
		return employees;
	}

	@Override
	public void delete(Integer empid) {
		String SQL = "DELETE FROM Employee WHERE empid = ?";
		getJdbcTemplate().update(SQL, new Object[] { empid });
		System.out.println("Deleted Record with EMPID = " + empid);
	}

	@Override
	public void update(Integer empid, Integer age) {
		String SQL = "UPDATE Employee SET age = ? WHERE empid = ?";
		getJdbcTemplate().update(SQL, new Object[] { age, empid });
		System.out.println("Updated Record with EMPID = " + empid);
	}

}
