package com.nikhilsnayak3473.departmentservice.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.nikhilsnayak3473.departmentservice.dto.DepartmentDto;
import com.nikhilsnayak3473.departmentservice.entity.Department;
import com.nikhilsnayak3473.departmentservice.exception.ResourceNotFoundException;
import com.nikhilsnayak3473.departmentservice.repository.DepartmentRepository;
import com.nikhilsnayak3473.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;
	private ModelMapper modelMapper;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		Department department = modelMapper.map(departmentDto, Department.class);
		Department savedDepartment = departmentRepository.save(department);
		return modelMapper.map(savedDepartment, DepartmentDto.class);
	}

	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		Department department = departmentRepository.findByDepartmentCode(departmentCode).orElseThrow(()->new ResourceNotFoundException("Department", "Code", departmentCode));
		return modelMapper.map(department, DepartmentDto.class);
	}

}
