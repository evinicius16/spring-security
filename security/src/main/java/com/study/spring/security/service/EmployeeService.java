package com.study.spring.security.service;


import com.study.spring.security.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    Optional<Employee> finById(Long id);
}
