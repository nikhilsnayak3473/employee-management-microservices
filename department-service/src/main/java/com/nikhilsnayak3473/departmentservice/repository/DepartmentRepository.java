package com.nikhilsnayak3473.departmentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhilsnayak3473.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	Optional<Department> findByDepartmentCode(String departmentCode);
}
