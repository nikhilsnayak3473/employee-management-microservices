package com.nikhilsnayak3473.departmentservice.service;

import com.nikhilsnayak3473.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
	
	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	
	DepartmentDto getDepartmentByCode(String departmentCode);

}
