package com.sb.empmgnt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.empmgnt.model.Employee;
import com.sb.empmgnt.repository.EmployeeRepository;
import com.sb.empmgnt.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEployees() {
		return employeeRepository.findAll();
	}
	
}
