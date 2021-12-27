package com.sb.empmgnt.service;

import java.util.List;

import com.sb.empmgnt.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEployees();
	
	Employee getEmployeeById(long id);
}
