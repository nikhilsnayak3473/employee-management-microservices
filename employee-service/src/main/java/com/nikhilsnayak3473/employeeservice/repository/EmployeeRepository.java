package com.nikhilsnayak3473.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhilsnayak3473.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
