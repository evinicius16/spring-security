package com.study.spring.security.repository;

import com.study.spring.security.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee employee);
}
