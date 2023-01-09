package com.nikhilsnayak3473.employeeservice.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.nikhilsnayak3473.employeeservice.dto.EmployeeDto;
import com.nikhilsnayak3473.employeeservice.entity.Employee;
import com.nikhilsnayak3473.employeeservice.exception.ResourceNotFoundException;
import com.nikhilsnayak3473.employeeservice.repository.EmployeeRepository;
import com.nikhilsnayak3473.employeeservice.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	private ModelMapper modelMapper;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = modelMapper.map(employeeDto, Employee.class);
		Employee savedEmployee = employeeRepository.save(employee);
		return modelMapper.map(savedEmployee, EmployeeDto.class);
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", String.valueOf(id)));;
		return modelMapper.map(employee, EmployeeDto.class);
	}
}
