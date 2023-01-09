package com.nikhilsnayak3473.employeeservice.service;

import com.nikhilsnayak3473.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long id);

}
