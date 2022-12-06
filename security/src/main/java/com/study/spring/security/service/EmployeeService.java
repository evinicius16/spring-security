package com.study.spring.security.service;

import com.study.spring.security.model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee findById(Integer id);
    void updateEmployee(Employee employee);
    Boolean deleteById(Integer id);
}
