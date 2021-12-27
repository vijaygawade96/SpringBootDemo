package com.sb.empmgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.empmgnt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
