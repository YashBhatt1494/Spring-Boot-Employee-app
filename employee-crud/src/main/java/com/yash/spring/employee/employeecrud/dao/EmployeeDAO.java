package com.yash.spring.employee.employeecrud.dao;



import java.util.List;

import com.yash.spring.employee.employeecrud.entity.Employee;



public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
